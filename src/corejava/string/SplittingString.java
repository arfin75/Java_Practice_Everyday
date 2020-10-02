package corejava.string;

public class SplittingString {

    /**
     * This allows the programmer to split the String on the basis of a regular expression.
     * This, in simple terms, means that the String will be split on a particular pattern that
     * we can give to the split() function built into the String class. The function will return
     * a String array with elements separated on the basis of the expression given.
     */

    public static void main(String[] args) {
        String greet = "Hello World,My name is Waldo,How are you?";
        String[] greetings = greet.split(",");
        System.out.println(greetings[0]);
        System.out.println(greetings[1]);
        System.out.println(greetings[2]);

    }
}
