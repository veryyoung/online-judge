package me.veryyoung.oj.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtils {

    public static boolean equal(List<List<String>> list1, List<List<String>> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            List<String> sublist1 = list1.get(i);
            List<String> sublist2 = list2.get(i);
            if (!sublist1.equals(sublist2)) {
                return false;
            }
        }
        return true;
    }


    public static List<List<String>> arrayToList(String[][] inputArray) {
        List<List<String>> resultList = new ArrayList<>();
        for (String[] innerArray : inputArray) {
            resultList.add(Arrays.asList(innerArray));
        }
        return resultList;
    }
}
