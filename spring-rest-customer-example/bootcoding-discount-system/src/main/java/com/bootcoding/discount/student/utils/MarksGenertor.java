package com.bootcoding.discount.student.utils;

import java.util.Random;

public class MarksGenertor {
    final static int Max = 100;
    final static int Min = 30;
    static Random random = new Random();

    public static int getMarks(){
        int number = random.nextInt(Max-Min);
        return Min + number;
    }
}
