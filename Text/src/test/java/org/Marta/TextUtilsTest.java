package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextUtilsTest {

    @Test
    void shouldReturnTextIsEmpty() {
        //given
        String text = "";
        //when
        boolean isNotEmpty = TextUtils.isNotEmpty(text);
        //then
        Assertions.assertFalse(isNotEmpty);
    }

    @Test
    void shouldReturnTextIsNotEmpty() {
        //given
        String text = "Future Collars";
        //when
        boolean isNotEmpty = TextUtils.isNotEmpty(text);
        //then
        Assertions.assertTrue(isNotEmpty);
    }

    @Test
    void shouldReturnTextIsAPalindrome() {
        //given
        String text = "Dammit, I'm mad.";
        //when
        boolean isPalindrome = TextUtils.isPalindrome(text);
        //then
        Assertions.assertTrue(isPalindrome);
    }

    @Test
    void shouldReturnTextIsNotAPalindrome() {
        //given
        String text = "Konstantynopolitanczykowianeczka";
        //when
        boolean isPalindrome = TextUtils.isPalindrome(text);
        //then
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    void shouldReturnEmptyTextIsNotAPalindrome() {
        //given
        String text = "";
        //when
        boolean isPalindrome = TextUtils.isPalindrome(text);
        //then
        Assertions.assertFalse(isPalindrome);
    }

    @Test
    void shouldReturnTextLengthIs13() {
        //given
        String text = "Marta Kwiatek";
        //when
        int length = TextUtils.textLength(text);
        //then
        Assertions.assertEquals(13, length);
    }
}