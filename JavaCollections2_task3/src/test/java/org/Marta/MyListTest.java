package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyListTest {
    private MyList<String> myList;

    @BeforeEach
    void init() {
        myList = new MyList<>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");
        myList.add("e");
        myList.add("f");
    }

    @Test
    void shouldVerifySize() {
        //given, when
        int size = myList.size();
        //then
        Assertions.assertEquals(6, size);
    }

    @Test
    void shouldVerifyExtendingArrayIfNeeded() {
        //given
        myList.add("g");
        myList.add("h");
        myList.add("i");
        myList.add("j");
        myList.add("k");
        myList.add("l");

        //when
        int size = myList.size();

        //then
        Assertions.assertEquals(12, size);
    }

    @Test
    void shouldVerifyAddingLastElement() {
        //given, when
        boolean isAdded = myList.add("last");
        int size = myList.size();
        //then
        Assertions.assertTrue(myList.add("last"));
        Assertions.assertEquals(7, size);
    }

    @Test
    @DisplayName("Should verify getting element from specific index")
    void shouldVerifyGettingFromList() {
        //given, when
        Object element = myList.get(5);
        //then
        Assertions.assertEquals("f", element);
    }

    @Test
    @DisplayName("Should throw Runtime Exception when trying to get element from nonexistent index")
    void shouldThrowRuntimeException() {
        //given, when
        try {
            myList.get(6);
            Assertions.fail("This method should throw Runtime Exception");
        } catch (RuntimeException e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("Index out of bounds");
            Assertions.assertTrue(rightMessage);
        }
    }

    @Test
    @DisplayName("Should verify removing the first occurrence of the specified element from this list, if it is present")
    void shouldVerifyRemoveTheFirstOccurrence() {
        //given
        String toRemove1 = "a";
        String toRemove2 = "f";

        //when
        boolean isRemoved1 = myList.remove(toRemove1);
        boolean isRemoved2 = myList.remove(toRemove2);

        //then
        Assertions.assertTrue(isRemoved1);
        Assertions.assertTrue(isRemoved2);
    }

    @Test
    @DisplayName("Should verify an attempt to remove a non-existent element")
    void shouldVerifyRemoveNonExistentElement() {
        //given
        String toRemove = "Marta";

        //when
        boolean isRemoved = myList.remove(toRemove);

        //then
        Assertions.assertFalse(isRemoved);
    }
}