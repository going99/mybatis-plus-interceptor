package com.going.mybatis_plus_interceptor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.going.mybatis_plus_interceptor.entity.User;
import com.going.mybatis_plus_interceptor.mapper.UserMapper;
import com.going.mybatis_plus_interceptor.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Description: UserServiceImpl
 * Created on 2022/3/14.
 *
 * @author go
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
