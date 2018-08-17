package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LeetCode349 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{}, new int[]{9, 4, 9, 8, 4})));
    }

    /**
     * 数组的交集：循环nums1的每个元素，然后去nums2中看看是否存在同个元素。存在则放入set
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) return new int[]{};
        Set<Integer> set = new HashSet<>();
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2) {
                    set.add(num1);
                    break;
                }
            }
        }
        Integer[] integers = set.toArray(new Integer[set.size()]);
        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = integers[i];
        }
        return result;
    }
}
