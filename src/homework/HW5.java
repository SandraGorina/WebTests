package homework;

public class HW5 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void printLine() {
        System.out.println("___________________________________________");
    }

    public static void printStars() {
        System.out.println("\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F" + "\uD83C\uDF1F");
    }

    public static void task(int number) {
        printLine();
        printStars();
        System.out.println(ANSI_PURPLE + "Задача " + number + ANSI_RESET);
        printLine();
    }

    public static String weekDay(int a) {
        String day;

        if (a >= 1 && a <= 7) {
            if (a == 1) {
                day = "Monday";

                return day;
            } else if (a == 2) {
                day = "Tuesday";

                return day;
            } else if (a == 3) {
                day = "Wednesday";

                return day;
            } else if (a == 4) {
                day = "Thursday";
//
                return day;
            } else if (a == 5) {
                day = "Friday";

                return day;
            } else if (a == 6) {
                day = "Saturday";

                return day;
            } else {
                day = "Sunday";

                return day;
            }
        } else {
            day = "Error";
//            System.out.println("Error");
        }

        return day;
    }



    public static void verifyEquals(int expectedResult, int actualResult) {
        if (expectedResult == actualResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }
    public static void verifyEquals(String expectedResult, String actualResult) {
        if (expectedResult.equals(actualResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static double returnMaxOfThree(double x, double y, double z) {
        double max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max < z) {
            max = z;
        }

        return max;
    }


    public static double averageTempCatBody(double a, double b, double c, double d, double i) {

        return ((double)a + b + c + d + i) / 5;
    }

    public static String retStringForDoubleMoney(double s) {
        int num1 = (int) s;
        int num2 = (int) Math.round(100 * (s - num1));

       return (num1 + " руб. " + num2 + " коп.");
    }

    public static String retStringForDoubleWeight(double w) {
        int num1 = (int) w;
        int num2 = (int) Math.round(1000 * (w - num1));

        return (num1 + " кг. " + num2 + " гр.");
    }

    public static double payPurchase(double priceSub, double quantitySub) {

        double sumPurchase = priceSub * quantitySub;
        double scale = Math.pow(10, 3);
        double result = Math.ceil(sumPurchase * scale) / scale;

        return (result);
    }

    public static void printReceiptApples(double s, double w) {
        double num1 = s;
        double num2 = w;
        payPurchase(num1, num2);
        retStringForDoubleMoney(payPurchase(num1, num2));
        System.out.println("\uD83C\uDF4E" + "\tЯблоки");
        printLine();
        System.out.println("| Цена за кг\t\t|" + " " + retStringForDoubleMoney(num1) + "\t  |");
        printLine();
        System.out.println("| Количество\t\t|" + " " + retStringForDoubleWeight(num2) + "\t\t  |");
        printLine();
        System.out.println("| Сумма к оплате\t|" + " " + retStringForDoubleMoney(payPurchase(num1, num2))
                + "\t  |");
        printLine();
    }

    public static void printReceiptBread(double s, int w) {
        double num1 = s;
        int num2 = w;
        payPurchase(num1, num2);
        retStringForDoubleMoney(payPurchase(num1, num2));
        System.out.println("\uD83C\uDF5E" + "\tХлеб");
        printLine();
        System.out.println("| Цена за кг\t\t|" + " " + retStringForDoubleMoney(num1) + "\t  |");
        printLine();
        System.out.println("| Количество\t\t|" + " " + num2 + " шт. " + "\t\t\t  |");
        printLine();
        System.out.println("| Сумма к оплате\t|" + " " + retStringForDoubleMoney(payPurchase(num1, num2))
                + "\t  |");
        printLine();
    }

    public static double returnSalary(double hour, double rate, int days) {
        double salary = 0.00;
        if (days > 0 && days <= 31 && hour > 0 && rate > 0) {
//            System.out.println(salary);
            salary = hour * rate * days;
        } else {
            System.out.println("Incorrect data");
        }

        return salary;
    }

    public static void countSalary(String name, double hour, double rate, int days){
        double x = hour;
        double y = rate;
        int z = days;
        double salary = returnSalary(x, y, z);

        String sal1 = retStringForDoubleMoney(salary);

        System.out.println(name + "\t" + sal1);
    }

    public static String printMonth(int a) {
        String month = null;

        if (a >= 1 && a <= 12) {
            if (a == 1) {
                month = "January";
            } else if (a == 2) {
                month = "February";
            } else if (a == 3) {
                month = "March";
            } else if (a == 4) {
                month = "April";
            } else if (a == 5) {
                month = "May";
            } else if (a == 6) {
                month = "Juny";
            } else if (a == 7) {
                month = "July";
            } else if (a == 8) {
                month = "August";
            } else if (a == 9) {
                month = "September";
            } else if (a == 10) {
                month = "Jctober";
            } else if (a == 11) {
                month = "November";
            } else if (a == 12) {
                month = "December";
            } else {
                month = "Error";
            }
        }

        return month;
    }


    public static void printMonthYear(int a, int b) {
        int year1 = b;
        String month1 = printMonth(a);
        System.out.println(month1 + " " + year1);
    }

    public static double defineSignNumber(double x) {

        if (x < 0) {
            System.out.println("x is negative");
        } else if (x > 0) {
            System.out.println("x is positive");
        } else {
            System.out.println("x is zero");
        }

        return x;
    }


    public static int findLuckyNum(int year) {
        int number1 = year / 1000;
        int number2 = year / 100 % 10;
        int number3 = year % 100 /10;
        int number4 = year % 10;

        int luckyNum = number1 + number2 + number3 + number4;
        if (luckyNum <= 9) {
            System.out.println("Счастливое число - " + luckyNum);
        } else {
            number1 = luckyNum / 10;
            number2 = luckyNum % 10;
            luckyNum = number1 + number2;
            if (luckyNum <= 9) {
                System.out.println("Счастливое число - " + luckyNum);
            } else {
                number1 = luckyNum / 10;
                number2 = luckyNum % 10;
                luckyNum = number1 + number2;
                if (luckyNum <= 9) {
                    System.out.println("Счастливое число - " + luckyNum);
                }
            }
        }
        return luckyNum;
    }


    public static double countAverageOfThree(int a, int b, int c) {

        double average = (a + b + c) / 3;

        return average;
    }

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

    public static int returnMaxOfThree(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        return max;
    }

    public static int countMedianaOfThree(int a, int b, int c) {
        int sum = a + b + c;
        int minValue = returnMinOfThree(a, b, c);
        int maxValue = returnMaxOfThree(a, b, c);

        int mediana = sum - minValue - maxValue;

        return mediana;
    }

    public static double countDifferenceValue( int a, int b, int c) {
        double srednee = countAverageOfThree(a, b, c);
        int med = countMedianaOfThree(a, b, c);

        double differenceValue = srednee - med;

        if (differenceValue < 0) {
            differenceValue = (-1) * differenceValue;

            return differenceValue;
        }

        if (differenceValue > 2) {
            System.out.println("Среднее занчение " + srednee + " отличается от медианы " + med +
                    " на " + differenceValue + " .");
        } else {
            System.out.println("Среднее занчение = " + srednee + " , медиана = " + med + " .");
        }

        return differenceValue;

    }


    public static int countMaxValueMath(int a, int b, int c) {
        int maxTwo = Math.max(a, b);
         if (maxTwo < c) {
             maxTwo = c;
         } else {
             maxTwo = maxTwo;
         }

         return maxTwo;
    }

    public static int countMinValueMath(int a, int b, int c) {
        int minTwo = Math.min(a, b);
        if (minTwo > c) {
            minTwo = c;
        } else {
            minTwo = minTwo;
        }

        return minTwo;
    }

    public static String roundValue( double a) {
        int b = (int) Math.floor(a);
        String sum = b + " руб. " + "0 копеек";

        return sum;
    }


    public static double solveExample(int a, int b, int c) {
        int mult = (int) Math.multiplyFull(a, b);
        int sum = mult + c;
        int aDegree = (int) Math.pow(a, b);
        double mult1 = (int) Math.multiplyFull(sum, aDegree);
        double rootOfNumber = Math.sqrt( mult1);
        double result = rootOfNumber / Math.PI;

        return result;
    }

    public static int showRandomNumber() {

        return (int) ((Math.random()) * 100);
    }

    public static boolean isleapyear(int year) {
        boolean leapyear = (year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0);

        return leapyear;
    }



public static void main(String[] args) {
        task(2);

    System.out.println(weekDay(4));
    System.out.println(weekDay(0));
    System.out.println(weekDay(1));
    System.out.println(weekDay(2));
    System.out.println(weekDay(3));
    System.out.println(weekDay(5));
    System.out.println(weekDay(6));
    System.out.println(weekDay(7));
    System.out.println(weekDay(-1));

    verifyEquals("Thursday", weekDay(4));
    verifyEquals("Error", weekDay(0));
    verifyEquals("Monday", weekDay(1));
    verifyEquals("Tuesday", weekDay(2));
    verifyEquals("Wednesday", weekDay(3));
    verifyEquals("Friday", weekDay(5));
    verifyEquals("Saturday", weekDay(6));
    verifyEquals("Sunday", weekDay(7));
    verifyEquals("Error", weekDay(-1));
    verifyEquals("Monday", weekDay(-1));

    task(3);

    System.out.println(returnMaxOfThree(5,8,13));

   verifyEquals(8, returnMaxOfThree(5,8,13));
   verifyEquals(13, returnMaxOfThree(5,8,13));

    task(4);

    double a = 15;
    double b = 7;
    double c = 2.5;
    double min;

    if (a < b) {
        min = a;
    } else {
        min = b;
    }
    if ( min > c) {
        min = c;
    }
    System.out.println(min);



    task(5);
    System.out.println(averageTempCatBody(33.5, 36.6, 36.7, 38.8, 35.7));

    task(6);

    System.out.println(retStringForDoubleMoney(67.43));

    task(7);

    System.out.println(retStringForDoubleWeight(4.067));

    task(8);

    System.out.println(payPurchase(1550.99, 3));

    task(9);

    printReceiptApples(44.99, 3.3);

    printReceiptBread(30, 7);

    task(10);

    returnSalary(30, 8.5, 22);

    task(11);

    countSalary("Смирнова Мария Ивановна", 80, 15, 22);

    printLine();
    printMonthYear(3, 2022);
    countSalary("Смирнова Мария Ивановна", 45, 18, 21);
    countSalary("Серебряков Иван Петрович", 33, 15, 19);
    printLine();

    task(12);
    defineSignNumber(-6556);

    task(13);

    findLuckyNum(1986);

    task(14);

    countDifferenceValue(5, 15, 45);

    task(15);

    System.out.println(roundValue(10.11));

    task(16);

//    int a = 3;
//    int b = 4;
//    int c = 20;

    System.out.println(solveExample(3, 4, 20));
    System.out.println(Math.round(((solveExample(3, 4, 20)) * 100.0)) / 100.0);



    task(19);

    System.out.println(showRandomNumber());
    System.out.println(showRandomNumber());

    task(20);

    System.out.println(isleapyear(1986));









































        
        
        
        
        
        
        
        



}

























}
