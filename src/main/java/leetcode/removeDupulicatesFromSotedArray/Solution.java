package leetcode.removeDupulicatesFromSotedArray;

/**
 * LeetCode 26
 */
public class Solution {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        int j=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=nums[j]){
                nums[j+1]=nums[i];
                j++;
            }
        }
        return j;
    }
}