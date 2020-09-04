package leetcode.slidingWindowMaxiMun;

import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        int[] result= new int[nums.length-k+1];
        for (int i = 0; i < nums.length; i++) {
            while (!linkedList.isEmpty() && nums[linkedList.peekLast()] <= nums[i]) {
                //全部弹出
                linkedList.pollLast();
            }
            linkedList.addLast(i);
            if (linkedList.peekFirst() <= i - k) {
                linkedList.pollFirst();
            }
            if(i+1>=k){
                result[i + 1 - k] = nums[linkedList.peekFirst()];
            }
        }
        return result;
    }
}