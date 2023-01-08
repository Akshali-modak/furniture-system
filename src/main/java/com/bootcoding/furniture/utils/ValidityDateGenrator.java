package com.bootcoding.furniture.utils;

import java.util.Random;

public class ValidityDateGenrator {
    final static int MAX = 20;
    final static int MIN = 1;
    static Random random = new Random();

    public static int getValidityDate(){
        int date = random.nextInt(MAX-MIN);
        return MIN + date;
    }
}
