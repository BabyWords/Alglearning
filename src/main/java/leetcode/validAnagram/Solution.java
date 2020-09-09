package leetcode.validAnagram;

import java.util.Arrays;
import java.util.HashMap;

class Solution {
    /**
     * 暴力法
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> stringHashMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> stringHashMap2 = new HashMap<Character, Integer>();
        for (int i=0;i<s.length();i++){
            stringHashMap.put(s.charAt(i), stringHashMap.getOrDefault(s.charAt(i), 0));
            stringHashMap2.put(t.charAt(i), stringHashMap2.getOrDefault(t.charAt(i), 0));
        }
        return stringHashMap.equals(stringHashMap2);
    }

    /**
     * Sort
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }

    /**
     * hash
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram3(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}