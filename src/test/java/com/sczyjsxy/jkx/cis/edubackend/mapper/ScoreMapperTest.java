package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
}
