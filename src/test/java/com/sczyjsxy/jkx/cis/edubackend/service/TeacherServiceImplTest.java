package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreDetailVo;
import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
