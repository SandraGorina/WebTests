package homework;

public class HW6 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static double formatDouble(double number, int d) {
        int num = (int) Math.round(number * Math.pow(10, d));
        number = num / Math.pow(10, d);

        return number;
    }

    /** Task 10
     Написать метод, который принимает на вход параметры start,  end, step,
     и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
     Точка выхода из цикла - число end.
     */
//    public static void displaySequenceOfNumbers(double start, double end, double step) {
//        if(step > 0) {
//            if(start < end) {
//                for (double i = start; i < end; i += step) {
//                    System.out.println(i);
//                }
//            } else {
//                System.out.println("Десятичных чисел, соответствующих данному условию, не найдено.");
//            }
//
//        } else if(step == 0) {
//            System.out.println("Бесконечный цикл");
//        } else {
//            if(start > end) {
//                for (double i = start; i > end; i += step) {
//                    System.out.println(i);
//                }
//            } else {
//                System.out.println("Десятичных чисел, соответствующих данному условию, не найдено.");
//            }
//        }
//    }

    public static void seq10(double start, double end, double step, int d) {
        //  increasing (увеличение) start < end , step > 0
        //  decreasing (уменьшение) start > end, step < 0
        if(start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else if(start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else {
            System.out.println("Invalid data");
        }
    }


    public static void displaySeq(int l) {
        int end = 0;

        for (int i = 0; end < l; i += 2) {
            System.out.println(i);
            end ++;
        }
    }

//    Задача 12

    public static void dispDegNumN(int n) {
        for(int i = 1; i <= n; i ++) {
            System.out.println(String.format("%2.0f", Math.pow(2, i)));
        }
    }


// Task 13

    public static String therteenTask() {
        String result = "";
        String result1 = "";
        String result2 = "";
        String result3 = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
            result1 = result1 + i + i;
            result2 = result2 + i + i +i;
            result3 = result3 + i + i + i + i;
        }
        return result + result1 + result2 + result3;
    }

    public static void task16(int n, int m, int l) {
        for (int i = n; i < l; i += m) {
            if (i % 2 != 0) {
                System.out.println(i);
                n++;
            }
        }
    }

    public static void seq17(int n) {
        int l = n + 5;
        for( ; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

    public static void seq18(int n, int l) {
        if(n < l) {
            System.out.println("[" + (n) + "]" + " = " + n);

            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    public static void task19() {
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if(des - ed <=3 && ed - des <=3) {
                System.out.print(i + ", ");
            }
        }
    }

    public static void printY(double x) {
        if (x > 1.5) {
            System.out.println(2.5 * Math.pow(x, 3) + 6 * Math.pow(x, 2) - 30);
        } else if(x >= 0 && x <= 1.5) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }




    public static void main(String[] args) {

        HW5.task(1);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        HW5.task(2);

        for (int i = 10; i > -1; i--) {
            System.out.println(i);
        }

        HW5.task(3);

        for (int i = 50; i < 56; i +=2) {
            System.out.println(i);
        }

        HW5.task(4);

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }

        HW5.task(5);

        for (double i = 12; i < 14; i += 0.1) {
            System.out.println(i);
        }

        HW5.task(6);

        for (int i = 215; i < 238; i++) {
            System.out.println(i);
        }

        HW5.task(7);

        for (int i = 8; i < 14; i++) {
            if(i % 7 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("Ой..." + " ");
            }
        }

        HW5.task(8);

        for (int i = Short.MIN_VALUE; i <= Short.MAX_VALUE; i++) {
            if(i % 15001 == 0) {
                System.out.println(i + " ");
            }
        }

        HW5.task(9);

        for (int i = -10; i < 35; i++) {
                if(i % 11 == 0 && i != 0) {
                    System.out.println(ANSI_BLUE + i + ANSI_RESET);
                } else if (i % 12 == 0 && i != 0) {
                    System.out.println(ANSI_RED + i + ANSI_RESET);
                } else if (i == 0) {
                    System.out.println("ZERO");
                }
        }

        HW5.task(10);

//        displaySequenceOfNumbers(0, 22, 5);
//        // happy path
//        seq10(10.5, 20.79, 1.29);
//        // happy path
//        seq10(15.9, 0, - 1.45);
//        //  negative path
//        seq10(15.9, 0, 0);
//        seq10(15.9, 0, 1);
//        seq10(- 15.9, 0, - 1.45);
//        seq10(0, 0,  1);
//        seq10(0, 0, - 1);

        seq10(10.5, 20.79, 1.29, 2);

        HW5.task(11);
        displaySeq(5);

        //Напишите метод, который принимает целое число n,
        // и выводит все степени числа 2 от 1 до n включительно
        HW5.task(12);

        HW5.task(13);
        //  Вывести последовательность 012345678900112233445566778899000…
        //  до числа 9999 включительно.

        System.out.println(therteenTask());

        HW5.task(14);
        // Распечатайте последовательность чисел:
        //0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
        System.out.print("0");
        for(int i = 1; i < 6; i++) {
            System.out.print(", " + i + ", " + (i * -1));
        }

        System.out.println();

        HW5.task(15);
        // Распечатать последовательность чисел:
        // 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25

        for (int i = 0; i < 26; i++) {
            if(i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + ", ");
            }
        }

        HW5.task(16);
        //   Написать метод, который принимает параметры n, m, l,
        //   и печатает последовательность нечетных чисел начиная с числа n,
        //   с шагом m,  длина последовательности l.

        HW5.task(17);
        // Сгенерируйте и распечатайте последовательность по формуле:
        //n + 1 = n + 2
        seq17(2);



        HW5.task(18);
        //    Написать метод, который принимает параметры , n,
        //    и печатает последовательность чисел, начиная с числа n,
        //    по формуле для n + 1 члена последовательности:
        //    n + 1 = 2n

        seq18(1, 10);

        HW5.task(19);
        //    Сгенерируйте последовательность целых положительных  двузначных чисел,
        //    в которых разница между первой цифрой (десятки) и второй цифрой (единицы)
        //    не превышает 3.

        task19();

        HW5.task(20);
        // Написать метод, который вычислит значение функции:

        printY(3);
        printY(1.5);
        printY(-1);









































    }
}
