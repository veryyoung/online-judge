package me.veryyoung.oj.leetcode;

public class LongestPalindromicSubstring {


    public String longestPalindrome(String s) {
        String str = new StringBuilder(s).reverse().toString();
        return longestSubString(s, str);
    }



    public String longestSubString(String str1, String str2) {
        if (str1 == null || str1.isEmpty()) {
            return "";
        }
        if(str1.equals(str2)){
            return str1;
        }
        int length = str1.length();
        int[] array = new int[length + 1];
        int max = 0;
        int max_j = 0;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    array[j + 1] = array[j] + 1;
                } else {
                    array[j + 1] = 0;
                }

                if (array[j + 1] > max && str2.substring(j + 1 - array[j + 1], j + 1).equals(str1.substring(length - j - 1, length - j - 1 + array[j + 1]))) {
                    max = array[j + 1];
                    max_j = j + 1;
                }
            }
        }

        if (max_j > 0)
            return str2.substring(max_j - max, max_j);
        else
            return null;
    }
}
