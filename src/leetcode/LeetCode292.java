package leetcode;

public class LeetCode292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(7));
    }

    /**
     * 每个玩家都会使 等到自己拿的时候剩下只有1-3颗，否则自己拿完剩下3颗以上
     *
     * @param n
     * @return
     */
    public static boolean canWinNim(int n) {
        if (n % 4 != 0) return true;
        else return false;
    }
}
