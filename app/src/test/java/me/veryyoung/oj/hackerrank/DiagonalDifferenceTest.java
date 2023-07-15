package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiagonalDifferenceTest {

    @Test
    public void testDiagonalDifference() {
        DiagonalDifference instance = new DiagonalDifference();
        assertEquals(2, instance.diagonalDifference(new ArrayList<>() {{
            add(new ArrayList<>(List.of(1, 2, 3)));
            add(new ArrayList<>(List.of(4, 5, 6)));
            add(new ArrayList<>(List.of(9, 8, 9)));
        }}));

        assertEquals(15, instance.diagonalDifference(new ArrayList<>() {{
            add(new ArrayList<>(List.of(11, 2, 4)));
            add(new ArrayList<>(List.of(4, 5, 6)));
            add(new ArrayList<>(List.of(10, 8, -12)));
        }}));
    }
}
