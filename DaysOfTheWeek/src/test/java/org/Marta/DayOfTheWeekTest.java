package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayOfTheWeekTest {

    @Test
    void shouldReturnFriday() {
        Days day = Days.FRIDAY;

        String result = DayOfTheWeek.getDay(day);

        Assertions.assertEquals("FRIDAY", result);
    }
}