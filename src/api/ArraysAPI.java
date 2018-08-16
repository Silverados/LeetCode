package api;

import java.util.Arrays;

public class ArraysAPI {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] ints1 = ints;
        int[] ints2 = Arrays.copyOf(ints, ints.length);
        int[] ints3 = new int[10];
        System.arraycopy(ints, 0, ints3, 0, ints.length);
        ints1[0] = 100;
        ints2[1] = 100;
        ints3[2] = 100;
        System.out.println(Arrays.toString(ints));
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));

        Arrays.sort(ints);
    }
}
