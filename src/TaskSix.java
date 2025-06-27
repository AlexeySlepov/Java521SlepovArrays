import java.util.Arrays;
import java.util.Scanner;

public class TaskSix {
    //TODO:У вас есть трехмерный массив чисел, представляющий собой набор матриц.
    // Ваша задача - вычислить среднее значение всех элементов в этом трехмерном массиве.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов трехмерного массива: ");
        int height = scanner.nextInt();
        int width = scanner.nextInt();
        int depth = scanner.nextInt();
        int[][][] matrix = new int[height][width][depth];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = (int) ((Math.random() - 0.5) * (Math.random() - 0.5) * 100);
                }
            }
        }
        System.out.println("Трехмерный массив: ");
        for (int[][] column : matrix) {
            System.out.println(Arrays.deepToString(column));

        }

        int summa = 0;
        int count = 0;
        for (int[][] column : matrix) {
            for (int[] row : column) {
                for (int number : row) {
                    summa += number;
                    count++;
                }
            }
        }

        System.out.println("Среднее значение - " + summa * 1.0 / count);

    }
}
