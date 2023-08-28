package me.veryyoung.oj.leetcode;

/**
 * 167. Two Sum II - Input Array Is Sorted
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class InputArrayIsSorted {

    /**
     * Use begin and end two index to traverse the array,
     * if the two number sum is target return
     * if the sum is bigger than target, end--;
     * if the sum is smaller than target, start++
     */
    public int[] twoSum(int[] numbers, int target) {
        int begin = 0;
        int end = numbers.length - 1;
        while (begin < end) {
            int sum = numbers[begin] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum == target) {
                return new int[]{begin + 1, end + 1};
            } else {
                begin++;
            }
        }
        return new int[]{};
    }

}
