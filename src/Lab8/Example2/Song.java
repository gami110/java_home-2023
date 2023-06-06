package Lab8.Example2;

public class Song {
    private final String songName;
    private final String author;
    private final String album;

    public Song(String title, String author, String album) {
        this.songName = title;
        this.author = author;
        this.album = album;
    }

    public String getSongName() {
        return songName;
    }

    public String getAuthor() {
        return author;
    }

    public String getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "{Название песни ='" + songName + '\'' +
                ", Исполнитель='" + author + '\'' +
                ", Альбом=" + album + "}" + '\n';
    }
}
