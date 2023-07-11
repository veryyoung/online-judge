package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-14
 * Time: 下午7:17
 * To change this template use File | Settings | File Templates.
 */
public class FourSum {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> returnArray = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> eachArray;
        int length = num.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int start = j + 1, end = length - 1;
                while (start < end) {
                    int sum = num[i] + num[j] + num[start] + num[end];
                    if (sum == target) {
                        eachArray = new ArrayList<Integer>(4);
                        eachArray.add(0, num[i]);
                        eachArray.add(1, num[j]);
                        eachArray.add(2, num[start]);
                        eachArray.add(3, num[end]);
                        returnArray.add(eachArray);
                        start++;
                        end--;
                        while (start < end && num[start] == num[start - 1]) start++;
                        while (start < end && num[end] == num[end + 1]) end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
                while (j < length - 1 && num[j] == num[j + 1]) j++;
            }
            while (i < length - 1 && num[i] == num[i + 1]) i++;
        }
        return returnArray;
    }
}
