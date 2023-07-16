package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        Set<Character> characterSet = new HashSet<>();
        while (start < s.length() && end < s.length()) {
            char current = s.charAt(end);
            if (characterSet.contains(current)) {
                characterSet.remove(s.charAt(start));
                start++;
            } else {
                characterSet.add(current);
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }
        }
        return maxLength;
    }

}
