package bai17.btquanlysanpham;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        add();
        inFile();

    }

    public static void add() throws Exception {
        Product product = new Product("sda", 1, "SASA", 223, "sff");
        outFile(product);

    }

    private static void inFile() throws ClassNotFoundException, IOException {
        ObjectInputStream oi = null;
        try {
            oi = new ObjectInputStream(new FileInputStream("src\\bai17\\btquanlysanpham\\Product.txt"));
            Product product1 = (Product) oi.readObject();
            System.out.println(product1);
        } catch (IOException ee) {
            ee.printStackTrace();
        } finally {
            oi.close();
        }
    }

    private static void outFile(Product product) {
        ObjectOutputStream ot = null;
        try {
            ot = new ObjectOutputStream(new FileOutputStream("src\\bai17\\btquanlysanpham\\Product.txt"));
//            Product product = new Product("sda", 1, "SASA", 223, "sff");
            ot.writeObject(product);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
