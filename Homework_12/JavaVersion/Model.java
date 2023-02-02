package Java.JavaHomework.Homework_12.JavaVersion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class Model {

    public ArrayList readName() {
        ArrayList<String> contat = new ArrayList<String>();
        try {
            File file = new File("Java/JavaHomework/Homework_11/contacts/Name.txt");
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                contat.add(line);;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contat;
    }


    public ArrayList readNumber() {
        ArrayList<String> number = new ArrayList<String>();
        try {
            File file = new File("Java/JavaHomework/Homework_11/contacts/Number.txt");
            // создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            // создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                number.add(line);;
                // считываем остальные строки в цикле
                line = reader.readLine();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return number;
    }
}
