package Lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
public class Example5 {
    public static void main(String[] args) {
        // Открываем для чтения
        String filePath = "src/Lab8/Example1/example32.xlsx";
        try {
            FileInputStream inputStream = new FileInputStream(filePath);

            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");

            for (Row row : sheet){
                for (Cell cell : row){
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Закрытие файла
            workbook.close();
            inputStream.close();
        } catch (IOException e){
            System.out.println("Ошибка ввода вывода");
            e.printStackTrace();
        } catch (IllegalStateException e){
            System.out.println("Проверьте структуру и содержимое файла Excel");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Программа пытается обратиться к несуществующему элементу");
        }
    }
}
