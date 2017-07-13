package com.mccarter.highlow;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/554b4ac871d6813a03000035
 */
public class Kata {
    public static String HighAndLow(String numbers) {
        IntSummaryStatistics stats = Arrays.stream(numbers.split(" ")).collect(Collectors.summarizingInt(Integer::parseInt));
        return stats.getMax() + " " + stats.getMin();
    }
}
