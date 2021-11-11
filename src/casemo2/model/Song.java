package casemo2.model;

import casemo2.service.General;

import java.io.Serializable;
import java.util.List;

public class Song implements  Serializable {
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
        return "Songname: " + name ;
    }
}