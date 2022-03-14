package com.going.mybatis_plus_interceptor.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.going.mybatis_plus_interceptor.entity.OrderTbl;
import com.going.mybatis_plus_interceptor.mapper.OrderTblMapper;
import com.going.mybatis_plus_interceptor.service.OrderTblService;
import org.springframework.stereotype.Service;

/**
 * Description: OrderTblServiceImpl
 * Created on 2022/3/14.
 *
 * @author go
 */
@Service
public class OrderTblServiceImpl extends ServiceImpl<OrderTblMapper, OrderTbl> implements OrderTblService {

}
