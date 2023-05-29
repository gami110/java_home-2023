package Lab7.Example1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Primer3 {
    public static void main(String[] args) {
        String fileName = "src/Lab7/Example1/example_file.txt";
        String data = "Это данные для записи";
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try (FileReader reader = new FileReader(fileName)){
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e){
            System.out.println("Ошибка при чтение файла: " + e.getMessage());
        }
        if (new File(fileName).delete()) {
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
