import java.util.Arrays;
import java.util.Scanner;

public class TaskNine {
    //TODO: Предоставлен массив элементов и число, представляющее количество шагов для циклической ротации.
    // Ваша задача - выполнить ротацию массива вправо на заданное количество шагов.
    // Это может потребовать использования временных переменных и циклов для перемещения элементов
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        int newCount = count;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - 0.5) * 10);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        System.out.print("Введите кол-во шагов: ");
        int steps = scanner.nextInt();


        for (int i = 0; i < steps; i++) {
            int firstTemp = array[0], secondTemp = array[count - 1];
            array[0] = secondTemp;
            for (int j = 1; j < array.length; j++) {
                secondTemp = array[j];
                array[j] = firstTemp;
                firstTemp = secondTemp;
            }
        }

        System.out.println("Измененный массив: " + Arrays.toString(array));
    }
}
