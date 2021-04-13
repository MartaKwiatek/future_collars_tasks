package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeConverterTest {

    @Test
    void shouldSay1MinIs60Sec() {
        int minutes = 1;

        int result = TimeConverter.convertMinutesToSeconds(minutes);

        Assertions.assertEquals(60, result);
    }

    @Test
    void shouldSay12MinIs720Sec() {
        int minutes = 12;

        int result = TimeConverter.convertMinutesToSeconds(minutes);

        Assertions.assertEquals(720, result);

    }

}