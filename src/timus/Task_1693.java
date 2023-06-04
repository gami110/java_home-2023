package timus;


import java.util.*;
import java.lang.*;

public class Task_1693 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        String[] splits = inScanner.nextLine().split(" ");
        if (Integer.parseInt(splits[0]) % 2 == 0 || Integer.parseInt(splits[1]) % 2 == 0) {
            System.out.println("[:=[first]");
        } else System.out.println("[second]=:]");
    }
}

