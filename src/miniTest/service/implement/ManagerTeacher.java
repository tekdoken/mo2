package miniTest.service.implement;

import miniTest.model.Teacher;
import miniTest.service.Manager;

import java.util.ArrayList;

public class ManagerTeacher implements Manager<Teacher> {
    private ArrayList<Teacher> listTeacher;

    public ManagerTeacher(ArrayList<Teacher> listTeacher) {
        this.listTeacher = listTeacher;
    }

    public ManagerTeacher() {
        listTeacher = new ArrayList<>();
    }

    @Override
    public void add(Teacher teacher) {
        listTeacher.add(teacher);
    }

    @Override
    public void edit(int id, Teacher teacher) {
        int index = find(id);
        listTeacher.set(index, teacher);
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listTeacher.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listTeacher.size(); i++) {
            if (listTeacher.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Teacher x : listTeacher
        ) {
            System.out.println(x);
        }
        System.out.println("------------------");
    }

    @Override
    public void printId(int id) {
        System.out.println(listTeacher.get(id));
    }

    @Override
    public boolean check(int id) {
        for (int i = 0; i < listTeacher.size(); i++) {
            if (id == listTeacher.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
