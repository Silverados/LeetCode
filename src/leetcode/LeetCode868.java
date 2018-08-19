package leetcode;

public class LeetCode868 {
    public static void main(String[] args) {
        System.out.println(binaryGap(8));
    }

    /**
     * 给定一个正整数 N，找到并返回 N 的二进制表示中两个连续的 1 之间的最长距离。
     * 22 的二进制是 0b10110 。
     * 在 22 的二进制表示中，有三个 1，组成两对连续的 1 。
     * 第一对连续的 1 中，两个 1 之间的距离为 2 。
     * 第二对连续的 1 中，两个 1 之间的距离为 1 。
     * 答案取两个距离之中最大的，也就是 2 。
     *
     * @param N
     * @return
     */
    public static int binaryGap(int N) {
        char[] arrays = Integer.toBinaryString(N).toCharArray();
        int result = 0;
        int temp = 0;
        int index = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == '1') {
                temp = i - index;
                if (temp >= result) result = temp;
                index = i;
            }
        }
        return result;
    }
}
