package com.wsb.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("service-stock")
public interface StockFeign {

    @PostMapping("/stock/update")
    void addStock(@RequestParam("num") Long num);
}
