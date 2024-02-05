package structures;

////////////////
// interfaces //
////////////////

/**
 * an interface is like a class, but you cant create an object from an
 * interface.
 * every function, defined in an interface must be overridden by the class
 * implementing it.
 */
interface exampleInterfaceOne {
    public void increase();
}

/**
 * methods implemented in interfaces are only declared but not defined. so the
 * dont have a body, only the structure of the method is declared
 */
interface exampleInterfaceTwo {
    public void decrease();

    /**
     * default methods however can have a body. they dont need to be overridden.
     */
    public default void defaultMethod() {
        // ...
    }
}

/**
 * a class can implement any number of interfaces, but it can only inherit from
 * one class.
 * Also it can implement and inherit at the same time. this would look like
 * something like this:
 * class <classname> extends <classname> implements <interface>, <interface>...
 */
class exampleClass implements exampleInterfaceOne, exampleInterfaceTwo {
    @Override
    public void increase() {
        // ...
    }

    @Override
    public void decrease() {
        // ...
    }
}