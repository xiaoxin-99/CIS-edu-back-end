package com.sczyjsxy.jkx.cis.edubackend.service;

import com.sczyjsxy.jkx.cis.edubackend.model.entity.ClassScoreVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeacherServiceImplTest {

    @Autowired
    TeacherService service;

    @Test
    void teacherTimetable() {
        service.teacherTimetable("1988210001", "2018-2019-2").forEach(System.out::println);
    }

    @Test
    void getClassScore() {
        service.getClass("1977210002");
    }

    @Test
    void getClassScore2(){
        List<ClassScoreVo> classScore = service.getClassScore("1961020501");
        classScore.forEach(System.out::println);

    }

}
