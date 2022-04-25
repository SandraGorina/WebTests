package homework;

public class HW4 {

    public static void assertIntegerResult(int expectResult, int actualResult) {
        if (actualResult == expectResult) {
            System.out.println("Pass");
        }else {
            System.out.println("Fall");
        }
    }

    public static void assertStringResult(String expectResult, String actualResult) {
        if (actualResult.equals(expectResult)) {
            System.out.println("Pass");
        }else {
            System.out.println("Fall");
        }
    }


    public static double tempF;

    public static void makeTemper(double tempC) {
        tempF = tempC * 1.8 + 32;
        System.out.println("Резуьтат температуры в цельсиях " + tempC + " и в Фаренгейтах "
                   + tempF);
    }

    public static int devRes;
    public static int devBack;

    public static void makeMath(int firstNum, int secondNum) {
        devRes = firstNum / secondNum;
        devBack = firstNum % secondNum;

        System.out.println("Результат деления " + firstNum + " на " + secondNum + " = " + devRes
               + ", а остаток от деления = " + devBack );
    }

    public static void appleStud(int apple, int student) {
        System.out.println("Если " + apple + " яблок(а) поделить на " + student
                 + " учеников, то каждый ученик получит по " + apple / student
                 + " яблок(а), и " + apple % student + " яблок(а) останется учителю.");
    }

    static int grade;

    public static void printLine() {
        System.out.println("_____________________");
    }

