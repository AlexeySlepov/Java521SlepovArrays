import java.util.Arrays;
import java.util.Scanner;

public class TaskTwo {
    //TODO: Вам предоставляется массив элементов, и ваша задача - определить, есть ли дубликаты (повторяющиеся элементы) в массиве.
    // Если есть, выведите информацию о том, какие элементы являются дубликатами и их индексы.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        int[] array = new int[count];
        String[] strings = new String[count];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - 0.5) * 10);
        }
        int[] tempArray = Arrays.copyOf(array, count);

        System.out.println("Исходный массив: " + Arrays.toString(array));

        for (int i = 0; i < tempArray.length - 1; i++) {
            if (tempArray[i] == -100) {
                continue;
            }
            boolean checkDuplicate = false;
            String duplicates = "";
            for (int j = i + 1; j < tempArray.length; j++) {

                if (tempArray[i] == tempArray[j] && checkDuplicate == false) {
                    duplicates += "Дубликаты числа (" + tempArray[i] + ") с индексами - " + i + "  ";
                    checkDuplicate = true;
                }
                if (tempArray[i] == tempArray[j]) {
                    duplicates += j + "  ";
                    tempArray[j] = -100;
                }
            }
            strings[i] = duplicates;

            if (strings[i] != "") {
                System.out.println(duplicates);
            }
        }
    }
}
