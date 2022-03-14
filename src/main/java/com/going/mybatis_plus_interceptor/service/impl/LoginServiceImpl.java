package com.going.mybatis_plus_interceptor.service.impl;

import com.going.mybatis_plus_interceptor.dto.LoginDTO;
import com.going.mybatis_plus_interceptor.service.LoginService;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Description: LoginServiceImpl
 * Created on 2022/3/14.
 *
 * @author go
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public LoginDTO getCurrentUser() {
        return new LoginDTO().setUserId(666).setTenantId("000"+(new Random().nextInt(2)+1));
    }

}
