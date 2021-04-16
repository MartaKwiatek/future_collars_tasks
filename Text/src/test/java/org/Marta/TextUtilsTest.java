package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextUtilsTest {

    @Test
    void shouldReturnTextIsEmpty() {
        String text = "";

        boolean isNotEmpty = TextUtils.isNotEmpty(text);

        Assertions.assertFalse(isNotEmpty);
    }

    @Test
    void shouldReturnTextIsNotEmpty() {
        String text = "Future Collars";

        boolean isNotEmpty = TextUtils.isNotEmpty(text);

        Assertions.assertTrue(isNotEmpty);
    }

    @Test
    void shouldReturnTextIsAPalindrome() {
        String text = "Dammit, I'm mad.";

        boolean isPalindrome = TextUtils.isPalindrome(text);

        Assertions.assertTrue(isPalindrome);
    }

    @Test
    void shouldReturnTextIsNotAPalindrome() {
        String text = "Konstantynopolitanczykowianeczka";

        boolean isPalindrome = TextUtils.isPalindrome(text);

        Assertions.assertFalse(isPalindrome);
    }

    @Test
    void shouldReturnTextLengthIs13() {
        String text = "Marta Kwiatek";

        int length = TextUtils.textLength(text);

        Assertions.assertEquals(13, length);
    }
}