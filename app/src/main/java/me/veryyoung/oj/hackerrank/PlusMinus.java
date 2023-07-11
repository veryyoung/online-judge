package me.veryyoung.oj.hackerrank;

import java.text.DecimalFormat;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/plus-minus/
 */
public class PlusMinus {
    public String[] plusMinus(List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (Integer number : arr) {
            if (number < 0) {
                negativeCount++;
            } else if (number == 0) {
                zeroCount++;
            } else {
                positiveCount++;
            }
        }
        DecimalFormat df = new DecimalFormat("0.000000");
        return new String[]{df.format((float) positiveCount / arr.size()),
                df.format((float) negativeCount / arr.size()),
                df.format((float) zeroCount / arr.size())
        };
    }
}
