package casemo2;


import java.util.Scanner;

public class InOut {
    Scanner sa = new Scanner(System.in);
    private static AccountExample accountExample = new AccountExample();


    public String NewAlbumName() {
        System.out.println("Enter the name of the album you want to create:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String EditNameAlbum() {
        System.out.println("Enter the album name you want to edit:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String NewEditNameAlbum() {
        System.out.println("Enter new album name:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String DeleteAlbum() {
        System.out.println("Enter the album name you want to Delete:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }


    public String FindRelativeAbum() {
        System.out.println("Enter the name of the album you want to find relative: ");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String FindAbsoluteAlbum() {
        System.out.println("Enter the name of the album you want to find absolute: ");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    //------------------------------------------------------------------------------------------------


    public String NewSongInAlbum() {
        System.out.println("Enter the name of the song you want to add to the album:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }
    public String AlbumAddSong() {
        System.out.println("Enter the name of the album you want to add song :");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }
    public String DeleteSong() {
        System.out.println("Enter the song name you want to Delete:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }


    public String FindRelativeSong() {
        System.out.println("Enter the name of the song you want to find relative: ");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String FindRelativeSong1() {
        System.out.println("Enter the name of the album you want to find song: ");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String FindAbsoluteSong() {
        System.out.println("Enter the name of the song you want to find absolute: ");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String EditNameSong() {
        System.out.println("Enter the song name you want to edit:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

    public String NewEditNameSong() {
        System.out.println("Enter new song name:");
        String newAlbumName = sa.nextLine();
        if (accountExample.Name(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }

//------------------------------------------------------------------------------------------------


    public String NewUserName() {
        System.out.println("Enter new username Account:");
        System.out.println("Note: name is letter or number, must not contain spaces");
        String newSongInAlbum = sa.nextLine();
        if (accountExample.Acc(newSongInAlbum) == true) {
            return newSongInAlbum;
        }
        return " ";
    }

    public String NewPass() {
        System.out.println("Enter new Password:");
        System.out.println("Note: Password must not contain spaces");
        String newAlbumName = sa.nextLine();
        if (accountExample.Pass(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }
    public String UserNameLogin() {
        System.out.println("Enter username Account:");
        System.out.println("Note: name is letter or number");
        String SongInAlbum = sa.nextLine();
        if (accountExample.Acc(SongInAlbum) == true) {
            return SongInAlbum;
        }
        return " ";
    }

    public String PassLogin() {
        System.out.println("Enter Password:");
        System.out.println("Note: Password must not contain spaces");
        String aAlbumName = sa.nextLine();
        if (accountExample.Pass(aAlbumName) == true) {
            return aAlbumName;
        }return " ";
    }


}
