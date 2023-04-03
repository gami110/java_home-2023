package lab1;
import java.util.Scanner;
import java.time.LocalDate;
public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        LocalDate current_date = LocalDate.now();
        System.out.println("Введите год рождения");
        int year_of_birth = in.nextInt();
        System.out.printf("Вам %d лет.", current_date.getYear()-year_of_birth);

    }
}
