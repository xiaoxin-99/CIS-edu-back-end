package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.dao.TeacherTimetable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

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
//        System.out.println(activitiesMapper.getActivitiesByTeachingClassId(list, "2018-2019-2"));
    }

    @Test
    void getActivitiesByTeacherId() {
        List<TeacherTimetable> activitiesByTeacherId = activitiesMapper.getActivitiesByTeacherId("1988210001", "2018-2019-2");
        System.out.println(activitiesByTeacherId);

    }

}
