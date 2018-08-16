package leetcode;

public class LeetCode258 {

    public static void main(String[] args) {
        System.out.println(addDigits(1919));

    }

    public static int addDigits(int num) {
        int sum = 0;
        while (num >= 10) {
            sum += num - num / 10 * 10;
            num = num / 10;
        }
        sum += num;
        return sum < 10 ? sum : addDigits(sum);
    }

}
