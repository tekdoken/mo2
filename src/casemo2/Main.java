package casemo2;

import casemo2.model.Account;
import casemo2.model.Album;
import casemo2.model.Song;
import casemo2.service.AccountManage;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends InOut {
    private static Integer file = 1;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws IOException {
        ArrayList<Song> listSong = new ArrayList<>();//nhập xuất file
        //        WedSong(listSong);
        //        WriterSong(listSong);
        InOut inOut = new InOut();
        ArrayList<Account> accountInManage = new ArrayList<>();
        ArrayList<Song> songInAlbum = new ArrayList<>();
        ArrayList<Album> albumInAccount = new ArrayList<>();

//        Album album = new Album(inOut.NewAlbumName(), songInAlbum);
        AccountManage accountManage = new AccountManage(accountInManage);
////        account.add(album);
//
//        Song newSongAlbum = new Song(inOut.NewSongInAlbum());
//        album.add(newSongAlbum);


//        account.edit(inOut.EditNameAlbum(), inOut.NewEditNameAlbum());
//        account.delete(inOut.DeleteAlbum());
//        account.findRelative(inOut.FindRelativeAbum());
//        account.printName(inOut.FindAbsoluteAlbum());

//        album.editSong(inOut.EditNameSong(), inOut.NewEditNameSong());
//        album.deleteSong(inOut.DeleteSong());
//        album.getSongs(inOut.FindRelativeSong());
//        album.printName(inOut.FindAbsoluteAlbum());
        int numcheck = -1;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(ANSI_CYAN + "Menu");
                System.out.println("1. Register an account");
                System.out.println("2. Account login");
                System.out.println("3. Account login");
                System.out.println("0. Exit" + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "Enter your choice: " + ANSI_RESET);
                numcheck = scanner.nextInt();
                if (numcheck != 0) {
                    switch (numcheck) {
                        case 1:
                            Account account = new Account(inOut.NewUserName(), inOut.NewPass(), albumInAccount);
                            if (!account.getName().equals("a") && !account.getPassword().equals("a")) {
                                for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                                    if (!accountManage.getListAccount().get(i).getName().equals(inOut.NewUserName())) {
                                        accountManage.add(account);
                                        WriterAcc(accountManage);
                                    } else {
                                        System.out.println(ANSI_YELLOW + "name already exists!!!!" + ANSI_RESET);
                                    }
                                }

                            } else {
                                System.out.println(ANSI_RED + "Invalid username or password!!!!!!" + ANSI_RESET);
                            }
                            break;
                        case 2:
                            for (int i = 0; i < accountManage.getListAccount().size(); i++) {
                                if (accountManage.getListAccount().get(i).getName().equals(inOut.UserNameLogin()) && accountManage.getListAccount().get(i).getPassword().equals(inOut.PassLogin())) {
                                    System.out.println("Logged in successfully");
                                    do {
                                        try {
                                            System.out.println(ANSI_CYAN + "Menu");
                                            System.out.println("1. Register an account");
                                            System.out.println("2. Account login");
                                            System.out.println("3. Account login");
                                            System.out.println("0. Exit" + ANSI_RESET);
                                            System.out.println(ANSI_YELLOW + "Enter your choice: " + ANSI_RESET);
                                            numcheck = scanner.nextInt();
                                            if (numcheck != 0) {
                                                switch (numcheck) {
                                                    case 1:

                                                    default:
                                                        System.out.println("This item is not available");
                                                }
                                            }
                                        } catch (java.util.InputMismatchException e) {
                                            System.err.println("please enter number");
                                        }
                                    } while (numcheck != 0);


                                } else {
                                    System.out.println("Invalid username or password!!!");
                                }
                            }
                            break;
                        default:
                            System.out.println("This item is not available");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.err.println("please enter number");
            }
        } while (numcheck != 0);
        accountManage.print();
//        ReadSong().print();
    }


    private static AccountManage ReadSong() throws IOException {
        ObjectInputStream read = null;
        AccountManage accountManage = null;
        try {
            read = new ObjectInputStream(new FileInputStream("src\\casemo2\\accdata.txt"));
            accountManage = (AccountManage) read.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            read.close();
        }
        return accountManage;
    }

    private static void WriterAcc(AccountManage listAcc) {
        ObjectOutputStream writer = null;

        try {
            writer = new ObjectOutputStream(new FileOutputStream("src\\casemo2\\accdata.txt"));
            writer.writeObject(listAcc);
        } catch (
                FileNotFoundException e) {
            System.err.println("The system cannot find the file specified");
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




