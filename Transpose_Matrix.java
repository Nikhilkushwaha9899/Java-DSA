import java.util.Arrays;

public class Transpose_Matrix {
    public int[][] transpose(int[][] matrix) {
		int row = matrix.length;
		int col = matrix[0].length;
		int Transpose[][] = new int[col][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Transpose[j][i] = matrix[i][j];
			}
		}
		return Transpose;
	}
    public static void main(String[] args) {
        Transpose_Matrix tm=new Transpose_Matrix();
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(Arrays.deepToString(tm.transpose(matrix)));
    }
}
