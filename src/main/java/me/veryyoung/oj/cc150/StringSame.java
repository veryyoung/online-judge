package me.veryyoung.oj.cc150;

/**
 * 给定两个字符串，请编写程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。这里规定大小写为不同字符，且考虑字符串重点空格。
 * 给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。保证两串的长度都小于等于5000。
 * 测试样例：
 * "This is nowcoder","is This nowcoder"
 * 返回：true
 * "Here you are","Are you here"
 * 返回：false
 * <p>
 * Created by veryyoung on 2016/2/1.
 */
public class StringSame {

    public boolean checkSam(String stringA, String stringB) {
        // all is null
        if (stringA == stringB) {
            return true;
        }

        // one is null
        if ((stringA == null && stringB != null) || (stringA != null && stringB == null)) {
            return false;
        }

        if (stringA.length() != stringB.length()) {
            return false;
        }

        int[] charCount = new int[256];
        for (int i = 0; i < stringA.length(); i++) {
            charCount[stringA.charAt(i)]++;
            charCount[stringB.charAt(i)]--;
        }

        for (int i = 0; i < 255; i++) {
            if (charCount[i] != 0) {
                return false;
            }
        }


        return true;
    }
}
