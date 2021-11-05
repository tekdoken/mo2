package casestudy.model;

import casestudy.service.AlbumManage;

public class Account {
    private String nameAccount;
    private int password;
    private int id;
    private AlbumManage album;

    public Account() {
    }

    public Account(String nameAccount, int password, int id, AlbumManage album) {
        this.nameAccount = nameAccount;
        this.password = password;
        this.id = id;
        this.album = album;
    }

    public AlbumManage getAlbum() {
        return album;
    }

    public void setAlbum(AlbumManage album) {
        this.album = album;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
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
                "nameAccount='" + nameAccount + '\'' +
                ", password=" + password +
                ", id=" + id +
                ", album=" + album +
                '}';
    }
}
