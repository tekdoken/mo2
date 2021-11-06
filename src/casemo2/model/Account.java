package casemo2.model;

import java.util.List;

public class Account {
    private String userName;
    private String password;
    private List<Album> listAlbum;

    public Account() {
    }

    public Account(String userName, String password, List<Album> listAlbum) {
        this.userName = userName;
        this.password = password;
        this.listAlbum = listAlbum;
    }

    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String
    toString() {
        return "Account{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", listAlbum=" + listAlbum +
                '}';
    }
    public void addAlbum(String name){

    }
//    public Album findByName(String name){
//
//    }
    public void deleteAlbum(String name){

    }
    public void editAlbum(String name,String newName){

    }
    public void printAlbum(){

    }
}
