package org.Marta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

class MyQueueTest {
    MyQueue myQueue = new MyQueue();
    MyQueue myQueue2 = new MyQueue();

    @BeforeEach
    void setMyQueue() {
        myQueue.add(0);
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
    }

    @Test
    void shouldVerifyAdd() {
        //given, when
        boolean isAdded = myQueue.add(8);
        int size = myQueue.size();
        //then
        Assertions.assertTrue(isAdded);
        Assertions.assertEquals(9, size);
    }

    @Test
    @DisplayName("Should verify removing element from queue")
    void shouldVerifyRemove() {
        //given, when
        myQueue.remove();
        Integer newHead = myQueue.element();
        //then
        Assertions.assertEquals(7, myQueue.size());
        Assertions.assertEquals(1, newHead);
    }

    @Test
    @DisplayName("Should throw NoSuchElementException when trying to remove elements from empty queue")
    void shouldThrowNoSuchElementException1() {
        //given, when
        try {
            myQueue2.remove();
            Assertions.fail("This method should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            String message = e.getMessage();
            boolean rightMessage = message.equals("Can not remove element from empty queue");
            Assertions.assertTrue(rightMessage);
        }
    }

    @Test
    @DisplayName("Should verify retrieving head from queue, without removing")
    void shouldVerifyRetrieveAndNotRemove() {
        //given, when
        int sizeBefore = myQueue.size();
        Integer head = myQueue.element();
        int sizeAfter = myQueue.size();
        //then
        Assertions.assertEquals(sizeBefore, sizeAfter);
        Assertions.assertEquals(0, head);
    }

    @Test
    @DisplayName("Should throw NoSuchElementException when trying to retrieve elements from empty queue")
    void shouldThrowNoSuchElementException2() {
        //given, when
        try {
            myQueue2.element();
            Assertions.fail("This method should throw NoSuchElementException");
        } catch (NoSuchElementException e) {
            String message = e.getMessage();
            boolean rightMessage = message.equals("Can not retrieve element from empty queue");
            Assertions.assertTrue(rightMessage);
        }
    }
}