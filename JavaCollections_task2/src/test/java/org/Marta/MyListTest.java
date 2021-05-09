package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyListTest {
    private MyList myList;

    @BeforeEach
    void init() {
        myList = new MyList(8);
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
    }

    @Test
    void shouldVerifySizeOfList() {
        //given, when
        int size = myList.size();

        //then
        Assertions.assertEquals(6, size);
    }

    @Test
    void shouldVerifyIfListIsEmpty() {
        //given, when
        boolean isEmpty = myList.isEmpty();

        //then
        Assertions.assertFalse(isEmpty);
    }

    @Test
    @DisplayName("Should verify adding element to the end of the list")
    void shouldVerifyAddingLastElement() {
        //given
        myList.add(6);
        //when
        Integer lastElement = myList.get(myList.size()-1);
        //then
        Assertions.assertEquals(6, lastElement);
    }

    @Test
    @DisplayName("Should verify getting element from specific index")
    void shouldVerifyGettingFromList() {
        //given, when
        Integer element = myList.get(5);
        //then
        Assertions.assertEquals(5, element);
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
    @DisplayName("Should verify adding element at a specific index")
    void shouldVerifyAddingToList() {
        //given, when
        myList.add(3, 666);

        //then
        Assertions.assertEquals(0, myList.get(0));
        Assertions.assertEquals(1, myList.get(1));
        Assertions.assertEquals(2, myList.get(2));
        Assertions.assertEquals(666, myList.get(3));
        Assertions.assertEquals(3, myList.get(4));
        Assertions.assertEquals(4, myList.get(5));
        Assertions.assertEquals(5, myList.get(6));
    }

    @Test
    @DisplayName("Should verify extend of list when max capacity is equal to current size")
    void shouldVerifyIfSizeOfListIsGrowing() {
        myList.add(0, 6876);
        myList.add(0, 6876);
        myList.add(0, 6876);
        myList.add(0, 6876);

        Assertions.assertEquals(6876, myList.get(0));
        Assertions.assertEquals(6876, myList.get(1));
        Assertions.assertEquals(6876, myList.get(2));
        Assertions.assertEquals(6876, myList.get(3));
        Assertions.assertEquals(0, myList.get(4));
        Assertions.assertEquals(1, myList.get(5));
        Assertions.assertEquals(2, myList.get(6));
        Assertions.assertEquals(3, myList.get(7));
        Assertions.assertEquals(4, myList.get(8));
        Assertions.assertEquals(5, myList.get(9));
    }

    @Test
    @DisplayName("Should throw Runtime Exception when trying to add element at nonexistent index")
    void shouldThrowRuntimeException2() {
        //given, when
        try {
            myList.add(-3, 6577);
            Assertions.fail("This method should throw Runtime Exception");
        } catch (RuntimeException e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("Index out of bounds");
            Assertions.assertTrue(rightMessage);
        }
    }

    @Test
    @DisplayName("Should verify removing element at a specific index")
    void shouldVerifyRemovingFromList() {
        //given, when
        myList.remove(3);
        //then
        Assertions.assertEquals(0, myList.get(0));
        Assertions.assertEquals(1, myList.get(1));
        Assertions.assertEquals(2, myList.get(2));
        Assertions.assertEquals(4, myList.get(3));
        Assertions.assertEquals(5, myList.get(4));
    }

    @Test
    @DisplayName("Should throw Runtime Exception when trying to remove element at nonexistent index")
    void shouldThrowRuntimeException3() {
        //given, when
        try {
            myList.remove(6);
            Assertions.fail("This method should throw Runtime Exception");
        } catch (RuntimeException e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("Index out of bounds");
            Assertions.assertTrue(rightMessage);
        }
    }

}