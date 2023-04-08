package com.bootcoding.furniture.controller;

import com.bootcoding.furniture.service.DiwaliDiscountService;
import com.bootcoding.furniture.utils.CalculateDiscount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiwaliDiscountController {
    @Autowired
    DiwaliDiscountService diwaliDiscountService;

    @GetMapping("/discount/customer")
    public List<CalculateDiscount> getAllCustomerDiscount(){

        return diwaliDiscountService.getAllCustomerDiscount();
    }
//    @PostMapping("/addDiscount")
//    public List<CalculateDiscount> addDiscount(){
//      return diwaliDiscountService.addDiscount();
//    }
}
