package bai9.fizz;

public class FizzBuzz {

    private static boolean fizz;
    private static boolean buzz;
    private static boolean fizzBuzz;

    public static String findF(int number) {
        fizz = number % 3 == 0;
        buzz = number % 5 == 0;
        fizzBuzz = buzz && fizz;
        if (fizzBuzz) {
            return "FizzBuzz";
        }
        if (fizz) {
            return "Fizz";
        } else if (buzz) {
                return "Buzz";
        }
        return "" + number;
    }
}
