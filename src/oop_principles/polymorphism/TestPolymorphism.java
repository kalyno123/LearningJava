package oop_principles.polymorphism;

public class TestPolymorphism {
    public static void main(String[] args) {

        System.out.println("\n-----Animal Object in Animal form------\n");
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        System.out.println("\n-----Dog Object in Dog form------\n");
        Dog d1 = new Dog();
        d1.eat();
        d1.sleep();
        d1.sleep(5);
        d1.bark();

        System.out.println("\n-----Dog Object in Animal form------\n");
        Animal a2 = new Dog(); // Animal is the bigger umbrella while Dog is more specific --> this is UP-CASTING
        // Up-casting: when reference is type of parent, but object is child. Up-casting happens implicitly.
        a2.sleep(); // Dog sleeps
        a2.eat(); // Dog eats
        a2.eat("food"); // Animal eats food
        //a2.bark(); compiler error -- this method isn't available in the Animal form
        // WHEN YOU INSTANTIATE AN OBJECT FROM A SUPERCLASS THEN YOU CAN ONLY USE THE CLASS MEMBERS FROM THAT SPECIFIC CLASS ONLY
        // EX: Dog(); Object is being created from Animal Class, so it takes the form of its parent Animal

        // until it iS ran compiler associates the Object Dog with parent Animal
        // HOWEVER, ONCE IT IS EXECUTED THE RUNTIME GRABS THE OBJECT BEING REFERENCE FROM THE HEAP AND WILL RETURN THE PROPER ASSOCIATED VALUE
        // THAT'S WHY IT PRINTS OUT DOG SLEEP AND DOG EATS AS OPPOSED TO ANIMAL SLEEPS ANIMAL EATS






    }
}
