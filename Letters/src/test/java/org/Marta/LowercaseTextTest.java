package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseTextTest {

    @Test
    void formatText() {
        LowercaseText lowercaseText = new LowercaseText();
        String text = "Future Collars";
        String result = lowercaseText.formatText(text);
        Assertions.assertEquals("future collars", result);
    }
}