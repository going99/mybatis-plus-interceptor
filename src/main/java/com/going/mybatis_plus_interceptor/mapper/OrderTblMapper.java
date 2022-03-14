package com.going.mybatis_plus_interceptor.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.going.mybatis_plus_interceptor.dto.OrderInfoDTO;
import com.going.mybatis_plus_interceptor.entity.OrderTbl;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Description: OrderTblMapper
 * Created on 2022/3/14.
 *
 * @author go
 */
@Repository
public interface OrderTblMapper extends BaseMapper<OrderTbl> {

    List<OrderInfoDTO> getOrderList();

}
