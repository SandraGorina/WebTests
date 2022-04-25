package homework;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class HW7 {

    public static void verifyEquals(double expectedResult, double actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printStars() {
        System.out.print("\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F");
    }

    public static void printLine() {
        System.out.println("―――――――――――――――――――――――――――――――――――――――――――――――");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        printStars();
        System.out.print(" " + ANSI_PURPLE + "Задача № " + " " + number + ANSI_RESET + " ");
        printStars();
        printEmptyLine();
        printEmptyLine();
    }

    public static double averageValue(int[] array) {
        double averageValue = 0;
        for (int i = 0; i < array.length; i++) {
            averageValue += array[i];
        }

        return averageValue / array.length;
    }

    public static int[] retMaxMinAver(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        int aver;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        aver = sum / array.length;

        int[] result = new int[3];
        result[0] = min;
        result[1] = max;
        result[2] = aver;

        return result;
    }

    public static int[] task21(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int average;

        for (int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
            if (max < array[i]){
                max = array[i];
            }
            sum += array[i];
        }
        average = sum / array.length;

        int[] arrayResult = {min, max, average};

        return arrayResult;
    }

    public static void main(String[] args) {

        /** Создать массив catsNames, заполнить его любыми значениями
         * (см картинку котов из презентации).
          */
        task(1);

        String[] catsNames = new String[8];
        catsNames[0] = "Васька";
        catsNames[1] = "Черныш";
        catsNames[2] = "Мурка";
        catsNames[3] = "Муська";
        catsNames[4] = "Рыжик";
        catsNames[5] = "Шалун";
        catsNames[6] = "Рыжуля";
        catsNames[7] = "Пухляш";

        task(3);
        String[] catsColors = new String[8];
        catsColors[0] = "Голубой";
        catsColors[1] = "Черный";
        catsColors[2] = "Серый";
        catsColors[3] = "Коричневый";
        catsColors[4] = "Красный";
        catsColors[5] = "Серый";
        catsColors[6] = "Красный";
        catsColors[7] = "Серый";

        task(4);
        int[] catsAges = {2, 3, 6, 4, 7, 10, 8, 5};


        task(5);
        boolean[] itCatsRed = new boolean[8];
        itCatsRed[0] = false;
        itCatsRed[1] = false;
        itCatsRed[2] = false;
        itCatsRed[3] = false;
        itCatsRed[4] = true;
        itCatsRed[5] = false;
        itCatsRed[6] = true;
        itCatsRed[7] = false;

        task(6);
        /** Task 6
         * Распечатать для массивов catsNames и catsColors:
         * имя кота в коробке с номером 6
         * имена котов из коробок с четными индексами
         * имена котов из коробок, чьи индексы кратны 4
         * цвет котов из коробок с нечетными индексами
         * цвет котов из коробок, чьи индексы кратны 3
         */

        System.out.println(catsNames[6]);

        printLine();
        for (int i =  0; i < 8; i++) {
            if(i % 2 == 0) {
                System.out.println(catsNames[i]);
            }
        }

        printLine();
        for (int i =  0; i < 8; i++) {
            if(i % 4 == 0) {
                System.out.println(catsNames[i]);
            }
        }

        printLine();
        for (int i =  0; i < 8; i++) {
            if(i % 2 != 0) {
                System.out.println(catsNames[i]);
            }
        }

        printLine();
        for (int i =  0; i < 8; i++) {
            if(i % 3 == 0) {
                System.out.println(catsNames[i]);
            }
        }

        task(7);
        /** task 7
         * Распечатать “Накорми кота!” для всех серых котов
         */

        for (int i = 0; i < 8; i ++) {
            if (catsColors[i] == "Серый") {
                System.out.println("Накорми кота из " + i + " коробки!");
            }
        }


        task(8);
        /** Распечатать “Отнеси кота на прививку!”,
         * если возраст кота меньше 2 лет
         */

        for (int i = 0; i < 8; i++) {
            if (catsAges[i] < 2) {
                System.out.println("Отнеси кота из " + i + " коробки на прививку!");
            }
        }

        task(9);
        /** Для кота в последней коробке распечатать
         *  имя, цвет, возраст
         */
        for (int i = 0; i < 8; i++) {
            if((catsNames.length == catsColors.length) && (catsNames.length == catsAges.length)) {
                if(i == 7) {
                    System.out.println("Имя кота - " + catsNames[i] + ", цвет шерсти - " + catsColors[i]
                            + ", возраст - " + catsAges[i] + " лет");
                }
            }
        }

        task(10);
        /**Распечатать имена всех котов,
         * чей возраст больше 2 лет
         */

        for (int i = 0; i < 8; i++) {
            if(catsAges[i] > 2) {
                System.out.print(catsAges[i] + ", ");
            }
        }

        task(11);
        /**Распечатать “Накорми кота!”
         * если имя кота “Рыжик” и значение isCatRed == true
         */

        if(catsNames.length == itCatsRed.length && catsNames.length != 0) {
            for (int i = 0; i < 8; i ++) {
                if (itCatsRed[i] == true && catsNames[i] == "Рыжик" ) {
                    System.out.println("Накорми кота!");
                }
            }
        }


        task(12);
        /**Распечатать средний возраст котов из массива catsAges
         */

//        double averageCatsAges = 0.0;
//        if(catsAges.length > 0) {
//            double sum = 0;
//            for (int i = 0; i < catsAges.length; i++) {
//                sum += catsAges[i];
//                averageCatsAges = sum / catsAges[i];
//                System.out.println(averageCatsAges);
//            }
//        }

//        System.out.println(Arrays.toString(catsAges));
          double sum = 0;
//        double average = 0;
        for(int i = 0; i < catsAges.length; i++) {
            sum = sum + catsAges[i];

        }
        System.out.printf("%.3f%n", sum / catsAges.length);

        System.out.println(Arrays.stream(catsAges).sum());
        double average = Arrays.stream(catsAges).sum() / catsAges.length;
        System.out.println(average);

        /** Task 13
         * Распечатать возраст самого молодого кота
         */

        task(13);

        double minAges = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if(catsAges[i] < minAges) {
                minAges = catsAges[i];
            }
        }
        System.out.println("Возраст самого молодого кота " + minAges);

        task(14);

        /** Task 14
         * Распечатать возраст самого старого кота
         */
        double maxAges = catsAges[0];
        for (int i = 1; i < catsAges.length; i++) {
            if(catsAges[i] > maxAges) {
                maxAges = catsAges[i];
            }
        }
        System.out.println("Возраст самого взрослого кота " + maxAges);

        int maxAge = Integer.MIN_VALUE;
        for (int i = 0; i < catsAges.length; i++) {
            if(catsAges[i] > maxAge) {
                maxAge = catsAges[i];
            }
        }
        System.out.println("Возраст самого взрослого кота " + maxAge);

        task(15);
        /** Task 15
         * Распечатать количество серых котов
         */

        int greyCat = 0;
        for (int i = 0; i < catsColors.length; i++) {
            if(catsColors[i].equals("Серый")) {
                greyCat++;
            }
        }
        System.out.println("Количество серых котов равно " + greyCat);

        task(16);
        /** Task 16
         * Распечатать имя кота,
         * если кот находится в коробке с четным индексом
         * и его возраст не больше 3 лет
         */

        for (int i = 0; i < catsAges.length; i++) {
            if(i % 2 == 0 && catsAges[i] <=3) {
                System.out.println(catsNames[i]);
            }
        }

        task(17);
        /**
         * Создать массив четных положительных чисел,
         * значения которых не больше 10.
         * (заполняем значения с помощью цикла for)
         */

        int count = 0;
        for(int i = 0; i < 11; i++) {
           if(i % 2 == 0) {
               count++;
           }
        }

        int[] array17 = new int[count];
        for (int i = 0, j= 0; i < array17.length; i++, j+= 2) {
            array17[i] = j;
            System.out.print(array17[i] + " ");
        }

        task(18);
        /**
         * Написать метод, который принимает на вход массив int,
         * и возвращает среднее значение.
         * Проверить работу метода тестом, если параметр - массив catsAges
         */
        System.out.println(averageValue(catsAges));
        verifyEquals(5.625, averageValue(catsAges));

        task(19);
        /**
         * Создать массив нечетных отрицательных чисел
         * в промежутке от -1000 до -900
         */

        int countOdd = 0;
        for(int i = -1000; i <= -900; i++) {
            if(i % 2 != 0) {
                countOdd++;
            }
        }

        int[] array19 = new int[countOdd];

        for (int i = -1000, j = 0; i <= -900; i++) {
            if(j < array19.length) {
                if (i % 2 != 0) {
                    array19[j] = i;
                    System.out.print(array19[j] + " ");
                }
            }
        }


        task(20);
        /**
         * Создать массив из 10 случайных положительных целых чисел
         */

        int[] array20 = new int[10];
        for (int i = 0; i < array20.length; i++) {
            array20[i] = ((int) (Math.random() * 10));
            System.out.print(array20[i] + " ");
        }

        printEmptyLine();

        int[] array20_1 = new int[10];
        for (int i = 0; i < 10; i++) {
            array20_1[i] = ((int) (Math.random() * Integer.MAX_VALUE));
            System.out.println(array20_1[i]);
        }

        task(21);
        /**
         * Создать метод, который принимает на вход массив int,
         * и возвращает минимальное значение, максимальное значение
         * и среднее значение всех чисел массива.
         * Проверить работу метода на массиве из задания 20.
         */

        System.out.println(Arrays.toString(task21(catsAges)));

        task(22);
        /**
         * Создать массив четных чисел и массив нечетных чисел
         * из элементов массива из задания 20.
         */

        int lengthEven = 0;
        int lengthOdd = 0;

        for (int i = 0; i < array20_1.length; i++) {
            if(array20_1[i] % 2 == 0) {
                lengthEven++;
            } else {
                lengthOdd++;
            }
        }
        int[] even = new int[lengthEven];
        int[] odd = new int[lengthOdd];
        int countEven22 = 0;
        int countOdd22 = 0;

        for (int i = 0; i < array20_1.length; i++) {
            if(array20_1[i] % 2 == 0 && countEven22 < even.length) {
                array20_1[i] = even[countEven22];
                countEven22++;
            } else  if (array20_1[i] % 2 != 0 && countOdd22 < odd.length){
                array20_1[i] = odd[countEven22];
                countOdd22++;
            }
        }
        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));

        task(23);
        /**
         * Создать двумерный массив,
         * который состоит из
         * имен, возрастов, цветов котов:
         */









































































    }
}
