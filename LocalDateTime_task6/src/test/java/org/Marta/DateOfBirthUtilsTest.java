package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

class DateOfBirthUtilsTest {
        DateOfBirthUtils date = new DateOfBirthUtils(LocalDate.of(1989, 10, 3));

    @Test
    void shouldVerifyAge() {
        //given, when
        int age = date.getAge();
        //then
        Assertions.assertEquals(31, age);
    }

    @Test
    void shouldVerifyWeekNumber() {
        //given, when
        int week = date.getWeek();
        //then
        Assertions.assertEquals(40, week);
    }

    @Test
    void shouldVerifyDayOfWeek() {
        //given, when
        DayOfWeek day = date.getDayOfWeek();
        //then
        Assertions.assertEquals(DayOfWeek.TUESDAY, day);
    }
}