package leetcode;

public class LeetCode026 {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 3, 3, 3, 4, 4, 5};
        int len = removeDuplicates(nums);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    public static int removeDuplicates(int[] nums) {
//        int count = 0;
//        for (int i = 0; i < nums.length-1; i++) {
//            if (nums[i] == nums[i+1]) {
//                nums[i] = Integer.MAX_VALUE;
//                count++;
//            }
//        }
//        ArraysAPI.sort(nums);
//        return nums.length - count;

        int index = 0;
        if (nums.length > 0) {
            int lastNum = nums[0];
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != lastNum) {
                    nums[++index] = nums[i];
                    lastNum = nums[i];
                }
            }
        }

        return ++index;
    }


}
