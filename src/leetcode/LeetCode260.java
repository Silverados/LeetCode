package leetcode;

import java.util.*;

public class LeetCode260 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(singleNumber(new int[]{1, 2, 1, 3, 2, 5})));
    }

    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            Integer value = map.getOrDefault(num, 0);
            map.put(num, ++value);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                list.add(integerIntegerEntry.getKey());
            }
        }
        Integer[] integer = list.toArray(new Integer[list.size()]);
        int[] ints = new int[list.size()];
        for (int i = 0; i < integer.length; i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }
}
