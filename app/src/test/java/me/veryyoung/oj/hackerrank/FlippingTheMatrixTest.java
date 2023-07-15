package me.veryyoung.oj.hackerrank;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FlippingTheMatrixTest {

    @Test
    public void testFlippingTheMatrix() {
        FlippingTheMatrix instance = new FlippingTheMatrix();
        assertEquals(4, instance.flippingMatrix(new ArrayList<>() {{
            add(new ArrayList<>(List.of(1, 2)));
            add(new ArrayList<>(List.of(3, 4)));
        }}));
        assertEquals(414, instance.flippingMatrix(new ArrayList<>() {{
            add(new ArrayList<>(List.of(112, 42, 83, 119)));
            add(new ArrayList<>(List.of(56, 125, 56, 49)));
            add(new ArrayList<>(List.of(15, 78, 101, 43)));
            add(new ArrayList<>(List.of(62, 98, 114, 108)));
        }}));
    }
}
