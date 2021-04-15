package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseTextFormatterTest {

    @Test
    void shouldFormatTextToUpperCase() {
        // given
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();
        String text = "Future Collars";

        // when
        String result = upperCaseTextFormatter.formatText(text);

        // then
        Assertions.assertEquals("FUTURE COLLARS", result);
    }
}