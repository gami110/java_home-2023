package Lab3;

import java.util.Scanner;

public class Example3 {
    // рекурсивный метод для ввода значений в массив
    public static int[] arr = new int[10];
    static Scanner in = new Scanner(System.in);
    public static int x = 0;

    public static int[] Massive(int n) {
        if (x == n) return arr;
        else {
            System.out.print("Введите " + (x + 1) + " элемент массива: ");
            arr[x++] = in.nextInt();
        }
        return Massive(n);
    }

    // рекурсивный метод вывода значений из массива
    public static void PrintArray(int[] myArray, int i) {
        if (i < myArray.length) {
            System.out.print(myArray[i] + " ");
            PrintArray(myArray, i + 1);
        }
    }

    public static void main(String[] args) {
        // заполняем массив
        int[] out = Massive(10);
        // выводим массив
        PrintArray(out, 0);
    }

}
