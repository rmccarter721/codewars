package com.mccarter.smiley;

import java.util.List;

/**
 * https://www.codewars.com/kata/583203e6eb35d7980400002a
 */
public class SmileFaces {
    public static int countSmileys(List<String> arr) {
        return (int) arr.stream().filter(member -> member.matches("(:|;)(-|~)?(D|\\))")).count();
    }
}
