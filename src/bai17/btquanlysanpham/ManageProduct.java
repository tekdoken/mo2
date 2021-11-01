package bai17.btquanlysanpham;

import bai17.btquanlysanpham.Product;

import java.util.ArrayList;

public class ManageProduct implements Manage<Product>{
    private ArrayList<Product> listProduct;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public ManageProduct(ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ManageProduct() {
        listProduct = new ArrayList<>();
    }

    @Override
    public void add(Product product) {
        listProduct.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        int index = find(id);
        listProduct.set(index, product);
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listProduct.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void priceSort() {
        listProduct.sort((a, b) -> (int) (b.getPrice() - a.getPrice()));
    }

   

    public ArrayList<Product> getListProduct() {
        return listProduct;
    }

    @Override
    public void print() {
        for (Product x : listProduct
        ) {
            System.out.println(x);
        }
        System.out.println(ANSI_BLUE + "------------------------------------------------------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
    }

    @Override
    public void printId(int id) {
        System.out.println(listProduct.get(id));
    }

    @Override
    public boolean checkId(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (id == listProduct.get(i).getId()) {
                return true;
            }
        }
        return false;
    }

}
