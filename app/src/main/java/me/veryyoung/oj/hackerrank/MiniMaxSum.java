package me.veryyoung.oj.hackerrank;

import java.math.BigInteger;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {
    public String miniMaxSum(List<Integer> arr) {
        BigInteger total = BigInteger.ZERO;
        BigInteger min = BigInteger.valueOf(arr.get(0));
        BigInteger max = BigInteger.valueOf(arr.get(0));
        for (Integer value : arr) {
            BigInteger bigIntValue = BigInteger.valueOf(value);
            total = total.add(bigIntValue);
            if (min.compareTo(bigIntValue) < 0) {
                min = bigIntValue;
            } else if (max.compareTo(bigIntValue) > 0) {
                max = bigIntValue;
            }
        }
        return total.subtract(min) + " " + total.subtract(max);
    }
}
