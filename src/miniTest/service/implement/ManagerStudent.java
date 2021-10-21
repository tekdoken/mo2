package miniTest.service.implement;

import miniTest.model.Student;
import miniTest.service.Manager;

import java.util.ArrayList;


public class ManagerStudent implements Manager<Student> {
    private ArrayList<Student> listStudent;

    public ManagerStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ManagerStudent() {
        listStudent = new ArrayList<>();
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void edit(int id, Student student) {
        int index = find(id);
        listStudent.set(index, student);
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listStudent.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Student x : listStudent
        ) {
            System.out.println(x);
        }
        System.out.println("------------------");
    }

    @Override
    public void printId(int id) {
        System.out.println(listStudent.get(id));

    }

    public void sortZa() {
        listStudent.sort((a, b) -> (int) (a.getScore() - b.getScore()));

    }

    public void sortAz() {
        listStudent.sort((a, b) -> (int) (b.getScore() - a.getScore()));
    }

    public void getTotalScore() {
        double to = 0;
        for (int i = 0; i < listStudent.size(); i++) {
            to += listStudent.get(i).getScore();
        }
        System.out.println("Total score: " + to);
    }

    @Override
    public boolean check(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (id == listStudent.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
