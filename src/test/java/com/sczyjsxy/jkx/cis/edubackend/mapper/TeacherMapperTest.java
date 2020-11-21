package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.TeachingLog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class TeacherMapperTest {

    @Autowired
    TeacherMapper teacherMapper;

    @Test
    void getTeacherName() {
        System.out.println(teacherMapper.getTeacher("1977210002"));
    }

    @Test
    void getAllLog() {
        teacherMapper.getAllLog("1977210002").forEach(System.out::println);
    }

    @Test
    void addTeachingLog() {
        TeachingLog teachingLog = new TeachingLog();
        teachingLog.setClassName("php一班");
        teachingLog.setRoom("致远楼407");
        teachingLog.setWeekNum(1);
        teachingLog.setWeek(2);
        teachingLog.setSection(3);
        teachingLog.setRecordTime(LocalDateTime.now());
        teachingLog.setContent("上php课程");
        Integer integer = teacherMapper.addTeachingLog(teachingLog, "1977210002");
        System.out.println(integer);
    }

}
