package casestudy.model;

public class Account {
    private String userName;
    private int password;
    private int id;
private Album album;
    public Account() {
    }

    public Account(String userName, int password, int id, Album album) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.album = album;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", id=" + id +
                ", album=" + album +
                '}';
    }
}
