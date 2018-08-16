package leetcode;

public class LeetCode807 {
    public static void main(String[] args) {
        System.out.println(maxIncreaseKeepingSkyline(new int[][]{{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}}));
    }

    /**
     * 1,先求每行的最大值 ， 再求每列的最大值
     * 2.获取每个元素所在的行列的最大值，使用其中的较小值，该值-元素值累加素
     * <p>
     * 最大值个数由行，列的length决定，题目给出：1 < grid.length = grid[0].length <= 50，那么可以用一个size为100的数组存储
     * 约定行存前50个，列存后50个
     *
     * @param grid
     * @return
     */
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int[] maxArrays = new int[100];
        int rowLength = grid.length;
        int columnLength = grid[0].length;
        /*每行中的最大值*/
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                if (maxArrays[i] <= grid[i][j]) {
                    maxArrays[i] = grid[i][j];
                }
            }
        }
        /*每列中的最大值*/
        for (int i = 0; i < columnLength; i++) {
            for (int j = 0; j < rowLength; j++) {
                if (maxArrays[50 + i] <= grid[j][i]) {
                    maxArrays[50 + i] = grid[j][i];
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < columnLength; j++) {
                int min = Math.min(maxArrays[i], maxArrays[50 + j]);
                result = result + min - grid[i][j];
            }
        }

        return result;
    }
}
