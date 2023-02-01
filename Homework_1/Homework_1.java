package Java.JavaHomework.Homework_1;
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
            fw.write(String.format("%.2f", Pow(text)));
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