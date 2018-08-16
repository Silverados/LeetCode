package leetcode;

public class LeetCode009 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1210));
    }

    public static boolean isPalindrome(int x) {
        int y = x;
        int result = 0;
        if (x < 0) return false;
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        if (y == result) return true;
        else return false;

    }
}
