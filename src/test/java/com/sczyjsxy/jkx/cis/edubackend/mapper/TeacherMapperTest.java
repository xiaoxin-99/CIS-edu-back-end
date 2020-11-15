package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherMapperTest {

    @Autowired
    TeacherMapper teacherMapper;

    @Test
    void getTeacherName() {
        System.out.println(teacherMapper.getTeacherName("1977210002"));
    }
}
