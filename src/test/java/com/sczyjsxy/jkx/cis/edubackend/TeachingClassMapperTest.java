package com.sczyjsxy.jkx.cis.edubackend;

import com.sczyjsxy.jkx.cis.edubackend.mapper.TeachingClassMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeachingClassMapperTest {

    @Autowired
    TeachingClassMapper mapper;

    @Test
    public void TeachingClassMapper() {
        System.out.println(mapper.getActivitiesAndCourseMap("1961020501", "2018-2019-2"));
    }
}
