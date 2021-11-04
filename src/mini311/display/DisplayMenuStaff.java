package mini311.display;

import mini311.model.Staff;
import mini311.service.manage.ManageStaff;

import java.io.*;
import java.util.Scanner;

public class DisplayMenuStaff {
    public static int idNew = 1;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws IOException {

        ManageStaff manageStaff = new ManageStaff();
        int numcheck = -1;

        do {
            try {

                Scanner scanner = new Scanner(System.in);
                System.out.println(ANSI_CYAN + "Menu");
                System.out.println("1. Add Staff");
                System.out.println("2. Edit Staff");
                System.out.println("3. Delete Staff");
                System.out.println("4. Find Staff");
                System.out.println("5. Print Staff");
                System.out.println("6.  ");
                System.out.println("7.  ");
                System.out.println("8. Write data to file ");
                System.out.println("9. Read data file ");
                System.out.println("0. Exit" + ANSI_RESET);
                System.out.println(ANSI_YELLOW + "Enter your choice: " + ANSI_RESET);
                numcheck = scanner.nextInt();
                if (numcheck != 0) {
                    switch (numcheck) {
                        case 1:
                            Staff addStaff = getStaff(scanner);
                            int id;
                            manageStaff.add(addStaff);
                            manageStaff.print();
                            break;
                        case 2:
                            System.out.println("Enter the staff ID to edit: ");
                            int idEdit = scanner.nextInt();
                            if (manageStaff.checkId(idEdit)) {
                                Staff editStaff = getStaffEdit(scanner, idEdit);
                                manageStaff.edit(idEdit, editStaff);
                                manageStaff.print();
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 3:
                            System.out.println("Enter the staff ID to delete: ");
                            int idDelete = scanner.nextInt();
                            if (manageStaff.checkId(idDelete)) {
                                manageStaff.delete(idDelete);
                                manageStaff.print();
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 4:
                            System.out.println("Enter the staff ID to Find: ");
                            id = scanner.nextInt();
                            if (manageStaff.checkId(id)) {
                                manageStaff.printId(manageStaff.findId(id));
                            } else {
                                System.out.println("This item is not available");
                            }
                            break;
                        case 5:
                            System.out.println("List Staff: ");
                            manageStaff.print();
                            break;
                        case 6:

                        case 7:

                        case 8:
                            System.out.print("Enter the file path you want to write data to: ");
                            scanner.nextLine();
                            String nameFile = scanner.nextLine();
                            try {
                                BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile));
//                        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\mini311\\staff.csv"));
                                String str = "Name,ID,Salary,Status ,Type";
                                for (int i = 0; i < manageStaff.getListStaff().size(); i++) {
                                    Staff staff = (Staff) manageStaff.getListStaff().get(i);
                                    str += "\n" + staff.getName() + ",";
                                    str += staff.getId() + ",";
                                    str += staff.getSalary() + ",";
                                    str += staff.getStatus() + ",";
                                    str += staff.getType() + ",";
                                }
                                bw.write(str);
                                bw.close();
                            } catch (FileNotFoundException e) {
                                System.out.println(ANSI_RED + "The system cannot find the file specified"+ ANSI_RESET);
                            } finally {
                                break;
                            }
                        case 9:
                            try {
                                System.out.print("Enter the file path you want to read data to: ");
                                scanner.nextLine();
                                nameFile = scanner.nextLine();
                                File file = new File(nameFile);
                                if (!file.exists()) {
                                    throw new FileNotFoundException();
                                }
                                BufferedReader br = new BufferedReader(new FileReader(nameFile));
                                String read  = br.readLine() ;
                                while ((read = br.readLine()) != null) {
                                    String[] arr = read.split(",");
                                    String name = arr[0];
                                    id = Integer.parseInt(arr[1]);
                                    double salary = Double.parseDouble(arr[2]);
                                    String status = arr[3];
                                    String type = arr[4];
                                    manageStaff.add(new Staff(name, type, salary, status, id));
                                }
                                manageStaff.print();
                            } catch (FileNotFoundException e) {
                                System.out.println(ANSI_RED + "The system cannot find the file specified"+ ANSI_RESET);
                            } finally {
                                break;
                            }
                        default:
                            System.out.println("This item is not available");
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.err.println("please enter number");
            }
        } while (numcheck != 0);
    }

    private static Staff getStaff(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Enter information New staff: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("type: ");
        String type = scanner.nextLine();
        System.out.print("status: ");
        String status = scanner.nextLine();
        int id = idNew++;
        System.out.print("salary: ");
        double salary = scanner.nextDouble();
        Staff newStaff = new Staff(name, type, salary, status, id);
        return newStaff;
    }

    private static Staff getStaffEdit(Scanner scanner, int id) {
        String name;
        scanner.nextLine();
        System.out.println("Enter information New staff: ");
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("type: ");
        String type = scanner.nextLine();
        System.out.print("status: ");
        String status = scanner.nextLine();
        System.out.print("salary: ");
        double salary = scanner.nextDouble();
        Staff updateStaff = new Staff(name, type, salary, status, id);
        return updateStaff;
    }

}
