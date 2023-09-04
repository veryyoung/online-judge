package me.veryyoung.oj.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 981. Time Based Key-Value Store
 */
public class TimeBasedKeyValueStore {

    /**
     * Use a struct Map<String, TreeMap<Integer, String>> to store the value
     * Get is very simple, use the function of floorKey to get the previously timestamp
     */
    public static class TimeMap {

        Map<String, TreeMap<Integer, String>> map;

        public TimeMap() {
            map = new HashMap<>();
        }

        public void set(String key, String value, int timestamp) {
            if (map.containsKey(key)) {
                map.get(key).put(timestamp, value);
            } else {
                TreeMap<Integer, String> treeMap = new TreeMap<>();
                treeMap.put(timestamp, value);
                map.put(key, treeMap);
            }
        }

        public String get(String key, int timestamp) {
            if (!map.containsKey(key)) {
                return "";
            }
            Integer treeMapKey = map.get(key).floorKey(timestamp);
            if (treeMapKey == null) {
                return "";
            }
            return map.get(key).get(treeMapKey);
        }

    }

}
