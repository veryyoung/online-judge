package me.veryyoung.oj.cc150;

/**
 * 题目描述
 * <p>
 * 假定我们都知道非常高效的算法来检查一个单词是否为其他字符串的子串。请将这个算法编写成一个函数，给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成，要求只能调用一次检查子串的函数。
 * 给定两个字符串s1,s2,请返回bool值代表s2是否由s1旋转而成。字符串中字符为英文字母和空格，区分大小写，字符串长度小于等于1000。
 * 测试样例：
 * "Hello world","worldhello "
 * 返回：false
 * "waterbottle","erbottlewat"
 * 返回：true
 * Created by veryyoung on 2016/2/3.
 */
public class ReverseEqual {

    /**
     * 以s1=ABCD为例，我们先分析s1进行循环移位之后的结果：
     * ABCD->BCDA->CDAB->DABC->ABCD  .......
     * 假设我们把前面移走的数据进行保留：
     * ABCD->ABCDA->ABCDAB->ABCDABC->ABCDABCD.....
     * 因此看出，对s1做循环移位，所得字符串都将是字符串s1s1的子字符串。如果s2可以由s1循环移位得到，则一定可以在s1s1上。
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean checkReverseEqual(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        return (s1 + s1).contains(s2);
    }
}
