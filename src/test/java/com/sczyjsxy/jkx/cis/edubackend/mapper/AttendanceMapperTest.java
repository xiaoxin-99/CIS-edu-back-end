package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AttendanceMapperTest {

    @Autowired
    private AttendanceMapper attendanceMapper;

    @Test
    public void getAttendanceByStudentId() {
        System.out.println(attendanceMapper.getAttendanceByStudentId("176102050117"));
    }
}
