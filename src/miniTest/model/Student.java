package miniTest.model;

import miniTest.model.Person;

public class Student extends Person {
    private double score;

    public Student(String name, int age, double score, int id) {
        super(name, age, id);
        this.score = score;
    }


    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + super.getId() + "," +
                "score=" + score +
                '}';
    }
}
