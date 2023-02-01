package Java.JavaHomework;
import java.util.Scanner;

public class Homework_5 {
    public static void main(String[] args) {
        run();
    }
    public static void run(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        System.out.printf("Треугольным числом числа %d является %d", num, triangularNumber(num));
        sc.close();
    }
    public static int triangularNumber(int num) {
        int res = num * (num + 1) / 2;
        System.out.println("Рисунок треугольника: ");
        for (int counter = 0; counter <= num; counter++) {
            for (int i = 0; i < counter; i++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return res;
    }
}
