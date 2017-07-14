package com.mccarter.grille;

/**
 * Java version of:
 * https://www.codewars.com/kata/grill-it/train/javascript
 */
public class Grille {
    public static String grille(String message, int code) {
        String binary = String.format("%1$" + Math.max(message.length(), 1) + "s", Integer.toBinaryString(code));
        String result = "";

        binary = binary.substring(binary.length() - message.length());

        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '1') {
                result += message.charAt(i);
            }
        }
        return result;
    }
}
