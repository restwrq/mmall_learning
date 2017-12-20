package com.mmall.utill;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created by 10679 on 2017/11/27.
 */
public class ProductDetailVo {
    //joda-time
    //str->data
    //date->str
    private static final String STANDARD_FORMAT="yyyy-MM-dd HH:mm:ss";
    public static Date strToDate(String dateTimeStr,String formatStr){
        DateTimeFormatter dateTimeFormatter=DateTimeFormat.forPattern(formatStr);
        DateTime dateTimel=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTimel.toDate();
    }
    public static String DateToStr(Date date,String formatStr){
      if(date==null){
          return StringUtils.EMPTY;
      }
      DateTime dateTime=new DateTime(date);
      return dateTime.toString(formatStr);
    }
    public static Date strToDate(String dateTimeStr){
        DateTimeFormatter dateTimeFormatter=DateTimeFormat.forPattern(STANDARD_FORMAT);
        DateTime dateTimel=dateTimeFormatter.parseDateTime(dateTimeStr);
        return dateTimel.toDate();
    }
    public static String DateToStr(Date date){
        if(date==null){
            return StringUtils.EMPTY;
        }
        DateTime dateTime=new DateTime(date);
        return dateTime.toString(STANDARD_FORMAT);
    }
}
