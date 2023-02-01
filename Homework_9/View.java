package Java.JavaHomework.Homework_9;

import java.util.Scanner;

public class View {
    String choise(){
        Scanner sk = new Scanner(System.in);
        System.out.println("1. XML\n2. HTML\n3. Markdown");
        System.out.print("Выбирите формат для сохранения: ");
        return sk.nextLine(); 
    }
}
