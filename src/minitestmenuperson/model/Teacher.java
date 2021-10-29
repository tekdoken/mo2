package minitestmenuperson.model;

public class Teacher extends Person {
    private String subjects;

    public Teacher(String name, int age, int id, String subjects) {
        super(name, age, id);
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Teacher:{" + "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + super.getId() + "," +
                "subjects=" + subjects +
                '}';
    }
}
