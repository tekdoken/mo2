package casemo2.display;

import casemo2.inoutdata.InOut;
import casemo2.inoutdata.WriteReadFile;
import casemo2.model.Account;
import casemo2.model.Album;
import casemo2.model.Song;
import casemo2.service.AccountManage;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App extends InOut {
    public static final String RS = "\u001B[0m";
    public static final String RE = "\u001B[31m";
    public static final String GR = "\u001B[32m";
    public static final String YE = "\u001B[33m";
    public static final String BL = "\u001B[34m";
    public static final String PU = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) throws IOException {
        InOut inOut = new InOut();
        Account account = null;
        int numCheck = -1;

        WriteReadFile.readFile();
        do {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println(PU + "-------------------------------------------------------------------------------------------------------------------------------");
                System.out.println(CYAN + "      Menu");
                System.out.println("1. Register an account");
                System.out.println("2. Account login");
                System.out.println("3. change Password");
                System.out.println("0. Exit" + RS);
                AccountManage.getInstance().print();
                System.out.println(YE + "Enter your choice: " + RS);
                numCheck = scanner.nextInt();
                if (numCheck != 0) {
                    switch (numCheck) {
                        case 1:
                            account = new Account(inOut.NewUserName(), inOut.NewPass());
                            if (checkAccNull()) {
                                if (checkRegex(account.getNameAcc()) && checkRegex(account.getPassword())) {
                                    AccountManage.getInstance().add(account);
                                    System.out.println(GR + "Register an account successfully!");
                                } else {
                                    System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                    break;
                                }
                            } else {
                                boolean checkNameAcc = true;
                                for (int indexAccRe = 0; indexAccRe < AccountManage.getInstance().getListAccount().size(); indexAccRe++) {
                                    if (checkNameAccDuplicate(account, indexAccRe)) {
                                        System.out.println(RE + "name already exists!!!!" + RS);
                                        checkNameAcc = false;
                                        break;
                                    }
                                }
                                if (checkNameAcc == true) {
                                    if (checkRegex(account.getNameAcc()) && checkRegex(account.getPassword())) {
                                        AccountManage.getInstance().add(account);
                                        System.out.println(GR + "Register an account successfully!");
                                        break;
                                    } else {
                                        System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                                        break;
                                    }
                                }
                            }
                            break;
                        case 2:
                            String nameAcc = inOut.UserNameLogin(), pass = inOut.PassLogin();
                            for (int indexAccLog = 0; indexAccLog < AccountManage.getInstance().getListAccount().size(); indexAccLog++) {
                                if (checkLogin(nameAcc, pass, indexAccLog)) {
                                    System.out.println(GR + "Logged in successfully");
                                    MenuAlbum.main(indexAccLog);

                                } else {
                                    System.out.println("Invalid username or password");
                                }
                            }
                            break;
                        case 3:
                            nameAcc = inOut.UserNameLogin();
                            pass = inOut.PassLogin();
                            String newPass = inOut.NewPass();
                            boolean check = true;
                            for (int indexAccPass = 0; indexAccPass < AccountManage.getInstance().getListAccount().size(); indexAccPass++) {
                                if (checkLogin(nameAcc, pass, indexAccPass)) {
                                    AccountManage.getInstance().edit(pass, newPass);
                                    System.out.println("change Password successfully");
                                    check = false;
                                    break;
                                }
                            }
                            if (check == true) {
                                System.out.println(RE + "Invalid username or password!!!!!!" + RS);
                            }
                            break;
                        default:
                            System.out.println(RE + "This item is not available" + RS);
                    }
                }
            } catch (InputMismatchException e) {
                System.err.println("please enter number");
            }
            WriteReadFile.writeFile();
            WriteReadFile.readFile();
        } while (numCheck != 0);
        //        ReadSong().print();


    }

    private static boolean checkLogin(String nameAcc, String pass, int indexAccLog) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccLog).getNameAcc().equals(nameAcc)
                && AccountManage.getInstance().getListAccount().get(indexAccLog).getPassword().equals(pass);
    }

    private static boolean checkNameAccDuplicate(Account account, int indexAccRe) throws IOException {
        return AccountManage.getInstance().getListAccount().get(indexAccRe).getNameAcc().equals(account.getNameAcc());
    }

    private static boolean checkAccNull() throws IOException {
        return AccountManage.getInstance().getListAccount().size() == 0;
    }

    private static boolean checkRegex(String oldName) {
        return !oldName.equals(" ");
    }

}




