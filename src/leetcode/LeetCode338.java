package leetcode;

import java.util.Arrays;

public class LeetCode338 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int j = 0; j <= num; j++) {
            int count = 0;
            int i = j;
            int moveSize = 0;
            moveSize = i & (~i + 1);
            while (moveSize != 0) {
                count++;
                i = i / (2 * moveSize);
                moveSize = i & (~i + 1);
            }
            result[j] = count;
        }
        return result;
    }
}
