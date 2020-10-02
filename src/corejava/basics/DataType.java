package corejava.basics;

public class DataType {

    // A primitive data type:  specifies the size and type of variable values,
    // and it has no additional methods Primitive data types - includes byte,
    // short, int, long, float, double, boolean and char.

    // Non-primitive data types are called reference types because they refer to objects.
    // such as String, Arrays and Classes

    int age = 25;       // whole number i.e. 10
    byte quantity = 30; // whole numbers from -128 to 127
    short number = 5000; // whole numbers from -32,768 to 32,767
    long transactionNumber = 5000000; // whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    float sharePrice = 100.1234567f; // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    double yearlySalary = 1000000.93944857229; // can sort 15 decimal digits
    char clothSize = 'M'; // Only used for single character
    boolean isAvailable = true; // used for true or false data types

    String firstName = "John"; // Anything you write inside double quote is called string.
    String name = "John 9988"; // he String data type is used to store a sequence of characters (text)


    public static void main(String[] args) {

        DataType obj = new DataType();  // to call global variables inside the main method
                                        // you have create the class object

        System.out.println(obj.age);
        System.out.println(obj.clothSize);
        System.out.println(obj.firstName);
        System.out.println(obj.name);
        System.out.println(obj.number);
        System.out.println(obj.quantity);
        System.out.println(obj.transactionNumber);
        System.out.println(obj.yearlySalary);
    }
}
