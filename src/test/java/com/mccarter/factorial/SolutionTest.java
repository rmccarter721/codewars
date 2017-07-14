package com.mccarter.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testZeros() throws Exception {
        assertEquals(0, Solution.zeros(0));
        assertEquals(0, Solution.zeros(4));
        assertEquals(1, Solution.zeros(5));
        assertEquals(1, Solution.zeros(6));
        assertEquals(2, Solution.zeros(10));
        assertEquals(2, Solution.zeros(14));
        assertEquals(3, Solution.zeros(15));
        assertEquals(4, Solution.zeros(20));
        assertEquals(6, Solution.zeros(25));
        assertEquals(7, Solution.zeros(30));
        assertEquals(8, Solution.zeros(35));
        assertEquals(9, Solution.zeros(40));
        assertEquals(10, Solution.zeros(45));
        assertEquals(12, Solution.zeros(50));
        assertEquals(18, Solution.zeros(75));
        assertEquals(24, Solution.zeros(100));
        assertEquals(37, Solution.zeros(150));
        assertEquals(249, Solution.zeros(1000));
        assertEquals(2499, Solution.zeros(10000));
        assertEquals(24999, Solution.zeros(100000));
    }
}