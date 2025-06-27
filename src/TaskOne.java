import java.util.Arrays;
import java.util.Scanner;

public class TaskOne {
    //TODO: Напишите программу, которая переворачивает массив, так чтобы последний элемент стал первым,
    // предпоследний - вторым и так далее. Используйте Random для заполнения массива. Вывести свои было и стало.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.println("Было: " + Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        System.out.println("Стало: " + Arrays.toString(array));
    }
}
