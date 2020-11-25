package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingWeekAndTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Adjustment;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreDetailVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class TeacherServiceImplTest {

    @Autowired
    TeacherService service;

    @Test
    void teacherTimetable() {
        service.teacherTimetable("1988210001", "2018-2019-2").forEach(System.out::println);
    }

    @Test
    void getClassScore() {
        service.getClassDetail("1977210002");
    }

    @Test
    void getClassScore2(){
        List<ClassScoreVo> classScore = service.getClassScore("1961020501");
        classScore.forEach(System.out::println);

    }

    @Test
    void getClassDetail() {
        List<ClassScoreDetailVo> classDetail = service.getClassDetail("1977210002");
        classDetail.forEach(System.out::println);
    }

    @Test
    void modifyScore() {
        List<Score> scores = new ArrayList<>();
        Score score = new Score();
        score.setPerformanceScore(880);
        score.setExamScore(770);
        score.setScoreId("1");
        scores.add(score);
        Score score1= new Score();
        score1.setPerformanceScore(870);
        score1.setExamScore(770);
        score1.setScoreId("2");
        scores.add(score1);
        Integer integer = service.modifyScore(scores);
        System.out.println(integer);
    }

    @Test
    void confirmScore() {
        System.out.println(service.confirmScore("1"));
    }

    @Test
    void getAllAdjustment() {
        List<Adjustment> allAdjustment = service.getAllAdjustment("1988210010");
        allAdjustment.forEach(System.out::println);
    }

    @Test
    void addAdjustment() {
        Adjustment adjustment = new Adjustment();
        adjustment.setCause("aaa");
        adjustment.setReplaceTeacher("张三丰");
        adjustment.setSubmitTime(LocalDateTime.now());

        TeachingWeekAndTimeAndPlace t = new TeachingWeekAndTimeAndPlace();
        t.setWeekNum(2);
        TeachingTimeAndPlace teachingTimeAndPlace = new TeachingTimeAndPlace();
        teachingTimeAndPlace.setWeek(3);
        teachingTimeAndPlace.setPlace("致远楼101");
        teachingTimeAndPlace.setSection(1);
        t.setTimeAndPlace(teachingTimeAndPlace);

        adjustment.setBefore(t);

        TeachingWeekAndTimeAndPlace t1 = new TeachingWeekAndTimeAndPlace();
        t1.setWeekNum(3);
        TeachingTimeAndPlace teachingTimeAndPlace1 = new TeachingTimeAndPlace();
        teachingTimeAndPlace1.setWeek(2);
        teachingTimeAndPlace1.setPlace("致远楼101");
        teachingTimeAndPlace1.setSection(4);
        t1.setTimeAndPlace(teachingTimeAndPlace);

        adjustment.setAfter(t1);

        String teacherId = "1988210010";

        Integer integer = service.addAdjustment(adjustment, teacherId);
        System.out.println(integer);
    }

    @Test
    void deleteAdjustment() {
        System.out.println(service.deleteAdjustment("6"));
    }

}
