package kiemtra.service;

import kiemtra.model.Directory;
import minitest2710.model.Student;

import java.io.Serializable;
import java.util.ArrayList;

public class DirectoryManage implements  Serializable {
    ArrayList<Directory> listDirectory= new ArrayList<>();
    
    public void add(Directory directory) {
        this.listDirectory.add(directory);
    }

    
    public void edit(String numPhone, String newName,String newNumPhone,String newAddress,String newBirthday,String email,String gender, String group) {
        if (findAbsolute(numPhone) != -1) {
            listDirectory.get(findAbsolute(numPhone)).setName(newName);
            listDirectory.get(findAbsolute(numPhone)).setNumPhone(newNumPhone);
            listDirectory.get(findAbsolute(numPhone)).setAddress(newAddress);
            listDirectory.get(findAbsolute(numPhone)).setBirthday(newBirthday);
            listDirectory.get(findAbsolute(numPhone)).setEmail(email);
            listDirectory.get(findAbsolute(numPhone)).setGender(gender);
            listDirectory.get(findAbsolute(numPhone)).setGroup(group);
            System.out.println("edit successful");
        } else {
            System.out.println("This item is not available");
        }
    }

    
    public void delete(String numPhone) {
        if (findAbsolute(numPhone) != -1) {
            listDirectory.remove(findAbsolute(numPhone));
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
