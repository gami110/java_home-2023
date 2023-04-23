package Lab3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Example6 {
    public static void LinkedList(int x) {
        Date currentTime = new Date();
        System.out.println("Метод LinkedList:");
        System.out.println("Количество элементов: " + x + " (от 0 до " + (x - 1) + ")");

        LinkedList<Integer> circle = new LinkedList<>();
        for (int i = 0; i < x; i++) circle.add(i); // Заполняем коллекцию

        int counter = 0;
        while (circle.size() > 1) {
            for (int i = 0; i < circle.size(); i++) {
                counter++;
                if (counter == 2) {
                    circle.remove(i);
                    i--;
                    counter = 0;
                }
            }
        }

        System.out.println("Оставшийся элемент: " + circle.get(0));
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Результат в миллисекундах: " + msDelay);
        System.out.println();
    }

    public static void ArrayList(int x) {
        System.out.println("Метод ArrayList:");
        Date currentTime = new Date();

        System.out.println("Количество элементов: " + x + " (от 0 до " + (x - 1) + ")");

        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 0; i < x; i++) circle.add(i); // Заполняем коллекцию

        int counter = 0;
        while (circle.size() > 1) {
            for (int i = 0; i < circle.size(); i++) {
                counter++;
                if (counter == 2) {
                    circle.remove(i);
                    i--;
                    counter = 0;
                }
            }
        }
        System.out.println("Оставшийся элемент: " + circle.get(0));
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Результат в миллисекундах: " + msDelay);
    }


    public static void main(String[] args) {
        LinkedList(100000);
        ArrayList(100000);


    }
}
