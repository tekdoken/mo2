package casemo2.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Album implements Serializable {
    private String name;
    private List<Song> listSong =new ArrayList<>();

    public Album() {
    }

    public List<Song> getListSong() {
        return listSong;
    }

    public void setSongs(List<Song> songs) {
        this.listSong = songs;
    }



    public Album(String name) {
        this.name = name;
    }

    public Album(String name, List<Song> songs) {
        this.name = name;
        this.listSong = songs;
    }


    public String getNameAlbum() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSongs(String song) {
        int r=0;
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().contains(song)) {
                System.out.println(listSong.get(i).getNameSong());
                r++;
            }
        }if (r==0){
            System.out.println("This song is not available!!!!");
        }
    }

    public void setSongs(ArrayList<Song> songs) {
        this.listSong = songs;
    }



    @Override
    public String toString() {
        return "Album name='" + name + '\'' + listSong +
                '}';
    }


    public int findAbsoluteSong(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().equals(name)) {
                return i;
            }
        }
        return -1;
    }




    public void editSong(String name, String newName) {
        if (findAbsoluteSong(name) != -1) {
            listSong.get(findAbsoluteSong(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    public void deleteSong(String name) {
        if (findAbsoluteSong(name) != -1) {
            listSong.remove(findAbsoluteSong(name));
        } else {
            System.out.println("This item is not available");
        }
    }
    public void findRelativeSong(String name) {
        boolean cc=true;
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().contains(name)) {
                System.out.println(listSong.get(i));
                cc=false;
            }
        }if (cc==true){
            System.out.println("This item is not available");
        }
    }

    public void printSong() {
        for (Song x : listSong
        ) {
            System.out.println(x);
        }
    }

    public void add(Song song) {
        listSong.add(song);
    }

    public void printName(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().equals(name)) {
                System.out.println(listSong.get(i));
            }
        }
    }
    public void printNameSong(String name) {
        boolean c=true;
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().equals(name)) {
                System.out.println(listSong.get(i));
                c=false;
                break;
            }
        }if (c==true){
            System.out.println("This item is not available");
        }
    }
}