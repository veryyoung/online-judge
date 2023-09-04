package me.veryyoung.oj.leetcode;

/**
 * 875. Koko Eating Bananas
 * https://leetcode.com/problems/koko-eating-bananas/
 */
public class KokoEatingBananas {

    /**
     * Use binary search to judge speed, left speed initial value is 1, right speed initial value is the max value pf piles
     * Speed = (left + right) / 2, if speed is ok, check the left part, if speed is not ok, check the right part
     * Time complexity is O(nlogm)
     */
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMaxPile(piles);
        while (left < right) {
            int speed = left + (right - left) / 2;
            if (checkSpeed(piles, h, speed)) {
                right = speed;
            } else {
                left = speed + 1;
            }
        }
        return left;
    }

    private int getMaxPile(int[] piles) {
        int maxSpeed = 0;
        for (int pile : piles) {
            if (pile > maxSpeed) {
                maxSpeed = pile;
            }
        }
        return maxSpeed;
    }

    private boolean checkSpeed(int[] piles, int h, int k) {
        int time = 0;
        for (int pile : piles) {
            time += Math.ceil((double) pile / k);
        }
        return time <= h;
    }


}
