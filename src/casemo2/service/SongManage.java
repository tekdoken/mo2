package casemo2.service;

import casemo2.model.Song;

import java.util.List;

public class SongManage implements General<Song> {
    List<Song> listSong;

    public SongManage() {
    }

    public SongManage(List<Song> listSong) {
        this.listSong = listSong;
    }

    @Override
    public void add(Song song) {
        listSong.add(song);
    }

    @Override
    public int findAbsolute(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().contains(name)) {
                System.out.println(listSong.get(i));
            }
        }
    }

    @Override
    public void edit(String name, String newName) {
        if (findAbsolute(name) != -1) {
            listSong.get(findAbsolute(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void delete(String name) {
        if ( findAbsolute(name)!=-1){
            listSong.remove(findAbsolute(name));
        }else{
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Song x:listSong
             ) {
            System.out.println(x);
        }
    }

    @Override
    public void printName(String name) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getName().equals(name)) {
                System.out.println(listSong.get(i));
            }
        }
    }
}
