package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyDoublyLinkedListTest {
    MyDoublyLinkedList<String> myList = new MyDoublyLinkedList<>();

    @BeforeEach
    void setUpList() {
        myList.addLast("text1");
        myList.addLast("text2");
        myList.addLast("text3");
    }

    @Test
    @DisplayName("should verify if list is empty")
    void shouldVerifyIfIsEmpty() {
        //given, when
        boolean isEmpty = myList.isEmpty();
        //then
        Assertions.assertFalse(isEmpty);
    }

    @Test
    @DisplayName("should verify the size of the list")
    void shouldVerifySize() {
        //given, when
        int size = myList.size();

        //then
        Assertions.assertEquals(3, size);
    }

    @Test
    @DisplayName("should verify adding elements at the end of the list")
    void shouldVerifyAddLast() {
        Assertions.assertEquals("text1", myList.get(0));
        Assertions.assertEquals("text2", myList.get(1));
        Assertions.assertEquals("text3", myList.get(2));
    }

    @Test
    @DisplayName("should verify adding element to a ZERO index (checking the boundary conditions)")
    void shouldVerifyAddToSpecificIndex1() {
        //given, when
        myList.add(0, "Marta");

        //then
        Assertions.assertEquals("Marta", myList.get(0));
        Assertions.assertEquals("text1", myList.get(1));
        Assertions.assertEquals("text2", myList.get(2));
        Assertions.assertEquals("text3", myList.get(3));
    }

    @Test
    @DisplayName("should verify adding element to any index")
    void shouldVerifyAddToSpecificIndex2() {
        //given, when
        myList.add(2, "Marta");

        //then
        Assertions.assertEquals("text1", myList.get(0));
        Assertions.assertEquals("text2", myList.get(1));
        Assertions.assertEquals("Marta", myList.get(2));
        Assertions.assertEquals("text3", myList.get(3));
    }

    @Test
    @DisplayName("should verify adding element after all existing elements (checking the boundary conditions)")
    void shouldVerifyAddToSpecificIndex3() {
        //given, when
        myList.add(3, "Marta");

        //then
        Assertions.assertEquals("text1", myList.get(0));
        Assertions.assertEquals("text2", myList.get(1));
        Assertions.assertEquals("text3", myList.get(2));
        Assertions.assertEquals("Marta", myList.get(3));
    }

    @Test
    @DisplayName("should throw IndexOutOfBounds Exception when trying to add element to a non-existent index")
    void shouldThrowIndexOutOfBoundsException1() {
        //given, when
        try {
            myList.add(54, "blabla");
            Assertions.fail("This method should throw IndexOutOfBounds Exception.");
        } catch (IndexOutOfBoundsException e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("invalid index");
            Assertions.assertTrue(rightMessage);
        }
    }

    @Test
    @DisplayName("should verify removing element from ZERO index (checking the boundary conditions)")
    void shouldVerifyRemove1() {
        //given, when
        myList.remove(0);

        //then
        Assertions.assertEquals("text2", myList.get(0));
        Assertions.assertEquals("text3", myList.get(1));
        Assertions.assertEquals(2, myList.size());
    }

    @Test
    @DisplayName("should verify removing element from any specified index")
    void shouldVerifyRemove2() {
        //given, when
        myList.remove(1);

        //then
        Assertions.assertEquals("text1", myList.get(0));
        Assertions.assertEquals("text3", myList.get(1));
        Assertions.assertEquals(2, myList.size());
    }

    @Test
    @DisplayName("should throw IndexOutOfBounds Exception when trying to remove element from empty list")
    void shouldThrowIndexOutOfBoundsException2() {
        //given
        MyDoublyLinkedList<String> myList2 = new MyDoublyLinkedList<>();
        //when
        try {
            myList2.remove(0);
            Assertions.fail("This method should throw IndexOutOfBounds Exception.");
        } catch (IndexOutOfBoundsException e) {
            //then
            String message = e.getMessage();
            boolean rightMessage = message.equals("invalid index");
            Assertions.assertTrue(rightMessage);
        }
    }

    @Test
    @DisplayName("should verify removing all elements from list")
    void shouldVerifyRemoveAll() {
        //given, when
        myList.remove(0);
        myList.remove(0);
        myList.remove(0);

        //then
        Assertions.assertTrue(myList.isEmpty());
    }
}