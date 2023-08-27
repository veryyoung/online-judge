package me.veryyoung.oj.leetcode;

import java.util.*;

/**
 * 49. Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {


    /**
     * If strs length is 1, just return the one.
     * Group the strs array by the sorted item.
     * For example "eat","tea","tan","ate","nat","bat"　will be
     * "aet"-> ["eat", "tea", "ate"]
     * "abt"-> ["bat"]
     * "ant"-> ["tan", "nat"]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length == 1) {
            result.add(Arrays.asList(strs));
            return result;
        }

        Map<String, List<String>> sortedMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            List<String> strings;
            if (sortedMap.containsKey(sortedStr)) {
                strings = sortedMap.get(sortedStr);
            } else {
                strings = new ArrayList<>();
            }
            strings.add(str);
            sortedMap.put(sortedStr, strings);
        }

        for (List<String> value : sortedMap.values()) {
            result.add(value);
        }
        return result;
    }

}
