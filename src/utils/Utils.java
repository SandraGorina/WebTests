package utils;

public class Utils {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void line() {
        System.out.println("______________________________________________________");
    }

    public static void ln() {
        System.out.println();
    }

    public static String verify(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static String verify(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {

            return ("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {

            return "Fail";
        }
    }

    public static String verify(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");

            return "Pass";
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");

            return "Fail";
        }
    }

    public static void printStars() {
        System.out.println("\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F");
    }

    public static void task(int number) {
        line();
        printStars();
        System.out.println(ANSI_PURPLE + "Задача " + number + ANSI_RESET);
        line();
    }













}
