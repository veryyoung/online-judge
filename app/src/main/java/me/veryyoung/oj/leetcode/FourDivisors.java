package me.veryyoung.oj.leetcode;

/**
 * 1390. Four Divisors
 * https://leetcode.com/problems/four-divisors/
 */
public class FourDivisors {

    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int sqrt = (int) Math.sqrt(num);
            if (sqrt * sqrt == num) {
                continue;
            }
            int first = 0;
            int second = 0;
            for (int i = sqrt; i > 1; i--) {
                if (num % i == 0) {
                    if (first > 0) {
                        first = 0;
                        break;
                    }
                    first = num / i;
                    second = i;
                }
            }
            if (first > 0) {
                sum = sum + 1 + first + second + num;
            }
        }
        return sum;
    }

}
