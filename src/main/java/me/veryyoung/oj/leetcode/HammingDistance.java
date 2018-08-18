package me.veryyoung.oj.leetcode;

import static org.junit.Assert.assertEquals;

/**
 * 461. Hamming Distance
 * https://leetcode.com/problems/hamming-distance/description/
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int bigger;
        int smaller;
        if (x > y) {
            bigger = x;
            smaller = y;
        } else {
            bigger = y;
            smaller = x;
        }
        String theBiggerDecimal = decimalToBinary(bigger);
        String theSmallerDecimal = decimalToBinary(smaller);
        if (theBiggerDecimal.length() > theSmallerDecimal.length()) {
            StringBuilder theSmallerOneHamming = new StringBuilder();
            for (int i = 0; i < theBiggerDecimal.length() - theSmallerDecimal.length(); i++) {
                theSmallerOneHamming.append(0);
            }
            theSmallerOneHamming.append(theSmallerDecimal);
            theSmallerDecimal = theSmallerOneHamming.toString();
        }
        int distance = 0;
        for (int i = 0; i < theBiggerDecimal.length(); i++) {
            if (theBiggerDecimal.charAt(i) != theSmallerDecimal.charAt(i)) {
                distance++;
            }
        }

        return distance;
    }

    public String decimalToBinary(int num) {
        if (0 == num) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(num % 2);
            num = num / 2;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        HammingDistance instance = new HammingDistance();
        assertEquals("0", instance.decimalToBinary(0));
        assertEquals("1", instance.decimalToBinary(1));
        assertEquals("10", instance.decimalToBinary(2));
        assertEquals("1011", instance.decimalToBinary(11));
        assertEquals(2, instance.hammingDistance(1, 4));
        assertEquals(2, instance.hammingDistance(0, 10));
    }
}
