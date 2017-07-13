package com.mccarter.persistence;

/**
 * https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
 */
class Persist {
    public static int persistence(long n) {
        // your code
        String numberAsString = String.valueOf(n);
        if(numberAsString.length() > 1) {
            long result = 1;
            for (int i = 0; i < numberAsString.length(); i++) {
                result *= Integer.valueOf(numberAsString.substring(i, i+1));
            }
            return Persist.persistence(result) + 1;
        }
        else {
            return 0;
        }
    }
}