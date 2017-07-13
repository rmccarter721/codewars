package com.mccarter.needle;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
 */
public class Kata {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
