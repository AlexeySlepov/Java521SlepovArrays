import java.util.Arrays;
import java.util.Scanner;

public class TaskEight {
    //TODO:Предоставлен массив элементов, включая возможные дубликаты.
    // Ваша задача - создать новый массив, который не содержит повторяющихся элементов.
    // *Эта задача может быть решена с использованием или сортировки
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

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && array[i] != Integer.MAX_VALUE) {
                    array[j] = Integer.MAX_VALUE;
                    newCount--;
                }
            }
        }
        Arrays.sort(array);
        System.out.println("Измененный массив: " + Arrays.toString(array));

        int[] newArray = Arrays.copyOf(array, newCount);
        System.out.println("Новый массив: " + Arrays.toString(newArray));
    }
}
