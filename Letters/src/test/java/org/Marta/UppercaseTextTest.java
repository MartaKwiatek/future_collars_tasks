package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseTextTest {

    @Test
    void formatText() {
        UppercaseText uppercaseText = new UppercaseText();
        String text = "Future Collars";
        String result = uppercaseText.formatText(text);
        Assertions.assertEquals("FUTURE COLLARS", result);
    }
}