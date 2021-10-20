package miniTest;

public class Studen extends Person{
    private double score;

    public Studen(String name, int age,double score,int id) {
        super(name, age,id);
        this.score=score;
    }

    public double getScore() {
        return score;
    }


    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Studen{" +"name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", id=" + super.getId() +","+
                "score=" + score +
                '}';
    }
}
