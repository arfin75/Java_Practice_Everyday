package corejava.string;

public class SubString {
    /**
     * This method allows the programmer to extract substrings from given Strings,
     * i.e., you can take out a part of an existing String as a new String. The method
     * that allows this functionality is called substring, and it works in two ways.
     */

    public static void main(String[] args) {

        String choice = "CoffeeOrTea";

        // First: only one argument
        System.out.println(choice.substring(8));

        // Second: Two argument
        System.out.println(choice.substring(0, 6));



    }
}
