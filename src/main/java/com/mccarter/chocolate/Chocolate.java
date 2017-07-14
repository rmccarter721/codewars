package com.mccarter.chocolate;

/**
 * https://www.codewars.com/kata/534ea96ebb17181947000ada
 */
public class Chocolate {
    public static int breakChocolate(int n, int m) {
        int totalArea = n*m;
        return totalArea == 0 ? 0 : totalArea - 1;
    }
}
