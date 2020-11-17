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
        String studentId = "176102050108";
        String semester = "2018-2019-2";
        studentService.studentTimetable(studentId, semester).forEach(System.out::println);
    }

    @Test
    public void studentScore() {
        String studentId = "176102050108";
        String semester = "2018-2019-2";
        studentService.studentScore(studentId, semester).forEach(System.out::println);
    }

    @Test
    public void attendance() {
        String studentId = "176102050117";
        studentService.attendance(studentId).forEach(System.out::println);
    }

}
