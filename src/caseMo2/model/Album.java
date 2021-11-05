package caseMo2.model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;
    private Account account;

    public Album() {
    }

    public Album(String name) {
        this.name = name;
    }

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songs = songs;
    }

    public Album(String name, List<Song> songs, Account account) {
        this.name = name;
        this.songs = songs;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", songs=" + songs +
                ", account=" + account +
                '}';
    }
    public void addSong(String name){

    }
    public void deleteSong(String name){

    }
    public void print(){

    }
}
