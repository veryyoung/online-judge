package me.veryyoung.oj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. Unique Morse Code Words
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        if (null == words || words.length == 0) {
            return 0;
        }
        String[] morseTable = new String[]{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> morseWords = new HashSet<>();
        for (String word : words) {
            StringBuilder wordToMorse = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                wordToMorse.append(morseTable[word.charAt(i) - 97]);
            }
            morseWords.add(wordToMorse.toString());
        }
        return morseWords.size();
    }

}
