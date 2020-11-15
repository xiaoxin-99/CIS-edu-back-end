package com.sczyjsxy.jkx.cis.edubackend;

import com.sczyjsxy.jkx.cis.edubackend.mapper.ActivitiesMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ActivitiesMapperTest {

    @Autowired
    ActivitiesMapper activitiesMapper;

    @Test
    void queryCourseName() {
        System.out.println(activitiesMapper.queryCourseName("1"));
    }

    @Test
    void queryTeacherName() {
        System.out.println(activitiesMapper.queryTeacherName("1"));
    }

    @Test
    void queryScheduleId() {
        System.out.println(activitiesMapper.queryScheduleId("1"));
    }
}
