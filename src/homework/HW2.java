package homework;

public class HW2 {

    public static void main(String [] args ) {
//        Task 11
//        Создать целочисленные переменные k, l, m

        int k = 5;
        int l = 10;
        int m = 15;

        int sumKL = k + l;
        int subLM = l - m;
        int devKL = k / l;
        int devKM = k / m;
        int devLM = l / m;
        int devMK = m / k;
        int apple = 40;
        int student = 6;
        int apple1 = 100;
        int student1 = 21;
        String line = "-------------------------------";

// Task 12 Вывести значения переменных в столбик
        System.out.println("TASK 12");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(line);

// Task 13 Вывести значения переменных в строку
        System.out.println("TASK 13");
        System.out.println("" + k + " " + l + " " + m);
        System.out.println(line);

        //        System.out.print(k);
//        System.out.print("\t");
//        System.out.print(l);
//        System.out.print("\t");
//        System.out.print(m);
//        System.out.print("\t\n");

//        Task 14 Используя конкатенацию, вывести значениеп переменных в строку через запятую

        System.out.println("Task 14");
        System.out.println("" + k + ", " + l + ", " + m);
        System.out.println(line);

// Task 15
        System.out.println("Task 15");
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        System.out.println("m = " + m);
        System.out.println(line);

        /**      Task 16
         * Распечатать следующие выражения? где вместо ...
         * будет выведен результат арифметической операции
         */
        System.out.println("Task 16");
        System.out.println("Sum of k and l = " + sumKL);
        System.out.println("Разность переменных l и m = " + subLM);
        System.out.println(line);

        /**       Task 17
         * Распечатать следующие выражения...
         */
        System.out.println("TASK 17");
        System.out.println("Результат деления k на l = " + devKL + ", " + "а остаток от деления = " + (k % l));
        System.out.println("Результат деления k на m = " + devKM + ", " + "а остаток от деления = " + (k % m));
        System.out.println("Результат деления l на m = " + devLM + ", " + "а остаток от деления = " + (l % m));
        System.out.println("Результат деления m на k = " + devMK + ", " + "а остаток от деления = " + (m % k));
        System.out.println(line);

        /**      Task 18
         * Создать переменные apple и student и присвоить им занчения 40 и 6 соответственно.
         */
        String text = " Если ";
        String text1 = " яблок поделить на ";
        String text2 = " учеников, то каждый ученик получит по ";
        String text3 = " яблок(а), и ";
        String text4 = " яблок(а) останется учителю. ";


        System.out.println("TASK 18");
        System.out.println(text + apple + text1 + student + text2 + (apple / student) + text3
                + (apple % student) + text4);
        System.out.println(text + apple1 + text1 + student1 + text2 + (apple1 / student1) + text3
                + (apple1 % student1) + text4);
        System.out.println(line);

        /**      TASK 19
         * Распечатать вычисления и итоговый результат
         * сумма чисел k, l, m++ и sumKLM-- = ..., а разность m++ и sumLKM = ...
         */

        System.out.println("TASK 19");
        int sumLKM = l + k + m;
        int sumKLM = k + l + m;
        m++;
        int sumKLM1 = k + l + m;
        sumKLM--;

        System.out.println("Сумма чисел " + sumKLM1 + " и " + sumKLM + " = " + (sumKLM1 + sumKLM--) + ", а разность "
        + m + " i " + sumLKM + " = " + (m - sumLKM) + " . ");

        System.out.println(line);

        /**    Task 20
         * Показать что число 48 кратоно 8, и что оба этих числа - четные. Ачисла 47 и 49 - нечетные.
         */

        System.out.println("TASK 20");

        System.out.println(48 % 8);
        System.out.println(48 % 2);
        System.out.println(8 % 2);
        System.out.println(47 % 2);
        System.out.println(49 % 2);

        System.out.println(line);

        /** Part  3
         *  a. Вывести на печать математическое выражение из заданий 21, 22 и 23
         *  x=2, y=3, a=k, b=l, c=m, d=y-x.
         *  b. Посчитать значения из задания а и вывести результат на печать в виде таблицы.
         *  result21, result22 и result23 - результаты вычислений в каждом выражении.
          */
        System.out.println("TASK 21");

        int x = 2;
        int sum = x + 3;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        String line1 = "+---------------------+";

        System.out.println(line1);
        System.out.println("| task\t\t| result  |");
        System.out.println(line1);
        System.out.println("| 21" + "\t\t|" + (sum * sum) + "\t\t  |");
        System.out.println(line1);

        System.out.println("| 22" + "\t\t|" + (((3 + (4 * x)) / 5) - ((10 * ((y - 5) * (a + b + c)))) / x
                + ((9 * (4 / x)) + ((9 * (9 + x) / y)))) + "\t  |");
        System.out.println(line1);

        System.out.println((((5 * x) + (7 * y)) / ((8 * x) + (10 * y))) / (((3 * x) - y) / (x + y)));
    }
}
