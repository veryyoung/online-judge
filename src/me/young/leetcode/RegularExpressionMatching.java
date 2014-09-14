package me.young.leetcode;

/**
 * Created by veryyoung on 14-6-13.
 * Thoughts for This Problem
 * <p/>
 * Overall, there are 2 different cases: 1) the second char of pattern is "*" , and 2) the second char of pattern is not "*".
 * <p/>
 * For the 1st case, if the first char of pattern is not ".", the first char of pattern and string should be the same.
 * Then continue to match the left part.
 * <p/>
 * For the 2nd case, if the first char of pattern is "." or first char of pattern == the first i char of string,
 * continue to match the left.
 * <p/>
 * Be careful about the offset.
 */
public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        if (p.length() == 0)
            return s.length() == 0;

        if (p.length() == 1 || p.charAt(1) != '*') {
            if (s.length() < 1 || (p.charAt(0) != '.' && s.charAt(0) != p.charAt(0)))
                return false;
            return isMatch(s.substring(1), p.substring(1));

        } else {
            int len = s.length();

            int i = -1;
            while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
                if (isMatch(s.substring(i + 1), p.substring(2)))
                    return true;
                i++;
            }
            return false;
        }
    }
}
