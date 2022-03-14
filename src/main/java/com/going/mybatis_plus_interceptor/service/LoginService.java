package com.going.mybatis_plus_interceptor.service;

import com.going.mybatis_plus_interceptor.dto.LoginDTO;

/**
 * Description: LoginService
 * Created on 2022/3/14.
 *
 * @author go
 */
public interface LoginService {

    LoginDTO getCurrentUser();

}
