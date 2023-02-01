package Java.JavaHomework.Homework_3;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner sk = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        long a = sk.nextInt();
        System.out.print("Введите второе число: ");
        long b = sk.nextInt();

        System.out.print("Введите шаг для умножения: ");
        long mult = sk.nextInt();
        while (mult < 2) {
            System.out.print("Шаг для умножения должен быть больше 1!\nВведите шаг для умножения: ");
            mult = sk.nextInt();
        }

        System.out.print("Введите шаг для сложения: ");
        long sum = sk.nextInt();
        while (sum < 1) {
            System.out.print("Шаг для сложения должен быть больше 0!\nВведите шаг для сложения: ");
            sum = sk.nextInt();
        }

        sk.close();
        System.out.println(String.format("Всего комбинаций получения %d из %d: %d", b, a, allWays(a, b, mult, sum)));
        System.out.println(String.format("Кратчайший путь получения %d из %d: %s", b, a, countStep(a, b, mult, sum)));
    }

    public static long allWays(long a, long b, long mult, long sum) {
        Map<Long, Long> dict = new HashMap<Long, Long>();
        long value = 1;
        dict.put(a, value);
        try {
            for (long i = a; i <= b; i += sum) {
                if (i % mult == 0) {
                    if (i / mult < a) {
                        dict.put(i, value);
                    } else {
                        value = dict.get(i - sum) + dict.get(i / mult);
                        dict.put(i, value);
                    }
                } else if (i % mult != 0) {
                    dict.put(i, value);
                }
            }
            if (dict.get(b) == null)
                return 0;
            else
                return  dict.get(b);
        } catch (Exception e) {
            return 0;
        }
    }

    public static String countStep(long a, long b, long mult, long sum) {
        String res = "";
        while (b > a) {
            // System.out.println(b);
            if (b % mult == 0 && b / mult >= a) {
                b /= mult;
                res = "*" + mult + "; " + res;
            } else if (b - sum >= a) {
                b -= sum;
                res = "+" + sum + "; " + res;
            } else return "Ходов нет!";
        }
        return res;
    }
}
