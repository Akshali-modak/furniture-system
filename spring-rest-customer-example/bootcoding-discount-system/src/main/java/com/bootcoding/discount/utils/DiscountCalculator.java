package com.bootcoding.discount.utils;

import com.bootcoding.discount.model.Customer;

import java.util.Date;

public class DiscountCalculator {
    private static final int MAX_COUNT = 100;
    public static int getDiscount(Customer customer){
        int orderCount = customer.getOrderCount();
        int visitsCount = customer.getVisitsCount();
        int discount = calcDiscount(orderCount + visitsCount);

        return discount;
    }

    private static int calcDiscount(int totalCount) {
        if (totalCount>500){
            return 50;
        }
        return (totalCount/MAX_COUNT);
    }
}
