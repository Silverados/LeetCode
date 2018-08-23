package leetcode;

public class LeetCode397 {
    public static void main(String[] args) {
        System.out.println(integerReplacement(31));
        System.out.println(Integer.toBinaryString(65535));
    }

    public static int integerReplacement(int n) {
        int count = 0;
        if (n == 2147483647) return 32;
        while (n != 1) {
            if (n == 3) {
                count = count + 2;
                return count;
            } else if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                if ((n + 1) / 2 % 2 == 0) {
                    n = n + 1;
                    count++;
                } else {
                    n = n - 1;
                    count++;
                }
            }
        }
        return count;
    }
}
