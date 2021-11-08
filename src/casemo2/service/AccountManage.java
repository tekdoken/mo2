package casemo2.service;

import casemo2.model.Account;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AccountManage implements General<Account>, Serializable {

    List<Account> listAccount = new ArrayList<Account>();
    private static final AccountManage instance = new AccountManage();

    public static AccountManage getInstance() {
    return instance;
    }

    public AccountManage(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public AccountManage() {

    }

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
    }

    @Override
    public int findAbsolute(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelative(String name) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getName().contains(name)) {
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
            if (listAccount.get(i).getName().equals(name)) {
                System.out.println(listAccount.get(i));
            }
        }
    }
}
