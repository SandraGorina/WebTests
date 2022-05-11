package homework;

import static utils.Utils.*;
// Написать алгоритм CapitalizeWords, который принимает на вход предложение
// с единичным пробелом между словами,
// и возвращает предложение, в котором все слова написаны с большой буквы
// "    happy birthday!  " ---> " Happy Birthday!"
// "   jhon jacob smith jr." ---> " Jhon Jacob Smith Jr."

// пустой String = ""; длина 0
// String str = null; это проблема

public class HW10 {
    public static String capitalizeWords(String sentence) {

        if(sentence != null) {
            sentence = sentence.trim(); // метод убирает все пробелы до и после слов
            //Character.toString(sentence.charAt(0)).toUpperCase();
            if (sentence.length() != 0) {
                sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
                // 1 индекс исключительно, если указывается один индекс, то от него и до конца
                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)  // слово до пробела
                                + sentence.substring(i + 1, i + 2).toUpperCase() // буква после пробела, сделать заглавной
                                + sentence.substring(i + 2);              // все оставшееся слово
                    }
                }

                return "";
            }
            return sentence;
        }

        return "";
    }

    //Task 1
    public static String getSentence(String sentence) {
        String sentenceNew = "";
        boolean fullSent = false;
        String answer = "";
        String answer1 = "Лишние пробелы удалены";
        String answer2 = "Пробелов не было";
        String answer3 = "Строка пустая";

        if(fullSent == sentence.isEmpty()) {
            sentenceNew = sentence.trim();
            if(sentenceNew.length() < sentence.length()) {
                answer = answer1;

                return answer;
            } else if (sentenceNew.length() == sentenceNew.length()) {
                answer = answer2;

                return answer;
            }
        } else {
            answer = answer3;

            return answer;
        }

        return answer;
    }

    //Task 2
    public static String removeAlla(String sentence) {
        String newS = "";
        if(sentence.length() > 0) {
            newS = sentence.trim();
        } else {

            return "Пустая строка";
        }
        newS = newS.replace("a", "");

        return newS;
    }

    //Task 3
    public static String removeAllZeros(String sentenceOfNumb) {
        if(sentenceOfNumb.length() > 0) {
            sentenceOfNumb = sentenceOfNumb.replace(" ", "");
        } else {

            return "Пустая строка";
        }
        sentenceOfNumb = sentenceOfNumb.replace("0", "");

        return sentenceOfNumb;
    }

    //Task 4
    public static String removeAllSpaces(String sentence) {
        if(sentence.length() > 0) {
            sentence = sentence.replace(" ", "");
        } else {

            return "Пустая строка";
        }

        return sentence;
    }

    //Task 5
    public static int countLettersA(String sentence) {
        if (sentence.length() > 0) {
            sentence = sentence.toLowerCase();
        } else {

            return 0;
        }
        int count = 0;
        for(int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    //Task 6
    public static boolean findTheWordJava(String text) {
        boolean find = true;
        find = text.contains("Java");

        return find;
    }

    //Task 7
    public static String addQuotes(String sentence) {
        if(sentence.length() > 0) {
            sentence = sentence.trim();
            String helperQuote = "\"";
            String helperD = ".";
            String sentNew = helperQuote.concat(sentence).concat(helperD).concat(helperQuote);

            return sentNew;
        } else {

            return "Пустая строка";
        }
    }

    //Task 8
    public static String correctCity(String cityName) {
        if (cityName.length() != 0) {
            cityName = cityName.toLowerCase();
            cityName = cityName.substring(0, 1).toUpperCase() + cityName.substring(1);

            return cityName;
        } else {

            return "Пустая строка";
        }
    }



    public static void main(String[] args) {
        // System.out.println("    happy birthday!  ");
        // System.out.println(capitalizeWords("    happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
       //  System.out.println(capitalizeWords("  jhon jacob smith jr."));
        System.out.println(capitalizeWords(" "));

       task(1);
        /**
         * Написать метод, который принимает на вход строку.
         * Если строка не пустая (проверить методом из видео),
         * то примените метод по удалению пробелов в начале строки и в конце строки.
         * Догадаться, каким методом из видео можно проверить, были ли пробелы.
         * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
         * Если пробелов не было, вернуть сообщение “Пробелов не было”.
         * Если строка пустая, вернуть сообщение “Строка пустая”.
         * Test Data:
         * “    QA4Everyone   “ → “Лишние пробелы удалены”
         * “QA4Everyone“ → “Пробелов не было”
         * “” → “Строка пустая”
         */

        System.out.println(getSentence("    QA4Everyone   "));
        System.out.println(getSentence("QA4Everyone"));
        System.out.println(getSentence(""));

        task(2);
        /**
         * Написать алгоритм RemoveAlla.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку.
         * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA4Everyone   “ →  “QA4Everyone“
         * “panda   “ → “pnd”
         */

        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));

        task(3);
        /**
         * Написать алгоритм RemoveAllZeros.
         * С помощью методов из видео1,  написать алгоритм, который принимает на вход строку,
         * состоящую из цифр. Если строка валидная,
         * то метод удаляет все пробелы из строки, если таковые имеются.
         * Метод возвращает обработанную строку, в которой нет нулей.
         * Test Data:
         *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         * “ 0000000111“ → “111”
         */

        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));

        task(4);
        /**
         * Написать алгоритм RemoveAllSpaces.
         * С помощью методов из видео1,  написать алгоритм,
         * который принимает на вход строку.
         * Если строка валидная, то метод удаляет все пробелы из строки,
         * если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA   4  Everyone   “ →  “QA4Everyone“
         * “p a     n d a   “ → “panda”
         */
        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));

        task(5);
        /**
         * Напишите метод, который принимает на вход строку и считает,
         * сколько букв а или А содержится в строке.
         * Test Data:
         * “Abracadabra” → 5
         * “Homenum Revelio” → 0
         */
        System.out.println(countLettersA("Abracadabra"));
        System.out.println(countLettersA("Homenum Revelio"));

        task(6);
        /**
         * Напишите метод, который принимает на вход текст и проверяет,
         * содержится ли в тексте хотя бы одно слово Java.
         */
        String text1 = "As of March 2022, Java 18 is the latest version, " +
                "while Java 17, 11 and 8 are the current long-term support (LTS) versions. " +
                "Oracle released the last zero-cost public update for the legacy version Java 8 LTS " +
                "in January 2019 for commercial use, although it will otherwise still support Java 8 with " +
                "public updates for personal use indefinitely. Other vendors have begun to offer zero-cost builds of " +
                "OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String text2 = "As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me.";
        System.out.println(findTheWordJava(text1));
        System.out.println(findTheWordJava(text2));

        task(7);
        /**
         * Напишите метод, который принимает на вход строку, и добавляет
         * Кавычки в начале строки, точку и кавычки в конце строки
         * с помощью метода concat()
         * Test Data:
         * “One” → ““One.””
         * “    TWO  “ → ““TWO.””
         */
        System.out.println(addQuotes("One"));
        System.out.println(addQuotes("    TWO  "));

        task(8);
        /**
         * Напишите метод, кторый принимает на вход название города
         * и исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго”
         */
        System.out.println(correctCity("ташкент"));
        System.out.println(correctCity("ЧикаГО"));








    }


}
