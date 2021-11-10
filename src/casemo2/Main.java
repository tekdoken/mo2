package casemo2;

import casemo2.model.Account;
import casemo2.model.Album;
import casemo2.model.Song;
import casemo2.service.AccountManage;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends InOut {
    public static final String RS = "\u001B[0m";
    public static final String RE = "\u001B[31m";
    public static final String GR = "\u001B[32m";
    public static final String YE = "\u001B[33m";
    public static final String BL = "\u001B[34m";
    public static final String PU = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws IOException {


        ArrayList<Song> listSong = new ArrayList<>();//nhập xuất file
        //        WedSong(listSong);
        //        WriterSong(listSong);
        InOut inOut = new InOut();
        ArrayList<Account> accountInManage = new ArrayList<>();
        ArrayList<Song> songInAlbum = new ArrayList<>();
        ArrayList<Album> albumInAccount = new ArrayList<>();
        Account account = null;





//        album.editSong(inOut.EditNameSong(), inOut.NewEditNameSong());
//        album.deleteSong(inOut.DeleteSong());
//        album.getSongs(inOut.FindRelativeSong());
//        album.printName(inOut.FindAbsoluteAlbum());
        int numcheck = -1;
        int numcheck2 = -1;
        int numcheck3 = -1;
        int numcheck4 = -1;

        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(CYAN + "Menu");
                System.out.println("1. Register an account");
                System.out.println("2. Account login");
                System.out.println("3. change Password");
                System.out.println("0. Exit" + RS);
                System.out.println(YE + "Enter your choice: " + RS);
                numcheck = scanner.nextInt();
                if (numcheck != 0) {
                    switch (numcheck) {
//         Acconut
                        case 1:
                            account = new Account(inOut.NewUserName(), inOut.NewPass());
                            if (AccountManage.getInstance().getListAccount().size() == 0) {
                                if (checkRegex(account.getName()) && checkRegex(account.getPassword())) {
                                    AccountManage.getInstance().add(account);
                                    WriterAcc(AccountManage.getInstance());
                                    System.out.println(GR + "Register an account successfully!");
                                } else {
                                    System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                    break;
                                }
                            } else {
                                for (int indexAccRe = 0; indexAccRe < AccountManage.getInstance().getListAccount().size(); indexAccRe++) {
                                    if (!AccountManage.getInstance().getListAccount().get(indexAccRe).getName().equals(account.getName())) {
                                        if (checkRegex(account.getName()) && checkRegex(account.getPassword())) {
                                            AccountManage.getInstance().add(account);
                                            WriterAcc(AccountManage.getInstance());
                                            System.out.println(GR + "Register an account successfully!");
                                            break;
                                        } else {
                                            System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                            break;
                                        }
                                    } else {
                                        System.out.println(RE + "name already exists!!!!" + RS);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            String nameAcc = inOut.UserNameLogin(), pass = inOut.PassLogin();
                            for (int indexAccLog = 0; indexAccLog < AccountManage.getInstance().getListAccount().size(); indexAccLog++) {
                                if (AccountManage.getInstance().getListAccount().get(indexAccLog).getName().equals(nameAcc)
                                        && AccountManage.getInstance().getListAccount().get(indexAccLog).getPassword().equals(pass)) {
                                    System.out.println(GR + "Logged in successfully");
                                    do {
                                        try {
                                            System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println(BL + "Menu Album");
                                            System.out.println("1. create new album");
                                            System.out.println(GR + "2. Edit album(Add song)" + RS);
                                            System.out.println(BL + "3. Delete album");
                                            System.out.println("4. Find Relative album");
                                            System.out.println("5. Show album");
                                            System.out.println("6. Show list albums");
                                            System.out.println("7. Show list albums and songs in album");
                                            System.out.println("0. Log out" + RS);
                                            System.out.println(YE + "Enter your choice: " + RS);
                                            numcheck2 = scanner.nextInt();
                                            if (numcheck2 != 0) {
                                                switch (numcheck2) {
//                 Album
                                                    case 1:
                                                        Album album = new Album(inOut.NewAlbumName());
                                                        if (AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size() == 0) {
                                                            if (checkRegex(album.getName())) {
                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().add(album);
                                                                WriterAcc(AccountManage.getInstance());
                                                                System.out.println(GR + "create successful album" + RS);
                                                                break;
                                                            } else {
                                                                System.out.println(RE + "Invalid name album!!!!!!" + RS);
                                                                break;
                                                            }
                                                        } else {
                                                            for (int indexAlbum = 0; indexAlbum < account.getListAlbum().size(); indexAlbum++) {
                                                                if (!account.getListAlbum().get(indexAlbum).getName().equals(album.getName())) {
                                                                    if (checkRegex(album.getName())) {

                                                                        account.add(album);
                                                                        WriterAcc(AccountManage.getInstance());
                                                                        System.out.println(GR + "create successful album" + RS);
                                                                        break;
                                                                    } else {
                                                                        System.out.println(RE + "Invalid name album!!!!!!" + RS);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    System.out.println(RE + "name already exists!!!!" + RS);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        do {
                                                            try {
                                                                scanner = new Scanner(System.in);
                                                                System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                                                                System.out.println(CYAN + "Menu Edit Album");
                                                                System.out.println("1. Edit name album");
                                                                System.out.println("2. Add songs to Album");
                                                                System.out.println("3. change Password");
                                                                System.out.println("0. Exit" + RS);
                                                                System.out.println(YE + "Enter your choice: " + RS);
                                                                numcheck3 = scanner.nextInt();
                                                                if (numcheck3 != 0) {
                                                                    switch (numcheck3) {
                                                                        case 1:
                                                                            if (AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size() == 0) {
                                                                                System.out.println(RE + "This item is not available" + RS);
                                                                                break;
                                                                            } else {
                                                                                String oldName = inOut.EditNameAlbum(), newName = inOut.NewEditNameAlbum();
                                                                                if (checkRegex(oldName) && checkRegex(newName)) {
                                                                                    account.edit(oldName, newName);
                                                                                    System.out.println("Edit name album successful");
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 2:


                                                                            Song newSongAlbum = new Song(inOut.NewSongInAlbum());
                                                                            break;
                                                                        default:
                                                                            System.out.println(RE + "This item is not available" + RS);
                                                                    }
                                                                }
                                                            } catch (java.util.InputMismatchException e) {
                                                                System.err.println(YE + "please enter number" + RS);
                                                            }
                                                        } while (numcheck3 != 0);

                                                        break;
                                                    case 3:
                                                        do {
                                                            try {
                                                                scanner = new Scanner(System.in);
                                                                String nameAlbum = inOut.DeleteAlbum();
                                                                System.out.println(CYAN + "You definitely want to delete this album?????");
                                                                System.out.println(RE + "1. YES" + RS);
                                                                System.out.println(GR + "2. NO" + RS);
                                                                System.out.println(YE + "Enter your choice: " + RS);
                                                                numcheck4 = scanner.nextInt();
                                                                if (numcheck4 == 1) {
                                                                    switch (numcheck4) {
                                                                        case 1:
                                                                            if (checkAlbumNull(account)) {
                                                                                System.out.println(RE + "This item is not available" + RS);
                                                                                break;
                                                                            }
                                                                            account.delete(nameAlbum);
                                                                            if (checkAlbumNull(account)) {
                                                                                System.out.println(RE + "This item is not available" + RS);
                                                                                break;
                                                                            }
                                                                            account.printListAlbum();
                                                                            System.out.println("Delete successful");
                                                                            break;
                                                                        default:
                                                                            System.out.println(RE + "This item is not available" + RS);
                                                                    }
                                                                }
                                                            } catch (java.util.InputMismatchException e) {
                                                                System.err.println("please enter number");
                                                            }
                                                        } while (numcheck4 != 0 && numcheck4 > 2);
                                                        break;
                                                    case 4:
                                                        if (checkAlbumNull(account)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        account.findRelative(inOut.FindRelativeAbum());
                                                        break;
                                                    case 5:
                                                        if (checkAlbumNull(account)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        account.printName(inOut.FindAbsoluteAlbum());
                                                        break;
                                                    case 6:
                                                        if (checkAlbumNull(account)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).printListAlbum();

                                                        break;
                                                    case 7:
                                                        if (checkAlbumNull(account)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        account.print();
                                                        break;
                                                    default:
                                                        System.out.println(RE + "This item is not available" + RS);
                                                }
                                            }
                                        } catch (java.util.InputMismatchException e) {
                                            System.err.println(YE + "please enter number" + RS);
                                        }
                                    } while (numcheck2 != 0);


                                } else {
                                    System.out.println("Invalid username or password");
                                }
                            }
                            break;
                        case 3:
                            nameAcc = inOut.UserNameLogin();
                            pass = inOut.PassLogin();
                            String newPass = inOut.NewPass();
                            boolean check = true;
                            for (int indexAccPass = 0; indexAccPass < AccountManage.getInstance().getListAccount().size(); indexAccPass++) {
                                if (AccountManage.getInstance().getListAccount().get(indexAccPass).getName().equals(nameAcc)
                                        && AccountManage.getInstance().getListAccount().get(indexAccPass).getPassword().equals(pass)) {
                                    AccountManage.getInstance().edit(pass, newPass);
                                    System.out.println("change Password successfully");
                                    check = false;
                                    break;
                                }
                            }
                            if (check == true) {
                                System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                            }
                            break;
                        default:
                            System.out.println(RE + "This item is not available" + RS);
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.err.println("please enter number");
            }
        } while (numcheck != 0);

        //        ReadSong().print();


    }

    private static boolean checkAlbumNull(Account account) {
        return account.getListAlbum().size() == 0;
    }

    private static boolean checkSongNull(Album album) {
        return album.getListSong().size() == 0;
    }

    private static boolean checkRegex(String oldName) {
        return !oldName.equals(" ");
    }

//    private static Account ReadSong() throws IOException {
//        ObjectInputStream read = null;
//       Account account=null;
//        try {
//            read = new ObjectInputStream(new FileInputStream("src\\casemo2\\accdata.txt"));
//            account = (Account) read.readObject();
//        } catch (IOException | ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } finally {
//            read.close();
//        }
//        return account;
//    }

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
//
//    private static void WedSong(List<Song> listSong) {
//        try {
//            URL url = new URL("https://www.nhaccuatui.com/");
//            // open the stream and put it into BufferedReader
//            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
//            String content = scanner.next();
//            // close scanner
//            scanner.close();
//            // remove all new line
//            content = content.replaceAll("\\n+", "");
//            // regex
//            Pattern p = Pattern.compile("name_song\">(.*?)</a>");
//            Matcher m = p.matcher(content);
//            while (m.find()) {
//                Song listSong1 = new Song(m.group(1));
//
//                listSong.add(listSong1);
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}




