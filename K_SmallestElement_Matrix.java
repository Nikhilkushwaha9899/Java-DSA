import java.util.*;

public class K_SmallestElement_Matrix {
    public int kthSmallest(int[][] matrix, int k) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                l.add(matrix[i][j]);
            }
        }
        return l.get(k - 1);
    }
    public static void main(String[] args) {
        K_SmallestElement_Matrix ksm=new K_SmallestElement_Matrix();
        int matrix[][] = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        System.out.println(ksm.kthSmallest(matrix, k));
    }
}