    public static void printLinePart() {
        System.out.print("\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        System.out.println("Задача " + number);
    }

    public static void papers(String B1, String B2) {
        if(B1.equals("books")) {
            System.out.println("На полке стоят учебники");
        }
        if (B2.equals("directory")) {
            System.out.println("а на столе лежат справочники");
        }
    }

    public static void part(int numbP) {
        printLinePart();
        System.out.print(" PART " + numbP + " ");
        printLinePart();
        printEmptyLine();
    }

    public static void main(String [] args) {
        part(1);
        task(3);

        System.out.println(2 == 2 && 7==7); // 2=2 И 7=7

        System.out.println(!(15<3)); // не (15<3)
        System.out.println(("Сосна" == "Дуб") || ("Вишня" == "Клен")); //("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён")
        System.out.println(!("Сосна" == "Дуб")); //Не("Сосна" = "Дуб")
        System.out.println((!(15<3)) && (10>20)); //(Не(15 < 3)) И (10 > 20)


        // ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
        String eye = "видеть";
        int etazh2 = 2;
        int etazh3 = 3;
        String simbol = "\uD83D\uDE29";

        if((eye.equals("видеть")) && (etazh2 == etazh3 - 1)) {
            System.out.println("(\"Глаза даны, чтобы " + eye + "\") && (\"Под третьим этажом находится второй этаж\")");
        } else {
            System.out.println(simbol);
        }

        //(6/2 = 3) ИЛИ (7*5 = 20)

        Integer a = 6;
        Integer b = 2;
        Integer a1 = 7;
        Integer b1 = 5;
        Integer div = a / b;
        Integer mul = a1 * b1;

        if(a.equals(6) && b.equals(2) && a1.equals(7) && b1.equals(5) && div.equals(3) || mul.equals(20)) {
            System.out.println("(6 / 2 = 3) || (7 * 5 = 20)");
        } else {
            System.out.println(simbol);
        }

        printLine();
        task(4);
        printEmptyLine();

        int minut = 60;
        String watchWork = "время";

        if ((minut == 70) || (watchWork.equals("время"))) {
            System.out.println("(\"В минуте 70 секунд\") || (\"Работающие часы показывают время\")");
        } else {
            System.out.println(simbol);
        }

        printLine();

        String con = "В минуте 60 секунд";
        String con2 = "Работающие часы показывают время";

        String q = "В минуте 70 секудн";
        String q1 = "Работающие часы показывают время";

        boolean e = (q.equals(con) || q1.equals(con2));
        System.out.println(e);

        printLine();

        int z = 28;
        int v = 7;
        int n = 300;
        int m = 5;
        int devNM = n / m;

        if((!(z > v)) && (!(devNM == 60))) {
            System.out.println("!(28 > 7) && !(300/5 = 60)");
        } else {
            System.out.println(simbol);
        }

        printLine();
        // ("Телевизор - электрический прибор") И ("Стекло - дерево")
        String conTV = "электрический прибор";
        String elP = "электрический прибор";
        String glass = "стекло";
        String wood = "дерево";

        boolean e1 = ((elP.equals(conTV)) && (glass.equals(wood)));
        System.out.println(e1);

        if((elP.equals(conTV)) && (glass.equals(wood))) {
            System.out.println((elP.equals(conTV)) && (glass.equals(wood)));
        } else {
            System.out.println(simbol);
        }

        printLine();
        //Не((300 < 100))  → ("Жажду можно утолить водой")
        int r = 300;
        int t = 100;

        if (!(r < t)) {
            System.out.println("Жажду можно утолить водой.");
        } else {
            System.out.println(simbol);
        }

        printLine();
        // (75 < 81) → (88 = 88).
        int j = 75;
        int k = 81;
         if (j < k) {
             System.out.println(88 == 88);
         } else {
             System.out.println(simbol);
         }

         printLine();
         task(5);
         int A = 35;
         int S = 25;
         int N = 45;

         if (A > S && N > S) {
             System.out.println("а) Андрей старше Светы. Наташа старше Светы.");
         } else {
             System.out.println(simbol);
         }

         printLine();

         String place = "table";
         String item;

         if (place == "shelf") {
             item = "textbooks";
             System.out.println(item);
         }
         if (place == "table") {
             item = "directory";
             System.out.println(item);
         }

         //б) На полке стоят учебники, а на столе лежат справочники. метод

        //в) БОльшая часть детей — девочки. Остальные - мальчики
         int chilAll = 100;
         int chilG = 60;
         if (chilAll / 2 < chilG) {
             System.out.println("БОльшая часть детей — девочки. Остальные - мальчики.");
             int chilBoys = chilAll - chilG;
             System.out.println("Мальчиков " + chilBoys);
         }

         printLine();
         task(6); // Водительские права можно получить, только когда исполнится 16 лет
         int ageCon = 16;
         int age1 = 21;

         if (age1 >= ageCon) {
             System.out.println("a) Водительские права можно получить.");
         } else {
             System.out.println(simbol);
         }

         // ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”

         String action = "Едет в автобусе";
         String action2 = "читает книгу";
         String action3 = "смотрит в окно";
         //String actionPetr = (!(action) && (action2 || !(action3));

        // “Если с другом ты, это хорошо, а когда наоборот - плохо”

        String f = "friends";
        if ("friends".equals(f)) {
            System.out.println("Иметь друзей - хорошо.");
        } else {
            System.out.println("Без друзей - плохо.");
        }

        //Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.

       int age = 22;
        if ((age > 0) && (150 > age)) {
            if (age >= 18) {
                System.out.println("Ты - взрослый");
            } else {
                System.out.println("Ты - ребенок");
            }
        }if (age > 150) {
            System.out.println("Возраст указан неверно");
        }

        //Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.

        String earth = "сухая"; // "мокрая"
        String sukho = "нет дождя";
        String mokro = "идет дождь";
        if (earth == "сухая") {
            System.out.println(sukho);
        } else if (earth == "мокрая"){
            System.out.println(mokro);
        } else {
            System.out.println("Идет снег");
        }


        printEmptyLine();
        printLine();
        part(2);
        task(10);
        //Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
        //Выведите результат работы алгоритма на печать.

        int l = 2;
        if (l % 2 == 0) {
            System.out.println(l = l * 2);
        } else {
            System.out.println(l = l * l);
        }

        assertIntegerResult(4, 4);

        task(11);
        //Напишите алгоритм проверки возраста на соответствие условиям (if-else):
        //Голосовать можно с 18 лет
        //Машину можно водить с 16 лет
        //В школу можно идти с 5 лет
        //Выведите результат работы алгоритма на печать.

        int ageV = 119;
        String expectResult = "Возраст введен некорректно";
        String actualResult = "Возраст введен некорректно";

        if (ageV > 0) {
            if ((ageV >= 18) && (ageV < 180)) {
                System.out.println(" Тебе можно голосовать");
            } else if (ageV < 18) {
                System.out.println("Голосовать еще ранно");
            }
        }
        if ((ageV <= 0) || (ageV >= 180)) {
            System.out.println("Возраст введен некорректно");
        }

        int ageV1 = 119;
        if (ageV1 > 0) {
            if ((ageV1 >= 16) && (ageV1 < 150)) {
                System.out.println(" Тебе можно водить машину");
            } else if (ageV1 < 16) {
                System.out.println("Водить машину еще ранно");
            }
        }
        if ((ageV1 <= 0) || (ageV1 >= 150)) {
            System.out.println("Возраст введен некорректно");
        }

        int ageV2 = 119;
        if (ageV2 > 0) {
            if ((ageV2 >= 5) && (ageV2 < 150)) {
                System.out.println(" Тебе можно идти в школу");
            } else if (ageV2 < 5) {
                System.out.println("В школу идти еще ранно");
            }
        }
        if ((ageV2 <= 0) || (ageV2 >= 150)) {
            System.out.println("Возраст введен некорректно");
        }




        task(12);
        //Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
        //5 - выдать похвальную грамоту и перевести в следующий класс
        //4 - перевести в следующий класс
        //3 - дать задание на лето и перевести в следующий класс
        //2 - вызвать родителей и оставить в текущем классе на второй год

        grade = -1;

        if (grade > 0) {
            if (grade == 5) {
                System.out.println("выдать похвальную грамоту и перевести в следующий класс");
            } else if (grade == 4) {
                System.out.println("перевести в следующий класс");
            } else if (grade == 3) {
                System.out.println("дать задание на лето и перевести в следующий класс");
            } else if (grade == 2) {
                System.out.println("вызвать родителей и оставить в текущем классе на второй год");
            } else {
                System.out.println(" Пересмотрите систему оценок");
            }
        }
        if (grade <= 0) {
            System.out.println("Пора менять работу");
        }

        task(13);
        int g = 8;
        int h = 4;
        int sumGH = g + h;
        int subGH = g - h;
        int mulGH = g * h;

        if (g % 3 == 0 && h % 3 == 0) {
            System.out.println(sumGH);
        } else if (g % 5 == 0 && h % 5 == 0) {
            System.out.println(subGH);
        } else if ( g % 2 == 0 && h % 2 == 0) {
            if (g >= 0 || h >= 0) {
                System.out.println(mulGH);
            } else {
                System.out.println(mul * -1);
            }
        }

        task(14);
//Распечатать следующие выражения, используя метод и параметры:
//Результат деления k на l = …, а остаток от деления  = …
//Результат деления k на m = …, а остаток от деления  = …
//Результат деления l на m = …, а остаток от деления  = …
//Результат деления m на k = …, а остаток от деления  = …
//И так далее все возможные варианты.


        makeMath(10, 15);

        task(15);

       appleStud(40, 6);
       appleStud(100, 21);

       task(17);
       //Напишите метод, который примет на вход параметр температуры в Цельсиях,
        // и распечатает результат температуры в Цельсиях и в Фаренгейтах.

        makeTemper(45);

        task(18);
        //) Создать метод, который примет на вход параметр i и распечатает таблицу:
        //
//        i ^ 2
//        значение i ^ 2



        task(19);
















































    }















































}
