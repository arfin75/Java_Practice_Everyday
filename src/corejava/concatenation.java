package corejava;

public class concatenation {

  //  Joining a variable with a string value. “+” operator is used to concatenate the string and the value.

    String country = "USA"; // global variable

    public static void main(String[] args) {

        String firstName = "John"; //local variable
        String lastName = "Wick";

        System.out.println("First name is : " + firstName + "and Last Name is: " + lastName);
        System.out.println("Name is : " + firstName + " " + lastName);


        concatenation obj = new concatenation(); //global variable
        System.out.println("Country's name is: " +obj.country);

    }
}
