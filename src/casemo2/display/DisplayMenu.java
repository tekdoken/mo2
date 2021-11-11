package casemo2.display;

import casemo2.inoutdata.InOut;
import casemo2.inoutdata.WriteReadFile;
import casemo2.model.Account;
import casemo2.model.Album;
import casemo2.model.Song;
import casemo2.service.AccountManage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DisplayMenu extends InOut {
    public static final String RS = "\u001B[0m";
    public static final String RE = "\u001B[31m";
    public static final String GR = "\u001B[32m";
    public static final String YE = "\u001B[33m";
    public static final String BL = "\u001B[34m";
    public static final String PU = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws IOException {
        InOut inOut = new InOut();
        Account account = null;
        int numCheck = -1;
        int numCheck2 = -1;
        int numCheck3 = -1;
        int numCheck4 = -1;
        WriteReadFile.readFile();
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(CYAN + "      Menu");
                System.out.println("1. Register an account");
                System.out.println("2. Account login");
                System.out.println("3. change Password");
                System.out.println("0. Exit" + RS);
                AccountManage.getInstance().print();
                System.out.println(YE + "Enter your choice: " + RS);
                numCheck = scanner.nextInt();
                if (numCheck != 0) {
                    switch (numCheck) {
                        case 1:
                            account = new Account(inOut.NewUserName(), inOut.NewPass());
                            if (checkAccNull()) {
                                if (checkRegex(account.getNameAcc()) && checkRegex(account.getPassword())) {
                                    AccountManage.getInstance().add(account);
                                    System.out.println(GR + "Register an account successfully!");
                                } else {
                                    System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                    break;
                                }
                            } else {
                                boolean checkNameAcc = true;
                                for (int indexAccRe = 0; indexAccRe < AccountManage.getInstance().getListAccount().size(); indexAccRe++) {
                                    if (checkNameAccDuplicate(account, indexAccRe)) {
                                        System.out.println(RE + "name already exists!!!!" + RS);
                                        checkNameAcc = false;
                                        break;
                                    }
                                }
                                if (checkNameAcc == true) {
                                    if (checkRegex(account.getNameAcc()) && checkRegex(account.getPassword())) {
                                        AccountManage.getInstance().add(account);
                                        System.out.println(GR + "Register an account successfully!");
                                        break;
                                    } else {
                                        System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            String nameAcc = inOut.UserNameLogin(), pass = inOut.PassLogin();
                            for (int indexAccLog = 0; indexAccLog < AccountManage.getInstance().getListAccount().size(); indexAccLog++) {
                                if (checkLogin(nameAcc, pass, indexAccLog)) {
                                    System.out.println(GR + "Logged in successfully");
                                    do {
                                        try {
                                            System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                                            System.out.println(BL + "      Menu Album");
                                            System.out.println("1. create new album");
                                            System.out.println(GR + "2. Edit album(Add song)" + RS);
                                            System.out.println(BL + "3. Delete album");
                                            System.out.println("4. Find Relative album");
                                            System.out.println("5. Show album");
                                            System.out.println("6. Show list albums");
                                            System.out.println("7. Show list albums and songs in album");
                                            System.out.println("8. change name album");
                                            System.out.println("0. Log out" + RS);
                                            System.out.println(YE + "Enter your choice: " + RS);
                                            numCheck2 = scanner.nextInt();
                                            if (numCheck2 != 0) {
                                                switch (numCheck2) {
//                 Album
                                                    case 1:
                                                        Album album = new Album(inOut.NewAlbumName());
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            if (checkRegex(album.getNameAlbum())) {
                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().add(album);
                                                                System.out.println(GR + "create successful album" + RS);
                                                                break;
                                                            } else {
                                                                System.out.println(RE + "Invalid name album!!!!!!" + RS);
                                                                break;
                                                            }
                                                        } else {
                                                            boolean checkNameAlbum = true;
                                                            for (int indexAlbum = 0; indexAlbum < AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size(); indexAlbum++) {
                                                                if (checkNameAlbumDuplicate(indexAccLog, indexAlbum, album.getNameAlbum())) {
                                                                    System.out.println(RE + "name already exists!!!!" + RS);
                                                                    checkNameAlbum = false;
                                                                    break;
                                                                }
                                                            }
                                                            if (checkNameAlbum == true) {
                                                                if (checkRegex(album.getNameAlbum())) {
                                                                    AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().add(album);
                                                                    System.out.println(GR + "create successful album" + RS);
                                                                    break;
                                                                } else {
                                                                    System.out.println(RE + "Invalid name album!!!!!!" + RS);
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 2:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        } else {
                                                            String nameAlbumEdit = inOut.EditNameAlbum();
                                                            for (int indexAlbum = 0; indexAlbum < AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size(); indexAlbum++) {
                                                                if (checkNameAlbumDuplicate(indexAccLog, indexAlbum, nameAlbumEdit)) {
                                                                    if (AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getListSong().size() == 0) {
                                                                        Song song = new Song(inOut.NewSongInAlbum());
                                                                        if (checkRegex(song.getNameSong())) {
                                                                            AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).add(song);
                                                                            System.out.println(GR + "create successful song" + RS);
                                                                        } else {
                                                                            System.out.println(RE + "Invalid name song!!!!!!" + RS);
                                                                            break;
                                                                        }
                                                                    }

                                                                    do {
                                                                        try {
                                                                            scanner = new Scanner(System.in);
                                                                            System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                                                                            System.out.println(CYAN + "      Menu Edit Album");
                                                                            System.out.println("1. Add song to Album");
                                                                            System.out.println("2. Delete song");
                                                                            System.out.println("3. Find Relative song");
                                                                            System.out.println("4. Show list song");
                                                                            System.out.println("5. change name song");
                                                                            System.out.println("0. Exit" + RS);
                                                                            System.out.println(YE + "Enter your choice: " + RS);
                                                                            numCheck3 = scanner.nextInt();
                                                                            if (numCheck3 != 0) {
                                                                                switch (numCheck3) {
                                                                                    case 1:
                                                                                        Song song = new Song(inOut.NewSongInAlbum());
                                                                                        boolean checkNameSong = true;
                                                                                        if (checkRegex(song.getNameSong())) {
                                                                                            for (int indexSong = 0; indexSong < AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getListSong().size(); indexSong++) {
                                                                                                if (checkNameSongDuplicate(indexAccLog, indexAlbum, indexSong, song.getNameSong())) {
                                                                                                    System.out.println(RE + "name already exists!!!!" + RS);
                                                                                                    checkNameSong = false;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (checkNameSong == true) {
                                                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).add(song);
                                                                                                System.out.println(GR + "create successful song" + RS);
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        } else {
                                                                                            System.out.println(RE + "Invalid name song!!!!!!" + RS);
                                                                                        }
                                                                                        break;
                                                                                    case 2:
                                                                                        do {
                                                                                            try {
                                                                                                scanner = new Scanner(System.in);
                                                                                                String nameSong = inOut.DeleteSong();
                                                                                                if (AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).findAbsoluteSong(nameSong) != -1) {
                                                                                                    System.out.println(CYAN + "You definitely want to delete this album?????");
                                                                                                    AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).printNameSong(nameSong);
                                                                                                    System.out.println(RE + "1. YES" + RS);
                                                                                                    System.out.println(GR + "2. NO" + RS);
                                                                                                    System.out.println(YE + "Enter your choice: " + RS);
                                                                                                    numCheck4 = scanner.nextInt();
                                                                                                    if (numCheck4 == 1) {
                                                                                                        switch (numCheck4) {
                                                                                                            case 1:
                                                                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).deleteSong(nameSong);
                                                                                                                System.out.println("Delete song successful!");
                                                                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).printSong();
                                                                                                                break;
                                                                                                            default:
                                                                                                                System.out.println(RE + "This item is not available" + RS);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    System.out.println("This item is not available");
                                                                                                }
                                                                                                break;
                                                                                            } catch (InputMismatchException e) {
                                                                                                System.err.println("please enter number");
                                                                                            }
                                                                                            WriteReadFile.writeFile();
                                                                                            WriteReadFile.readFile();
                                                                                        } while (numCheck4 != 0);
                                                                                        break;
                                                                                    case 3:
                                                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).findRelativeSong(inOut.FindRelativeSong());
                                                                                        break;
                                                                                    case 4:
                                                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).printSong();
                                                                                        break;
                                                                                    case 5:
                                                                                        String nameSongEdit = inOut.EditNameSong();
                                                                                        boolean checkNameSongNew = true;
                                                                                        if (AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).findAbsoluteSong(nameSongEdit) != -1) {
                                                                                            String newNameSong = inOut.NewEditNameAlbum();
                                                                                            for (int indexSong = 0; indexSong < AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getListSong().size(); indexSong++) {
                                                                                                if (checkNameSongDuplicate(indexAccLog, indexAlbum, indexSong, newNameSong)) {
                                                                                                    System.out.println(RE + "name already exists!!!!" + RS);
                                                                                                    checkNameSongNew = false;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (checkNameSongNew == true) {
                                                                                                if (checkRegex(nameSongEdit) && checkRegex(newNameSong)) {
                                                                                                    AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).editSong(nameSongEdit, newNameSong);
                                                                                                    System.out.println("Edit name Song successful");
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            System.out.println("This item is not available");
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    default:
                                                                                        System.out.println(RE + "This item is not available" + RS);
                                                                                }
                                                                            }
                                                                        } catch (InputMismatchException e) {
                                                                            System.err.println(YE + "please enter number" + RS);
                                                                        }
                                                                        WriteReadFile.writeFile();
                                                                        WriteReadFile.readFile();
                                                                    } while (numCheck3 != 0);
                                                                } else {
                                                                    System.out.println(RE + "This item is not available" + RS);
                                                                }
                                                            }
                                                        }
                                                        break;
                                                    case 3:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        do {
                                                            try {
                                                                scanner = new Scanner(System.in);
                                                                String nameAlbum = inOut.DeleteAlbum();
                                                                if (checkExistenceAlbum(indexAccLog, nameAlbum)) {
                                                                    System.out.println(CYAN + "You definitely want to delete this album?????");
                                                                    AccountManage.getInstance().getListAccount().get(indexAccLog).printName(nameAlbum);
                                                                    System.out.println(RE + "1. YES" + RS);
                                                                    System.out.println(GR + "2. NO" + RS);
                                                                    System.out.println(YE + "Enter your choice: " + RS);
                                                                    numCheck4 = scanner.nextInt();
                                                                    if (numCheck4 == 1) {
                                                                        switch (numCheck4) {
                                                                            case 1:
                                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).delete(nameAlbum);
                                                                                System.out.println("Delete song successful!");
                                                                                AccountManage.getInstance().getListAccount().get(indexAccLog).printListAlbum();
                                                                                break;
                                                                            default:
                                                                                System.out.println(RE + "This item is not available" + RS);
                                                                        }
                                                                    }
                                                                } else {
                                                                    System.out.println("This item is not available");
                                                                }
                                                                break;
                                                            } catch (InputMismatchException e) {
                                                                System.err.println("please enter number");
                                                            }
                                                            WriteReadFile.writeFile();
                                                            WriteReadFile.readFile();
                                                        } while (numCheck4 != 0);
                                                        break;
                                                    case 4:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).findRelative(inOut.FindRelativeAbum());
                                                        break;
                                                    case 5:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).printName(inOut.FindAbsoluteAlbum());
                                                        break;
                                                    case 6:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        } else {
                                                            AccountManage.getInstance().getListAccount().get(indexAccLog).printListAlbum();
                                                        }
                                                        break;
                                                    case 7:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        }
                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).print();
                                                        break;
                                                    case 8:
                                                        if (checkAlbumNull(indexAccLog)) {
                                                            System.out.println(RE + "This item is not available" + RS);
                                                            break;
                                                        } else {
                                                            boolean checkNameNew = true;
                                                            String nameAlbumEdit = inOut.EditNameAlbum();
                                                            if (checkExistenceAlbum(indexAccLog, nameAlbumEdit)) {
                                                                String newName = inOut.NewEditNameAlbum();
                                                                for (int indexAlbum = 0; indexAlbum < AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size(); indexAlbum++) {
                                                                    if (checkNameAlbumDuplicate(indexAccLog, indexAlbum, newName)) {
                                                                        System.out.println(RE + "name already exists!!!!" + RS);
                                                                        checkNameNew = false;
                                                                        break;
                                                                    }
                                                                }
                                                                if (checkNameNew == true) {
                                                                    if (checkRegex(nameAlbumEdit) && checkRegex(newName)) {
                                                                        AccountManage.getInstance().getListAccount().get(indexAccLog).edit(nameAlbumEdit, newName);
                                                                        System.out.println("Edit name album successful");
                                                                        break;
                                                                    }
                                                                }
                                                            } else {
                                                                System.out.println("This item is not available");
                                                                break;
                                                            }
                                                            break;
                                                        }
                                                    default:
                                                        System.out.println(RE + "This item is not available" + RS);
                                                }
                                            }
                                        } catch (InputMismatchException e) {
                                            System.err.println(YE + "please enter number" + RS);
                                        }
                                        WriteReadFile.writeFile();
                                        WriteReadFile.readFile();
                                    } while (numCheck2 != 0);

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
                                if (checkLogin(nameAcc, pass, indexAccPass)) {
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
            } catch (InputMismatchException e) {
                System.err.println("please enter number");
            }
            WriteReadFile.writeFile();
            WriteReadFile.readFile();
        } while (numCheck != 0);
        //        ReadSong().print();


    }

    private static boolean checkExistenceAlbum(int indexAccLog, String nameAlbumEdit) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).findAbsolute(nameAlbumEdit) != -1;
    }

    private static boolean checkNameSongDuplicate(int indexAccLog, int indexAlbum, int indexSong, String nameSong) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getListSong().get(indexSong).getNameSong().equals(nameSong);
    }

    private static boolean checkNameAlbumDuplicate(int indexAccLog, int indexAlbum, String nameAlbum) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getNameAlbum().equals(nameAlbum);
    }

    private static boolean checkAlbumNull(int indexAccLog) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().size() == 0;
    }

    private static boolean checkLogin(String nameAcc, String pass, int indexAccLog) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getNameAcc().equals(nameAcc)
                && AccountManage.getInstance().getListAccount().get(indexAccLog).getPassword().equals(pass);
    }

    private static boolean checkNameAccDuplicate(Account account, int indexAccRe) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccRe).getNameAcc().equals(account.getNameAcc());
    }

    private static boolean checkAccNull() throws IOException {
        return AccountManage.getInstance().getListAccount().size() == 0;
    }

    private static boolean s(Account account) {
        return account.getListAlbum().size() == 0;
    }

    private static boolean checkRegex(String oldName) {
        return !oldName.equals(" ");
    }

}




