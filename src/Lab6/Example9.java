package Lab6;

import java.util.List;
import java.util.Arrays;

import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Олег 23", "Олег и Анна", "Морс 123", "Java");
        System.out.println("Исходный массив" + "\n" + list + "\n");

        List<String> filteredList = filterBySymbol(list);
        System.out.println("Слова которы не содержут цифр и символов: " + "\n" + filteredList);
    }

    public static List<String> filterBySymbol(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я\\s]+"))
                .collect(Collectors.toList());
    }
}