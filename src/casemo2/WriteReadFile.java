package casemo2;

import casemo2.model.Account;
import casemo2.service.AccountManage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteReadFile {

//    public static void write(String pathFile, List<Account> listAccount) {
//        File file=new File(pathFile);
//        FileWriter fileWriter= null;
//        try {
//            fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
//            bufferedWriter.write(String.valueOf(listAccount));
//            bufferedWriter.close();
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static List<Account> ReadSong(String pathFile) {
        ObjectInputStream read = null;
       List<Account> account=null;
        try {
            read = new ObjectInputStream(new FileInputStream(pathFile));
            account = (List<Account>) read.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return account;
    }
    public static void WriterAcc(String pathFile, List<Account> listAcc) {
        ObjectOutputStream writer = null;

        try {
            writer = new ObjectOutputStream(new FileOutputStream(pathFile));
            writer.writeObject(listAcc);
        } catch (Exception e) {
            System.err.println("The system cannot find the file specified");
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
