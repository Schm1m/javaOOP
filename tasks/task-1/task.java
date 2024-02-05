///////////////////////////
// basic class structure //
///////////////////////////

/**
 * define the Rectangle class accordingly so it takes one or two arguments,
 * stores them and is able to print the rectangle.
 * if only one argument is given, both sides of the rectangle should be the same
 * length.
 * the output should match the content of output.log
 * 
 * see /structures/class.java for help on how to create a class
 */

public class task {
    public static void main(String[] args) {
        System.out.println("x = 2, y = 5:");
        Rectangle one = new Rectangle(2, 5);
        one.print();

        System.out.println("x = 5, y = 7:");
        Rectangle two = new Rectangle(5, 7);
        two.print();

        System.out.println("x = 6:");
        Rectangle three = new Rectangle(6);
        three.print();
    }
}

class Rectangle {
    // define class structure in here
}
