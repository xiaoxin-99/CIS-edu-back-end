package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ScheduleMapperTest {

    @Autowired
    ScheduleMapper scheduleMapper;

    @Test
    void queryTeachingTimeAndPlaceByScheduleId() {
        List<String> l = new ArrayList<>();
        l.add("1");l.add("2");
        System.out.println(scheduleMapper.queryTeachingTimeAndPlaceByScheduleId(l));
    }

    @Test
    void queryTeachingTimeAndPlaceByActivitiesId() {
        System.out.println(scheduleMapper.queryTeachingTimeAndPlaceByActivitiesId("1"));
    }
}
