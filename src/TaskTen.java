import java.util.Arrays;
import java.util.Scanner;

public class TaskTen {
//TODO:Предоставлен массив чисел.
// Ваша задача - найти подмассив (последовательность элементов) с наибольшей суммой элементов.
// Эта задача называется задачей максимальной подпоследовательности (maximum subarray problem) и
// может быть решена с использованием алгоритма Кадана

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

        System.out.println("Подмассив с наибольшей суммой элементов " + kadane(array));
    }

    public static int kadane(int[] arr) {
        int result = 0;
        int max = 0;
        for (int i : arr) {
            max = max + i;
            max = Integer.max(max, 0);
            result = Integer.max(result, max);
        }
        return result;
    }
}
