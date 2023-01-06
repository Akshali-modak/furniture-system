package com.bootcoding.discount.student.utils;

import java.util.Random;

public class IdGenertor {
    final static int Max = 10;
    final static int Min = 1;
    static Random random = new Random();

    public static int getId(){
        int number = random.nextInt(Max-Min);
        return Min + number;
    }
}
