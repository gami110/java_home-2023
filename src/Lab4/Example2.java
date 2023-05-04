package Lab4;

import java.util.Random;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        arr();
        Scanner in = new Scanner(System.in);
        boolean column_number;
        System.out.print("Введите номер столбца: ");
        do {
            try {
                column_number = false;
                print(in.next());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("– нет столбца с таким номером.\n" +
                        "введите корректное значение");
                column_number = true;
            } catch (NumberFormatException e) {
                System.out.println("– ввод строки вместо числа. \n" +
                        "введите корректное значение");
                column_number = true;
            }
        } while (column_number);
    }

    // Генерируем матрицу размером x*y
    private static final int[][] matrix = new int[5][5];

    // Заполняем матрицу случайными значениями
    private static void arr() {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
    }

    // Выводим запрошеный столбец в матрице
    private static void print(String a) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[Integer.parseInt(a) - 1][i] + " ");
        }
    }
}
