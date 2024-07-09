import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare and initialize a 2D array
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Display the matrix
        System.out.println("Matrix:");
        displayMatrix(matrix);

        // Find the sum of all elements in the matrix
        int sum = sumMatrix(matrix);
        System.out.println("Sum of matrix: " + sum);

        // Find the maximum value in the matrix
        int max = maxMatrix(matrix);
        System.out.println("Max value in matrix: " + max);

        // Transpose the matrix
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Transposed matrix:");
        displayMatrix(transposedMatrix);

        // Multiply two matrices
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{5, 6}, {7, 8}};
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product of matrices:");
        displayMatrix(productMatrix);

        input.close();
    }

    // Method to display a 2D array
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to find the sum of all elements in a 2D array
    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    // Method to find the maximum value in a 2D array
    public static int maxMatrix(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    // Method to transpose a 2D array
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    // Method to multiply two 2D arrays
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        if (cols1 != rows2) {
            throw new IllegalArgumentException("Cannot multiply matrices with these dimensions.");
        }