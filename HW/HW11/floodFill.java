class HW11 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        flood(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void flood(int[][] image, int sr, int sc, int oldColor, int color){
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor || image[sr][sc] == color) return;
        image[sr][sc] = color;
        flood(image, sr + 1, sc, oldColor, color);
        flood(image, sr - 1, sc, oldColor, color);
        flood(image, sr, sc + 1, oldColor, color);
        flood(image, sr, sc - 1, oldColor, color);
    }

    public static void main(String[] args) {
        HW11 hw11 = new HW11();
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;
        int[][] filled = hw11.floodFill(image, sr, sc, color);
        
        System.out.println("\nFlood Fill:");
        for (int[] row : filled) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}