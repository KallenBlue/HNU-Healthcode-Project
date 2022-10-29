package com.zishala.healthcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zishala.healthcode.dao")
public class HealthcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(HealthcodeApplication.class, args);
  }

}
