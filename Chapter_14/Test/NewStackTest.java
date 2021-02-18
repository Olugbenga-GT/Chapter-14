import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewStackTest {

    NewStack myNewStack;


    @BeforeEach
    void startWithTHIS() {
        myNewStack = new NewStack(5);
    }

    @Test
    void pushOneElementTest() {
        myNewStack.push(5);
        assertEquals(5, myNewStack.peek());
    }

    @Test
    void testToPushTwoElements() {
        myNewStack.push(8);
        myNewStack.push(6);
        assertEquals(6, myNewStack.peek());
    }

    @Test
    void testToPushTwoElements_popOne_andPeek() {
        myNewStack.push(4);
        myNewStack.push(11);
        assertEquals(11, myNewStack.pop());
        assertEquals(4, myNewStack.peek());
    }

    @Test
    void testTo_pushTwo_popTwo_shouldBeEmpty() {
        myNewStack.push(4);
        myNewStack.push(11);

        myNewStack.pop();
        myNewStack.pop();
        assertTrue(myNewStack.isEmpty());
    }


    @Test
    void testTo_pushThree_shouldBeFull() {

        myNewStack = new NewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(3);
        assertTrue(myNewStack.isFull());
    }

    @Test
    void testTo_pushOneElement_AfterStackIsFull_ThrowsStackOverflowException() {

        myNewStack = new NewStack(3);
        myNewStack.push(4);
        myNewStack.push(11);
        myNewStack.push(3);
        assertTrue(myNewStack.isFull());

        assertThrows(NewStack.StackOverflowException.class, () -> myNewStack.push(5));
    }

    @Test
    void removeLastElementWhen_StackIsEmpty() {
        assertTrue(myNewStack.isEmpty());
        assertThrows(NewStack.StackUnderflowException.class, () -> myNewStack.pop());
    }


    @Test
    void testToPeekEmptyStack_throwStackUnderflowException() {
        assertTrue(myNewStack.isEmpty());
        assertThrows(NewStack.StackUnderflowException.class, () -> myNewStack.peek());
    }

}