package Java.JavaHomework.Homework_12.JavaVersion;

import java.io.*;

class WriteToFile {

    void writeName(String name) {
        String filePath = "Java/JavaHomework/Homework_11/contacts/Name.txt";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(name + "\n");
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    void writeNumber(String number) {
        String filePath = "Java/JavaHomework/Homework_11/contacts/Number.txt";
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(number + "\n");
            bufferWriter.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
