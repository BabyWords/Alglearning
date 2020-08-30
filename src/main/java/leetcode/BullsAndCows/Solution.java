package leetcode.BullsAndCows;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getHint("1807", "7810"));
    }
    public String getHint(String secret, String guess) {
            int A = 0, B = 0;
            int[] extra1 = new int[10];
            int[] extra2 = new int[10];
            for(int i = 0; i < secret.length(); i++)
            {
                int a = Integer.parseInt(String.valueOf(secret.charAt(i)));
                int b = Integer.parseInt(String.valueOf(guess.charAt(i)));
                if(a == b)  A++;
                else
                {
                    extra1[a]++;
                    extra2[b]++;
                }
            }
            for(int i = 0; i < 10; i++)
                B += Math.min(extra1[i], extra2[i]);
            return A + "A" + B + "B";
    }
}