package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.TeacherTimetable;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherTimetableVo;
import com.sczyjsxy.jkx.cis.edubackend.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 教师服务实现
 * @author Mr zhang
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private ActivitiesMapper activitiesMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private CourseMapper courseMapper;

    @Autowired
    private ScheduleMapper scheduleMapper;

    @Autowired
    private TeachingClassMapper teachingClassMapper;

    @Override
    public List<TeacherTimetableVo> teacherTimetable(String teacherId, String semester) {
        ArrayList<TeacherTimetableVo> list = new ArrayList<>();
        // 查询教师的教学活动
        List<TeacherTimetable> activitiesByTeacherId = activitiesMapper
                .getActivitiesByTeacherId("1988210001", "2018-2019-2");

        // 查询教学活动的课程、名称
        for (TeacherTimetable timetable : activitiesByTeacherId){
            Activities activities = timetable.getActivities();
            activities.setTeacher(teacherMapper.
                    getTeacher(activities.getTeacher().getId()));
            activities.setCourse(courseMapper.
                    getCourse(activities.getCourse().getCourseId()));
            timetable.setTimeAndPlace(scheduleMapper.
                    getTeachingTimeAndPlaceByActivitiesId(activities.getActivitiesId()));
            timetable.setTeachingClass(teachingClassMapper
                    .getTeachingClass(timetable.getTeachingClass().getTeachingClassId()));
        }

        for (TeacherTimetable timetable : activitiesByTeacherId){
            for (TeachingTimeAndPlace timeAndPlace : timetable.getTimeAndPlace()){
                Activities activities = timetable.getActivities();
                TeacherTimetableVo teacherActivities = new TeacherTimetableVo();
                TeachingActivities teachingActivities = new TeachingActivities();
                teachingActivities.setCourse(activities.getCourse().getCourseName());
                teachingActivities.setPlan(activities.getPlan());
                teachingActivities.setTimeAndPlace(timeAndPlace);
                teacherActivities.setActivities(teachingActivities);
                teacherActivities.setClassName(timetable.getTeachingClass().getTeachingClassName());
                list.add(teacherActivities);
            }
        }

        return list;
    }
}
