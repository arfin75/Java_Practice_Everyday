package corejava.string;

public class ComparingString {

    /**
     * The String class has an in-built function called equals() for this operation.
     * The method returns true if the two Strings are identical and false if they aren’t.
     * The function is case-sensitive, as can be seen in the code snippet below.
     * @param args
     */

    public static void main(String[] args) {

        String one = "HELLO";
        String two = "WORLD";
        String lower = "hello";
        String same = "HELLO";

        System.out.println(one.equals(same));
        System.out.println(two.equals(lower));
        System.out.println(lower.equals(one));
        System.out.println(same.equals(one));


    }
}

