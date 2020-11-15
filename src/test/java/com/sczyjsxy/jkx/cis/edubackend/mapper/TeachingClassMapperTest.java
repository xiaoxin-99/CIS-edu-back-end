package com.sczyjsxy.jkx.cis.edubackend.mapper;

import com.sczyjsxy.jkx.cis.edubackend.mapper.TeachingClassMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TeachingClassMapperTest {

    @Autowired
    TeachingClassMapper mapper;

    @Test
    void getTeachingClass() {
        System.out.println(mapper.getTeachingClass("1861020502"));
    }


}
