package com.going.mybatis_plus_interceptor.controller;

import com.going.mybatis_plus_interceptor.dto.OrderInfoDTO;
import com.going.mybatis_plus_interceptor.entity.OrderTbl;
import com.going.mybatis_plus_interceptor.mapper.OrderTblMapper;
import com.going.mybatis_plus_interceptor.service.OrderTblService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description: IndexController
 * Created on 2022/3/14.
 *
 * @author go
 */
@RestController
@AllArgsConstructor
public class IndexController {

    private final OrderTblService tblService;
    private final OrderTblMapper tblMapper;

    @GetMapping(value = "/index")
    public String index(){
        return "Hello..";
    }

    @GetMapping(value = "/list")
    public Object list(){
        List<OrderTbl> list = tblService.list();
        return list;
    }

    @GetMapping(value = "/list1")
    public Object list1(){
        List<OrderInfoDTO> list = tblMapper.getOrderList();
        return list;
    }

}
