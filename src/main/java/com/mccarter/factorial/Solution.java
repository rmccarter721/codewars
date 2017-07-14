package com.mccarter.factorial;

/**
 * https://www.codewars.com/kata/52f787eb172a8b4ae1000a34
 */
public class Solution {
    public static int zeros(int n) {
//        BigInteger total = LongStream.range(1, n+1).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply);
//        int zeros=0;
//        while (total.mod(BigInteger.TEN).equals(BigInteger.ZERO)){
//            total=total.divide(BigInteger.TEN);
//            zeros++;
//        }
//        return zeros;

        int pow = 1;
        int numZeros = 0;

        while(Math.pow(5, pow) <= n) {
            numZeros += (int)(n/Math.pow(5, pow));
            pow++;
        }
        return numZeros;
    }
}
