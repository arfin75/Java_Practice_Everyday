package corejava.basics;

public class Casting {
    // Casting converts data types
    // such as primitive data type to primitive
    // non primitive to non primitive

    public static void main(String[] args) {

        double price = 9.99;
        int newPrice = (int) price;
        System.out.println(newPrice);

        int number1 = 10;
        int number2 = 20;
        int number3 = number1;
        int number4 = number2 + number3;
        System.out.println(number4);

        int number=56;
        byte total=(byte) number;
        System.out.println("Int Converting to Byte: " + total);

    }

}
