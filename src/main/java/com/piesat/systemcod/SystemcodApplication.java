package com.piesat.systemcod;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.piesat.systemcod.mapper"})
public class SystemcodApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemcodApplication.class, args);
    }
}
