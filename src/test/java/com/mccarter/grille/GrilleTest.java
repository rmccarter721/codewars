package com.mccarter.grille;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrilleTest {
    @Test
    public void tests() {
        assertEquals(Grille.grille("abcdef", 5) , "df" );
        assertEquals(Grille.grille("", 5) , "" );
        assertEquals(Grille.grille("abc", 1) , "c" );
        assertEquals(Grille.grille("tcddoadepwweasresd",77098 ) , "codewars" );
        assertEquals(Grille.grille("ab", 255) , "ab" );
        assertEquals(Grille.grille("ab", 256) , "" );
        assertEquals(Grille.grille("abcde", 32) , "" );
    }
}
