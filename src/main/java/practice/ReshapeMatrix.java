package practice;

public class ReshapeMatrix {
    public static void main(String[] args) {
        ReshapeMatrix rm = new ReshapeMatrix();
    }

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int columns = mat[0].length;

        if ((rows * columns) != (r * c))
            return mat;

        int[][] result = new int[r][c];
        int row_num = 0, col_num = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[row_num][col_num] = mat[i][j];
                col_num++;                              // increment the result col (rows hold the columns)
                if (col_num == c) {                     // if col_num matches provided c, reset to 0 and increment row_num
                    col_num = 0;
                    row_num++;
                }
            }
        }

        return result;
    }
}
