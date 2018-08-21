package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode136 {
    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int num : nums) {
            if (map.containsKey(num)) {
                Integer value = map.get(num);
                map.put(num, ++value);
                continue;
            }
            map.put(num, 1);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if (integerIntegerEntry.getValue() == 1) {
                return integerIntegerEntry.getKey();
            }
        }
        return 0;
    }

//    public int singleNumber(int[] nums) {
//        int result = 0;
//        for(int i = 0;i< nums.length;i++){
//            result = nums[i] ^ result;
//        }
//        return result;
//    }
}
