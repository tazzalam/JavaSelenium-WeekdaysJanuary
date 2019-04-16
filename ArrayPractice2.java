package Utility;

public class ArrayPractice2 {

    public static void main(String[] args) {


        String[] employeesName = {"Tom", "John"};
        String department = "IT";
        int[] salary = {60000, 90000, 70000};

        int[] Identification = new int[2];
        Identification[0] = 6000;
        Identification[1] = 90000;
        try {
            Identification[2] = 70000;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception caught");
        }
        System.out.println(Identification[1]);


        String multiDimentionalArray[][] = new String [3][3];
        for(int i =0;i<multiDimentionalArray.length;i++){
            for(int j=0;j<multiDimentionalArray.length;j++){
                multiDimentionalArray[0][1]="hey";

            }
        }
        System.out.println(multiDimentionalArray[0][1]);




    }
}

