package com.wsb.controller;

import com.wsb.entity.StockDO;
import com.wsb.mapper.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @Autowired
    private StockMapper stockMapper;


    @PostMapping("/update")
    public void addStock(@RequestParam("num") Long num) {
        StockDO stockDO = new StockDO();
        stockDO.setGoodId("001");
        stockDO.setStock(num);
        stockMapper.insert(stockDO);
    }
}
