package leetcode.SwapNodeInPairs;

/**
 * LeetCode 24
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second =head.next;

        ListNode next = second.next;

        second.next=first;

        first.next = swapPairs(next);
        return second;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
