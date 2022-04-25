package lesson.lessons1To7;

public class Lesson4 {

    public static void print(String text) {
        System.out.println(text);
    }

    public static void print(double dd) {
        System.out.println(dd);
    }

    public static void printHi() {
        System.out.println("Hi!");
    }

    public static void printPrivet() {
        System.out.println("привет!");
    }

// -------------13-----------------
    public static void printLnLine() {
        System.out.println("_____________________");
    }

    public static void print(int number) {
        System.out.println(number);
    }

    public static void printTaskNumber(int num) {
        printLnLine();
        print(num);
        printLnLine();
    }

    public static void printLine() {
        System.out.println("_____________________");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        System.out.println("Задача " + number);
    }

    /** Сложный
     * static int number = 1;
     *
     * public static void task() {
     *     printLine();
     *     sout("Задача" + number);
     *
     *     number++;
     * }
     */

    public static void main(String[] args) {
        task(1);
        // Квадрат - это !круг.

        String square = "Квадрат";
        String circle = "Круг";

        System.out.println(square != circle);

        task(2);
        // если сегодня суббота? значит завтра воскресенье

        // вариант 1
        String today = "Суббота";

        if(today == "Суббота") {
            String tomorrow = "Воскресенье";
        }

        // вариант 2
        String tomorrow = "Воскресенье";

        if(today == "Суббота") {
            System.out.println(tomorrow);
        }

        // Вариант 3
        String tomorrow1;

        if(today == "Суббота") {
            tomorrow1 = "Воскресенье";
        }


        task(3);
        // Если a>b или b<c, то присвоить а значение 7, и сложить b и c,
        // иначе присвоить  а значение 10

        int a = 9;
        int b = 12;
        int c = 2;

        if(a>b || b<c) {
            a = 7;
            int sum = b + c;

            System.out.println(a + " " + sum);
        } else  {
            a = 10;

            System.out.println(a);
        }

        task(4);

        print("Hello!");
        print(tomorrow);

        print("До свидания");
        print(today);

        task(100);
        /** Проверьте число
         * Если число нечетное и кратно трем,
         * то посчитайте результат деления на 3. Иначе
         * посчитайте результат умножения на 3.
         * Если число не Нечетное, посчитайте произведение числа
         * на результат деления на 2.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         * Напишите тест, который проверит работу вашего кода и выведет
         * на печать результат проверки.
         * Тестовые данные 23, 44, 21.
         * ААА (triple A pattern : A обьявление  А действия   А проверка действительного результата actualResult
         * и ожидаемого expectedResult
         */

        int n = 3;
        int actualResult = 0;
        int expectedResult = 1;


        if (n % 2 != 0) {
            if (n % 3 == 0) {
                n = n / 3;
            } else {
                n = n * 3;
            }
        } else {
            n = n * (n / 2);
        }

        System.out.println("n = " + n);

        // Test
         if (expectedResult == n) {
             System.out.println("\u001B[32m" + "Pass");
         } else {
             System.out.println("\u001B[31m" + "Fail");

         }


        //    public static final String ANSI_RESET = "\u001B[0m";
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
    }

}
