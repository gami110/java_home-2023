package lab1;
import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String month = in.nextLine();

        System.out.println("Введите колличество дней в месяце");
        int number_day = in.nextInt();

        System.out.printf("В %s %d дней", month, number_day);
    }
}
