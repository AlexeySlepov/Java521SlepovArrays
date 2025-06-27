import java.util.Arrays;
import java.util.Scanner;

public class TaskFour {
    //TODO: У вас есть одномерный массив целых чисел.
    // Ваша задача - найти наименьший элемент в этом массиве с использованием цикла foreach.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Было: " + Arrays.toString(array));

        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        System.out.println("Наименьший элемент массива: " + minValue);
    }
}
