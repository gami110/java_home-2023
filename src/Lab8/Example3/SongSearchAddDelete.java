package Lab8.Example3;

import java.util.Scanner;
import Lab8.Example2.ParserXml;
public class SongSearchAddDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParserJson ParserJson = new ParserJson();
        System.out.println();
        System.out.println("Основное меню (Парсер JSON): ");
        System.out.println("Нажмите '1' что бы вывести список песен");
        System.out.println("Нажмите '2' что бы добавить новую песню");
        System.out.println("Нажмите '3' что бы найти песню по названию или альбому");
        System.out.println("Нажмите '4' что бы удалить песню по названию");
        System.out.println("Нажмите '5' что бы закрыть программу");
        System.out.print("Выбранно: ");

        int choiceOption = in.nextInt();
        in.nextLine();

        switch (choiceOption) {
            case 1 -> ParserXml.printSong(ParserJson.parser(), "JSON");
            case 2 -> ParserJson.addNewSong();
            case 3 -> ParserXml.printSong(ParserXml.findSong(ParserJson.parser()), "JSON c указанным исполнителем");
            case 4 -> ParserJson.deleteSong();
            case 5 -> System.exit(0);
        }
    }
}
