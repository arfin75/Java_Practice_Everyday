package corejava.basics;


public class method {
//     Method: block of code which runs when it is called. Method is used to perform
//     certain actions and they are known as function
//     Method Type:
//     Return Method without Parameter:
//     Return Method with Parameter:
//     Non Return Method without Parameter:
//     Non Return Method with Parameter:
//
//     Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body}
//     ReturnType/MethodType : Data Type/Class Type
//     MethodName: verb+Noun
//
//     Method Syntax:
//     AccessModifier ReturnType/MethodType MethodName(){ Method Body }
//
//     Return Types are: All Data type, void,class and object.
//
//     Method Syntax: AccessModifier ReturnType/MethodType MethodName(){ Method Body

public static int doAddition(){ // Return method without parameter
    // AccessModifier ReturnType/MethodType MethodName(){ Method body }

    int num1 = 10;
    int numb2 = 20;
    int total = num1 + numb2;
    System.out.println("Return method without parameter is : " + total);
    return total;
}

public static int doMultiply(int number1, int number2) {   // Return Method with Parameter/ Dynamic method:

        int num1 = number1;
        int num2 = number2;
        int total = num1 * num2;
        System.out.println("Return method with parameter is: " + total);
        return total;
    }

    public static void studentInfo(){ // Non Return Method without Parameter:
        String name="James";
        String address="Queens,NY";
        System.out.println("Student name is "+ name + " " + "Address is " + address);
    }


    public static void studentInformation(String stName, String stAddress) {  // Non Return Method with Parameter:
        String name = stName;
        String address = stAddress;
        System.out.println("Student name is " + name + " " + "Address is " + address);

        }



    public static void main(String[] args) {
        method.doAddition();
        method.doMultiply(20, 20);
        method.studentInfo();
        method.studentInformation("John", "Address");
    }

}
