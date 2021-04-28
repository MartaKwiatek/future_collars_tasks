package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;

import java.time.Month;

class SeasonCheckerTest {

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"DECEMBER", "JANUARY", "FEBRUARY"})
    void shouldReturnWinter(Month month) {
        //given, when
        String expected = Season.WINTER.toString();
        String actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"MARCH", "APRIL", "MAY"})
    void shouldReturnSpring(Month month) {
        //given, when
        String expected = Season.SPRING.toString();
        String actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"JUNE", "JULY", "AUGUST"})
    void shouldReturnSummer(Month month) {
        //given, when
        String expected = Season.SUMMER.toString();
        String actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {"SEPTEMBER", "OCTOBER", "NOVEMBER"})
    void shouldReturnAutumn(Month month) {
        //given, when
        String expected = Season.AUTUMN.toString();
        String actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @NullSource
    void shouldReturnEmptyStringForNull(Month month) {
        //given, when
        String expected = "";
        String actual = SeasonChecker.getSeason(month);
        //then
        Assertions.assertEquals(expected, actual);
    }
}