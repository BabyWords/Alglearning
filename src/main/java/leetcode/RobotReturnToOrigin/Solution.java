package leetcode.RobotReturnToOrigin;

/**
 * LeetCode 657
 */
class Solution {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        for (int i=0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case 'U':{
                    x=x+1;
                    break;
                }
                case 'D' :{
                    x=x-1;
                    break;
                }
                case  'R':{
                    y=y+1;
                    break;
                }
                case 'L' :{
                    y=y-1;
                    break;
                }
            }
        }
        return x==0&&y==0;
    }
}
