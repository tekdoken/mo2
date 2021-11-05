package casestudy.service;

import casestudy.model.Song;
import casestudy.service.interfa.ManageSong;

import java.util.ArrayList;

public class SongManage implements ManageSong<Song> {
    private ArrayList<Song> listSong = new ArrayList<>();

    @Override
    public int findAbsolute(String nameSong) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().equals(nameSong)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String nameSong) {
        for (int i = 0; i < listSong.size(); i++) {
            if (listSong.get(i).getNameSong().contains(nameSong)) {
                System.out.println(listSong.get(i));
            }
        }
    }

    @Override
    public void add(Song song) {
        listSong.add(song);
    }

    @Override
    public void edit(String nameSong, Song song) {
        if (findAbsolute(nameSong)!=-1){
            listSong.set(findAbsolute(nameSong),song);
        }else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void deletel(String nameSong) {
        if (findAbsolute(nameSong)!=-1){
            listSong.remove(findAbsolute(nameSong));
        }else {
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Song x : listSong
        ) {
            System.out.println(x);
        }
        System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    }
}
