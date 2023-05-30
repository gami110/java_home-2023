package Lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя файла: ");
        String fileName = scanner.nextLine();
        System.out.print("Введите текст для записи в файл: ");
        String text = scanner.nextLine();

        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            writer.write(text);
            writer.close();

            System.out.println("Количество записанных символов: " + text.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
