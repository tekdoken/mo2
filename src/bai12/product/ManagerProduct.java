package bai12.product;

import java.util.ArrayList;

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
        int index = find(id);
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
    public void printId(int id) {
        System.out.println(listproduct.get(id));
    }

    @Override
    public void print() {
        for (Product x : listproduct
        ) {
            System.out.println(x);
        }
        System.out.println("---------");
    }

    @Override
    public void sorta() {
        listproduct.sort((a, b) -> a.getPrice() - b.getPrice());
    }

    @Override
    public boolean che(int id) {
        for (int i = 0; i < listproduct.size(); i++) {
            if (id == listproduct.get(i).getId()) {
                return true;
            }
        }return false;
    }

    @Override
    public void sortg() {
        listproduct.sort((a, b) -> b.getPrice() - a.getPrice());
    }
}
