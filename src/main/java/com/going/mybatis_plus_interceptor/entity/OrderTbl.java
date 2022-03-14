package com.going.mybatis_plus_interceptor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * Description: OrderTbl
 * Created on 2022/3/14.
 *
 * @author go
 */
@ToString
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("order_tbl")
public class OrderTbl {

    private Integer id;
    private Integer userId;
    private String commodityCode;
    private Integer count;
    private Integer money;
    private Integer deptId;
    private Integer tenantId;

}
