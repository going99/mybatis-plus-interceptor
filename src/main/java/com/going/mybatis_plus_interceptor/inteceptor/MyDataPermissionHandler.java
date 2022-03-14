package com.going.mybatis_plus_interceptor.inteceptor;

import com.baomidou.mybatisplus.extension.plugins.handler.DataPermissionHandler;
import lombok.extern.slf4j.Slf4j;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.TimeValue;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Objects;

/**
 * Description: MyDataPermissionHandler
 * Created on 2022/3/14.
 *
 * @author go
 */
@Slf4j
public class MyDataPermissionHandler implements DataPermissionHandler {

    /**
     * 获取数据权限 SQL 片段
     *
     * @param where             待执行 SQL Where 条件表达式
     * @param mappedStatementId Mybatis MappedStatement Id 根据该参数可以判断具体执行方法
     * @return JSqlParser 条件表达式
     */
    @Override
    public Expression getSqlSegment(Expression where, String mappedStatementId) {
        log.info("..............mappedStatementId = " + mappedStatementId);
        if (Objects.isNull(where)) {
            Time time = Time.valueOf(LocalTime.now());
            TimeValue value = new TimeValue(String.valueOf(time));
            return value;
        }
        log.info("..............where = " + where);
        return where;
    }

}
