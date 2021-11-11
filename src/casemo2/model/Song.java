package casemo2.model;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;

    public Song(String name) {
        this.name = name;
    }

    public String getNameSong() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("\n%41s",
                "Song name: " +  name
        );
//        return "\n"+ "Song name: " + name ;
    }
}