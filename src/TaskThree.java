import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    //TODO: Предоставлен массив чисел и значение, которое нужно найти.
    // Ваша задача - определить, содержит ли массив заданное значение, и если да, то найти индекс этого значения в массиве.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        String stringIndex = "";

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - 0.5) * 100);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.print("Введите значение для поиска: ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                stringIndex += i + "  ";
            }
        }

        if (stringIndex != "") {
            System.out.print("В исходном массиве содержится число " + searchNumber + " с индексами - " + stringIndex);
        } else {
            System.out.print("В исходном массиве не содержится число " + searchNumber);
        }

    }
}
