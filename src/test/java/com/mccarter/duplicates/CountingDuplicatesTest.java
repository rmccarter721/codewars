package com.mccarter.duplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountingDuplicatesTest {
    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }


}
