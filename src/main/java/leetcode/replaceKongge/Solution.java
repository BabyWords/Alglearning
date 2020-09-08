package leetcode.replaceKongge;

class Solution {
    public String replaceSpace(String s) {
        return s.replace(" ","%20");
    }

    public String replaceFunction(String s){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) == ' ') {
                stringBuilder.append("%20");
            }else{
                stringBuilder.append(s.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}