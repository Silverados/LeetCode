package leetcode;

import java.util.Arrays;

public class LeetCode041 {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{2, 3, 2, 1}));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int j = 0;
        if (nums.length == 0) return 1;
        if (nums[0] > 1) return 1;
        else if (nums[nums.length - 1] <= 0) return 1;
        else {
            if (nums.length == 1) {
                if (nums[0] == 1) {
                    return 2;
                }
            }
            if (nums.length > 1) {
                for (int i = 0; i < nums.length; i++) {
                    if (i == nums.length - 1) {
                        j++;
                        if (j != nums[i]) {
                            return j;
                        }
                        break;
                    }
                    if (nums[i] > 0 && nums[i] != nums[i + 1]) {
                        j++;
                        if (j != nums[i]) {
                            return j;
                        }
                    }

                }
            }


        }
        return j + 1;
    }
}
