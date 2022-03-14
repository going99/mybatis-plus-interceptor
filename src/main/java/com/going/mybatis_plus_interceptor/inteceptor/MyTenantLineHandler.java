package com.going.mybatis_plus_interceptor.inteceptor;

import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import com.going.mybatis_plus_interceptor.service.LoginService;
import com.going.mybatis_plus_interceptor.service.UserService;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;
import net.sf.jsqlparser.schema.Column;

import java.util.List;

/**
 * Description: MyTenantLineHandler
 * Created on 2022/3/14.
 *
 * @author go
 */
@Slf4j
public class MyTenantLineHandler implements TenantLineHandler {

    private LoginService loginService;

    public MyTenantLineHandler(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 获取租户 ID 值表达式，只支持单个 ID 值
     * <p>
     *
     * @return 租户 ID 值表达式
     */
    @Override
    public Expression getTenantId() {
        log.info("==========================getTenantId");
        String userTenantId = loginService.getCurrentUser().getTenantId();
        return new StringValue(userTenantId);
    }

    /**
     * 获取租户字段名
     * <p>
     * 默认字段名叫: tenant_id
     *
     * @return 租户字段名
     */
    @Override
    public String getTenantIdColumn() {
        return TenantLineHandler.super.getTenantIdColumn();
    }

    /**
     * 根据表名判断是否忽略拼接多租户条件
     * <p>
     * 默认都要进行解析并拼接多租户条件
     *
     * @param tableName 表名
     * @return 是否忽略, true:表示忽略，false:需要解析并拼接多租户条件
     */
    @Override
    public boolean ignoreTable(String tableName) {
        return "user".equalsIgnoreCase(tableName);
    }

    /**
     * 忽略插入租户字段逻辑
     *
     * @param columns        插入字段
     * @param tenantIdColumn 租户 ID 字段
     * @return
     */
    @Override
    public boolean ignoreInsert(List<Column> columns, String tenantIdColumn) {
        boolean ignoreInsert = TenantLineHandler.super.ignoreInsert(columns, tenantIdColumn);
        return ignoreInsert;
    }

}
