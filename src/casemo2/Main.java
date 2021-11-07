package casemo2;

import casemo2.model.Album;
import casemo2.model.Song;
import casemo2.service.AlbumManage;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends InOut {
    public static void main(String[] args) throws IOException {
        ArrayList<Song> listSong = new ArrayList<>();//nhập xuất file
        //        WedSong(listSong);
        //        WriterSong(listSong);

        ArrayList<Song> songInAlbum = new ArrayList<>();
        ArrayList<Album> albums = new ArrayList<>();
        AlbumManage albumManage = new AlbumManage(albums);

        InOut inOut = new InOut();

        Album album = new Album(inOut.NewAlbumName(), songInAlbum);
        albumManage.add(album);

        Song newSongAlbum = new Song(inOut.NewSongInAlbum());
        songInAlbum.add(newSongAlbum);
        newSongAlbum = new Song(inOut.NewSongInAlbum());
        songInAlbum.add(newSongAlbum);
        newSongAlbum = new Song(inOut.NewSongInAlbum());
        songInAlbum.add(newSongAlbum);


        albumManage.print();


//        albumManage.edit(inOut.EditNameAlbum(), inOut.NewEditNameAlbum());
//        albumManage.delete(inOut.DeleteAlbum());
//        albumManage.findRelative(inOut.FindRelativeAbum());
//        albumManage.printName(inOut.FindAbsoluteAlbum());

//        album.editSong(inOut.EditNameSong(), inOut.NewEditNameSong());
//        album.deleteSong(inOut.DeleteSong());

        album.getSongs(inOut.FindRelativeSong());
//        album.printName(inOut.FindAbsoluteAlbum());

        albumManage.print();


    }


    private static List<Song> ReadSong() throws IOException {
        ObjectInputStream read = null;
        ArrayList<Song> song = new ArrayList<>();
        try {
            read = new ObjectInputStream(new FileInputStream("src\\casemo2\\song.txt"));
            song = (ArrayList<Song>) read.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            read.close();
        }
        return song;
    }

    private static void WriterSong(List<Song> listSong) {
        ObjectOutputStream writer = null;

        try {
            writer = new ObjectOutputStream(new FileOutputStream("src\\casemo2\\song.txt"));
            writer.writeObject(listSong);
        } catch (
                FileNotFoundException e) {
            System.out.println("The system cannot find the file specified");
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private static void WedSong(List<Song> listSong) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            // close scanner
            scanner.close();
            // remove all new line
            content = content.replaceAll("\\n+", "");
            // regex
            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()) {
                Song listSong1 = new Song(m.group(1));

                listSong.add(listSong1);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




