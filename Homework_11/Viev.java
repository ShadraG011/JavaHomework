package Java.JavaHomework.Homework_11;

import java.util.ArrayList;
import java.util.Scanner;

class Viev {
    private Scanner sc = new Scanner(System.in);

    void vievContacts(ArrayList name, ArrayList number) {
        int size = Math.max(name.size(), number.size());
        for (int i = 0; i < size; i++) {
            System.out.println(name.get(i) + " - " + number.get(i));
        }
    }

    String getName() {
        System.out.print("Введите имя контакта: ");
        return sc.nextLine();
    }

    String getNumber() {
        String number = "";
        while (!isNumeric(number) || number.length() != 11) {
            System.out.print("Введите номер контакта: ");
            number = sc.nextLine();
            if (!isNumeric(number) || number.length() != 11)
                System.out.println("\nНомер состоит только из цифр (11)!");
        }
        return number;
    }

    static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void continueProg() {
        String str = "";
        while (!str.equalsIgnoreCase("Y")) {
            System.out.print("\nДля продолжения введите (Y): ");
            str = sc.nextLine();
            if (!str.equalsIgnoreCase("Y")) {
                System.out.println("Ошибка ввода");
            }
        }
    }

    void menu() {
        boolean flag = true;
        while (flag) {
            System.out.print("\033[H\033[J");
            System.out
                    .println("Выберите функцию:\n1. Показать все контаты\n2. Добавить контакт\n0. Выход из приложения");
            switch (sc.nextLine()) {
                case "1":
                    System.out.print("\033[H\033[J");
                    new Controler().readContactList();
                    continueProg();
                    break;
                case "2":
                    System.out.print("\033[H\033[J");
                    new Controler().writeContactList();
                    System.out.println("Контаткт добавлен!");
                    continueProg();
                    break;
                case "0":
                    System.out.print("\033[H\033[J");
                    System.out.println("Спасибо, что использовали наше приложение!");
                    flag = false;
                    break;
                default:
                    System.out.print("\033[H\033[J");
                    System.out.println("Эта функция пока не реализована!");
                    break;
            }
        }
    }
}
