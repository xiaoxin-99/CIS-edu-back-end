package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CourseMapperTest {

    @Autowired
    CourseMapper courseMapper;

    @Test
    void getCourseInfo() {
        System.out.println(courseMapper.getCourse("1234567819"));
    }
}
