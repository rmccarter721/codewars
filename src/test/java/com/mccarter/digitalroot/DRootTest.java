package com.mccarter.digitalroot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DRootTest {
    @Test
    public void Tests() {
        assertEquals(DRoot.digital_root(16), 7);
    }
}
