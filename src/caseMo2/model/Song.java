package caseMo2.model;

public class Song {
    private String name;

    public Song() {
    }

    public Song(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                '}';
    }
}
