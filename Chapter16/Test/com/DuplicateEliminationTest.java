package com;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEliminationTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatNamesCanBeReadIn(){
    }

    @Test
    void removeDuplicateWithNullArray(){
        assertThrows(IllegalArgumentException.class, ()-> DuplicateElimination.removeDuplicate(null));
    }

    @Test
    void removeDuplicateWithEmptyArray(){
        String[] emptyInput= {};
        assertThrows(IllegalArgumentException.class, ()-> DuplicateElimination.removeDuplicate(emptyInput));
    }

    @Test
    void removeDuplicate(){
        String [] input = {"John", "Paul", "Silas", "John"};
        String[] duplicated = DuplicateElimination.removeDuplicate(input);
//        assertTrue(input.length != duplicated.length);?
//        assertEquals(null, duplicated[3]);
        assertNull(duplicated[3]);
        System.out.println(input);
        }
    }

