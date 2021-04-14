package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void getDayTest() {
        Assertions.assertEquals("FRIDAY",DayOfTheWeek.getDay(Days.FRIDAY));
    }
}