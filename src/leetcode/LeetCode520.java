package leetcode;

public class LeetCode520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("ffffffffffffffffffffF"));
        System.out.println(detectCapitalUse("Word"));
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("USa"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.equals(word.toLowerCase())) return true;
        else if (word.equals(word.toUpperCase())) return true;
        else {
            char[] chars = word.toCharArray();
            if (chars[0] <= 90 && chars[0] >= 65) {
                for (int i = 1; i < chars.length; i++) {
                    if (chars[i] <= 90 && chars[i] >= 65) return false;
                }
                return true;
            }
            return false;
        }
    }
}
