package leetcode;

public class LeetCode001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        for (int i : twoSum(nums, target)) {
            System.out.println(i);
        }


    }

    public static int[] twoSum(int[] nums, int target) {
        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == need) {
                    a = i;
                    b = j;
                }
            }
        }

        return new int[]{a, b};
    }
}
