package leetcode;

import java.util.Arrays;

public class LeetCode048 {
    public static void main(String[] args) {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(ints);
        System.out.println(Arrays.deepToString(ints));
    }

    public static void rotate(int[][] matrix) {
//        int len = matrix.length;
//        if (len % 2 == 0){
//            for (int i = 0; i < len/2; i++) {
//                for (int j = 0; j < len/2; j++) {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[len - 1 - j][i];
//                    int temp2 = matrix[j][len - 1 -i];
//                    matrix[j][len - 1 -i] = temp;
//                    int temp3 = matrix[len - 1- i][len - 1 - j];
//                    matrix[len - 1- i][len - 1 - j] = temp2;
//                    matrix[len -1 -j][i] = temp3;
//                }
//            }
//        }else {
//            for (int i = 0; i < len/2; i++) {
//                for (int j = 0; j < len/2; j++) {
//                    int temp = matrix[i][j];
//                    matrix[i][j] = matrix[len - 1 - j][i];
//                    int temp2 = matrix[j][len - 1 -i];
//                    matrix[j][len - 1 -i] = temp;
//                    int temp3 = matrix[len - 1- i][len - 1 - j];
//                    matrix[len - 1- i][len - 1 - j] = temp2;
//                    matrix[len -1 -j][i] = temp3;
//                }
//            }
//            int a = len/2;
//            for (int i = 0; i < a; i++) {
//                int temp = matrix[i][a];
//                matrix[i][a] = matrix[a][i];
//                int temp2 = matrix[a][len-1-i];
//                matrix[a][len-1-i] = temp;
//                int temp3 = matrix[len-1-i][a];
//                matrix[a][i] = temp3;
//                matrix[len-1-i][a] = temp2;
//            }
//        }
        int length = matrix.length;
        // 调换对角元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[length - j - 1][length - i - 1];
                matrix[length - j - 1][length - i - 1] = tmp;
            }
        }

        // 调换列元素
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length / 2; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[length - j - 1][i];
                matrix[length - j - 1][i] = tmp;
            }
        }
    }
}
