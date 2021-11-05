package casestudy.model;

public class Album {
    private String nameAlbum;
    private int id;
    private String song;

    public Album() {
    }

    public Album(String nameAlbum, int id, String song) {
        this.nameAlbum = nameAlbum;
        this.id = id;
        this.song = song;
    }

    public String getNameAlbum() {
        return nameAlbum;
    }

    public void setNameAlbum(String nameAlbum) {
        this.nameAlbum = nameAlbum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getString() {
        return song;
    }

    public void setString(String song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nameAlbum='" + nameAlbum + '\'' +
                ", id=" + id +
                ", song=" + song +
                '}';
    }
}
