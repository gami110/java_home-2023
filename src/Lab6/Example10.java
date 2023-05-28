package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Список целых чисел: ");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.print(integers.get(i) + " ");
        }
        System.out.print("\n" + "Введите число больше которого должны быть полученые числа: ");
        int count = in.nextInt();

        List<Integer> integersAfter = filterByLength(integers, count);
        System.out.println("Полученые значения : ");
        for (Integer i : integersAfter) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> filterByLength(List<Integer> integers, int count) {
        return integers.stream()
                .filter(number -> number < count)
                .collect(Collectors.toList());
    }
}
