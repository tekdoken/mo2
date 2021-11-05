package casestudy.service;

import casestudy.model.Album;
import casestudy.model.Album;
import casestudy.service.interfa.ManageAlbum;

import java.util.ArrayList;

public class AlbumManage implements ManageAlbum<Album> {
    private ArrayList<Album> listAlbum = new ArrayList<>();

    @Override
    public int findAbsoluteAlbum(String nameAlbum) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getNameAlbum().equals(nameAlbum)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelativeAlbum(String nameAlbum) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getNameAlbum().contains(nameAlbum)) {
                System.out.println(listAlbum.get(i));
            }
        }
    }

    @Override
    public void addAlbum(Album album) {
        listAlbum.add(album);
    }

    @Override
    public void editAlbum(String nameAlbum, Album album) {
        if (findAbsoluteAlbum(nameAlbum)!=-1){
            listAlbum.set(findAbsoluteAlbum(nameAlbum),album);
        }else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void deletelAlbum(String nameAlbum) {
        if (findAbsoluteAlbum(nameAlbum)!=-1){
            listAlbum.remove(findAbsoluteAlbum(nameAlbum));
        }else {
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Album x : listAlbum
        ) {
            System.out.println(x);
        }
        System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    }
}
