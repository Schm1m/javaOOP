package structures;

///////////////////////////
// basic class structure //
///////////////////////////

class exampleClass {
    //////////////////////
    // class attributes //
    //////////////////////

    /**
     * if you declare a class`s variable as public, you can access it from anywhere.
     * i.e. you could just change its value outside of the class with "one = 1;".
     * 
     * you rarely define class variables as public, as the class is typically used
     * to manage these properties so access from the outside often does not make
     * sense
     */
    public int one;

    /**
     * if you declare a class`s variable as private, only this class can access it.
     * 
     * this is the most commonly used modifier for variables in classes.
     */
    private int two;

    /**
     * if you declare a class´s variable as protected, only this class and
     * subclasses can access it.
     * 
     * this modifier is used to give subclasses access to these variables. so if
     * your second class is inheriting from this class, it has access to there
     * variables.
     */
    protected int three;

    /**
     * if you declare a class´s variable as static, this variable is the same for
     * all class objects.
     * 
     * so if you decide to create a second class object of this class, "four" would
     * always be the same in every class object of class exampleClass. if you change
     * it in one object, it changes for all of them.
     */
    static String four;

    ////////////////////////
    // class constructors //
    ////////////////////////

    /**
     * to create a class object, you call its constructor, the constructor always
     * looks like a function with the name of the class itself.
     * 
     * inside the body of the constructor you can execute code like in any other
     * block, as seen below.
     */
    public exampleClass() {
        this.one = 1;
    }

    /**
     * you can also define parameters for a constructor.
     * if multiple constuctors are present, the one with matching arguments (inputs)
     * is used.
     * 
     * if no constructor is present, a default constructor is used to create an
     * class object, but no values will be assigned
     * 
     * @param input an input value
     */
    public exampleClass(int input) {
        this.two = input;
    }

    /////////////////////
    // class functions //
    /////////////////////

    /**
     * defining class functions
     * <access modifier> <return type> <method name>(<arguments>) {}
     * 
     * access modifiers: [ public | private | protected ]
     * return types: [ void | int | String | ... ]
     */

    /**
     * this is a typical getter method. it only returns a value stored in the class
     * object. to use it you call (object).getOne() on your class object.
     * 
     * @return one
     */
    public int getOne() {
        return one;
    }

    /**
     * this is a typical setter method. it takes at least one argument an sets
     * values accordingly
     * 
     * @param input
     */
    public void setTwo(int input) {
        two = input;
    }

    public void doubbleFirst() {
        one += one;
    }
}

/**
 * to create a sub-class, the "extends" keyword is used in the class
 * declaration.
 * the subclass inherits everything from the super class that is not defined as
 * private
 */
class exampleClassTwo extends exampleClass {
    private int zero;

    /**
     * when creating a subclass object, sometimes its necessary to create the super
     * classes object.
     * this is done with the super() method, which calls the super classes
     * constructor.
     */
    public exampleClassTwo() {
        super(2);
        this.zero = 0;
    }

    /**
     * if you want to change a method, already defined in the super class, you
     * annotate it with @override
     */
    @Override
    public void doubbleFirst() {
        zero += zero;
    }
}