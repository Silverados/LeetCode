package leetcode;

public class LeetCode832 {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
//        int[][] A =  {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        for (int i = 0; i < flipAndInvertImage(A).length; i++) {
            for (int j = 0; j < flipAndInvertImage(A).length; j++) {
                System.out.print(flipAndInvertImage(A)[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <= A.length / 2; ) {
                temp = A[i][j];
                A[i][j] = A[i][A.length - j - 1];
                if (A[i][j] == 0) A[i][j] = 1;
                else A[i][j] = 0;
                if (temp == 0) temp = 1;
                else temp = 0;
                A[i][A.length - j - 1] = temp;
                if (A.length % 2 == 0 && j == A.length / 2 - 1) {
                    break;
                }
                j++;
            }


        }
        return A;
    }
}
