package basics;

public class AccessModifier {

    // Access Modifier/ Access Specifier: class,variable,method
    // Private: only we can call or use within the class where it is located.
    // Public: we can call or use within the class where it is located and from any
    // other class.
    // Protected: only accessible from all the class of that particular package.

    // Access modifier:

    // Public
    // Private
    // Protected
    // Default

    public String name = "James";
    private String address = "Queens,NY";
    protected String contactNumber = "89798793223";
    int num = 21;


    protected void display() {
        System.out.println("We are learning Access Modifier");
    }

    public static void main(String[] args) {

        int num1 = 20;
        System.out.println(num1);//20
        num1 = 25;
        System.out.println(num1);//25

    }


}


