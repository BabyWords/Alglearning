package leetcode.AddDigits;

/**
 * LeetCode 258
 */
class Solution {
    public int addDigits(int num) {
        if (num<10){
            return num;
        }else{
            return addDigits((num/10)+(num%10));
        }
    }
}