package casemo2.model;

import casemo2.service.General;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements General<Album> , Serializable {
    private String name;
    private String password;
    private List<Album> listAlbum=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Account() {
    }

    public Account(List<Album> listAlbum) {
        listAlbum = listAlbum;
    }

    public Account(String name, String password, List<Album> listAlbum) {
        this.name = name;
        this.password = password;
        this.listAlbum = listAlbum;
    }

    public Account(String name, String password) {
        this.name = name;
        this.password = password;
    }

    @Override
    public String
    toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", listAlbum=" + listAlbum +
                '}';
    }

    public List<Album> getListAlbum() {
        return listAlbum;
    }

    public void setListAlbum(List<Album> listAlbum) {
        this.listAlbum = listAlbum;
    }


    @Override
    public void add(Album album) {
        this.listAlbum.add(album);
    }

    @Override
    public int findAbsolute(String name) {
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String name) {
        boolean cc=true;
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().contains(name)) {
                System.out.println(listAlbum.get(i));
                cc=false;
            }
        }if (cc==true){
            System.out.println("This item is not available");
        }
    }


    @Override
    public void edit(String name, String newName) {
        if (findAbsolute(name) != -1) {
            listAlbum.get(findAbsolute(name)).setName(newName);
        } else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void delete(String name) {
        if ( findAbsolute(name)!=-1){
            listAlbum.remove(findAbsolute(name));
        }else{
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Album x:listAlbum
        ) {
            System.out.println(x);
        }
    }


    @Override
    public void printName(String name) {
        boolean c=true;
        for (int i = 0; i < listAlbum.size(); i++) {
            if (listAlbum.get(i).getName().equals(name)) {
                System.out.println(listAlbum.get(i));
                c=false;
                break;
            }
        }if (c==true){
            System.out.println("This item is not available");
        }
    }
    public void printListAlbum() {
        for (Album x:listAlbum
        ) {
            System.out.println("Name Album: "+x.getName());
        }
    }
}