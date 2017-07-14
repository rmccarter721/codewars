package com.mccarter.cube;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/580dda86c40fa6c45f00028a
 */
public class FindOddCubes {
    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .map(num -> (int)Math.pow(num, 3))
                .sum();
    }
}
