package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode187 {
    public static void main(String[] args) {
        System.out.println(findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String key = s.substring(i, i + 10);
            if (!map.containsKey(key)) {
                map.put(key, 0);
            } else {
                Integer value = map.get(key);
                map.put(key, ++value);
            }
        }
        List<String> result = new ArrayList<>();
        map.forEach((k, v) -> {
            if (v != 0) {
                result.add(k);
            }
        });
        return result;
    }
}
