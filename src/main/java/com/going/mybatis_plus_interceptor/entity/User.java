package com.going.mybatis_plus_interceptor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Description: User
 * Created on 2022/3/14.
 *
 * @author go
 */
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("user")
public class User {

    private Integer id;
    private String name;
    private Integer age;
    private String tenantId;

}
