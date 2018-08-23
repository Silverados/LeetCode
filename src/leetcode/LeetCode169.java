package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int num : nums) {
            Integer value = map.getOrDefault(num, 0);
            map.put(num, ++value);
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() > nums.length / 2) {
                result = integerIntegerEntry.getKey();
            }
        }
        return result;
    }
}
