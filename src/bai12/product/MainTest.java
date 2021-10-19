package bai12.product;

public class MainTest {
    public static void main(String[] args) {
        ManagerProduct ma=new ManagerProduct();
        Product p1=new Product("aaa",1,111);
        Product p2=new Product("ssss",2,22);
        Product p3=new Product("fff",3,333);
        ma.add(p1);
        ma.add(p2);
        ma.print();
        System.out.println( ma.find(1));
        ma.edit(2,p3);
        ma.print();
        ma.sortg();
        ma.print();
        ma.delete(1);
        ma.print();
    }
}
