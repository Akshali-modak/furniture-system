package com.bootcoding.match.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MatchDateGenerator {
    final static int MAX = 20;
    final static int currentDate = 1;
    static Random random = new Random();

    public static Date getMatchDate(int days)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,days);
        return  calendar.getTime();
    }
}
