package casemo2;

import casemo2.model.Account;
import casemo2.service.AccountManage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {

    public static void write(String pathFile, List<Account> listAccount) {
        File file=new File(pathFile);
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(String.valueOf(listAccount));
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
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
//            ArrayList<Account> newList = (ArrayList<Account>) listAcc;
            a.setListAccount(listAcc);
            objectInputStream.close();
            fileInputStream.close();
        }catch (IOException | ClassNotFoundException e){
            System.out.println();
        }

    }

//    public static List<Account> read(String pathFile) throws IOException {
//        List<Account> accounts=new ArrayList<>();
//        File file=new File(pathFile);
//        FileReader fileReader= null;
//        try {
//            fileReader = new FileReader(file);
//            BufferedReader bufferedReader=new BufferedReader(fileReader);
//            String lineCSV= bufferedReader.readLine();
//            while ((lineCSV=bufferedReader.readLine())!=null){
//                String[] lineContent=lineCSV.split(",");
//                String clientName=lineContent[0];
//                String clientPhoneNumber=lineContent[1];
//                List<Album> clientAddress=lineContent[2];
//                accounts.add(new Account(clientName,clientPhoneNumber,clientAddress));
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        return clients;
//    }
}
