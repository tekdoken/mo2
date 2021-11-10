package casemo2;

import casemo2.model.Account;
import com.sun.security.ntlm.Client;

import java.io.*;
import java.util.List;

public class WriteReadFile {

    public static List<Account> ReadSong(String pathFile) throws IOException {
        ObjectInputStream read = null;
        List<Account> list=null;
        try {
            read = new ObjectInputStream(new FileInputStream(pathFile));
            list = (List<Account>) read.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            read.close();
        }
        return list;
    }
}
