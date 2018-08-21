package leetcode;

public class LeetCode231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-4));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == -2147483648) {
            return false;
        }
        char[] chars = Integer.toBinaryString(n).toCharArray();
        if (chars[0] == '0') {
            return false;
        } else {
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == '1') return false;
            }
        }
        return true;
    }

//    public static boolean isPowerOfTwo(int n) {
//
//        return true;
//    }

//    public boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        switch (n) {
//            case 1 << 0:
//            case 1 << 1:
//            case 1 << 2:
//            case 1 << 3:
//            case 1 << 4:
//            case 1 << 5:
//            case 1 << 6:
//            case 1 << 7:
//            case 1 << 8:
//            case 1 << 9:
//            case 1 << 10:
//            case 1 << 11:
//            case 1 << 12:
//            case 1 << 13:
//            case 1 << 14:
//            case 1 << 15:
//            case 1 << 16:
//            case 1 << 17:
//            case 1 << 18:
//            case 1 << 19:
//            case 1 << 20:
//            case 1 << 21:
//            case 1 << 22:
//            case 1 << 23:
//            case 1 << 24:
//            case 1 << 25:
//            case 1 << 26:
//            case 1 << 27:
//            case 1 << 28:
//            case 1 << 29:
//            case 1 << 30:
//            case 1 << 31:
//                return true;
//            default:
//                break;
//        }
//        return false;
//    }

}
