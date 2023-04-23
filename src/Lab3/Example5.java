package Lab3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

public class Example5 {
    private static final String ENGLISH = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final int MIN = 1;
    private static final int MAX = 20;
    private static final int AMOUNT_WRITE = 10;

    private static void printStringMod3(Map<Integer, String> map) {
        map.entrySet().stream().filter(e -> e.getKey() == 0).forEach(e -> System.out.print(e.getValue() + ", "));
    }

    private static int multi(Map<Integer, String> map) {
        return map.entrySet().stream().filter(e -> e.getValue().length() > 5).mapToInt(Map.Entry::getKey).reduce(1, (x, y) -> x * y);
    }

    private static void printMap(Map<Integer, String> map) {
        map.forEach((key, value) -> System.out.println(key + ": " + value + ";"));
    }

    private static String[] getKeyMoreFive(Map<Integer, String> map) {
        return map.entrySet().stream().filter(x -> x.getKey() > 5).map(Map.Entry::getValue).toArray(String[]::new);
    }

    private static Map<Integer, String> fillingMap() {
        Map<Integer, String> map = new HashMap<>();
        Random random = new Random();
        for (int count = 0; count < AMOUNT_WRITE; count++) {
            int key = random.nextInt(MAX - MIN + 1) + MIN;
            map.put(key, getRandomString(key));
        }
        return map;
    }

    private static String getRandomString(int size) {
        Random random = new Random();
        return IntStream.rangeClosed(1, size).
                mapToObj(i -> String.valueOf(ENGLISH.charAt(random.nextInt(ENGLISH.length())))).
                reduce("", (x, y) -> x + y);
    }

    public static void main(String[] args) {
        Map<Integer, String> map = fillingMap();
        System.out.println("HashMap:");
        printMap(map);
        System.out.println("Значения, где ключ > 5 :" + Arrays.toString(getKeyMoreFive(map)));
        System.out.print("Values, where key == 0: ");
        printStringMod3(map);
        System.out.println("\nMulti key, where string length > 5: " + multi(map));
    }
}
