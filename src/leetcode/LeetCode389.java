package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode389 {
    public static void main(String[] args) {
        System.out.println(findTheDifference("abcd", "abcda"));
    }

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                Integer value = map.get(aChar);
                map.put(aChar, ++value);
            } else {
                map.put(aChar, 1);
            }
        }

        char[] chars1 = t.toCharArray();
        for (char c : chars1) {
            if (!map.containsKey(c)) return c;
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                if (value == 0) return c;
                else map.put(c, --value);
            }
        }
        return ' ';
    }

    /**
     * 把char直接变为int来计算~
     */
//    public char findTheDifference(String s, String t) {
//        char res = 0;
//        for(char c : s.toCharArray())res-=c;
//        for(char c : t.toCharArray())res+=c;
//        return res;
//    }
}
