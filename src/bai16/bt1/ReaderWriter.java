package bai16.bt1;

//import bai16.th1.ReadFileExample;

import java.io.*;

public class ReaderWriter {
    public static void main(String[] args) {
        try{
            BufferedWriter wr = new BufferedWriter(new FileWriter("src\\bai16\\th2\\result1.txt"));
            BufferedReader br = new BufferedReader(new FileReader("D:\\num.txt"));
            File file = new File("D:\\num.txt");

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            String i = "";
            while ((i = br.readLine()) != null) {
                wr.write("\n" + i);
            }
            br.close();
            wr.close();
        }catch (Exception e){
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }
}
