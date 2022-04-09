package javaMemoryManagement;

public class StringExample {
    public static void main(String[] args) {

        //!st WAY TO CREATE A STRING:
        String name1 = "John";

        //2ND WAY TO CREATE A STRING:
        String name2 = new String("Alex");

        String name3 = "Alex";
        String name4 = "John";

        //WHEN COMPARING STRINGS DO *NOT* USE == OPERATION ALWAYS USE EQUALS();
        System.out.println(name1 == name4); // true
        System.out.println(name2 == name3); // false --> false bc name2 is an Object ... so it's got stored in the Heap. While name3 was stored in the Stack.
        System.out.println(name2.equals(name3)); // true
        // == compare their location meanwhile equal is comparing item not stored in the same location

        /*
        for (int i = 0; i < 1000; i++) {
            String name = new String("Kaly"); -- 1000 objects will be created and referenced 1000x
            String name = String("Kaly"); -- only one Kaly is created and 1000x will reference that one Kaly
        }
        */


    }
}
