package Homework_1;

/**
 * Homework_1
 *Реализовать функцию возведения числа а в степень b. a, b ∈ Z. Сводя количество выполняемых действий к минимуму.
Пример 1: а = 3, b = 2, ответ: 9
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
Пример 5
входные данные находятся в файле input.txt в виде
a 10
b 3
Результат нужно сохранить в файле output.txt
1000
 */

import java.io.*;
import java.util.*;
public class Homework_1 {
    public static void main(String[] args) throws FileNotFoundException {
        String read = "Homework_1/input.txt";
        String write = "Homework_1/output.txt";
        File file = new File(read);
        Scanner sc = new Scanner(file);
        String text = "";
        while (sc.hasNextLine()) {
            text += sc.nextLine() + ' ';
        }
        sc.close();

        try (FileWriter fw = new FileWriter(write, false)) {
            fw.write(String.format("%f", Pow(text)));
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static double Pow(String text) {
        String[] arr = text.split(" ");
        int[] list = new int[2];
        int count = 0;
        for (String i : arr) {
            try {
                list[count] = Integer.parseInt(i);
                count++;
            } catch (NumberFormatException e) {}
        }
        return Math.pow(list[0], list[1]);
    }
    
}