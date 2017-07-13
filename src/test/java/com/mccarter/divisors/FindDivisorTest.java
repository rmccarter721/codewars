package com.mccarter.divisors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDivisorTest {

    FindDivisor findDivisor = new FindDivisor();

    @Test
    public void test2() {
        assertEquals(2, findDivisor.numberOfDivisors(2));
    }

    @Test
    public void test3() {
        assertEquals(2, findDivisor.numberOfDivisors(3));
    }

    @Test
    public void test4() {
        assertEquals(3, findDivisor.numberOfDivisors(4));
    }

    @Test
    public void test5() {
        assertEquals(2, findDivisor.numberOfDivisors(5));
    }

    @Test
    public void test6() {
        assertEquals(4, findDivisor.numberOfDivisors(6));
    }
}