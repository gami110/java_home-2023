package lab1;
import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Имя и возраст:");
        String name = in.nextLine();
        int age = in.nextInt();

        System.out.println("Вас зовут " + name + " и вам "+ age + " лет/год");
    }
}
