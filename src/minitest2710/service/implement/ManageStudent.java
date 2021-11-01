package minitest2710.service.implement;

import minitest2710.model.Student;
import minitest2710.service.Manage;

import java.util.ArrayList;

public class ManageStudent implements Manage<Student> {
    private ArrayList<Student> listStudent;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public ManageStudent(ArrayList<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public ManageStudent() {
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
        student.getGradePointAverage();
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

    public void gradePointAverageSort() {
        listStudent.sort((a, b) -> (int) (b.getGradePointAverage() - a.getGradePointAverage()));
    }

    public void ScoreHighest() {
        double max = listStudent.get(0).getGradePointAverage();
        for (int i = 0; i < listStudent.size(); i++) {
            if (max < listStudent.get(i).getGradePointAverage()) {
                max = listStudent.get(i).getGradePointAverage();
            }
        }
        for (int i = 0; i < listStudent.size(); i++) {
            if (max == listStudent.get(i).getGradePointAverage())
                System.out.println(listStudent.get(i));
        }

    }

    public ArrayList<Student> getListStudent() {
        return listStudent;
    }

    @Override
    public void print() {
        for (Student x : listStudent
        ) {
            System.out.println(x);
        }
        System.out.println(ANSI_BLUE + "------------------------------------------------------------------------------------------------------------------------------------------------------------" + ANSI_RESET);
    }

    @Override
    public void printId(int id) {
        System.out.println(listStudent.get(id));
    }

    @Override
    public boolean checkId(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (id == listStudent.get(i).getId()) {
                return true;
            }
        }
        return false;
    }

}
