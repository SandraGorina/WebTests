package lesson.lesson8;

public class lasson8 {


    public static void main(String[] args) {
//  Cпособы создания массивов
        int[] arr = new int[] {1,2,3};
        int[] arr2 = {1,2,3};

        int[] arr1 = new int[0];
        int[] arr4 = {}; // массив с одним индексом (пустой с длиной 1)

        int[] arr5 = new int[1];
        int[] arr6 = {0};

        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

        Integer intObject = new Integer(4);
        Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");


        System.out.println(str1 == str2);
        System.out.println(intReg == intReg1);

        System.out.println(intReg == intObject);














    }


}
