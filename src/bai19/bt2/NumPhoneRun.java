package bai19.bt2;

public class NumPhoneRun {
    private static NumPhone numPhone;
    private static final String[] vali={"00-088898989"};

    public static void main(String[] args) {
        numPhone=new NumPhone();
        String num=vali[0];
        boolean invalid=numPhone.validate(num);
        System.out.println(num+":"+invalid);
    }
}
