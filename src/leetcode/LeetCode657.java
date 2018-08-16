package leetcode;

public class LeetCode657 {
    public static void main(String[] args) {
        System.out.println(judgeCircle("RLUURDDDLU"));
    }

    public static boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int[] ints = new int[4];
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'U':
                    ints[0]++;
                    break;
                case 'D':
                    ints[1]--;
                    break;
                case 'L':
                    ints[2]++;
                    break;
                case 'R':
                    ints[3]--;
                    break;
            }
        }
        return ints[0] + ints[1] == 0 && ints[2] + ints[3] == 0 ? true : false;
    }
}
