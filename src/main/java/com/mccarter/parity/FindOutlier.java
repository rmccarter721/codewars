package com.mccarter.parity;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/5526fc09a1bbd946250002dc
 */
public class FindOutlier {
    public static int find(int[] integers) {
        int num1 = Math.abs(integers[0]) % 2;
        int num2 = Math.abs(integers[1]) % 2;
        int num3 = Math.abs(integers[2]) % 2;
        int mod = (num1 == num2) ? num1 : (num1 == num3) ? num1 : num3;

        return Arrays.stream(integers).filter(num -> Math.abs(num) % 2 != mod).findFirst().getAsInt();
    }
}
