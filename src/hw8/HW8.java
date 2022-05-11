package hw8;

import utils.Utils;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {


    public static int[] createArrayRandomInt(int upper, int lower) {
        int countRandom = 0;
        for(int i = lower; i <= upper; i++) {
                countRandom++;
        }

        int[] arrayRandom = new int[countRandom];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = ((int) (Math.random() * countRandom));
        }

        return arrayRandom;
    }

    //Task 7
    public static int[] retArrayInteger(int a, int b, int c, int d, int e) {

        return new int[]{a, b, c, d, e};
    }

    //Task 8
    public static double[] retArrayDouble(double a, double b, double c, double d, double e){

        return new double[]{a, b, c, d, e};
    }

    //Task 9
    public static String[] retArrayString(String a, String b, String c, String d, String e) {

        return new String[]{a, b, c, d, e};
    }

    //Task 10
    public static double[] retArrayIntByMult(int[] array, double a) {
        double[] newArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * a;
        }

        return newArray;
    }

    //Task 11
    public static int retAmountOfEvenNumbers(int[] array) {
       int count = 0;
       for (int i = 0; i < array.length; i ++){
         if(array[i] % 2 == 0) {
             count++;
         }
       }

       return count;
    }

    //Task 12
    public static int retAmountOfOddNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i ++){
            if(array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    //Task 13
    public static boolean[] retArrayNumbersGreaterThanTen(int[] array) {
       boolean[] arrayBoolean17 = new boolean[array.length];
       if(array == null || array.length == 0) {

           return null;
       }
       for(int i = 0; i < array.length; i++) {
           if(array[i] > 10) {
               arrayBoolean17[i] = true;
           } else {
               arrayBoolean17[i] = false;
           }
       }

       return arrayBoolean17;
    }

    //Task 14
    public static String createStringOfWords(String[] array) {
        String stringOfWords = "";
        for (int i = 0; i < array.length; i++) {
            stringOfWords += array[i] + " ";
        }

        return stringOfWords;
    }

    //Task 15
    public static int countSumOfNumbersFromSecondHalf(int[] array) {
        int sum = 0;
        if(array.length > 0) {
            for (int i = array.length / 2; i < array.length; i++) {
                sum += array[i];
            }
        }

        return sum;
    }

    //Task 16
    public static int[] getMultiplicationTable(int a) {
        int[] arrayMultiplicationTable = new int[11];
        int factor = 0;
        if(a > 0 && a < 11) {
            for (int i = 0; i < arrayMultiplicationTable.length; i++) {
                arrayMultiplicationTable[i] = a * factor;
                factor++;
            }
        }

        return arrayMultiplicationTable;
    }

    public static int[] getArrayEvenOrOddNumbers(int[] array) {
        // 1. создаем счетчик для вычисления
        // количества четных и нечетных чисел
        // основного массива
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        // Создаем массивы для четных и нечетных чисел
        // с длинами, равными количеству этих чисел из п 1.
        int[] arrayEven = new int[countEven];
        int[] arrayOdd = new int[countOdd];
        // Создаем дополнительные счетчики для индексов ячеек новых массивов.
        int counterEv = 0;
        int counterO = 0;
        // Проверяем значения в ячейках основного массива на чет/нечет.
        // Заполняем соответствующие новые массивы.
        for (int i = 0; i < array.length; i ++){
            if(array[i] % 2 == 0) {
                arrayEven[counterEv] = array[i];
                counterEv++;
            } else {
                arrayOdd[counterO] = array[i];
                counterO++;
            }
        }
        // Сравниваем значения счетчиков из п 1.
        // В зависимости от результата возвращаем нужный массив.
        if (countEven > countOdd) {

            return arrayEven;
        } else if (countOdd > countEven) {

            return arrayOdd;
        } else {

            return new int[]{};
        }
    }

    // Task 18
    public static int[] getArrayRandomNubers(int lenght) {
        if(lenght > 0) {
            int[] array18 = new int[lenght];
            for (int i = 0; i < lenght; i++) {
                array18[i] = ((int) (Math.random() * 101));
            }

            return array18;
        } else {

            return new int[]{};
        }
 }
    // Task 19
    public static int[] getArray19(int lenght, int d) {
        int value = (int) Math.pow(10, d);
        if(lenght > 0 && d > 0) {
            int[] array19 = new int[lenght];
            for (int i = 0; i < lenght; i++) {
                array19[i] = ((int) ((Math.random()) * value));
            }

            return array19;
        } else {

            return new int[]{};
        }
    }

    // Task 20
    public static int[] getArrayTwoDigitNumbers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10) {
                count++;
            }
        }
        int[] arrayTwoDigitNumbers = new int[count];
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10) {
                arrayTwoDigitNumbers[count1] = array[i];
                count1++;
            }
        }

        return arrayTwoDigitNumbers;
    }

    // Task 21
    public static int[] arrayDifBetweenTensAndOnes(int[] array) {
        int[] array21 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array21[i] = (array[i] / 10) - (array[i] % 10);
        }
        return array21;
    }

    public static void main(String[] args) {

        task(5);

        Integer int8 = 3;
        Double doub8 = 3.3;
        String str8= "Text";

        task(6);
        //Сравнить переменные соответствующих типов из классов HW8_1 и HW8 и распечатать результат сравнения в виде таблички:
        //HW8	 		|HW8_1			|areEquals?
        //____________________________________________
        //Double d = …	|Double d_1 = …		| true or false


        System.out.println("HW 8\t\t\t\t| HW 8_1\t\t\t\t| areEquals?" + "\t|");
        line();
        System.out.println("Double doub8 = " + doub8 + "\t| Double doub8_1 = " + HW8_1.doub8_1
                + "\t| " + verify(doub8, HW8_1.doub8_1) + "\t\t\t|");
        line();
        System.out.println("Integer int8 = " + int8 + "\t| Integer int8_1 = " + HW8_1.int8_1
                + "\t| " + verify(int8, HW8_1.int8_1) + "\t\t\t|");
        line();
        System.out.println("String str8 = " + str8 + "\t| String str8_1 = " + HW8_1.str8_1
                + "\t| " + verify(str8, HW8_1.str8_1) + "\t\t\t|");
        line();

        task(7);
        //Написать метод, который принимает на вход 5 целых чисел,
        //и возвращает массив из этих же чисел

        System.out.println(Arrays.toString(retArrayInteger(2, 3, 4, 5, 6)));

        task(8);
        //Написать метод, который принимает на вход 5 чисел типа double,
        //и возвращает массив из этих же чисел

        task(9);
        //Написать метод, который принимает на вход 5 слов,
        //и возвращает массив из этих слов

        task(10);
        //Написать метод, который принимает на вход массив целых чисел,
        //и возвращает массив тех же чисел,
        //умноженных на 2.5

        System.out.println(Arrays.toString(retArrayIntByMult(retArrayInteger(1, 2, 3, 4, 5), 2.5)));

        task(11);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        //и возвращает количество четных чисел в этом массиве
        int[] array11 = {1, 3, 7, 2, 4, 8, 6};
        System.out.println(retAmountOfEvenNumbers(array11));

        task(12);
        //Написать метод, который принимает на вход массив целых положительных чисел,
        //и возвращает массив нечетных чисел
        System.out.println(retAmountOfOddNumbers(array11));

        task(13);
        //Написать метод, который принимает на вход массив целых чисел,
        //и возвращает массив значений true или false,
        //если числа больше 10

        System.out.println(Arrays.toString(retArrayNumbersGreaterThanTen(array11)));

        //Массив рандомных чисел
        line();
        System.out.println(Arrays.toString(createArrayRandomInt(20, 1)));

        task(14);
        //Написать метод, который принимает на вход массив слов,
        //и возвращает строку, состоящую из этих слов
        String[] array14 = new String[] {"Сходи", "за", "хлебом"};
        System.out.println(createStringOfWords(array14));

        task(15);
        //Написать метод, который принимает массив целых чисел
        //и считает сумму чисел во второй половине массива
        System.out.println(countSumOfNumbersFromSecondHalf(array11));

        task(16);
        //Написать метод, который принимает на вход целое положительные число
        //в пределах от 1 до 10 исключительно,
        //и возвращает таблицу умножения на это число в виде массива
        //Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
        printArray(getMultiplicationTable(5));

        task(17);
        //Написать метод, который принимает массив целых чисел
        //и возвращает массив четных чисел, если четных чисел больше,
        //или массив нечетных чисел, если нечетных чисел больше.
        printArray(getArrayEvenOrOddNumbers(array11));

        task(18);
        // Написать метод, который принимает на вход длину массива
        // и генерирует массив случайных положительных чисел
        // от 0 до 100 исключительно.
        printArray(getArrayRandomNubers(10));

        task(19);
        // Написать метод, который принимает на вход длину массива l
        // и количество знаков d (однозначные, двузначные, трехзначные и тд числа),
        // и генерирует массив случайных целых положительных чисел длины l,
        // в котором все числа имеют количество знаков d
        printArray(getArray19(5, 2));
        printArray(getArray19(5, 3));
        printArray(getArray19(10, 3));
        printArray(getArray19(10, 4));

        task(20);
        // Написать метод, который принимает на вход массив целых положительных чисел,
        // и возвращает массив только двузначных чисел.
        // Проверить работу метода на массиве из задания 18.
        int[] arrayTest = {24, 2, 45, 18, 77, 67, 99, 2, 79, 1};
        printArray(getArrayTwoDigitNumbers(arrayTest));

        task(21);
        // Написать метод, который принимает на вход
        // массив целых положительных двузначных чисел,
        // и возвращает массив разниц между десятками и единицами
        int[] arrayTest21 = {24, 42, 45, 18, 77, 67, 99, 72, 79, 11};
        arrayDifBetweenTensAndOnes(arrayTest21);































    }

}
