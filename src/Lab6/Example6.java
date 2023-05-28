package Lab6;

import java.util.*;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {
        //Создаем лист и заполняем его рандомными целочислиными значениями
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println("Список до: ");
        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.print(integers.get(i) + " ");
        }
        //Задаем число которым будем проверять деление без остатка
        int divisor = 5;
        //Прогоняем через функцию и выводим результат
        List<Integer> integersAfter = getDivisibleNumbers(integers, divisor);
        System.out.println("\n" + "Список числел которые делятся без остатка на число:" + divisor);

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> getDivisibleNumbers(List<Integer> list, int divisor) {
        return list.stream().filter(i -> i % divisor == 0).collect(Collectors.toList());
    }
}
