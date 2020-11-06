package com.leave.common;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 处理时间的公共类
 */
public class DateUtil {

    public static String getCurrentDateStr(String pattern){
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String currentDateStr = format.format(new Date());
        return  currentDateStr;
    }
}
