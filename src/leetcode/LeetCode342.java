package leetcode;

public class LeetCode342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }

    public static boolean isPowerOfFour(int num) {
        if (num < 0) return false;
        int length = Integer.toBinaryString(num).length() - 1;
        if (length % 2 == 1) return false;
        if (num == Math.pow(4, (double) length / 2)) {
            return true;
        }
        return false;
    }
}
