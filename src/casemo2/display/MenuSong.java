package casemo2.display;

import casemo2.inoutdata.InOut;
import casemo2.inoutdata.WriteReadFile;
import casemo2.model.Account;
import casemo2.model.Song;
import casemo2.service.AccountManage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSong {
        public static final String RS = "\u001B[0m";
        public static final String RE = "\u001B[31m";
        public static final String GR = "\u001B[32m";
        public static final String YE = "\u001B[33m";
        public static final String BL = "\u001B[34m";
        public static final String PU = "\u001B[35m";
        public static final String CYAN = "\u001B[36m";
        public static void main(int indexAccLog,int indexAlbum) throws IOException {

            InOut inOut = new InOut();
            int numCheck3 = -1;
            int numCheck4 = -1;
            WriteReadFile.readFile();

        do {
            try {
                Scanner scanner = new Scanner(System.in);
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

    }

    private static boolean checkNameSongDuplicate ( int indexAccLog, int indexAlbum, int indexSong, String nameSong) throws
            IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getListAlbum().get(indexAlbum).getListSong().get(indexSong).getNameSong().equals(nameSong);
    }

    private static boolean checkRegex (String oldName){
        return !oldName.equals(" ");
    }
}
