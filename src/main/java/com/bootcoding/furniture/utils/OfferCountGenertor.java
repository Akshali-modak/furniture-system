package com.bootcoding.furniture.utils;

import java.util.Random;

public class OfferCountGenertor {
    final static int Max = 599;
    final static int Min = 10;
    static Random random = new Random();

    public static int getOfferCount(){
        int number = random.nextInt(Max-Min);
        return Min + number;
    }
}
