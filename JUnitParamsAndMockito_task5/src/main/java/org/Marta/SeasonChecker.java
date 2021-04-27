package org.Marta;

import java.time.Month;

public class SeasonChecker {
    public static String getSeason(Month month) {
        if (month == null) {
            return "";
        }
        String season = "";
        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                season = Season.WINTER.toString();
                break;
            case MARCH:
            case APRIL:
            case MAY:
                season = Season.SPRING.toString();
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                season = Season.SUMMER.toString();
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                season = Season.AUTUMN.toString();
        }
        return season;
    }
}
