package me.veryyoung.oj.cc150;

/**
 * 利用字符重复出现的次数，编写一个方法，实现基本的字符串压缩功能。比如，字符串“aabcccccaaa”经压缩会变成“a2b1c5a3”。若压缩后的字符串没有变短，则返回原先的字符串。
 * 给定一个string iniString为待压缩的串(长度小于等于3000)，保证串内字符均由大小写英文字母组成，返回一个string，为所求的压缩后或未变化的串。
 * 测试样例
 * "aabcccccaaa"
 * 返回："a2b1c5a3"
 * "welcometonowcoderrrrr"
 * 返回："welcometonowcoderrrrr"
 * <p>
 * Created by veryyoung on 2016/2/2.
 */
public class Zipper {

    public String zipString(String iniString) {
        if (null == iniString || iniString.length() < 3) {
            return iniString;
        }
        char repeatTempChar = iniString.charAt(0);
        StringBuffer stringBuffer = new StringBuffer().append(repeatTempChar);
        int repeatCharCount = 1;
        for (int i = 1; i < iniString.length(); i++) {
            char currentChar = iniString.charAt(i);
            if (currentChar == repeatTempChar) {
                repeatCharCount++;
            } else {
                stringBuffer.append(repeatCharCount).append(currentChar);
                repeatCharCount = 1;
                repeatTempChar = currentChar;
            }
        }
        stringBuffer.append(repeatCharCount);
        return stringBuffer.length() > iniString.length() ? iniString : stringBuffer.toString();
    }
}
