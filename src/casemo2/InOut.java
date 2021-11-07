package casemo2;

import java.util.Scanner;

public class InOut {
    Scanner sa = new Scanner(System.in);

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
}
