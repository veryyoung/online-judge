package me.veryyoung.oj.leetcode;

/**
 * Created with IntelliJ IDEA.
 * User: veryyoung
 * Email:codingyoung@gmail.com
 * Date: 14-4-16
 * Time: 下午8:38
 * To change this template use File | Settings | File Templates.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int maxlen = 0;
        int[] table = new int[256];
        for (int i = 0; i < 256; i++) table[i] = -1;
        for (int i = 0; i < s.length(); i++) {
            if (table[chars[i]] != -1) {
                while (start <= table[chars[i]]) table[chars[start++]] = -1;
            }
            if (i - start + 1 > maxlen) maxlen = i - start + 1;
            table[chars[i]] = i;
        }
        return maxlen;
    }
}
