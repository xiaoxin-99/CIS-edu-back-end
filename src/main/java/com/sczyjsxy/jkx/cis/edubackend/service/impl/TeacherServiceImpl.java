package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreDetailVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
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
    private ScheduleMapper scheduleMapper;

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<TeacherTimetableVo> teacherTimetable(String teacherId, String semester) {
        ArrayList<TeacherTimetableVo> list = new ArrayList<>();
        // 查询教师的教学活动
        List<Activities> activities1 = activitiesMapper
                .getActivitiesByTeacherId("1988210001", "2018-2019-2");

        // 查询教学活动的时间地点
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

    @Override
    public List<ClassScoreDetailVo> getClass(String teacherId) {
        List<ClassScoreDetailVo> classScoreDetail = scoreMapper.getClassScoreDetail(teacherId);
        for (ClassScoreDetailVo c: classScoreDetail ) {
            c.setScoreStaus(scoreMapper.getScoreStatus(c.getTeachingActivitiesId()));
        }
        return classScoreDetail;
    }

    @Override
    public List<ClassScoreVo> getClassScore(String teachingClassId) {
        List<String> students = scoreMapper.getStudent(teachingClassId);
        List<ClassScoreVo> scoreByStudent = scoreMapper.getScoreByStudent(students);
        return scoreByStudent;
    }

//    @Override
//    public List<ClassScoreVo> getClassScore(String teachingClassId) {
//         return  scoreMapper.getStudentScore(teachingClassId);
//    }

    @Override
    public Integer modifyScore(List<Score> scores) {
        // 修改条数
        int count = 0;
        // 循环修改成绩
        for (Score s : scores) {
            count += scoreMapper.modifyScore(s);
        }
        return count;
    }


}
