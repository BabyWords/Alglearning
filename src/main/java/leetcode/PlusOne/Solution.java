package leetcode.PlusOne;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if (digits[i]!=0){
                return digits;
            }
        }
        int[] newArray=new int[digits.length+1];
        newArray[0]=1;
        return  newArray;
    }
}