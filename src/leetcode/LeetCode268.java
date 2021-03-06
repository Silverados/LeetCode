package leetcode;

public class LeetCode268 {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
        int sum = (nums.length) * (1 + nums.length) / 2;
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }
}
