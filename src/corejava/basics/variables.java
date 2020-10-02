package corejava.basics;

public class variables {


    int age = 25; //global variables

    static double quantity = 9.99; // global static variables


    public static void main(String[] args) {

        int price = 10; // local variables

        variables obj = new variables(); // className objectName = new constructorOfClass();
        System.out.println(obj.age);

        System.out.println(price);

        System.out.println(quantity); // do not need to create objects for global static variables.

    }
}
