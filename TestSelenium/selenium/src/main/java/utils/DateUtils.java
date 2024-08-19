package utils;

import java.time.LocalDate;

public class DateUtils {

    public static String getTodayDate() {
        LocalDate localDate = LocalDate.now();
        return String.valueOf(localDate.getDayOfMonth());
    }

    public static String getCurrentMonth() {
        LocalDate localDate = LocalDate.now();
        return localDate.getMonth().toString();
    }

    public static int getCurrentYear() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear();
    }
}