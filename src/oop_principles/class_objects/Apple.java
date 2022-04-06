package oop_principles.class_objects;

public class Apple {
// COMMAND CLICK ON THE OBJECT TO SEE ITS CONNECTION IN OTHER CLASSES

    /*
    CLASS MEMBERS:
    1. ATTRIBUTES -- Every class has its attributes; Attributes are known as instance variables or fields.
    2. METHOD -- Every class has its attributes methods; Methods are functions of that class.
    3. BLOCKS
    4. CONSTRUCTOR -- this is how you are able to create an object.
        NOTE: whenever you invoke a constructor to create an object the block of code will be executed.
    */

    // this is default constructor -- THIS IS HIDDEN IN THE BACKGROUND -- starts at empty/zero/executes-nothing
    public Apple(){
        // no block of codes in the body of the default constructor (OPTIONAL)
    }

    // Define instance variable:
    public String color;
    public String taste;
    public double price;

    // one arg constructor -- this one must be created due to having args.

    /* this is custom. if you make a custom object w/ args then the default constructor will be eliminated.
    if you want to utilize the default constructor then you'll have to create the default yourself(reveal it).
    if custom is created with args then you can't invoke the object and leave empty args. */

    // by creating the toString(); method able to print it in main method class and not just print location
    public String toString(){
        return "Apple{color=" + color + ", taste=" + taste + ", price=" + price + "}";
    }








}
