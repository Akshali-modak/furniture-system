package com.bootcoding.discount.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class DiscountValidityGenrator {

    public static Date getValidity(int days){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,days);
        return calendar.getTime();

    }


}
