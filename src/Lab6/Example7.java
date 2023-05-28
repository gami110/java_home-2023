package Lab6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        list.add("Привет");
        list.add("Солнце");
        list.add("Роскосмос");
        list.add("Музыка");
        list.add("Игра");
        list.add("Заря");
        System.out.println(list);
        System.out.print("Введите ограничение: ");
        int length = in.nextInt();

        List<String> filteredList = filterByLength(list, length);
        System.out.println(filteredList);
    }
    public static List<String> filterByLength(List<String> list, int length) {
        return list.stream().filter(s -> s.length() > length).collect(Collectors.toList());
    }
}
