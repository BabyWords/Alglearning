package leetcode.sqrtx;

class Solution {
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.mySqrt(8));
    }
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
}
