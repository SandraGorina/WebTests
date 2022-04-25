package lesson.lessons1To7;

public class Lesson6 {

    public static void main(String[] args) {

//        for (: :) {
//
//
//        }
//       //Печатаем для всех чисел от 1 до 5 включительно
//        for(int i = 1; i < 6; i++) {
//            System.out.println("Java for beginners.");
//        }
//
////        Печатаем числа от 1 до 5 включительно
//        for(int i = 1; i < 6; i++) {
//            System.out.println(i);
//        }

//        Печатаем  только нечетные числа от 1 до 10 включительно
//        for (int i = 1; i < 11; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }

        for (int i = 1; i < 11; i = i + 2) {
                System.out.println(i);
        }

        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
        }

//        Печатаем все числа от 1 до 100 включительно с шагом 10
        for (int i = 1; i < 101; i += 10) {
            System.out.println(i);
        }

//        Печатаем все числа в промежутке от 0 до 100, которые делятся на 10 без остатка
        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }

//        Печатаем все числа в промежутке от -100 до 100 включительно, кратные 10
         for (int i = -100; i < 101; i += 10) {
             System.out.println(i);
        }

//         Печатаем все цифры от 5 до 1 включительно
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }

//     Песенка про 99 бутылок пива на стене

         String bottles = " bottles of beer";
         String bottle = " bottle of beer";
         String wall = " on the wall";
         String take = "Take one down and pass it around";
         String commaSpece = ", ";
         String dot = ".";
         String go = "Go to the store and by some more";
         String noMoreC = "No more";
         String noMoreL = "no more";
         String ln = "\n";

         for (int i = 99; i > -1; i--) {
             if (i == 2) {
                 System.out.println(i + bottles + wall + commaSpece + i + bottles + dot);
                 System.out.println(take + commaSpece + (i - 1) + bottle + wall + dot + ln);
             } else if (i == 1) {
                 System.out.println(i + bottle + wall + commaSpece + i + bottle + dot);
                 System.out.println(take + commaSpece + noMoreL + bottles + wall + dot + ln);
             } else if (i == 0) {
                 System.out.println(noMoreC + bottles + wall + commaSpece + noMoreL + bottles + dot);
                 System.out.println(go + commaSpece + (i + 99) + bottles + wall + dot);
             } else {
                 System.out.println(i + bottles + wall + commaSpece + i + bottles + dot);
                 System.out.println(take + commaSpece + (i - 1) + bottles + wall + dot + ln);
             }
         }
    }
}
