package javaMemoryManagement;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;
        System.out.println(age); // 45

        //left-side of the equation is known as Reference (DOG) and the right-side of the equation is known as Object (DOG1).
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        System.out.println(dog1); // javaMemoryManagement.Dog@1540e19d --> right now its printing location. dog1, dog2, dog3 are reference variable
        System.out.println(dog2); // so, it is stored in the Stack space. While Dog is an Object so, it is stored in the Heap space.
        System.out.println(dog3);








    }
}
