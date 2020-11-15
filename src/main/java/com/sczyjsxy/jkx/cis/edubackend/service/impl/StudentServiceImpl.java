package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.StudentTimetable;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;
import com.sczyjsxy.jkx.cis.edubackend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 学生服务实现
 * @author lx
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Autowired
    private ChooseMapper chooseMapper;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Override
    public List<StudentActivities> studentTimetable(String studentId, String semester) {
        ArrayList<StudentActivities> list = new ArrayList<>();
        // 查询学生所选班级
        List<String> teachingClassIds = chooseMapper.getTeachingClassId(studentId);
        // 查询教学班的教学活动
        List<StudentTimetable> studentTimetable = activitiesMapper.getActivitiesByTeachingClassId(teachingClassIds, semester);
        // 查询教学活动的课程、名称
        for (StudentTimetable timetable : studentTimetable){
            Activities activities = timetable.getActivities();
            activities.setTeacher(teacherMapper.
                    getTeacher(activities.getTeacher().getId()));
            activities.setCourse(courseMapper.
                    getCourse(activities.getCourse().getCourseId()));
            timetable.setTimeAndPlace(scheduleMapper.
                    getTeachingTimeAndPlaceByActivitiesId(activities.getActivitiesId()));
        }

        for (StudentTimetable timetable : studentTimetable){
            for (TeachingTimeAndPlace timeAndPlace : timetable.getTimeAndPlace()){
                Activities activities = timetable.getActivities();
                StudentActivities studentActivities = new StudentActivities();
                TeachingActivities teachingActivities = new TeachingActivities();
                teachingActivities.setCourse(activities.getCourse().getCourseName());
                teachingActivities.setPlan(activities.getPlan());
                teachingActivities.setTimeAndPlace(timeAndPlace);
                studentActivities.setActivities(teachingActivities);
                studentActivities.setTeacher(activities.getTeacher().getName());
                list.add(studentActivities);
            }
        }

        return list;
    }
}

