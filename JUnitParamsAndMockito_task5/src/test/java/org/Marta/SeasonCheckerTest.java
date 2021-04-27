package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

class SeasonCheckerTest {

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldReturnWinter(Month month) {
        //given, when
        Season expected = Season.WINTER;
        Season actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldReturnSpring(Month month) {
        //given, when
        Season expected = Season.SPRING;
        Season actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldReturnSummer(Month month) {
        //given, when
        Season expected = Season.SUMMER;
        Season actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldReturnAutumn(Month month) {
        //given, when
        Season expected = Season.AUTUMN;
        Season actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }
}