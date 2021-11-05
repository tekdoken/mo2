package casestudy.service;

import casestudy.model.Account;
import casestudy.model.Album;
import casestudy.service.interfa.ManageAcc;
import casestudy.service.interfa.ManageAlbum;

import java.util.ArrayList;

public class AccountManage implements ManageAcc<Account> {
    private ArrayList<Account> listAccount = new ArrayList<>();
    private ArrayList<Album> listAlbum = new ArrayList<>();

    @Override
    public int findAbsoluteAcc(String nameAccount) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getNameAccount().equals(nameAccount)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findRelativeAcc(String nameAccount) {
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getNameAccount().contains(nameAccount)) {
                System.out.println(listAccount.get(i));
            }else {
                System.out.println("This item is not available");
            }
        }
    }

    @Override
    public void addAcc(Account account) {
        listAccount.add(account);
    }

    @Override
    public void editAcc(String nameAccount, Account account) {
        if (findAbsoluteAcc(nameAccount)!=-1){
            listAccount.set(findAbsoluteAcc(nameAccount),account);
        }else {
            System.out.println("This item is not available");
        }
    }

    @Override
    public void deletelAcc(String nameAccount) {
        if (findAbsoluteAcc(nameAccount)!=-1){
            listAccount.remove(findAbsoluteAcc(nameAccount));
        }else {
            System.out.println("This item is not available");
        }
    }


    @Override
    public void print() {
        for (Account x : listAccount
        ) {
            System.out.println(x);
        }
        System.out.println( "------------------------------------------------------------------------------------------------------------------------------------------------------------" );
    }
}
