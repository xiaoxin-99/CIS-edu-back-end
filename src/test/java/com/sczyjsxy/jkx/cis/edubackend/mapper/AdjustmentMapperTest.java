package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.common.TeachingWeekAndTimeAndPlace;
import com.sczyjsxy.jkx.cis.edubackend.model.dao.common.Adjustment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class AdjustmentMapperTest {

    @Autowired
    private AdjustmentMapper adjustmentMapper;

    @Test
    void getAllAdjustment() {
        List<Adjustment> allAdjustment = adjustmentMapper.getAllAdjustment("1988210010");
        allAdjustment.forEach(System.out::println);
    }

    @Test
    void addAdjustment() {
        Adjustment adjustment = new Adjustment();
        adjustment.setCause("aaa");
        adjustment.setReplaceTeacher("张三丰");
        adjustment.setSubmitTime(LocalDateTime.now());
        adjustment.setTeacherId("1988210010");

        TeachingWeekAndTimeAndPlace t = new TeachingWeekAndTimeAndPlace();
        t.setWeekNum(2);
        TeachingTimeAndPlace teachingTimeAndPlace = new TeachingTimeAndPlace();
        teachingTimeAndPlace.setWeek(3);
        teachingTimeAndPlace.setPlace("致远楼101");
        teachingTimeAndPlace.setSection(1);
        t.setTimeAndPlace(teachingTimeAndPlace);

        adjustment.setBefore(t);

        TeachingWeekAndTimeAndPlace t1 = new TeachingWeekAndTimeAndPlace();
        t1.setWeekNum(3);
        TeachingTimeAndPlace teachingTimeAndPlace1 = new TeachingTimeAndPlace();
        teachingTimeAndPlace1.setWeek(2);
        teachingTimeAndPlace1.setPlace("致远楼101");
        teachingTimeAndPlace1.setSection(4);
        t1.setTimeAndPlace(teachingTimeAndPlace);

        adjustment.setAfter(t1);

        System.out.println(adjustmentMapper.addAdjustment(adjustment));

    }

    @Test
    void deleteAjustment() {
        System.out.println(adjustmentMapper.deleteAdjustment("4"));
    }
}
