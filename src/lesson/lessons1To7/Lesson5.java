package lesson.lessons1To7;

public class Lesson5 {

    public static int returnMinOfThree(int a, int b, int c) {
        int min;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (min > c) {
            min = c;
        }

        return min;
    }

    public static double average(int a, int b, int c) {

        return ((double)a + b + c) / 3;
    }

    public static double returneAbs(double number) {
        if (number < 0) {
            number = (-1) * number;
        }

        return number;
    }

    public static double countDifferenceBetweenMinAndAverage(int a, int b, int c) {
        int min = returnMinOfThree(a, b, c);
        double average = average(a, b, c);

        return returneAbs(min - average);

    }


    public static String displayMessage(int a, int b, int c) {
        String message;

        if (countDifferenceBetweenMinAndAverage(a, b, c) > 3.51) {
            message = "Большой разброс чисел";
            System.out.println(message);
        } else {
            message = "Маленький разброс чисел";
            System.out.println(message);
        }

        return message;
    }




    public static void main(String[] args) {

        /** Даны три числа
         * необходимо найти максимально точную разницу
         * между минимальным числом и средним значением
         * Если разницабооьше 3.51
         * показать пользователю сообщение "Большой разброс чисел"
         * иначе показать сообщение "Маленький разброс чисел"
         */

        int a = 5;
        int b = 2;
        int c = 10;

//        System.out.println(returnMinOfThree(a, b, c));
//        System.out.println(average(a, b, c));

        displayMessage(a, b, c);













    }
}
