package casestudy.model;

import casestudy.service.SongManage;

public class Album {
    private String nameAlbum;
    private int id;
    private SongManage song;

    public Album() {
    }

    public Album(String nameAlbum, int id, SongManage song) {
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

    public SongManage getString() {
        return song;
    }

    public void setString(SongManage song) {
        this.song = song;
    }

    @Override
    public String toString() {
        return "Album{" +
                "nameAlbum='" + nameAlbum + '\'' +
                ", id=" + id +
               "," +song +
                '}';
    }
}
