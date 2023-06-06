package Lab8.Example3;

import Lab8.Example2.ParserXml;
import Lab8.Example2.Song;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ParserJson {
    private final List<Song> songs = new ArrayList<>();
    private static final String TAG_SONG = "songs";
    private static final String TAG_SONGNAME = "title";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_ALBUM = "album";

    private final String filePath = "src/Lab8/Example3/exampleJson.json";

    public List<Song> parser() {
        String title;
        String author;
        String album;

        JSONArray jsonArray = getJson();

        assert jsonArray != null;
        for (Object o : jsonArray) {
            JSONObject objectJson = (JSONObject) o;
            title = (String) objectJson.get(TAG_SONGNAME);
            author = (String) objectJson.get(TAG_AUTHOR);
            album = (String) objectJson.get(TAG_ALBUM);
            Song song = new Song(title, author, album);
            songs.add(song);
        }

        return songs;
    }


    public void addNewSong() {
        JSONArray jsonArray = getJson();
        JSONObject jsonNewSong = new JSONObject();
        System.out.println();
        Song newSong = ParserXml.newSong();
        jsonNewSong.put(TAG_SONGNAME, newSong.getSongName());
        jsonNewSong.put(TAG_AUTHOR, newSong.getAuthor());
        jsonNewSong.put(TAG_ALBUM, newSong.getAlbum());
        assert jsonArray != null;
        jsonArray.add(jsonNewSong);

        writeDate(jsonArray);

        System.out.println("Новая песня добавлена в Json");
    }

    public void deleteSong() {
        Scanner in = new Scanner(System.in);
        JSONArray jsonArray = getJson();

        System.out.println("Введите название песни которую необходимо удалить:");
        String title = in.nextLine();
        assert jsonArray != null;
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject song = (JSONObject) iterator.next();
            if (title.equals(song.get(TAG_SONGNAME))) {
                iterator.remove();
                writeDate(jsonArray);
                return;
            }
        }
        System.out.println("Песня не найдена");

    }

    private JSONArray getJson() {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            return (JSONArray) jsonObject.get(TAG_SONG);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private void writeDate(JSONArray jsonArray) {
        try {
            FileWriter file = new FileWriter(filePath);
            JSONObject library = new JSONObject();

            library.put(TAG_SONG, jsonArray);
            file.write(library.toString());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
