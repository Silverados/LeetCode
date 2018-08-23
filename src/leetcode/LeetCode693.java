package leetcode;

public class LeetCode693 {
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(0b10101));
    }

    public static boolean hasAlternatingBits(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1) {
                if (chars[i] == '1') {
                    return false;
                }
            } else {
                if (chars[i] == '0') {
                    return false;
                }
            }
        }
        return true;
    }
}
