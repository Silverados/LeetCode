package leetcode;

public class LeetCode344 {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }
}
