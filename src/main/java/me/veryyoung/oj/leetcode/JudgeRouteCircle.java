package me.veryyoung.oj.leetcode;

import static org.junit.Assert.assertEquals;

/**
 * 657. Judge Route Circle
 * https://leetcode.com/problems/judge-route-circle/description/
 */
public class JudgeRouteCircle {

    public boolean judgeCircle(String moves) {
        if (null == moves || "".equals(moves)) {
            return true;
        }
        int leftCount = 0, rightCount = 0, upCount = 0, downCount = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'L':
                    leftCount++;
                    break;
                case 'R':
                    rightCount++;
                    break;
                case 'U':
                    upCount++;
                    break;
                case 'D':
                    downCount++;
                    break;
            }
        }
        return (leftCount == rightCount) && (upCount == downCount);
    }


    public static void main(String[] args) {
        JudgeRouteCircle instance = new JudgeRouteCircle();
        assertEquals(true, instance.judgeCircle("UD"));
        assertEquals(false, instance.judgeCircle("LL"));
        assertEquals(true, instance.judgeCircle("UDLR"));

    }
}
