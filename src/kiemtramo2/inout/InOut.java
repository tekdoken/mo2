package kiemtramo2.inout;


import java.util.Scanner;

public class InOut {
    Scanner sa = new Scanner(System.in);
    private static InputRegex inputRegex = new InputRegex();

    public String Name() {
        System.out.println("Enter the name:");
        String name = sa.nextLine();
        if (inputRegex.Name(name) == true) {
            return name;
        }
        return " ";
    }

    public String Group() {
        System.out.println("Enter the group:");
        String name = sa.nextLine();
        if (inputRegex.Name(name) == true) {
            return name;
        }
        return " ";
    }

    public String Gender() {
        System.out.println("Enter the gender:");
        String name = sa.nextLine();
        if (inputRegex.Name(name) == true) {
            return name;
        }
        return " ";
    }

    public String Address() {
        System.out.println("Enter the address:");
        String name = sa.nextLine();
        if (inputRegex.Name(name) == true) {
            return name;
        }
        return " ";
    }

    public String NumPhone() {
        System.out.println("Enter the number phone:");
        String name = sa.nextLine();
        if (inputRegex.NumPhone(name) == true) {
            return name;
        }
        return " ";
    }

    public String Birthday() {
        System.out.println("Enter the birthday:");
        String name = sa.nextLine();
        if (inputRegex.Birthday(name) == true) {
            return name;
        }
        return " ";
    }

    public String Email() {
        System.out.println("Enter the Email:");
        String name = sa.nextLine();
        if (inputRegex.Email(name) == true) {
            return name;
        }
        return " ";
    }

}
