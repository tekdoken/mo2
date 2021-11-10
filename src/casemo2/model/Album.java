package casemo2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Album implements Serializable {
    private String name;
    private List<Song> songList=new ArrayList<>();

    public Album() {
    }

    public List<Song> getListSong() {
        return songList;
    }

    public void setSongs(List<Song> songs) {
        this.songList = songs;
    }



    public Album(String name) {
        this.name = name;
    }

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.songList = songs;
    }


    public String getNameAlbum() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSongs(String song) {
        int r=0;
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getName().contains(song)) {
                System.out.println(songList.get(i).getName());
                r++;
            }
        }if (r==0){
            System.out.println("This song is not available!!!!");
        }
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songList = songs;
    }



    @Override
    public String toString() {
        return "Album name='" + name + '\'' + songList +
                '}';
    }


    public int findAbsoluteSong(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }




    public void editSong(String name, String newName) {
        if (findAbsoluteSong(name) != -1) {
            songList.get(findAbsoluteSong(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    public void deleteSong(String name) {
        if (findAbsoluteSong(name) != -1) {
            songList.remove(findAbsoluteSong(name));
        } else {
            System.out.println("This item is not available");
        }
    }


    public void printSong() {
        for (Song x : songList
        ) {
            System.out.println(x);
        }
    }

    public void add(Song song) {
        songList.add(song);
    }

    public void printName(String name) {
        for (int i = 0; i < songList.size(); i++) {
            if (songList.get(i).getName().equals(name)) {
                System.out.println(songList.get(i));
            }
        }
    }
}