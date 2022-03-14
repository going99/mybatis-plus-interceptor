package com.going.mybatis_plus_interceptor.dto;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * Description: LoginDTO
 * Created on 2022/3/14.
 *
 * @author go
 */
@Data
@ToString
@Accessors(chain = true)
public class LoginDTO {

    private Integer userId;
    private String tenantId;

}
