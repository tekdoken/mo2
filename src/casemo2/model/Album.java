package casemo2.model;

import casemo2.service.General;

import java.util.ArrayList;
import java.util.List;

public class Album implements General<Album> {
    private String name;
    private List<Song> songs;
    private List<Album> listAlbum;
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
    public void addSong(Song name){
        songs.add(name);
    }
    public void deleteSong(String name){

    }

    @Override
    public void add(Album album) {
        listAlbum.add(album);
    }

    @Override
    public int findAbsolute(String name) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String name) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().contains(name)) {
                System.out.println(listAlbum.get(i));
            }
        }
    }


    @Override
    public void edit(String name, String newName) {
        if (findAbsolute(name) != -1) {
            listAlbum.get(findAbsolute(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void delete(String name) {
        if ( findAbsolute(name)!=-1){
            listAlbum.remove(findAbsolute(name));
        }else{
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Album x:listAlbum
        ) {
            System.out.println(x);
        }
    }

    @Override
    public void printName(String name) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().equals(name)) {
                System.out.println(listAlbum.get(i));
            }
        }
    }
}
