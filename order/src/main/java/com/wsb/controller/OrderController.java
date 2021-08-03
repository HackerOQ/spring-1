package com.wsb.controller;

import com.wsb.entity.OrderDO;
import com.wsb.feign.StockFeign;
import com.wsb.mapper.OrderMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeign stockFeign;

    @Autowired
    private OrderMapper orderMapper;

    @PostMapping("/create")
    @GlobalTransactional
    public String createOrder() {
        OrderDO orderDO = new OrderDO();
        orderDO.setGoodId("001");
        orderDO.setPrice(50D);
        stockFeign.addStock(100L);
        orderMapper.insert(orderDO);
        throw new RuntimeException("异常");
//        return "create success";
    }
}
