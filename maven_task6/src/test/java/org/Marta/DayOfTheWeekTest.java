package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayOfTheWeekTest {

    @Test
    void shouldSayItIsMonday() {
        int day = 1;

        Assertions.assertEquals("Monday", DayOfTheWeek.whichDay(day));
    }

    @Test
    void shouldSayItIsWeekend() {
        int day = 6;

        Assertions.assertEquals("Weekend", DayOfTheWeek.whichDay(day));
    }

    @Test
    void shouldSayThereIsNoSuchADay() {
        int day = 454;

        Assertions.assertEquals("There is no such a day!", DayOfTheWeek.whichDay(day));
    }
}