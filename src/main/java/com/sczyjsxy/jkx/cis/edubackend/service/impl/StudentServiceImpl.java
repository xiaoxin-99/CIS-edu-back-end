package com.sczyjsxy.jkx.cis.edubackend.service.impl;

import com.sczyjsxy.jkx.cis.edubackend.mapper.*;
import com.sczyjsxy.jkx.cis.edubackend.model.common.ScoreDetails;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingActivities;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Activities;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentScoreVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.StudentTimetableVo;
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

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public List<StudentTimetableVo> studentTimetable(String studentId, String semester) {
        ArrayList<StudentTimetableVo> list = new ArrayList<>(16);

        List<Activities> activities = getActivities(studentId,semester);

        for (Activities act : activities) {
            List<TeachingTimeAndPlace> timeAndPlaceList =
                    scheduleMapper.getTeachingTimeAndPlaceByActivitiesId(act.getActivitiesId());
            for (TeachingTimeAndPlace timeAndPlace : timeAndPlaceList) {
                StudentTimetableVo studentActivities = new StudentTimetableVo();
                TeachingActivities teachingActivities = new TeachingActivities();
                teachingActivities.setCourse(act.getCourse().getCourseName());
                teachingActivities.setPlan(act.getPlan());
                teachingActivities.setTimeAndPlace(timeAndPlace);
                studentActivities.setActivities(teachingActivities);
                studentActivities.setTeacher(act.getTeacher().getName());
                list.add(studentActivities);
            }
        }

        return list;
    }

    @Override
    public List<StudentScoreVo> studentScore(String studentId, String semester) {
        ArrayList<StudentScoreVo> list = new ArrayList<>(16);

        List<Activities> activities = getActivities(studentId,semester);

        for (Activities act : activities) {
            StudentScoreVo scoreVo = new StudentScoreVo();
            scoreVo.setCourse(act.getCourse().getCourseName());
            scoreVo.setTeacher(act.getTeacher().getName());
            Score score = scoreMapper.getScoreByStudentIdAndActivitiesId(studentId, act.getActivitiesId());
            if (score != null){
                ScoreDetails scoreDetails = new ScoreDetails();
                scoreDetails.setPerformanceScore(score.getPerformanceScore());
                scoreDetails.setExamScore(score.getExamScore());
                scoreDetails.setStatus(score.getStatus());
                scoreVo.setScore(scoreDetails);
            }
            list.add(scoreVo);
        }

        return list;
    }

    private List<Activities> getActivities (String studentId, String semester){
        // 查询学生所选班级
        List<String> teachingClassIds = chooseMapper.getTeachingClassId(studentId);

        List<Activities> activities = activitiesMapper
                .getActivitiesByTeachingClassId(teachingClassIds, semester);

        for (Activities item : activities) {
            item.setTeacher(teacherMapper.
                    getTeacher(item.getTeacher().getId()));
            item.setCourse(courseMapper.
                    getCourse(item.getCourse().getCourseId()));
        }
        return activities;
    }
}


