package leetcode;

public class LeetCode476 {
    public static void main(String[] args) {
        System.out.println(findComplement(10));
    }

    public static int findComplement(int num) {
        int result = 0;
        char[] chars = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                chars[i] = '0';
            } else {
                chars[i] = '1';
            }
            result += (chars[i] - 48) * Math.pow(2, chars.length - i - 1);
        }
        return result;
    }
}
