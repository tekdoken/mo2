package casestudy.main;

import casestudy.model.Account;
import casestudy.model.Album;
import casestudy.model.Song;
import casestudy.service.AccountManage;
import casestudy.service.AlbumManage;
import casestudy.service.SongManage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AccountManage accountManage = new AccountManage();
        SongManage songManage= new SongManage();
        AlbumManage albumManage=new AlbumManage();
        Song song = new Song("DUY", 1);
        Song song1 = new Song(" Ldfdfu*n", 1);
        Song song2 = new Song(" Lu*n", 1);
        Song song3 = new Song(" Lu*n", 1);
        songManage.add(song);
        songManage.add(song2);
        songManage.add(song3);
        songManage.add(song1);

        Album album = new Album("dfsdsd", 2, songManage);
        albumManage.addAlbum(album);
        albumManage.print();

//        Account acc = new Account("Long", 1232443434, 3, albumManage);
//        accountManage.addAcc(acc);
//        accountManage.print();
    }
}
