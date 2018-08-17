package me.veryyoung.oj.leetcode;

import static org.junit.Assert.assertEquals;


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

    public static void main(String[] args) {
        assertEquals(97, 'a');
        assertEquals(122, 'z');
        assertEquals(65, 'A');
        assertEquals(90, 'Z');


        ToLowerCase instance = new ToLowerCase();
        assertEquals("hello", instance.toLowerCase("Hello"));
        assertEquals("here", instance.toLowerCase("here"));
        assertEquals("lovely", instance.toLowerCase("LOVELY"));
        assertEquals("al&phabet", instance.toLowerCase("al&phaBET"));
    }
}
