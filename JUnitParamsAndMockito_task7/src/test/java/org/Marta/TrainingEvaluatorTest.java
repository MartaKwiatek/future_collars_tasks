package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.stream.Stream;

import static org.junit.Assert.*;

class TrainingEvaluatorTest {

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForLengthIsOne(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForLength();
        //then
        Assertions.assertEquals(1, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForKCalIsOne(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForKCal();
        //then
        Assertions.assertEquals(1, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateOne")
    void shouldVerifyRateForPulseIsOne(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForPulse();
        //then
        Assertions.assertEquals(1, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateOne() {
        Training training1 = new Training(1, 300, 176);
        Training training2 = new Training(29, 100, 190);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForLengthIsTwo(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForLength();
        //then
        Assertions.assertEquals(2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForKCalIsTwo(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForKCal();
        //then
        Assertions.assertEquals(2, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateTwo")
    void shouldVerifyRateForPulseIsTwo(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForPulse();
        //then
        Assertions.assertEquals(2, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateTwo() {
        Training training1 = new Training(30, 301, 160);
        Training training2 = new Training(60, 399, 175);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForLengthIsThree(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForLength();
        //then
        Assertions.assertEquals(3, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForKCalIsThree(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForKCal();
        //then
        Assertions.assertEquals(3, actual);
    }

    @ParameterizedTest
    @MethodSource("provideSampleTrainingsRateThree")
    void shouldVerifyRateForPulseIsThree(Training training) {
        //given, when
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        int actual = trainingEvaluator.rateForPulse();
        //then
        Assertions.assertEquals(3, actual);
    }

    private static Stream<Arguments> provideSampleTrainingsRateThree() {
        Training training1 = new Training(61,400 , 159);
        Training training2 = new Training(720, 3000, 30);
        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2)
        );
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalLengthException")
    void shouldThrowIllegalLengthException(Training training) throws Exception {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);

        try {
            //when
            double actual = trainingEvaluator.evaluateTraining();
            fail("This method should throw IllegalLengthException");
        } catch (IllegalLength e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("The length of training should be in the range of 1 - 720 minutes");
            Assertions.assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalLengthException() {
        Training training1 = new Training(0,400 , 159);
        Training training2 = new Training(-100, 3000, 30);
        Training training3 = new Training(721, 3000, 30);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2),
                Arguments.of(training3)
        );
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalKCalException")
    void shouldThrowIllegalKCalException(Training training) throws Exception {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);

        try {
            //when
            double actual = trainingEvaluator.evaluateTraining();
            fail("This method should throw IllegalKcalException");
        } catch (IllegalKCal e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("calories burned should be in the range of 1 - 3000");
            Assertions.assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalKCalException() {
        Training training1 = new Training(40,-300 , 159);
        Training training2 = new Training(40, 3001, 30);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2)
        );
    }

    @ParameterizedTest
    @NullSource
    @MethodSource("provideSampleTrainingsWithIllegalPulseException")
    void shouldThrowIllegalPulseException(Training training) throws Exception {
        //given
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);

        try {
            //when
            double actual = trainingEvaluator.evaluateTraining();
            fail("This method should throw IllegalPulseException");
        } catch (IllegalPulse e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("Hmmm, so you are dead xD");
            Assertions.assertTrue(rightMessage);
        }
    }

    private static Stream<Arguments> provideSampleTrainingsWithIllegalPulseException() {
        Training training1 = new Training(40,300 , 0);
        Training training2 = new Training(40, 500, 400);

        return Stream.of(
                Arguments.of(training1),
                Arguments.of(training2)
        );
    }

    @Test
    void testForPrimaSortTraining() {
        //given
        Training training = new Training(40, 349, 155);
        TrainingEvaluator trainingEvaluator = new TrainingEvaluator(training);
        //when
        double actual = trainingEvaluator.evaluateTraining();
        //then
        Assertions.assertEquals(15.0, actual);
    }
}