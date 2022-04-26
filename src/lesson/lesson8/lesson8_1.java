package lesson.lesson8;

import utils.Utils;

public class lesson8_1 {

    public static String str1_2 = "Dog"; // видна везде в рамках данного проекта
    protected static String str1_1 = "Cat"; // видна в рамках одного пакета, во всех его классах
    private static String dog1_1 = "Dog"; // видна только в данном классе

    public static void main(String[] args) {
        dog1_1 = "Конь в яблоках";
        Utils.line();




    }
}
