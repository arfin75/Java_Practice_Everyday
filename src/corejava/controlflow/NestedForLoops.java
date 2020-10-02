package corejava.controlflow;

public class NestedForLoops {
    /** Nesting means including one for loop in another for loop.
     * Syntax:
     * for (expression for initialization ; expression for testing ; expression for updating ) {
     * for (expression for initialization ; expression for testing ; expression for updating) {
     *       //body
     *    }
     *    //body
     * }
     */
    public static void main(String[] args) {

        int input = 3;
        System.out.println("How many miles do you want to run?");
        System.out.println("I will run " + input + "miles");

        for (int i = 0; i < input; i++){ //outer for loop
            for (int j = 3; j > 0; j--) {
                System.out.println(j + " ");
            }
            System.out.println("Running" + (i + 1) + "Start");
        }
        System.out.println("Running Start");

    }
}
