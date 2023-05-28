package Lab6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");

        int size = in.nextInt();
        // Создаем массив и заполняем рандомными числами
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt();
        }
        // Смотрим какие данные в исходном массиве
        System.out.println("Массив arr : ");
        System.out.println(Arrays.toString(arr));
        // создаем еще один массив и заполняем его через созданую функцию
        int[] arrResult = filterEvenNumbers(arr);
        System.out.println("Массив arrResult :");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterEvenNumbers(int[] arr) {
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
