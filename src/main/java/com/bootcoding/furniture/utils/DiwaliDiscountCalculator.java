package com.bootcoding.furniture.utils;

import com.bootcoding.furniture.modal.Customer;

public class DiwaliDiscountCalculator {
    private static final int MAX_COUNT = 100;
    public static int getDiscount(Customer customer){
        int orderCount = customer.getOfferCount();
        int visitsCount = customer.getVisitCount();
        int discount = calcDiscount(orderCount + visitsCount);

        return discount;
    }

    private static int calcDiscount(int totalCount) {
        if (totalCount >= 1 && totalCount <=249){
            return 10;
        }
        else if (totalCount >= 250 && totalCount <= 599){
            return 35;
        } else if (totalCount >= 500 && totalCount <= 749 ) {
            return 40;
        } else if (totalCount >= 850) {
            return 50;
        }
        return (totalCount/MAX_COUNT);
    }
}
