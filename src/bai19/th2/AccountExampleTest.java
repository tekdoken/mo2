package bai19.th2;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] vali = {"123abc_", "_abc123", "______", "123456","abcdefgh"};
    private static final String[] invali = {".@", "12345", "1234_", "abcde","@.sjjkhhjf","@kkkkkkk"};

    public static void main(String[] args) {
       accountExample=new AccountExample();
        for (String acc:vali
             ) {
            boolean isvalid= accountExample.validate(acc);
            System.out.println("Account is " + acc +" is valid: "+ isvalid);
        }
        for (String acc : invali
        ) {
            boolean isvalid = accountExample.validate(acc);
            System.out.println("Account is " + acc + " is valid: " + isvalid);
        }

    }
}
