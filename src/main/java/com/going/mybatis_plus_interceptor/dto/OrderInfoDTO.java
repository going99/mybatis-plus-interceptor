package com.going.mybatis_plus_interceptor.dto;

import lombok.Data;
import lombok.ToString;

/**
 * Description: OrderInfoDTO
 * Created on 2022/3/14.
 *
 * @author go
 */
@Data
@ToString
public class OrderInfoDTO {

    private Integer userId;
    private String name;
    private String age;
    private String tenantId;
    private String commodityCode;
    private Integer count;
    private Integer money;
    private Integer deptId;

}
