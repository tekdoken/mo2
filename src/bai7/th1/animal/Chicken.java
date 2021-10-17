package bai7.th1.animal;
import bai7.th1.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "could be fried";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";

    }

}
