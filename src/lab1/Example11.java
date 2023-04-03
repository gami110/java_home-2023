package lab1;
import java.util.Scanner;
import java.time.LocalDate;
public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        System.out.println("Введите имя и год рождения:");
        String name = in.nextLine();
        int year_birth = in.nextInt();

    System.out.printf("Вас зовут %s и вам %d лет!", name, current_date.getYear()-year_birth);

    }
}
