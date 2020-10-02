package corejava.basics;

public class SwitchStatement {
    /**
     * The switch statement is very similar to the if-else if statement.
     * The only difference is that the switch case construct only uses int,
     * short values, and character constants or character literals. For this
     * reason, the switch-case can come in handy, but it is limited to these
     * circumstances.
     */
    public static void main(String[] args) {
        int x = 2;
        int temp;

        switch (x) {
            case 1:
                temp = 1;
                break;
            case 2:
                temp = 2;
                break;
            case 3:
                temp = 3;
                break;

                default:
                temp = 4;
                break;
        }

        System.out.println("Value of temp: " + temp);
    }
}
