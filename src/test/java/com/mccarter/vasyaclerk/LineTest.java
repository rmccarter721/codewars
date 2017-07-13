package com.mccarter.vasyaclerk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {
    @Test
    public void test1() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 50}));
    }
    @Test
    public void test2() {
        assertEquals("NO", Line.Tickets(new int []{25, 100}));
    }
    @Test
    public void test3() {
        assertEquals("YES", Line.Tickets(new int[] {25, 25, 25, 25, 25, 25, 25, 25, 25, 25}));
    }
    @Test
    public void test4() {
        assertEquals("NO", Line.Tickets(new int []{50, 50, 50, 50, 50, 50, 50, 50, 50, 50}));
    }
    @Test
    public void test5() {
        assertEquals("NO", Line.Tickets(new int []{100, 100, 100, 100, 100, 100, 100, 100, 100, 100}));
    }
    @Test
    public void test6() {
        assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 25, 50, 100, 50}));
    }
    @Test
    public void test7() {
        assertEquals("NO", Line.Tickets(new int []{50, 100,100}));
    }
    @Test
    public void test8() {
        assertEquals("NO", Line.Tickets(new int []{25, 25, 100}));
    }
    @Test
    public void test9() {
        assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 25, 25, 25, 25, 50, 50, 50, 100, 100, 100, 100}));
    }
    @Test
    public void test10() {
        assertEquals("YES", Line.Tickets(new int []{25,25,50,50,100}));
    }
    @Test
    public void test11() {
        assertEquals("YES", Line.Tickets(new int []{25, 25, 25, 25, 25, 100, 100}));
    }
}
