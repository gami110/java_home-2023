package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = id.nextInt();
        System.out.println("Размер массива равен " + size);
        int[] nums = new int[size];
        Random random = new Random();
//Заполняем массив рандомными числами
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
        }
//Показываем массив
        System.out.println(Arrays.toString(nums));
//Ищем минимальное число
        int min = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
//Ищем все минимальные числа и выдаем их с индексами
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == min) {
                System.out.printf("Минимально число %d с индексом [" + i + "]%n", nums[i]);
            }
        }
    }
}
