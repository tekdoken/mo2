package casemo2;

import casemo2.model.Album;
import casemo2.model.Song;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main  {
    public static void main(String[] args) {
        List<Song> listSong = new ArrayList<>();
        Song song=new Song();
        WedSong(listSong);
        WriterSong(listSong);
        song.setSongs(ReadSong());
        ArrayList<Song> songAlbum=new ArrayList<>();
//        songAlbum=listSong.get(1);
        Album album=new Album("al1");
        album.add(album);
        System.out.println(album);



    }


    private static List<Song> ReadSong() {
        ObjectInputStream read = null;
        ArrayList<Song>  song=new ArrayList<>();
        try {
            read = new ObjectInputStream(new FileInputStream("src\\casemo2\\song.txt"));
            song = (ArrayList<Song>) read.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
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




