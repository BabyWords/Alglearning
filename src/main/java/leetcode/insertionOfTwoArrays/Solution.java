package leetcode.insertionOfTwoArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 350
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0;i<nums1.length;i++){
            if (!map.containsKey(nums1[i])){
                map.put(nums1[i],1);
            }else{
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }
        int[] array = new int[nums1.length];
        int index=0;
        for (int i = 0; i < nums2.length; i++) {
            int count = map.getOrDefault(nums2[i],0);
            if (count!=0){
                array[index++] = nums2[i];
                map.put(nums2[i], count-1);
            }
        }
        return Arrays.copyOfRange(array, 0, index);
    }
}