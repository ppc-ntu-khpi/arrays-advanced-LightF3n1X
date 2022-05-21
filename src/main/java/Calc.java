import java.util.Random;

/**
 * Creates random matrix with ability to transpose it
 */
public class Calc {
    /**
     * Fills' matrix of size N x M with random numbers
     * @param N rows
     * @param M columns
     * @return Matrix
     */
    public static int[][] getRandomMatrix(int N, int M) {
        int[][] matrix = new int[N][M];
        Random random = new Random();

        for(int i = 0; i < N * M; i++) {
            matrix[i / M][i % M] = random.nextInt(0, 100);
        }

        return matrix;
    }

    /**
     * Transposes matrix of size N x M
     * @param N rows
     * @param M columns
     * @param matrix matrix to transpose
     * @return Matrix
     */
    public static int[][] getTransposedMatrix(int N, int M, int[][] matrix) {
        int[][] tempMatrix = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                tempMatrix[i][j] = matrix[j][i];

        return tempMatrix;
    }
}