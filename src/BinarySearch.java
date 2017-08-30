import edu.princeton.cs.algs4.*;

import java.util.HashMap;
import java.util.Map;

public class BinarySearch {

    public static int Bins(int[] a, int key) {
        //定义头和尾
        int lo = 0;
        int tail = a.length - 1;
        //开始循环
        while (lo <= tail) {
            int mid = lo + (tail - lo) / 2;
            if (key < a[mid]) {
                tail = mid - 1;
            } else if (key > a[mid])
                lo = mid + 1;
            else {
                return mid;
            }
        }
        return -1;
    }

    public static double mysqrt(int num) {
        double head = 0.00;
        System.out.println("请输入预测值：");
        double guess = StdIn.readDouble();
        // double mid = (head + guess) / 2;
        while (head <= guess) {
            double mid = head + (guess - head) / 2.00;
            double result = mid * mid;
            if (Math.abs(result - num) < 0.001) {
                return mid;
            } else if (result > num) {
                guess = mid;
            } else if (result < num) {
                head = mid;
            } else if (Math.abs(result - num) > 0.01) {
                return mid;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


