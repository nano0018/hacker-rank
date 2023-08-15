package org.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KangarooTest {
    @Test
    void should_return_NO() {
        assertEquals("NO", Kangaroo.kangaroo(0, 2, 5, 3));
    }

    @Test
    void should_return_YES() {
        assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2));
        assertEquals("YES", Kangaroo.kangaroo(2, 1, 1, 2));
    }
}