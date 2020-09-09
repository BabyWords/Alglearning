package leetcode.generateParentheses;

import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.docreate(0,0, 3, "");
    }

    private void docreate(int left,int right, int n, String s) {
        //terminator
        if (left==n&& right==n){
            System.out.println(s);
            return;
        }
        //processor
        if (left < n) {
            docreate(left + 1 ,right,n, s + "(");
        }
        if (left > right && right < n) {
            docreate(left  ,right+1,n, s + ")");
        }

    }

}