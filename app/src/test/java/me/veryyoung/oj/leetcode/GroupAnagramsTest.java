package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.ListUtils;
import org.junit.Test;

import static me.veryyoung.oj.util.ListUtils.arrayToList;
import static org.junit.Assert.assertTrue;

public class GroupAnagramsTest {

    @Test
    public void testCombine() {
        GroupAnagrams instance = new GroupAnagrams();
        assertTrue(ListUtils.equal(arrayToList(new String[][]{{"eat", "tea", "ate"}, {"bat"}, {"tan", "nat"}}),
                instance.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
        assertTrue(ListUtils.equal(arrayToList(new String[][]{{""}}), instance.groupAnagrams(new String[]{""})));
        assertTrue(ListUtils.equal(arrayToList(new String[][]{{"a"}}), instance.groupAnagrams(new String[]{"a"})));
    }

}
