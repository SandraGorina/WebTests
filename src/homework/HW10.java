package homework;

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

    public static void main(String[] args) {
        // System.out.println("    happy birthday!  ");
        // System.out.println(capitalizeWords("    happy birthday!  "));
        System.out.println(capitalizeWords(""));
        System.out.println(capitalizeWords(null));
       //  System.out.println(capitalizeWords("  jhon jacob smith jr."));
        System.out.println(capitalizeWords(" "));





    }


}
