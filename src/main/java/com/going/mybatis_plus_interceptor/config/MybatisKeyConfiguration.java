package com.going.mybatis_plus_interceptor.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 序列化过程把返回给前端的所有Long类型转换成String类型
 * Created on 2022/2/17.
 *
 * @author go
 */
@Configuration
public class MybatisKeyConfiguration implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        final ObjectMapper objectMapper = new ObjectMapper();
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        objectMapper.registerModule(simpleModule);
    }

}
