package minitest2710.model;

public class Student extends Person {

    private double mathScores;
    private double physicsScores;
    private double chemistryScores;
    private double gradePointAverage;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public Student(String name, int age, int id, double mathScores, double physicsScores, double chemistryScores) {
        super(name, age, id);
        this.mathScores = mathScores;
        this.physicsScores = physicsScores;
        this.chemistryScores = chemistryScores;
    }

    public double getMathScores() {
        return mathScores;
    }

    public void setMathScores(double mathScores) {
        this.mathScores = mathScores;
    }

    public double getPhysicsScores() {
        return physicsScores;
    }

    public void setPhysicsScores(double physicsScores) {
        this.physicsScores = physicsScores;
    }

    public double getChemistryScores() {
        return chemistryScores;
    }

    public void setChemistryScores(double chemistryScores) {
        this.chemistryScores = chemistryScores;
    }


    public double getGradePointAverage() {
        return gradePointAverage = (this.chemistryScores + this.mathScores + this.physicsScores) / 3;
    }

    @Override
    public String toString() {
        return String.format(ANSI_BLUE+"------------------------------------------------------------------------------------------------------------------------------------------------------------"+ANSI_RESET + "\n" +
                        "|Name: %-8s|ID: %-10d|Age: %-7d|Math Scores: %-11.2f|Physics Scores: %-11.2f|Chemistry Scores: %-11.2f|Grade Point Average: %-11.2f|",
                super.getName(),
                super.getId(),
                super.getAge(),
                mathScores,
                physicsScores,
                chemistryScores,
                gradePointAverage);
    }
}
