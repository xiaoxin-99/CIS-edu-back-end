package com.sczyjsxy.jkx.cis.edubackend.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentServiceImplTest {

    @Autowired
    private StudentService studentService ;

    @Test
    public void studentTimetable (){
        String studentId = "176102050105";
        String semester = "2018-2019-2";
        studentService.studentTimetable(studentId, semester).forEach(System.out::println);
    }
}
