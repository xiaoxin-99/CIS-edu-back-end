package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;
import com.sczyjsxy.jkx.cis.edubackend.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 课表服务实现
 * @author lx
 */
@Service
public class TimetableServiceImpl implements TimetableService {

    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Autowired
    private ChooseMapper chooseMapper;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private TeachingClassMapper teachingClassMapper;

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
        List<Activities> activities = activitiesMapper.getActivitiesByTeachingClassId(teachingClassIds, semester);
        // 查询教学活动的课程、名称
        for (Activities activitiesItem : activities){
            activitiesItem.setTeacher(teacherMapper.
                    getTeacher(activitiesItem.getTeacher().getId()));
            activitiesItem.setCourse(courseMapper.
                    getCourse(activitiesItem.getCourse().getCourseId()));
            activitiesItem.setTimeAndPlace(scheduleMapper.
                    getTeachingTimeAndPlaceByActivitiesId(activitiesItem.getActivitiesId()));
        }

        for (Activities activitiesItem : activities){
            for (TeachingTimeAndPlace timeAndPlace : activitiesItem.getTimeAndPlace()){
                StudentActivities studentActivities = new StudentActivities();
                TeachingActivities teachingActivities = new TeachingActivities();
                teachingActivities.setCourse(activitiesItem.getCourse().getCourseName());
                teachingActivities.setPlan(activitiesItem.getPlan());
                teachingActivities.setTimeAndPlace(timeAndPlace);
                studentActivities.setActivities(teachingActivities);
                studentActivities.setTeacher(activitiesItem.getTeacher().getName());
                list.add(studentActivities);
            }
        }

        return list;
    }

    @Override
    public List<TeacherActivities> teacherTimetable(String teacherId, String semester) {
        return null;
    }
}

