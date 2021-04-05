package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class AgeVerificationTest {

    @Test
    void isLegalAgeTest() {
        int age1 = 1;
        int age2 = 17;
        int age3 = 18;
        int age4 = 32;
        int age5 = 100;

        Assertions.assertFalse(AgeVerification.isLegalAge(age1));
        Assertions.assertFalse(AgeVerification.isLegalAge(age2));
        Assertions.assertTrue(AgeVerification.isLegalAge(age3));
        Assertions.assertTrue(AgeVerification.isLegalAge(age4));
        Assertions.assertTrue(AgeVerification.isLegalAge(age5));
    }
}