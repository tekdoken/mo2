package bai12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ManagerProduct implements Manager<Product> {
    private ArrayList<Product> listproduct;

    public ManagerProduct(ArrayList<Product> listproduct) {
        this.listproduct = listproduct;
    }

    public ManagerProduct() {
        listproduct = new ArrayList<>();
    }

    @Override
    public void add(Product product) {
        listproduct.add(product);
    }

    @Override
    public void edit(int id, Product product) {
        int index = find(id);
        listproduct.set(index, product);
    }

    @Override
    public void delete(int id) {
int index=find(id);
listproduct.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listproduct.size(); i++) {
            if (listproduct.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Product x:listproduct
             ) {
            System.out.println(x);
        }
        System.out.println("---------");
    }

    @Override
    public void sorta() {
        listproduct.sort((a,b)->a.getPrice()- b.getPrice());
    }  @Override
    public void sortg() {
        listproduct.sort((a,b)->b.getPrice()- a.getPrice());
    }
}
