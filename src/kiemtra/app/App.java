package kiemtra.app;

import kiemtra.inout.InOut;
import kiemtra.model.Directory;
import kiemtra.service.DirectoryManage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static final String RS = "\u001B[0m";
    public static final String RE = "\u001B[31m";
    public static final String GR = "\u001B[32m";
    public static final String YE = "\u001B[33m";
    public static final String BL = "\u001B[34m";
    public static final String PU = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {
        InOut inOut = new InOut();
        DirectoryManage directoryManage = new DirectoryManage();
        int numCheck = -1;
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(CYAN + "CONTACT LICENSE PROGRAM");
                System.out.println("1. show list");
                System.out.println("2. add directory");
                System.out.println("3. edit directory");
                System.out.println("4. delete directory");
                System.out.println("5. find directory");
                System.out.println("0. Exit" + RS);
                System.out.println(YE + "Enter your choice: " + RS);
                numCheck = scanner.nextInt();
                if (numCheck != 0) {
                    switch (numCheck) {
                        case 1:
                            directoryManage.print();
                            break;
                        case 2:
                            String name = inOut.Name();
                            String numPhone = inOut.NumPhone();
                            String group = inOut.Group();
                            String gender = inOut.Gender();
                            String address = inOut.Address();
                            String birthday = inOut.Birthday();
                            String email = inOut.Email();
                            if (name.equals(" ") || numPhone.equals(" ") || group.equals(" ") || gender.equals(" ") ||
                                    address.equals(" ") || birthday.equals(" ") || email.equals(" ")) {
                                System.out.println("invalid data field!!");
                                break;
                            } else {
                                Directory directory = new Directory(name, numPhone, group, gender, address, birthday, email);
                                directoryManage.add(directory);
                                break;
                            }
                        case 3:
                            numPhone = inOut.NumPhone();
                             name = inOut.Name();
                            String newNumPhone = inOut.NumPhone();
                             group = inOut.Group();
                             gender = inOut.Gender();
                             address = inOut.Address();
                             birthday = inOut.Birthday();
                             email = inOut.Email();
                            if (name.equals(" ") || numPhone.equals(" ") || group.equals(" ") || gender.equals(" ") ||
                                    address.equals(" ") || birthday.equals(" ") || email.equals(" ")) {
                                System.out.println("invalid data field!!");
                                break;
                            } else {
                                directoryManage.edit(numPhone,name, newNumPhone, address, birthday, email, gender, group);
                                break;
                            }
                        case 4:
                            numPhone = inOut.NumPhone();
                            if (numPhone.equals(" ")) {
                                System.out.println("invalid data field!!");
                                break;
                            } else {
                                directoryManage.delete(numPhone);
                                break;
                            }
                        case 5:
                            numPhone = inOut.NumPhone();
                            directoryManage.findRelative(numPhone);
                            break;
                        default:
                            System.out.println(RE + "This item is not available" + RS);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("please enter number");
            }
        } while (numCheck != 0);
    }
}
