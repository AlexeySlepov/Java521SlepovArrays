import java.util.Arrays;
import java.util.Scanner;

public class TaskFive {
    //TODO:У вас есть двумерный массив чисел, например, матрица.
    // Ваша задача - написать программу, которая находит сумму всех элементов в этом массиве.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во строк массива: ");
        int height = scanner.nextInt();
        System.out.print("Введите кол-во столбцов массива: ");
        int width = scanner.nextInt();
        int[][] matrix = new int[height][width];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) ((Math.random() - 0.5) * (Math.random() - 0.5) * 100);
            }
        }
        System.out.println("Двумерный массив: ");
        for (int[] column : matrix) {
            System.out.println(Arrays.toString(column));
        }

        int summa = 0;
        for (int[] column : matrix) {
            for (int number : column) {
                summa += number;
            }
        }
        System.out.println("Сумма всех элементов - " + summa);

    }
}
