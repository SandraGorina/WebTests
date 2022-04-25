package homework;

public class HW3 {

    static byte a, b;
    static String task = "TASK # ";
    static String line = "------------------------------------------";
    static String lineSmall = "\uD83D\uDC9A\uD83D\uDC9A\uD83D\uDC9A\uD83D\uDC9A\uD83D\uDC9A";
    static String lineB = "-----------------------------------------------------------";



    public static void main (String [] args) {

        System.out.println(task + 2);

        System.out.println(a);
        System.out.println(b);
        System.out.println(lineSmall);

        /**  Task 3  Создать переменные  s и t типа short, присвоить им негативное и позитивное
         * значениея с разницей 60000.
         */

        short s = Short.MAX_VALUE;
        short t = Short.MAX_VALUE - 60000;



        System.out.println(task + 3);
        System.out.println( " " + s + "\n" +t);
        System.out.println(lineSmall);

        /** Task 4
         * Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа.
         * Распечатать оба значения в виде таблицы
         */


        int iMin = - 2147483648;
        int iMax = 2147483647;
        String textMin = "int min";
        String textMax = "int max";

        System.out.println(task + 4);
        System.out.println(line);
        System.out.println("| " + textMin + "\t\t |" + iMin + "\t\t\t |");
        System.out.println(line);
        System.out.println("| " + textMax + "\t\t |" + iMax + "\t\t\t |");
        System.out.println(line);
        System.out.println(lineSmall);

        /** Task 5
         * Создать переменную phoneNumber и присвоить ей значение телефона с кодом
         * страны и города
         */

        long phoneNumber = 79036240041L;
        System.out.println(task + 5);
        System.out.println(phoneNumber);
        System.out.println(lineSmall);


        /** Task 6
         * Создать переменную f  типа float и присвоить ей значение 100.101101.
         * Создать переменную d типа double и присвоить ей значение 100.101101.
         * Распечатать результат в виде таблицы
         */

        float f = 100.101101F;
        double d = 100.101101;
        String floatF = "float f = 100.101101";
        String doubleD = "double D = 100.101101";

        System.out.println(task + 6);
        System.out.println(line);
        System.out.println("| " + floatF + "\t | " + f + "\t |");
        System.out.println(line);
        System.out.println("| " + doubleD + "\t | " + d + "\t |");
        System.out.println(line);
        System.out.println(lineSmall);

        /** Task 7
         * Создать пернеменную типа Double с именем dd и инициализировать ее
         * результатом суммы чисел 10.09999 и 20.099999.
         * Создать переменную типа Float с именем ff и инициализировать ее
         * результатом суммы чисел 10.09999 и 20.099999.
         * распечатать результаты как продолжение таблицы из задания 6.
         */

        Double dd = 10.09999 + 20.099999;
        Float ff = 10.09999F + 20.099999F;
        String doubDD= "Double dd = 10.09999 + 20.099999";
        String floFF = "Float ff = 10.09999F + 20.099999F";

        System.out.println(task + 7);
        System.out.println(lineB);
        System.out.println("| " + doubDD + "\t | " + dd + " |");
        System.out.println(lineB);
        System.out.println("| " + floFF + "\t | " + ff + "\t\t\t  |");
        System.out.println(lineB);
        System.out.println(lineSmall);

        /** Task 8
         * Создать переменную result и присвоить ей значение выражения 10/3
         * с максимальной точностью.
         */

        double result = 10.0 / 3;

        System.out.println(task + 7);
        System.out.println(result);
        System.out.println(lineSmall);


        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(task + 8);
        System.out.println(sum + "\n" + product + "\n" + quotient + "\n" + remainder + "\n");
        System.out.println(lineSmall);
























    }


    public static class HW1 {
        public static void main(String[] args) {
            int a = 10;
            int b = 20;
            int s = 100;
            int t = s;
            String myNameInSlak = "Aleksandra Gorina";

        }


    }
}
