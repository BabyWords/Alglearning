package leetcode.FizzBuzz;

import java.util.ArrayList;
import java.util.List;


class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(6));
    }

    /**
     * 多重判断
     * @param n
     * @return
     */
    public List<String> fizzBuzz1(int n) {
        List<String> list = new ArrayList<String>();
        for (int i=1;i<=n;i++){
            if (i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }else if(i%5==0){
                list.add("Buzz");
            }else{
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

    /**
     * 字符串拼接
     * @param n
     * @return
     */

    public List<String> fizzBuzz(int n) {
        // ans list
        List<String> ans = new ArrayList<String>();
        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);
            if (divisibleBy3 && divisibleBy5) {
                // Divides by both 3 and 5, add FizzBuzz
                ans.add("FizzBuzz");
            } else if (divisibleBy3) {
                // Divides by 3, add Fizz
                ans.add("Fizz");
            } else if (divisibleBy5) {
                // Divides by 5, add Buzz
                ans.add("Buzz");
            } else {
                // Not divisible by 3 or 5, add the number
                ans.add(Integer.toString(num));
            }
        }

        return ans;
    }

    /**
     * 散列表
     * @param n
     * @return
     */
    public List<String> fizzBuzz2(int n) {
        List<String> ans = new ArrayList<String>();
        for (int num = 1; num <= n; num++) {
            boolean divisibleBy3 = (num % 3 == 0);
            boolean divisibleBy5 = (num % 5 == 0);
            String numAnsStr = "";
            if (divisibleBy3) {
                // Divides by 3, add Fizz
                numAnsStr += "Fizz";
            }
            if (divisibleBy5) {
                // Divides by 5, add Buzz
                numAnsStr += "Buzz";
            }
            if (numAnsStr.equals("")) {
                // Not divisible by 3 or 5, add the number
                numAnsStr += Integer.toString(num);
            }
            // Append the current answer str to the ans list
            ans.add(numAnsStr);
        }
        return ans;
    }
}

