package casemo2.service;

import casemo2.WriteReadFile;
import casemo2.model.Account;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountManage implements General<Account>, Serializable {
    private List<Account> listAccount=new ArrayList<>();
    private static AccountManage instance;
    public static final String FILE = "src\\casemo2\\accdata.csv";

    public static AccountManage getInstance() throws IOException {
        if (instance == null) instance = new AccountManage();
        return instance;
    }

//    private AccountManage() throws IOException {
//            this.listAccount= WriteReadFile.read(FILE);
//    }


    public List<Account> getListAccount() {
        return this.listAccount;
    }

    public int getListAccount1() {
        return this.listAccount.size();
    }

    public int getListAccountNa() {
        return this.listAccount.size();
    }

    public void setListAccount(List<Account> listAccount) {
        this.listAccount = listAccount;
    }


    @Override
    public void add(Account account) {
        this.listAccount.add(account);
        WriteReadFile.write(FILE, this.listAccount);
    }

    @Override
    public int findAbsolute(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getNameAcc().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getNameAcc().contains(name)) {
                System.out.println(listAccount.get(i));
            }
        }
    }


    @Override
    public void edit(String name, String newPass) {
        if (findAbsolute(name) != -1) {
            listAccount.get(findAbsolute(name)).setPassword(newPass);
        } else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void delete(String name) {
        if (findAbsolute(name) != -1) {
            listAccount.remove(findAbsolute(name));
        } else {
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Account x : listAccount
        ) {
            System.out.println(x);
        }
    }

    @Override
    public void printName(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getNameAcc().equals(name)) {
                System.out.println(listAccount.get(i));
            }
        }
    }
}