package corejava.string;

public class StringCases {

    String greet = "Hello Java";

    public static void main(String[] args) {

        String greetings = "bonjour";

        StringCases obj = new StringCases(); //created object of the class
        System.out.println(obj.greet.toUpperCase());
        System.out.println(obj.greet.toLowerCase());

        System.out.println(greetings.length());


    }
}
