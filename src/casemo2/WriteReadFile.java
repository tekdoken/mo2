package casemo2;

import casemo2.model.Account;
import casemo2.service.AccountManage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {


    public static void writeFile()  {
        try{
            FileOutputStream fileOutputStream=new FileOutputStream("src\\casemo2\\accdata.txt");
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(AccountManage.getInstance().getListAccount());
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println();
        }

    }

    public static void readFile()  {
        try{
            ArrayList<Account> listAcc ;
            AccountManage a= AccountManage.getInstance();
            FileInputStream fileInputStream=new FileInputStream("src\\casemo2\\accdata.txt");
            ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
            listAcc= (ArrayList) objectInputStream.readObject();
            a.setListAccount(listAcc);
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println();
        }

    }

}
