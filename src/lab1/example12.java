package lab1;
import java.util.Scanner;
import java.time.LocalDate;
public class example12 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    LocalDate dt = LocalDate.now();
    System.out.println("Введите имя и возраст");

    String name = in.nextLine();
    int age = in.nextInt();

    System.out.printf("%s вы %d года рождения.", name, dt.getYear()-age);
    }
}
