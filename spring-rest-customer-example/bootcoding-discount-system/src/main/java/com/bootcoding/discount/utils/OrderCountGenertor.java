package com.bootcoding.discount.utils;

import java.util.Random;

public class OrderCountGenertor {
    final static int Max = 9999;
    final static int Min = 10;
    static Random random = new Random();

    public static int getOrderCount(){
        int number = random.nextInt(Max-Min);
        return Min + number;
    }
}
