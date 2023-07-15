package me.veryyoung.oj.hackerrank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/lonely-integer/problem
 */
public class LonelyInteger {
    public int lonelyInteger(List<Integer> arr) {
        Map<Integer, Integer> numberCount = new HashMap<>(arr.size() / 2 + 1);
        for (Integer number : arr) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }
        for (Integer number : numberCount.keySet()) {
            if (numberCount.get(number) == 1) {
                return number;
            }
        }
        return arr.get(0);
    }

}
