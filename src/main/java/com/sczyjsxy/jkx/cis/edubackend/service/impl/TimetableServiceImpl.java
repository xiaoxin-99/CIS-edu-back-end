package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.ActivitiesMapper;
import com.sczyjsxy.jkx.cis.edubackend.mapper.ChooseMapper;
import com.sczyjsxy.jkx.cis.edubackend.mapper.ScheduleMapper;
import com.sczyjsxy.jkx.cis.edubackend.mapper.TeachingClassMapper;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.TeacherActivities;
import com.sczyjsxy.jkx.cis.edubackend.service.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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

    @Override
    public List<StudentActivities> studentTimetable(String studentId, String semester) {
        // 查询学生所选班级
        List<String> teachingClassIds = chooseMapper.queryTeachingClassId(studentId);
        // 查询教学班的教学活动
        List<Activities> activities = activitiesMapper.getActivities(teachingClassIds, semester);
        // 查询教学活动的课程名称
        for (Activities item : activities){
            item.getCourse().getCourseId();
            item.getTeacher().getId();
        }

        return null;
    }

    @Override
    public List<TeacherActivities> teacherTimetable(String teacherId, String semester) {
        return null;
    }
}
