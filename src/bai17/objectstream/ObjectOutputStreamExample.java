package bai17.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectOutputStreamExample {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos=null;
        try{
            oos= new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product=new Product(1,"nokia 1280",99999,"legendary");
            oos.writeObject(product);
            oos.flush();
        }catch (IOException ex) {
        ex.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Success");
    }
}
