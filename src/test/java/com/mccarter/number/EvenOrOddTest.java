package com.mccarter.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
}