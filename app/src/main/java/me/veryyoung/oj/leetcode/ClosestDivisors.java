package me.veryyoung.oj.leetcode;

/**
 * 1362. Closest Divisors
 * https://leetcode.com/problems/closest-divisors/
 */
public class ClosestDivisors {

    public int[] closestDivisors(int num) {
        int firstSmaller = 0;
        int firstBigger = 0;
        int secondSmaller = 0;
        int secondBigger = 0;
        for (int i = (int) Math.sqrt(num + 1); i > 0; i--) {
            if ((num + 1) % i == 0) {
                firstBigger = (num + 1) / i;
                firstSmaller = i;
                break;
            }
        }
        for (int i = (int) Math.sqrt(num + 2); i > 0; i--) {
            if ((num + 2) % i == 0) {
                secondBigger = (num + 2) / i;
                secondSmaller = i;
                break;
            }
        }

        if ((firstBigger - firstSmaller) <= (secondBigger - secondSmaller)) {
            return new int[]{firstSmaller, firstBigger};
        } else {
            return new int[]{secondSmaller, secondBigger};
        }
    }

}
