package com.sczyjsxy.jkx.cis.edubackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lx
 */
@SpringBootApplication
@MapperScan("com.sczyjsxy.jkx.cis.edubackend.mapper")
public class EduBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(EduBackEndApplication.class, args);
    }

}
