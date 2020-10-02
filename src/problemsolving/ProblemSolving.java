package problemsolving;

import java.util.Scanner;

public class ProblemSolving {

    public static void main(String[] args) {

        ProblemSolving.checkEligibility();


    }
        public static void checkEligibility(){

            Scanner input = new Scanner(System.in);
            System.out.println("Please enter you age: ");

            int age = input.nextInt();

            if (age>=18){
                System.out.println("You are eligible to vote!!..Congrats!");
            } else {
                System.out.println("You are not eligible to vote!!");

                input.close();


            }

        }

    }



