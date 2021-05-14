package org.Marta;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyMapTest {
    MyMap myMap = new MyMap();

    @BeforeEach
    void setMyMap() {
        myMap.put("12", "text1");
        myMap.put("18", "text2");
        myMap.put("2", "text3");
        myMap.put("5", "text4");
        myMap.put("19", "text5");
        myMap.put("9", "text6");
        myMap.put("13", "text7");
        myMap.put("17", "text8");
        myMap.put("15", "text9");
    }

    @Test
    void shouldVerifyIfMapContainsKey() {
        //given, when
        boolean isPresent1 = myMap.containsKey("12");
        boolean isPresent2 = myMap.containsKey("15");
        boolean isPresent3 = myMap.containsKey("69");
        //then
        Assertions.assertTrue(isPresent1);
        Assertions.assertTrue(isPresent2);
        Assertions.assertFalse(isPresent3);
    }

    @Test
    @DisplayName("Should verify if entry from specified index is removed and and what value was assigned to this index")
    void shouldVerifyRemoving() {
        //given
        boolean isPresentBeforeRemove = myMap.containsKey("9");
        Assertions.assertTrue(isPresentBeforeRemove);

        //when
        String valueToRemove = myMap.remove("9");
        boolean isPresentAfterRemove = myMap.containsKey("9");

        //then
        Assertions.assertFalse(isPresentAfterRemove);
        Assertions.assertEquals("text6", valueToRemove);
    }

    @Test
    void shouldVerifyGettingValueForSpecifiedKey() {
        //given, when
        String value1 = myMap.get("15");
        String value2 = myMap.get("2");
        String value3 = myMap.get("19");
        String value4 = myMap.get("13");

        //then
        Assertions.assertEquals("text9", value1);
        Assertions.assertEquals("text3", value2);
        Assertions.assertEquals("text5", value3);
        Assertions.assertEquals("text7", value4);
    }

    @Test
    void shouldVerifyIfMapContainsValue() {
        //given
        String value1 = "text5";
        String value2 = "Marta";

        //when
        boolean isPresent1 = myMap.containsValue(value1);
        boolean isPresent2 = myMap.containsValue(value2);

        //then
        Assertions.assertTrue(isPresent1);
        Assertions.assertFalse(isPresent2);

    }
}