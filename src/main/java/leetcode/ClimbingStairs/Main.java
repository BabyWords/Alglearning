package leetcode.ClimbingStairs;

/**
 * LeetCode 70
 */
public class Main {
    public static void main(String[] args) {
        Solution solution= new Solution();
        System.out.println(solution.climbStairs1(3));
    }
}

class Solution {
    public int climbStairs1(int n) {
        int memo[]=new int[n+1];
        return helper(n, memo);
    }

    /**
     * 加入了缓存,避免重复计算
     * @param n
     * @param memo
     * @return
     */
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

    /**
     * 最基本的递归模板,效率比较差,会有很多重复计算
     * @param n
     * @return
     */
    public int helper2(int n){
        if (n == 1) {
            return  1;
        }
        if (n==2){
            return 2;
        }
        return helper2(n - 1) + helper2(n - 2);
    }


    /**
     * 迭代
     * @param n
     * @return
     */
    public int climbStairs2(int n) {
        int cross_one=1,cross_two=2;
        int result=0;
        /**
         * 假设n==1
         */
        if (n==1){
            return cross_one;
        }
        if (n==2)
            return cross_two;
        for (int i = 3; i <= n;i++) {
            result=cross_one+cross_two;
            cross_one=cross_two;
            cross_two=result;
        }
        return result;
    }
}

