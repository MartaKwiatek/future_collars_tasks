package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LowerCaseTextFormatterTest {

    @Test
    void shouldFormatTextToLowerCase() {
        // given
        LowerCaseTextFormatter lowerCaseTextFormatter = new LowerCaseTextFormatter();
        String text = "Future Collars";

        // when
        String result = lowerCaseTextFormatter.formatText(text);

        // then
        Assertions.assertEquals("future collars", result);
    }
}