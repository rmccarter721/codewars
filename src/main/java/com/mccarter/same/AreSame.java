package com.mccarter.same;

import java.util.Arrays;

/**
 * https://www.codewars.com/kata/550498447451fbbd7600041c
 */
public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        if(null == a || null == b) {
            return false;
        }
        if(Arrays.stream(a).distinct().toArray().length != Arrays.stream(b).distinct().toArray().length) {
            return false;
        }

        for (int toCheck : a) {
            if(Arrays.stream(b).noneMatch(number -> number == Math.pow(toCheck, 2))){
                return false;
            }
        }
        return true;
    }
}
