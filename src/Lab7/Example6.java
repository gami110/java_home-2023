package Lab7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название файла:");
        String fileName = in.nextLine();
        System.out.println("Введите слово для поиска:");
        String word = in.nextLine();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            int count = 0;
            while (line != null) {
                if (line.contains(word)) {
                    System.out.println(line);
                    count++;
                }
                line = reader.readLine();
            }
            System.out.println("В файле " + fileName + " найдено совпадений: " + count);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
