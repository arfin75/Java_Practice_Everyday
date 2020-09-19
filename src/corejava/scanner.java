package corejava;

import java.util.Scanner;

public class scanner {

    // Scanner is used to get the input form the users.


    public static void main(String[] args) {

        // 1st create scanner object + 2nd ask the user for input + 3rd declare the data type

        Scanner input = new Scanner(System.in);
        System.out.println("What's your last name: ");
        String lastName = input.nextLine();

        System.out.println("How many coffee's do you drink in a day: ");
        int coffees = input.nextInt();

        System.out.println("My name is: " + lastName + " " + "I drink " + coffees + " " + "in a day. ");

    }
}
