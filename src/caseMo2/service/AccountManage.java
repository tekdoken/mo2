package caseMo2.service;

import caseMo2.model.Account;
import caseMo2.model.Album;

import java.util.List;

public class AccountManage implements General<Account> {
    List<Album> listAlbum;
    List<Account> listAccount;

    public AccountManage(List<Account> listAccount) {
        this.listAccount = listAccount;
    }

    public AccountManage(List<Album> listAlbum, List<Account> listAccount) {
        this.listAlbum = listAlbum;
        this.listAccount = listAccount;
    }

    @Override
    public void add(Account account) {
        listAccount.add(account);
    }

    @Override
    public void edit(String name, String newName) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public int findAbsolute(String name) {
        return 0;
    }

    @Override
    public void findRelative(String name) {

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

    }
}
