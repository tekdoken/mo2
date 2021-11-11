package miniTest311.model;

public class Staff {
    private String name;
    private String type;
    private double salary;
    private String status;
    private int id;

    public Staff() {
    }

    public Staff(String name, String type, double salary, String status, int id) {
        this.name = name;
        this.type = type;
        this.salary = salary;
        this.status = status;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", salary=" + salary +
                ", status='" + status + '\'' +
                ", id=" + id +
                '}';
    }
}
