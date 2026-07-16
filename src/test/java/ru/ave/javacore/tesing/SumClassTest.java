package ru.ave.javacore.tesing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumClassTest {

    @BeforeAll
    static void before() {
    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sum() {
        SumClass sumClass = new SumClass();
        assertEquals(8, sumClass.sum(3,5), "ok");
    }

    @Test
    void someTest() {
        SumClass sumClass = new SumClass();

        assertThrows(ArithmeticException.class, () -> sumClass.devide(5, 0));

    }

}