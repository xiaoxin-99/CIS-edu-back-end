package com.sczyjsxy.jkx.cis.edubackend.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeacherServiceImplTest {

    @Autowired
    TeacherService service;

    @Test
    void teacherTimetable() {
        service.teacherTimetable("1988210001", "2018-2019-2").forEach(System.out::println);
    }
}
