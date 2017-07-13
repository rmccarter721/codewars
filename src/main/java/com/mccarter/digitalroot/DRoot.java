package com.mccarter.digitalroot;

/**
 * https://www.codewars.com/kata/541c8630095125aba6000c00
 */
public class DRoot {
    public static int digital_root(int n) {
        String numAsString = String.valueOf(n);
        int added = 0;
        if(numAsString.length() > 1) {
            for (int i = 0; i < numAsString.length(); i++){
                added += Integer.parseInt(numAsString.substring(i, i+1));
            }
            return digital_root(added);
        }
        else {
            return n;
        }
    }
}
