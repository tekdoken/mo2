package casestudy.model;

public class Song {
    private String nameSong;
    private int id;

    public Song() {
    }

    public Song(String nameSong, int id) {
        this.nameSong = nameSong;
        this.id = id;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format(
                        "\n"+"%30s %s","",
                "nameSong='" + nameSong + '\'' +
                ", id="+id );
    }
}
