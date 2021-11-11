package miniTest311.service.manage;

import miniTest311.model.Staff;
import miniTest311.service.Manage;

import java.util.ArrayList;

public class ManageStaff implements Manage<Staff> {
    private ArrayList<Staff> listStaff;

    public ManageStaff(ArrayList listStaff) {
        this.listStaff = listStaff;
    }

    public ManageStaff() {
        listStaff=new ArrayList<>();
    }

    @Override
    public void add(Staff staff) {
        listStaff.add(staff);
    }

    @Override
    public void edit(int id, Staff staff) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public int findId(int id) {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void findName(String name) {
        for (int i = 0; i < listStaff.size(); i++) {
            if (listStaff.get(i).getName().contains(name)) {
                System.out.println(listStaff.get(i));;
            }
        }
    }

    @Override
    public void print() {
        for (Staff x : listStaff
        ) {
            System.out.println(x);
        }
    }

    @Override
    public void printId(int id) {

    }

    @Override
    public boolean checkId(int id) {
        return false;
    }

    public ArrayList<Staff> getListStaff() {
        return listStaff;
    }
}
