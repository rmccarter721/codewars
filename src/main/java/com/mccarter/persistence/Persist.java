package com.mccarter.persistence;

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