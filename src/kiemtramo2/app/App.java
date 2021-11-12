package kiemtramo2.app;

import kiemtramo2.inout.InOut;
import kiemtramo2.model.Directory;
import kiemtramo2.service.DirectoryManage;

import java.io.*;
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

    public static void main(String[] args) throws IOException {
        DirectoryManage directoryManage=ReadFile();
        InOut inOut = new InOut();
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
                System.out.println("6. write to file");
                System.out.println("7. read from file");
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
                            addDirectory(directoryManage, name, numPhone, group, gender, address, birthday, email);
                            break;
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
                                directoryManage.edit(numPhone, name, newNumPhone, address, birthday, email, gender, group);
                                break;
                            }
                        case 4:
                            numPhone = inOut.NumPhone();
                            if (numPhone.equals(" ")) {
                                System.out.println("invalid data field!!");
                                break;
                            } else {
                                int selection = 0;
                                Scanner scanner1 = new Scanner(System.in);
                                System.out.println("You definitely want to delete this directory?????");
                                System.out.println("1.yes");
                                System.out.println("2.no");
                                selection = scanner1.nextInt();
                                if (selection == 1) {
                                    directoryManage.delete(numPhone);
                                    break;
                                }
                                break;
                            }
                        case 5:
                            numPhone = inOut.NumPhone();
                            directoryManage.findRelative(numPhone);
                            break;
                        case 6:
                            WriteToFile(directoryManage);
                            break;
                        case 7:
                            directoryManage=  ReadFile();
                            directoryManage.print();
                            break;
                        default:
                            System.out.println(RE + "This item is not available" + RS);
                    }
                }
            } catch (InputMismatchException | IOException e) {
                System.err.println("please enter number");
            }
//            WriteToFile(directoryManage);
        } while (numCheck != 0);
    }

    private static void addDirectory(DirectoryManage directoryManage, String name, String numPhone, String group, String gender, String address, String birthday, String email) {
        if (name.equals(" ") || numPhone.equals(" ") || group.equals(" ") || gender.equals(" ") ||
                address.equals(" ") || birthday.equals(" ") || email.equals(" ")) {
            System.out.println("invalid data field!!");
            return;
        } else {
            Directory directory = new Directory(name, numPhone, group, gender, address, birthday, email);
            directoryManage.add(directory);
            System.out.println("add successful");
            return;
        }
    }

    private static void WriteToFile(DirectoryManage directoryManage) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\directory.csv"));
        String str = "Name,Number Phone,Group,Gender, Address,Birthday,Email";
        for (int i = 0; i < directoryManage.getListDirectory().size(); i++) {
            Directory directory = (Directory) directoryManage.getListDirectory().get(i);
            str += "\n" + directory.getName() + ",";
            str += directory.getNumPhone() + ",";
            str += directory.getGroup() + ",";
            str += directory.getGender() + ",";
            str += directory.getAddress() + ",";
            str += directory.getBirthday() + ",";
            str += directory.getEmail();
        }
        bw.write(str);
        bw.close();
    }

    private static DirectoryManage ReadFile() throws IOException {
        DirectoryManage directoryManage = new DirectoryManage();
        BufferedReader br = new BufferedReader(new FileReader("src\\directory.csv"));
        String read = br.readLine();
        while ((read = br.readLine()) != null) {
            String[] arr = read.split(",");
            directoryManage.add(new Directory(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5],arr[6]));
        }
        return directoryManage;
    }
}
