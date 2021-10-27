package miniTest2710.service.implement;

import miniTest2710.model.Student;
import miniTest2710.service.Manage;

import java.util.ArrayList;

public class ManageStudent implements Manage<Student> {
    private ArrayList<Student> listStudent;

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
            if(max==listStudent.get(i).getGradePointAverage())
                System.out.println(listStudent.get(i));
        }

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
