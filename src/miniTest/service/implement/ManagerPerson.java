package miniTest.service.implement;

import miniTest.model.Person;
import miniTest.service.Manager;

import java.util.ArrayList;

public class ManagerPerson implements Manager<Person> {
    private ArrayList<Person> listPerson;

    public ManagerPerson(ArrayList<Person> listPerson) {
        this.listPerson = listPerson;
    }

    public ManagerPerson() {
        listPerson = new ArrayList<>();
    }

    @Override
    public void add(Person person) {
        listPerson.add(person);
    }

    @Override
    public void edit(int id, Person person) {
        int index = find(id);
        listPerson.set(index, person);
    }

    @Override
    public void delete(int id) {
        int index = find(id);
        listPerson.remove(index);
    }

    @Override
    public int find(int id) {
        for (int i = 0; i < listPerson.size(); i++) {
            if (listPerson.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void print() {
        for (Person x : listPerson
        ) {
            System.out.println(x);
        }
        System.out.println("------------------");
    }

    @Override
    public void printId(int id) {
        System.out.println(listPerson.get(id));

    }

    @Override
    public boolean check(int id) {
        for (int i = 0; i < listPerson.size(); i++) {
            if (id == listPerson.get(i).getId()) {
                return true;
            }
        }
        return false;
    }
}
