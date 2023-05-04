package Lab4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        ESetArray();
        SumArray(StatArray);
    }

    private static byte[] StatArray;

    private static void ESetArray() {
        try {
            SetArray();
        } catch (InputMismatchException e) {
            System.out.println("введите корректное значение (" + e + ")");
            ESetArray();
        } catch (Exception e) {
            System.out.println("ошибка (" + e + ")");
            ESetArray();
        }

    }

    static class ByteRangeException extends InputMismatchException {
        ByteRangeException() {
            super("число за пределами диапазона byte");
        }
    }

    private static void EInput(int i) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.print("введите byte элемент массива: " + "[" + (i + 1) + "]");
            int sum_int = 0;
            try {
                sum_int = scan.nextInt();
                if (sum_int < -128 || sum_int > 127) {
                    throw new ByteRangeException();
                }
            } catch (ByteRangeException e) {
                System.out.println("значение за пределами диапазона byte (" + e + ")");
                EInput(i);
            }
            StatArray[i] = (byte) sum_int;
        } catch (InputMismatchException e) {
            System.out.println("введите число (" + e + ")");
            EInput(i);
        }
    }

    private static void SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = scan.nextInt();
        StatArray = new byte[a];
        for (int i = 0; i < a; i++) {
            EInput(i);
        }
    }

    private static void SumArray(byte[] InputArray) {
        int A = 0;
        for (int j : InputArray) {
            A += j;
        }
        System.out.println("сумма элементов массива = [" + (A) + "]");
    }
}
