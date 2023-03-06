package lab1;
import java.util.Scanner;
public class example8 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Название текущего дня: ");
    String name_day = in.nextLine();
    System.out.println("Название месяца");
    String name_month = in.nextLine();
    System.out.println("Номер даты месяца");
    int day = in.nextInt();

    System.out.printf("%s %d %s", name_day, day, name_month);
    }
}
