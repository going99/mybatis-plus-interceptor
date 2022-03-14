package com.going.mybatis_plus_interceptor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.going.mybatis_plus_interceptor.mapper")
@SpringBootApplication
public class MybatisPlusInterceptorApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusInterceptorApplication.class, args);
    }

}
