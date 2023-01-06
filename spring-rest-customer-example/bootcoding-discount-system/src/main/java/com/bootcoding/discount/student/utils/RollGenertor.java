package com.bootcoding.discount.student.utils;

import java.util.Random;

public class RollGenertor {
    final static int Max = 80;
    final static int Min = 1;
    static Random random = new Random();

    public static int getRollNo(){
        int number = random.nextInt(Max-Min);
        return Min + number;
    }
}
