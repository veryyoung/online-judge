package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

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

}
