package corejava.controlflow;

public class DoWhileLoop {

    /**
     * The do-while loop is nearly identical to the while loop,
     * but instead of checking the conditional statement before the loop starts,
     * the do-while loop checks the conditional statement after the first run,
     * then continuing onto another iteration if the condition is true.
     *
     * syntax while loop and do while loop:
     * while (con.) {
     *     body goes here
     * }
     * do{
     *     body
     *     i++
     * } while (con.) {
     *     body goes here
     * }
     */

    public static void main(String[] args) {

        int number = 5;

        do {
            System.out.println("Value of number is: " + number);
            number++;
        } while (number <=9);

    }
}
