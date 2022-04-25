package lesson.school;

public class Person {
    public static void main(String[] args) {
        int yob = 1986;
        String text = "Если человек родился в ";
        String text2 = " , то его возраст ";
        int age = 2022 - yob;

        System.out.println(text + yob + text2 + age);

    }
}
