package Java.JavaHomework;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        // Запуск программы
        run();
    }

    // Функция для запуска программы
    static public void run() {
        Scanner sk = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = sk.nextInt();
        System.out.print("Введите минимальное значение в диапозоне: ");
        int min = sk.nextInt();
        System.out.print("Введите максимальное значение в диапозоне: ");
        int max = sk.nextInt();
        sk.close();

        if (size < 0) {
            System.out.println("\nРазмер массива введен не правильно и автоматически исправлен!");
            size *= -1;
        }
        if (min > max) {
            System.out.println("\nДиапозон введен не правильно и автоматически исправлен!");
            int temp = max;
            max = min;
            min = temp;
        }

        System.out.println(String.format("\nПолученны массив: %s", Arrays.toString(fillArray(min, max, size))));
        System.out.println(
                String.format("Отсортированный массив: %s", Arrays.toString(sortArray(fillArray(min, max, size)))));
    }

    // Функция для создания и заполнения массива
    public static int[] fillArray(int min, int max, int size) {
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (min == max)
                array[i] = min;
            else
                array[i] = rd.nextInt(min, max + 1);
        }
        return array;
    }

    // Функция который разбивает массива на подмассивы
    public static int[] sortArray(int[] array) {
        int size = array.length;
        if (size == 0)
            return array;
        if (size == 1)
            return array;
        int[] left = new int[size / 2];
        System.arraycopy(array, 0, left, 0, size / 2);

        int[] right = new int[size - size / 2];
        System.arraycopy(array, size / 2, right, 0, size - size / 2);

        left = sortArray(left);
        right = sortArray(right);

        return mergeArray(left, right);

    }

    // Функция соединяющий массивы после разъбиения
    public static int[] mergeArray(int[] left, int[] right) {
        int leftSize = left.length, rightSize = right.length;
        int leftIndex = 0, rightIndex = 0;
        int[] resultSort = new int[leftSize + rightSize];
        int size = resultSort.length;

        for (int i = 0; i < size; i++) {
            if (leftIndex == leftSize) {
                resultSort[i] = right[rightIndex++];

            } else if (rightIndex == rightSize) {
                resultSort[i] = left[leftIndex++];

            } else if (left[leftIndex] < right[rightIndex]) {
                resultSort[i] = left[leftIndex++];

            } else {
                resultSort[i] = right[rightIndex++];
            }
        }
        return resultSort;
    }
}
