package caseMo2;

import caseMo2.model.Account;
import caseMo2.model.Album;
import caseMo2.model.Song;
import caseMo2.service.AccountManage;
import caseMo2.service.AlbumManage;
import caseMo2.service.SongManage;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> listSong = new ArrayList<>();
        ArrayList<Album> listAlbum = new ArrayList<>();
        SongManage songManage = new SongManage(listSong);
        ArrayList<Account> listAccount = new ArrayList<>();
        AccountManage accountManage = new AccountManage(listAccount);
        AlbumManage albumManage = new AlbumManage(listAlbum);
//        ArrayList<Account>
        Song song = new Song("345");
        Song song2 = new Song("123");
        Song song3 = new Song("678");
        songManage.add(song);
        songManage.add(song2);
        songManage.add(song3);
//        System.out.println(listSong);
        Album album=new Album("a",listSong);
        albumManage.add(album);
//        albumManage.print();
        Account account = new Account("day la acc", "123", listAlbum);
        accountManage.add(account);

//        songManage.print();
    }
}
