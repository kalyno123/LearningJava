package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    /* VECTOR: is synchronized ArrayList .. synchronized = thread-safe
    thread .. single thread -- multiple thread .. executing multiple codes at the same time but VECTOR(is thread-safe)
    which means it waits for certain codes to complete first implicitly before running so there's fewer issues.
    */

    // SINCE CLASS IS JUST A TEMPLATE/BLUEPRINT THIS MEANS THAT ORDER (TOP-DOWN/LEFT-RIGHT) DOESN'T MATTER.
    // HOWEVER A CONVENTION THAT JAVA CODERS FOLLOWS IS 1)CONSTRUCTORS 2)INSTANCE VARIABLE 3)METHOD(LAST BEING toString())

    // TO DIFFERENTIATE BETWEEN INSTANCE VARIABLE'S DEFAULT VALUES AND IT ACTUAL VALUES (EX: 0 DEFAULT VS INT 0) CAN ASSIGN THE
    // VALUES FROM 0 TO -1 FOR NON-FLOATING .. 0.0 TO -0.0 FOR FLOATING


    //DEFAULT CONSTRUCTOR:
    public Animal(){

    }

    //CUSTOM CONSTRUCTOR THAT TAKES 6 ARGS:
    public Animal(String name, int age, String color, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore){
        // inside constructor code block should assign local variable into instance variable;
        // if you define which variable is being used then Java will assume/default by using the local variable.
        this.name = name; // "this" keyword is used to reference the instance variable and the variable after the equal sign is referred to the local variable.
        this.age = age; // "this" keyword is defined as current object reference
        this.color = color; // "this" keyword is useful when we have instance variable and method parameter with same name
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
        // name = name1; ---> if args has String name1; then assign like this w/o using "this" keyword if the local variable and instance variable has different names.
    }

    //FIELDS OF AN OBJECT-ANIMAL (when declaring instance order doesn't matter):
    // if final then it cannot be changed and all the objects instantiated from the Class will hold the attribute since its final.
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;
    public static final boolean hasEyes = true;
    // this instance variable is FINAL so cannot be reassigned(changed) -- ALWAYS TRUE.
    // this instance variable is STATIC, so it belongs to the Class; must be invoked with ClassName.

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    /* @Override
    public String toString() {
        String s = "Animal{";
               if(this.name != null) s +=   "name='" + this.name + '\'';
               if(this.color != null) s += ", color='" + this.color + '\'';
               if(this.age != 0) s +=  ", age=" + this.age;
               if(this.isCarnivore) s += ", isCarnivore=" + this.isCarnivore;
               if(this.isHerbivore) s += ", isHerbivore=" + this.isHerbivore;
               if(this.isOmnivore) s += ", isOmnivore=" + this.isOmnivore;
               s += '}';
        return s;
    }
    */




    //TESTING ANIMAL:
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        // animal1.hasEyes = false; --> compiler error as hasEyes is a final instance variable
        // System.out.println(animal1.hasEyes); // true -- since now static but be invoked by ClassName
        System.out.println(Animal.hasEyes); // true

        System.out.println("\n-----TASK 1------\n");
    /* TASK 1:
    Create an animal object called a1 and define its information as below
    Cow
    3
    Black
    Herbivore
    */
        Animal a1 = new Animal(); // defining info can be done in one line if Class Animal has a custom constructor that takes 6 args.
        a1.name = "Cow";
        a1.age = 3;
        a1.color = "Black";
        a1.isHerbivore = true;
        a1.isCarnivore = false;
        a1.isOmnivore = false;
        System.out.println(a1);

        Animal a2 = new Animal("Cow", 3, "Black", true, false,false);
        System.out.println(a2);

        System.out.println("\n-----TASK 2------\n");
    /* TASK 2:
    CREATE A3 OBJECT WITH INFO AND PRINT IT:
    CAT
    1
    GRAY
    OMNIVORE
    */
        Animal a3 = new Animal("Cat", 1, "Gray", false, false, true);
        System.out.println(a3);

        System.out.println("\n-----TASK 3------\n");
    /* TASK 3:
    Create a4 object with below info. Print it as well.
    Parrot
    2
    White
    Herbivore
    */
        Animal a4 = new Animal("Parrot", 2, "White", false, true, false);
        System.out.println(a4);

        System.out.println("\n-----TASK 4------\n");
    /* TASK 4:
    Create a5 object with below info. Print it as well.
    Lion
    4
    Beige
    Carnivore
    */
        Animal a5 = new Animal("Lion", 4, "Beige", true, false, false);
        System.out.println(a5);

        System.out.println("\n-----TASK 5------\n");
    /* TASK 5:
    Store your animal object in a collection. Then count how many herbivore, omnivore and carnivore animal object you have.
    RESULT:
    Herbivore = 2
    Carnivore = 1
    Omnivore = 1
    */
        List<Animal> animals = new ArrayList();
        animals.add(a1);
        animals.add(a3);
        animals.add(a4);
        animals.add(a5);

        int countHerb = 0, countCarni = 0, countOmni = 0;
        for (Animal element : animals){
            if (element.isCarnivore) countCarni++;
            else if (element.isOmnivore) countOmni++;
            else countHerb++; // (element.isHerbivore)
        }
        System.out.println("Herbivore = " + countHerb);
        System.out.println("Carnivore = " + countCarni);
        System.out.println("Omnivore = " + countOmni);

        int herbCount = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carniCount = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omniCount = (int) animals.stream().filter(animal -> animal.isOmnivore).count();
    // putting the elements of the collection into a pipeline and then filter it with a condition and action(function -- what to do with the info)
    // for this example (int) is explicitly cast bc we want it to return int but the count(); returns a long.

        System.out.println("Herbivore = " + herbCount);
        System.out.println("Carnivore = " + carniCount);
        System.out.println("Omnivore = " + omniCount);

    /* ABE'S SOLUTION:
    List<Animal> animals = new ArrayList<>(Arrays.asList(a1,a2,a3,a4)); --> this is creating an Array for each object and converting it into ArrayList
    int countHerb = 0;
    int countCarni = 0;
    int countOmni = 0;
    for (Animal animal : animals) {
        if(animal.isOmnivore) countOmni++;
        else if(animal.isHerbivore) countHerb++;
        else countCarni++;
    }
    System.out.print("Herbivore = " + countHerb + " Carnivore = " + countCarni + " Omnivore = " + countOmni);
    */






    }

}
