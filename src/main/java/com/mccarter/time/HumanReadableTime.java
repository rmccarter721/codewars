package com.mccarter.time;

/**
 * https://www.codewars.com/kata/52685f7382004e774f0001f7
 */
public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        // Do something
        return String.format("%1$02d:%2$02d:%3$02d", ((seconds / (60*60))), ((seconds / 60) % 60), (seconds % 60));
    }
}
