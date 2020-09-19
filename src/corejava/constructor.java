package corejava;


public class constructor {

    // Constructor:
    // Constructor name should be same name as class
    // Constructor has no return type
    // Constructor are used to initialize object

    // AccessModifier className (){ }


    String name;
    String address;
    String contactNumber;

    public constructor() { //default constructor
        System.out.println("Hello I am default constructor.");
    }

    public constructor(String name){
        //Single Parameterized Constructor
        // Add Signature/ Pattern/ Parameter
        this.name = name;
        System.out.println("I am single parameterized constructor: "+ this.name);
    }

    public constructor(String name, String address, String contactNumber){
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        System.out.println("I am multi parameterized constructor: ");
        System.out.println(this.name + " " + this.address + " " + this.contactNumber);
    }



    public static void main(String[] args) {

        constructor obj = new constructor(); // className objectName = new constructorOfClass();

        constructor obj2 = new constructor("John"); // single parameterized constructor

        constructor obj3 = new constructor("John", "New York City", "718-000-000");


    }
}

