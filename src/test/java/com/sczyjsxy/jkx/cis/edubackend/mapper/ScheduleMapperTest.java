package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.mapper.ScheduleMapper;
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
    void queryTeachingTimeAndPlace() {
        List<String> l = new ArrayList<String>();
        l.add("1");l.add("2");
        System.out.println(scheduleMapper.queryTeachingTimeAndPlace(l));
    }
}
