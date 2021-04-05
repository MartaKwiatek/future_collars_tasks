package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void whichDayTest() {
        int day1 = 1;
        int day2 = 6;
        int day3 = 454;

        Assertions.assertEquals("Monday", DayOfTheWeek.whichDay(day1));
        Assertions.assertEquals("Weekend", DayOfTheWeek.whichDay(day2));
        Assertions.assertEquals("There is no such a day!", DayOfTheWeek.whichDay(day3));
    }
}