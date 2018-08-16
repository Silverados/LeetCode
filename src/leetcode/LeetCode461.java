package leetcode;

public class LeetCode461 {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 5));
    }

    public static int hammingDistance(int x, int y) {
        int sum = 0;
        String sx = Integer.toBinaryString(x);
        String sy = Integer.toBinaryString(y);
        char[] xchars = sx.toCharArray();
        char[] ychars = sy.toCharArray();
        int min = Math.min(xchars.length, ychars.length);
        int max = Math.max(xchars.length, ychars.length);
        boolean isXLonger = false;
        if (max == xchars.length) isXLonger = true;
        char[] extendChars = new char[max];
        java.util.Arrays.fill(extendChars, '0');
        if (isXLonger == true) {
            System.arraycopy(ychars, 0, extendChars, max - min, min);
            for (int i = 0; i < max; i++) {
                if (extendChars[i] != xchars[i]) sum++;
            }
        } else {
            System.arraycopy(xchars, 0, extendChars, max - min, min);
            for (int i = 0; i < max; i++) {
                if (extendChars[i] != ychars[i]) sum++;
            }
        }
        return sum;
    }
}
