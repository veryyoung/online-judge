package me.veryyoung.oj.leetcode;

/**
 * 709. To Lower Case
 * https://leetcode.com/problems/to-lower-case/description/
 */
public class ToLowerCase {

    public String toLowerCase(String str) {
        if (null == str || str.length() == 0) {
            return "";
        }
        StringBuilder lowCaseBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 97 && str.charAt(i) >= 65) {
                lowCaseBuilder.append((char) (str.charAt(i) + 32));
            } else {
                lowCaseBuilder.append(str.charAt(i));
            }
        }
        return lowCaseBuilder.toString();
    }
}
