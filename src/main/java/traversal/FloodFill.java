package traversal;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        FloodFill ff = new FloodFill();
        int[][] arr = new int[][] {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };
        // can declare/initilize this way also;
        // int array[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] result = ff.floodFill(arr, 1, 1, 2);
        for (int[] row : result)
            System.out.println(Arrays.toString(row));
    }
    /*
    * Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, newColor = 2
    * Output: [[2,2,2],[2,2,0],[2,0,1]]
    * Explanation: From the center of the image with position (sr, sc) = (1, 1) (i.e., the red pixel), all pixels connected by a path of the same color as the starting pixel (i.e., the blue pixels) are colored with the new color.
    * Note the bottom corner is not colored 2, because it is not 4-directionally connected to the starting pixel.
    */
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        fill(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int newColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[sr].length || image[sr][sc] != color)
            return;

        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, color, newColor);
        fill(image, sr + 1, sc, color, newColor);
        fill(image, sr, sc - 1, color, newColor);
        fill(image, sr, sc + 1, color, newColor);
    }
}
