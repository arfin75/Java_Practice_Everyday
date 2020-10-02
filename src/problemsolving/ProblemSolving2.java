package problemsolving;

import java.util.Scanner;

public class ProblemSolving2 {


    public static void main(String[] args) {

        ProblemSolving2.checkLargestNumber();

    }

    public static void checkLargestNumber(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your 1st number: ");
        int num1 = input.nextInt();

        System.out.println("Please enter your 2nd number: ");
        int num2 = input.nextInt();

        System.out.println("Please enter your 3rd number: ");
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("Largest number is: " +num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number is:" +num2);

        } else if (num3 > num2 && num3 > num1) {
            System.out.println("Largest number is:" +num3);

            input.close();
        }


    }

}
