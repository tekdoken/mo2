package casemo2;


import java.util.Scanner;

public class InOut {
    Scanner sa = new Scanner(System.in);
    private static AccountExample accountExample = new AccountExample();

    public String NewSongInAlbum() {
        System.out.println("Enter the name of the song you want to add to the album:");
        String newSongInAlbum = sa.nextLine();
        return newSongInAlbum;
    }

    public String NewAlbumName() {
        System.out.println("Enter the name of the album you want to create:");
        String newAlbumName = sa.nextLine();
        return newAlbumName;
    }

    public String EditNameAlbum() {
        System.out.println("Enter the album name you want to edit:");
        String editNameAlbum = sa.nextLine();
        ;
        return editNameAlbum;
    }

    public String NewEditNameAlbum() {
        System.out.println("Enter new album name:");
        String newEditNameAlbum = sa.nextLine();
        return newEditNameAlbum;
    }

    public String DeleteAlbum() {
        System.out.println("Enter the album name you want to Delete:");
        String deleteAlbum = sa.nextLine();
        return deleteAlbum;
    }


    public String FindRelativeAbum() {
        System.out.println("Enter the name of the album you want to find relative: ");
        String findRelativeAbum = sa.nextLine();
        return findRelativeAbum;
    }

    public String FindAbsoluteAlbum() {
        System.out.println("Enter the name of the album you want to find absolute: ");
        String findAbsoluteAlbum = sa.nextLine();
        return findAbsoluteAlbum;
    }

    //------------------------------------------------------------------------------------------------
    public String DeleteSong() {
        System.out.println("Enter the song name you want to Delete:");
        String deleteAlbum = sa.nextLine();
        return deleteAlbum;
    }


    public String FindRelativeSong() {
        System.out.println("Enter the name of the song you want to find relative: ");
        String findRelativeAbum = sa.nextLine();
        return findRelativeAbum;
    }

    public String FindRelativeSong1() {
        System.out.println("Enter the name of the album you want to find song: ");
        String findRelativeAbum = sa.nextLine();
        return findRelativeAbum;
    }

    public String FindAbsoluteSong() {
        System.out.println("Enter the name of the song you want to find absolute: ");
        String findAbsoluteAlbum = sa.nextLine();
        return findAbsoluteAlbum;
    }

    public String EditNameSong() {
        System.out.println("Enter the song name you want to edit:");
        String editNameAlbum = sa.nextLine();
        ;
        return editNameAlbum;
    }

    public String NewEditNameSong() {
        System.out.println("Enter new song name:");
        String newEditNameAlbum = sa.nextLine();
        return newEditNameAlbum;
    }

//------------------------------------------------------------------------------------------------


    public String NewUserName() {
        System.out.println("Enter new username Account:");
        System.out.println("Note: name is letter or number");
        String newSongInAlbum = sa.nextLine();
        if (accountExample.validate(newSongInAlbum) == true) {
            return newSongInAlbum;
        }
        return "a";
    }

    public String NewPass() {
        System.out.println("Enter new Password:");
        System.out.println("Note: Password must not contain spaces");
        String newAlbumName = sa.nextLine();
        if (accountExample.va(newAlbumName) == true) {
            return newAlbumName;
        }return "a";
    }
    public String UserNameLogin() {
        System.out.println("Enter username Account:");
        System.out.println("Note: name is letter or number");
        String newSongInAlbum = sa.nextLine();
        if (accountExample.validate(newSongInAlbum) == true) {
            return newSongInAlbum;
        }
        return " ";
    }

    public String PassLogin() {
        System.out.println("Enter Password:");
        System.out.println("Note: Password must not contain spaces");
        String newAlbumName = sa.nextLine();
        if (accountExample.va(newAlbumName) == true) {
            return newAlbumName;
        }return " ";
    }
    public String EditPass() {
        System.out.println("Enter old Password:");
        String editNameAlbum = sa.nextLine();
        ;
        return editNameAlbum;
    }

}
