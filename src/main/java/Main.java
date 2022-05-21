import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int N = 4;
        int M = 3;

        int [][]matrix = Calc.getRandomMatrix(N, M);
        int [][]transposedMatrix = Calc.getTransposedMatrix(N, M, matrix);

        System.out.println("Matrix:");
        for(int[] row:matrix)
            System.out.println(Arrays.toString(row));

        System.out.println("\nTransposed matrix:");
        for(int[] row:transposedMatrix)
            System.out.println(Arrays.toString(row));
    }
}