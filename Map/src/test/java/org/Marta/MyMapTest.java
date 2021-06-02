package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMapTest {
    private MyMap<String, String> myMap;

    @BeforeEach
    void setUp() {
        myMap = new MyMap<>();
    }

    @Test
    void shouldVerifyIfMapIsEmpty() {
        //given, when
        boolean isEmpty = myMap.isEmpty();
        //then
        Assertions.assertTrue(isEmpty);
    }

    @Test
    void shouldVerifyIfMapIsNotEmpty() {
        //given
        myMap.put("1", "Marta");
        myMap.put("2", "Jaro");

        //when
        boolean isEmpty = myMap.isEmpty();

        //then
        Assertions.assertFalse(isEmpty);
    }

    @Test
    void shouldVerifyGettingValueWithSpecificKey() {
        //given
        myMap.put("4", "Justyna");

        //when
        String value = myMap.get("4");

        //then
        Assertions.assertEquals("Justyna", value);
    }

    @Test
    void shouldVerifyGettingNullValue() {
        //given
        myMap.put("5", null);

        //when
        String value = myMap.get("5");

        //then
        Assertions.assertNull(value);
    }

    @Test
    void shouldVerifyGettingValueWithNonExistingKey() {
        //given, when
        String value = myMap.get("5");

        //then
        Assertions.assertNull(value);
    }

    @Test
    void shouldVerifyGettingValueWithNullKey() {
        //given
        myMap.put(null, "Ewelina");

        //when
        String value = myMap.get(null);

        //then
        Assertions.assertEquals("Ewelina", value);
    }

    @Test
    void shouldOverrideExistingValue() {
        //given
        myMap.put("1", "Justyna");
        myMap.put("1", "Marta");

        //when
        String value = myMap.get("1");

        //then
        Assertions.assertEquals("Marta", value);
    }

    @Test
    void shouldReturnRemovedValue() {
        //given
        myMap.put("1", "Marta");

        //when
        String removedValue = myMap.remove("1");

        //then
        Assertions.assertEquals("Marta", removedValue);
    }

    @Test
    void shouldNotContainKey() {
        //given, when
        boolean containKey = myMap.containsKey("jkhhk");

        //then
        Assertions.assertFalse(containKey);
    }

    @Test
    void shouldContainKey() {
        //given
        myMap.put("key1", "value1");

        // when
        boolean containKey = myMap.containsKey("key1");

        //then
        Assertions.assertTrue(containKey);
    }

    @Test
    void shouldNotContainValue() {
        //given
        myMap.put("1", "A");
        myMap.put("2", "B");

        // when
        boolean containValue = myMap.containsValue("Future Collars");

        //then
        Assertions.assertFalse(containValue);
    }

    @Test
    void shouldContainValue() {
        //given
        myMap.put("1", "A");
        myMap.put("2", "B");

        // when
        boolean containValue = myMap.containsValue("A");

        //then
        Assertions.assertTrue(containValue);
    }
}