package com.sczyjsxy.jkx.cis.edubackend.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ChooseMapperTest {

    @Autowired
    ChooseMapper chooseMapper;

    @Test
    void queryTeachingClassId() {
        List<String> strings = chooseMapper.getTeachingClassId("176102050105");
        System.out.println(strings.toString());
    }
}
