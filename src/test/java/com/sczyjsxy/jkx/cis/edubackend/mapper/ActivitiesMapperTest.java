package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

@SpringBootTest
public class ActivitiesMapperTest {

    @Autowired
    ActivitiesMapper activitiesMapper;

    @Test
    void queryCourseName() {
        System.out.println(activitiesMapper.getCourseName("1"));
    }

    @Test
    void queryTeacherName() {
        System.out.println(activitiesMapper.getTeacherName("1"));
    }

    @Test
    void queryScheduleId() {
        System.out.println(activitiesMapper.getScheduleId("1"));
    }

    @Test
    public void getActivitiesAndCourseMap() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1961020501");
        list.add("1861020502");
        System.out.println(activitiesMapper.getActivitiesAndCourseMap(list, "2018-2019-2"));
    }

    @Test
    public void getActivities() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1961020501");
        list.add("1861020502");
        System.out.println(activitiesMapper.getActivities(list, "2018-2019-2"));
    }

}
