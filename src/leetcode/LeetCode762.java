package leetcode;

public class LeetCode762 {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10, 15));
    }

    /**
     * 32位 最多31个
     *
     * @param L
     * @param R
     * @return
     */
    public static int countPrimeSetBits(int L, int R) {
        int sum = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(Integer.bitCount(i))) {
                sum++;
            }
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        int[] primeArray = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31};
        for (int i : primeArray) {
            if (i == n) return true;
            if (i > n) break;
        }
        return false;
    }
}
