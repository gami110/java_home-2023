package lab1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите два целых числа:");
    int a = in.nextInt();
    int b = in.nextInt();

    System.out.printf("%d + %d = %d", a, b, a+b);

    }
}
