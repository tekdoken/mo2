package kiemtramo2.service;

import kiemtramo2.model.Directory;

import java.io.Serializable;
import java.util.ArrayList;

public class DirectoryManage implements  Serializable {
    ArrayList<Directory> listDirectory= new ArrayList<>();

    public ArrayList<Directory> getListDirectory() {
        return listDirectory;
    }

    public void setListDirectory(ArrayList<Directory> listDirectory) {
        this.listDirectory = listDirectory;
    }

    public void add(Directory directory) {
        this.listDirectory.add(directory);
        System.out.println("add successful");
    }

    
    public void edit(String numPhone, String newName,String newNumPhone,String newAddress,String newBirthday,String email,String gender, String group) {
       int index=findAbsolute(numPhone);
        if (index != -1) {
            listDirectory.get(index).setName(newName);
            listDirectory.get(index).setNumPhone(newNumPhone);
            listDirectory.get(index).setAddress(newAddress);
            listDirectory.get(index).setBirthday(newBirthday);
            listDirectory.get(index).setEmail(email);
            listDirectory.get(index).setGender(gender);
            listDirectory.get(index).setGroup(group);
            System.out.println("edit successful");
        } else {
            System.out.println("This item is not available");
        }
    }

    
    public void delete(String numPhone) {
        if (findAbsolute(numPhone) != -1) {
            listDirectory.remove(findAbsolute(numPhone));
            System.out.println("delete successful");
        } else {
            System.out.println("This item is not available");
        }
    }

    
    public int findAbsolute(String num) {
        for (int i = 0; i < listDirectory.size(); i++) {
            if (listDirectory.get(i).getNumPhone().equals(num)) {
                return i;
            }
        }
        return -1;
    }

    
    public void findRelative(String numPhone) {
        boolean check=true;
        for (int i = 0; i < listDirectory.size(); i++) {
            if (listDirectory.get(i).getNumPhone().contains(numPhone)) {
                System.out.println(listDirectory.get(i));
                check=false;
            }
        }if (check==true){
            System.out.println("This item is not available");
        }
    }

    
    public void print() {
        for (Directory x : listDirectory
        ) {
            System.out.println(x);
        }
    }
}
