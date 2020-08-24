package leetcode.ClimbingStairs;

public class Main {
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.climbStairs(3));
    }
}

class Solution {
    public int climbStairs(int n) {
        int memo[]=new int[n+1];
        return helper(n, memo);
    }

    public int helper(int n,int[] memo){
        if (memo[n]>0) {
            return memo[n];
        }else if(n==1){
            memo[n]=1;
        }else if(n==2){
            memo[n]=2;
        }else {
            memo[n] = helper(n - 1, memo) + helper(n - 2, memo);
        }
        return memo[n];
    }
}
