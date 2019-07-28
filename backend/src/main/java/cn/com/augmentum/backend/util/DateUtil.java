package cn.com.augmentum.backend.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


    public static int daysBetween(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        long time1 = 0;
        long time2 = 0;

        try {
            cal.setTime(sdf.parse(date));//effective date
            time1 = cal.getTimeInMillis();
            cal.setTime(new Date());//current date
            time2 = cal.getTimeInMillis();
        } catch (Exception e) {
            e.printStackTrace();
        }

        long between_days = (time1 - time2) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }


    public static Boolean noNewDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Long time1 = Long.parseLong(sdf.format(date));
        Long time2 = Long.parseLong(sdf.format(new Date()));

        if(time1.equals(time2)){
            return false;
        }

        return true;
    }

    public static String getDateNow() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        return sdf.format(new Date());
    }

    public static String getDateFomat() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return sdf.format(new Date());
    }


}
