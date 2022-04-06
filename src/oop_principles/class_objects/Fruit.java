package oop_principles.class_objects;

public class Fruit {

    //DEFINE THE INSTANCE VARIABLES:
    public static boolean hasColor;// CAN ALSO BE: public static boolean hasColor = true; if done this way don't have to have static block.
    static {
        System.out.println("This is static block");
        hasColor = true;
    }
    // if assigning in a static block then must declare instance variable first. HOWEVER, if assigning(initializing) in the instance variable then don't have to have static block.
    //Static instance variable can be initialized inside the non-static block. HOWEVER, non-static instance variable CANNOT be initialized inside static block.

    public String name;
    public String shape;
    public boolean isSweet;
    {
        System.out.println("This is instance block");
        shape = "Round";
        isSweet = true;
        //hasColor = true; CAN BE INITIALIZED HERE
    }

    public static void main(String[] args) {
        Fruit fruit1 = new Fruit();

        System.out.println(Fruit.hasColor);
        System.out.println(fruit1.name);
        System.out.println(fruit1.shape);
        System.out.println(fruit1.isSweet);

    }





}
