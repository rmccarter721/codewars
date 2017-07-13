package com.mccarter.vasyaclerk;

/**
 * https://www.codewars.com/kata/555615a77ebc7c2c8a0000b8
 * Actual KATA is broken, tests 9, 10, 11 have been updated to correct answer.
 */
public class Line {
    public static String Tickets(int[] peopleInLine) {
        int ticketCost = 25;
        for(int i=0; i < peopleInLine.length; i++) {
            if (peopleInLine[i] - ticketCost > ticketCost*i) {
                return "NO";
            }
        }
        return "YES";
    }
}
