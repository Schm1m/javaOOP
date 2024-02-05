//////////////////////////////////
// basic inheritance of classes //
//////////////////////////////////

/**
 * define the Customer class, extending the class Person.
 * when creating an Customer object you should create a Person as well, so you
 * can access the according attributes as well.
 * the output should match the content of output.log
 * 
 * see /structures/class.java for help on how to create a class
 */

public class task {
    public static void main(String[] args) {
        Customer simon = new Customer("Simon", 23, "Heilbronn");
        Customer micheal = new Customer("Michael", 21, "Karlsruhe");
        Customer claudia = new Customer("Claudia", 30, "Nagold");
        simon.do_business(230);
        simon.do_business(400);
        claudia.do_business(1000);
        micheal.do_business(199);
        simon.do_business(3.99);
        simon.print();
        micheal.print();
        claudia.print();
    }
}

class Person {
    protected String name;
    private int age = 0;

    Person(String name) {
        this.name = name;
    }

    public void setAge(int input) {
        age = input;
    }

    public int getAge() {
        return age;
    }

    public void print() {
        String retAge = age == 0 ? "undefined" : Integer.toString(age);
        System.out.println("Person: " + name + ", age: " + retAge);
    }
}

// define class customer which extends Person