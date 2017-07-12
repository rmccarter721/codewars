package com.mccarter.vowel;

import java.util.Arrays;
import java.util.List;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        for (char c : str.toLowerCase().toCharArray()) {
            if(vowels.contains(c)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
