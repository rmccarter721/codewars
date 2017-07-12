package com.mccarter.needle;

import java.util.Arrays;

public class Kata {
    public static String findNeedle(Object[] haystack) {
        // Your code here
        return "found the needle at position " + Arrays.asList(haystack).indexOf("needle");
    }
}
