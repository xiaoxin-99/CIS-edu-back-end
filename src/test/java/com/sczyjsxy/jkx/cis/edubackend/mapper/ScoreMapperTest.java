package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Score;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ScoreMapperTest {

    @Autowired
    private ScoreMapper scoreMapper;

    @Test
    public void getScoreByStudentIdAndActivitiesId() {
        String studentId = "176102050108";
        String activitiesId = "1";
        int status = 1;
        System.out.println(scoreMapper
                .getScoreByStudentIdAndActivitiesId(studentId, activitiesId,status));
        System.out.println("=======================================================");
        status = 0;
        System.out.println(scoreMapper
                .getScoreByStudentIdAndActivitiesId(studentId, activitiesId,status));
        System.out.println("=======================================================");
        System.out.println(scoreMapper
                .getScoreByStudentIdAndActivitiesId(studentId, activitiesId,null));
    }

    @Test
    void getClassScoreDetail() {
        scoreMapper.getClassScoreDetail("1977210002").forEach(System.out::println);
    }

    @Test
    void getScoreStatus() {
        System.out.println(scoreMapper.getScoreStatus(1));
    }

    @Test
    void getStudentScore() {
        scoreMapper.getStudent("1961020501").forEach(System.out::println);
    }

    @Test
    void getScoreByStudent() {
        List<String> students = scoreMapper.getStudent("1961020501");
        scoreMapper.getScoreByStudent(students).forEach(System.out::println);
    }

    @Test
    void modifyScore() {
        Score score = new Score();
        score.setPerformanceScore(880);
        score.setExamScore(770);
        score.setScoreId("1");
        int i = scoreMapper.modifyScore(score);
        System.out.println(i);
    }

}
