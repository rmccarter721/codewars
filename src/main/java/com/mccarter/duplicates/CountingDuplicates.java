package com.mccarter.duplicates;

/**
 * https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */
public class CountingDuplicates {
    public static int duplicateCount(String text) {
        text = text.toLowerCase();
        int dups = 0;
        for (int i = 0; i < text.length(); i++) {
            String letter = text.substring(i, i+1);
            if(!letter.equals("-") && text.lastIndexOf(letter) != i) {
                dups++;
                text = text.replaceAll(letter, "-");
            }
        }
        return dups;
    }
}
