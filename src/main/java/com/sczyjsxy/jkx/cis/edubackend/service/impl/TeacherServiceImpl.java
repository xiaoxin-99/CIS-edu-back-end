package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.TeacherTimetable;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentTimetableVo;
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
        List<Activities> activities1 = getActivities("1988210001", "2018-2019-2");

        // 查询教学活动的课程、名称
        for (Activities activities : activities1){
            List<TeachingTimeAndPlace> timeAndPlaceList =
                    scheduleMapper.getTeachingTimeAndPlaceByActivitiesId(activities.getActivitiesId());

            for (TeachingTimeAndPlace timeAndPlace : timeAndPlaceList) {
                TeacherTimetableVo teacherTimetableVo = new TeacherTimetableVo();
                TeachingActivities teachingActivities = new TeachingActivities();
                teachingActivities.setCourse(activities.getCourse().getCourseName());
                teachingActivities.setPlan(activities.getPlan());
                teachingActivities.setTimeAndPlace(timeAndPlace);
                teacherTimetableVo.setActivities(teachingActivities);
                teacherTimetableVo.setClassName(activities.getCourse().getCourseName());
                list.add(teacherTimetableVo);
            }
        }

        return list;
    }

    /**
     * 查询教师的教学班
     * @param teacherId 教师编号
     * @param semester 学期
     * @return
     */

    private List<Activities> getActivities (String teacherId, String semester){


        List<Activities> activities = activitiesMapper
                .getActivitiesByTeacherId(teacherId, semester);

        for (Activities item : activities) {
            item.setTeacher(teacherMapper.
                    getTeacher(item.getTeacher().getId()));
            item.setCourse(courseMapper.
                    getCourse(item.getCourse().getCourseId()));
        }
        return activities;
    }
}
