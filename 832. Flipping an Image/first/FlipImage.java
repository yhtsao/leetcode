package first;

public class FlipImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] row : A) {
            for (int i = 0; i < row.length / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
            if (row.length % 2 == 1)
                row[row.length / 2] = row[row.length / 2] ^ 1;
        }
        return A;
    }
}
