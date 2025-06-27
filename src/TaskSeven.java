import java.util.Scanner;

public class TaskSeven {
    //TODO:У вас есть массив строк, и ваша задача - найти самую длинную строку в этом массиве
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во элементов массива: ");
        int count = scanner.nextInt();
        String[] array = new String[count];
        int stringLength = Integer.MIN_VALUE, index = 0, i = 0;

        while (i < array.length) {
            System.out.printf("Введите %d элемент массива: ", i);
            Scanner scan = new Scanner(System.in);
            String read = scan.nextLine();
            array[i] = read;
            if (array[i].length() > stringLength) {
                stringLength = array[i].length();
                index = i;
            }
            i++;
        }
        System.out.println("Самая длинная строка '" + array[index] + "' с индексом - " + index);

    }
}
