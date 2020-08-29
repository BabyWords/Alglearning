package leetcode.WordPattern;

import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if (pattern.length() != strs.length) {
            return false;
        }
        HashMap<Character, String> temp = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (temp.containsKey(pattern.charAt(i))) {
                if (!temp.get(pattern.charAt(i)).equals(strs[i])) {
                    return false;
                }
            } else {
                if (temp.containsValue(strs[i])) {
                    return false;
                }
                temp.put(pattern.charAt(i), strs[i]);
            }
        }
        return true;
    }
}