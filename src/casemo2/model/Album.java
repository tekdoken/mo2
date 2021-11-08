package casemo2.model;

import casemo2.service.General;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Album implements Serializable {
    private String name;
    private List<Song> songs;
    private List<Album> listAlbum;
    private Account account;

    public Album() {
    }

    public List<Song> getListSong() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
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

    public void getSongs(String song) {
        int r=0;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().contains(song)) {
                System.out.println(songs.get(i).getName());
                r++;
            }
        }if (r==0){
                System.out.println("This song is not available!!!!");
        }
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
        return "Album name='" + name + '\'' + songs +
                '}';
    }


    public int findAbsoluteSong(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public void findRelativeSong(String song, String album) {
        for (int j = 0; j < listAlbum.size(); j++) {
            if (listAlbum.get(j).getName().equals(album)) {
                System.out.println(listAlbum.get(j).getName() + ":");
                for (int i = 0; i < songs.size(); i++) {
                    if (songs.get(i).getName().contains(song)) {
                        System.out.print(songs.get(i).getName());
                    } else {
                        System.out.println("This song is not available!!!!");

                    }
                }
            } else {
                System.out.println("This album is not available!!!!");
            }
        }

    }


    public void editSong(String name, String newName) {
        if (findAbsoluteSong(name) != -1) {
            songs.get(findAbsoluteSong(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    public void deleteSong(String name) {
        if (findAbsoluteSong(name) != -1) {
            songs.remove(findAbsoluteSong(name));
        } else {
            System.out.println("This item is not available");
        }
    }


    public void printSong() {
        for (Song x : songs
        ) {
            System.out.println(x);
        }
    }

    public void add(Song song) {
        songs.add(song);
    }

    public void printName(String name) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getName().equals(name)) {
                System.out.println(songs.get(i));
            }
        }
    }
}
