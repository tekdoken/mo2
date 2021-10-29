package minitest2710.model;

public class Student extends Person {
    private double mathScores;
    private double physicsScores;
    private double chemistryScores;
    private double gradePointAverage;

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
        return String.format("------------------------------------------------------------------------------------------------------------------------------------------------------------" + "\n" +
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
