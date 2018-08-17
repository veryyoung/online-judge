package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        if (null == S || S.length() == 0) {
            return 0;
        }
        Set<Character> jewels = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            jewels.add(J.charAt(i));
        }

        int jewelsInStonesCount = 0;
        for (int i = 0; i < S.length(); i++) {
            if (jewels.contains(S.charAt(i))) {
                jewelsInStonesCount++;
            }
        }
        return jewelsInStonesCount;
    }

    public static void main(String[] args) {
        JewelsAndStones instance = new JewelsAndStones();
        assertEquals(3, instance.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, instance.numJewelsInStones("z", "ZZ"));
    }
}
