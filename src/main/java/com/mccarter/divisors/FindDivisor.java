package com.mccarter.divisors;

/**
 * https://www.codewars.com/kata/542c0f198e077084c0000c2e
 */
public class FindDivisor {
    public long numberOfDivisors(int n) {
        int numberToDivideBy = n/2;
        long factorCount = 1; // n is the only factor above n/2 so just start from n/2
        while(numberToDivideBy > 0) {
            if ((n % numberToDivideBy--) == 0) {
                factorCount++;
            }
        }
        return factorCount;
    }
}
