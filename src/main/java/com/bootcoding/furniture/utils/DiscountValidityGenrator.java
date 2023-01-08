package com.bootcoding.furniture.utils;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class DiscountValidityGenrator {

    public static Date getValidity(int days){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DATE,days);
        return calendar.getTime();
    }


}
