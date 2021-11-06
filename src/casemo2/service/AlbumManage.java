package casemo2.service;

import casemo2.model.Album;
import casemo2.model.Song;

import java.util.List;

public class  AlbumManage implements General<Album> {
    List<Album> listAlbum;
    List<Song> listSong;

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }

    public List<Song> getListSong() {
        return listSong;
    }

    public void setListSong(List<Song> listSong) {
        this.listSong = listSong;
    }

    public AlbumManage() {
    }

    public AlbumManage(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }
    public void addSong(Song song){

    }
    @Override
    public void add(Album album) {
        this.listAlbum.add(album);
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
                System.out.println("listAlbum.get(i)");
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
