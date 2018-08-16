package leetcode;

public class LeetCode485 {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 0, 1}));
    }

    /**
     * 思路：遍历数组，存一个最大的连续数。
     * 用一个数count来存：当1，该数加1；当0，该数置0 ，在置0前和max进行比较，如果值大将值赋给max；
     * 这个算法大致应该没问题，问题在于max的初始化赋值在上面的逻辑里只有当值为0时才进行赋值
     * 那么在结尾对max和count再进行一次比较赋值问题就可以解决
     */
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}
