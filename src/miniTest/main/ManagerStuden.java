package miniTest.main;

import miniTest.model.Studen;

import java.util.ArrayList;


public class ManagerStuden implements Manager<Studen> {
    private ArrayList<Studen> listStuden;

    public ManagerStuden(ArrayList<Studen> listStuden) {
        this.listStuden = listStuden;
    }

    public ManagerStuden() {
        listStuden = new ArrayList<>();
    }

    @Override
    public void add(Studen studen) {
        listStuden.add(studen);
    }

    @Override
    public void edit(int id, Studen studen) {
        int index = find(id);
        listStuden.set(index, studen);
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listStuden.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listStuden.size(); i++) {
            if (listStuden.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Studen x : listStuden
        ) {
            System.out.println(x);
        }
        System.out.println("------------------");
    }

    @Override
    public void printId(int id) {
        System.out.println(listStuden.get(id));

    }

    public void sortg() {
        listStuden.sort((a, b) -> (int) (a.getScore() - b.getScore()));

    }

    public void sorta() {
        listStuden.sort((a, b) -> (int) (b.getScore() - a.getScore()));
    }

    public void getTotalScore() {
        double to = 0;
        for (int i = 0; i < listStuden.size(); i++) {
            to += listStuden.get(i).getScore();
        }
        System.out.println("Total score: " + to);
    }

    @Override
    public boolean check(int id) {
        for (int i = 0; i < listStuden.size(); i++) {
            if (id == listStuden.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
