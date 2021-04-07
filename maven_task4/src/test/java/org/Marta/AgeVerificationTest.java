package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class AgeVerificationTest {

    @Test
    void shouldSayThat1isNotLegalAge() {
        int age = 1;
        Assertions.assertFalse(AgeVerification.isLegalAge(age));
    }

    @Test
    void shouldSayThat17isNotLegalAge() {
        int age = 17;
        Assertions.assertFalse(AgeVerification.isLegalAge(age));
    }

    @Test
    void shouldSayThat18isLegalAge() {
        int age = 18;
        Assertions.assertTrue(AgeVerification.isLegalAge(age));
    }

    @Test
    void shouldSayThat32isLegalAge() {
        int age = 32;
        Assertions.assertTrue(AgeVerification.isLegalAge(age));
    }

}