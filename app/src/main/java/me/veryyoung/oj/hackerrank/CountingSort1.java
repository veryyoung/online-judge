package me.veryyoung.oj.hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/countingsort1/problem
 */
public class CountingSort1 {

    public List<Integer> countingSort(List<Integer> arr) {
        List<Integer> frequencyArray = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            frequencyArray.add(0);
        }
        for (Integer number : arr) {
            frequencyArray.set(number, frequencyArray.get(number) + 1);
        }
        return frequencyArray;
    }

}
