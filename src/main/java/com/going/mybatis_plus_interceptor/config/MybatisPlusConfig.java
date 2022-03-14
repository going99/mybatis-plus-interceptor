package com.going.mybatis_plus_interceptor.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.*;
import com.going.mybatis_plus_interceptor.inteceptor.MyDataPermissionHandler;
import com.going.mybatis_plus_interceptor.inteceptor.MyTenantLineHandler;
import com.going.mybatis_plus_interceptor.service.LoginService;
import com.going.mybatis_plus_interceptor.service.UserService;
import org.apache.ibatis.type.JdbcType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created on 2021/6/28
 * desc()
 *
 * @author JAGO
 */
@Configuration
public class MybatisPlusConfig {

    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        paginationInnerInterceptor.setOverflow(true);
        paginationInnerInterceptor.setMaxLimit(1000L);
        paginationInnerInterceptor.setOptimizeJoin(true);
        interceptor.addInnerInterceptor(paginationInnerInterceptor);

        DataPermissionInterceptor permissionInterceptor=new DataPermissionInterceptor();
        permissionInterceptor.setDataPermissionHandler(new MyDataPermissionHandler());
        interceptor.addInnerInterceptor(permissionInterceptor);

        TenantLineInnerInterceptor tenantLineInnerInterceptor = new TenantLineInnerInterceptor();
        tenantLineInnerInterceptor.setTenantLineHandler(new MyTenantLineHandler(ApplicationContextHolder.getBean(LoginService.class)));
        interceptor.addInnerInterceptor(tenantLineInnerInterceptor);

        return interceptor;
    }

    /**
     * configurationCustomizer
     * @return
     */
    @Bean
    public ConfigurationCustomizer configurationCustomizer() {
        return configuration -> {
            configuration.setCacheEnabled(true);
            configuration.setMapUnderscoreToCamelCase(true);
            configuration.setCallSettersOnNulls(true);
            configuration.setJdbcTypeForNull(JdbcType.NULL);
        };
    }

}
