package com.bootcoding.furniture.utils;

import java.util.Random;

public class VisitCountGenrator {
    final static int MAX = 599;
    final static int MIN = 10;
    static Random random = new Random();

    public static int getOrderCount() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }
}
