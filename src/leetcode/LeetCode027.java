package leetcode;

import java.util.Arrays;

public class LeetCode027 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                length--;
                nums[i] = Integer.MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return length;
    }
}
