package oop_principles.inheritance;

import oop_principles.package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {

    System.out.println("\n--------TASK 1---------\n");
    /* TASK 1:
    GIVE FNAME, LNAME, AGE, GENDER, DOB, SSN TO ALL OF THE OBJECTS BELOW INFO:
    Person 1: John Doe, 45, Male, 01/01/1977, 000-00-0000
    Tester 1: Abe Kim, 20, Male, 01/12/2002, 111-11-1111
    Singer 1: Kaly Ngo, 15, Female, 05/10/2007, 222-22-2222
    Dancer 1: Alona Q, 15, Female, 10/10/2007, 333-33-3333
    */
        Person person1 = new Person();
        person1.setfName("John Doe");
        person1.setAge(45);
        person1.setGender("Male");
        person1.setDOB("01/01/1977");
        person1.setSNN("000-00-0000");

        Tester tester1 = new Tester();
        tester1.setfName("Abe Kim");
        tester1.setAge(20);
        tester1.setGender("Male");
        tester1.setDOB("01/12/2002");
        tester1.setSNN("111-11-1111");

        Singer singer1 = new Singer(); // this Singer Class must be imported since it comes from another package
        singer1.setfName("Kaly Ngo");
        singer1.setAge(15);
        singer1.setGender("Female");
        singer1.setDOB("05/10/2007");
        singer1.setSNN("222-22-2222");

        Dancer dancer1 = new Dancer();
        dancer1.setfName("Alona Q");
        dancer1.setAge(15);
        dancer1.setGender("Female");
        dancer1.setDOB("10/10/2007");
        dancer1.setSNN("333-33-3333");

        System.out.println(person1);
        System.out.println(tester1);
        System.out.println(singer1);
        System.out.println(dancer1);

    System.out.println("\n--------TASK 2---------\n");
    /* TASK 2:
    Give a fName, lName, age, gender, DOB and SSN to all the objects below:
    Person 2: Jane Doe, 45, Female, 01/01/1977, 555-55-5555
    Tester 2: Yung Kim, 20, Male, 01/12/2002, 777-77-7777
    Singer 2: Jessie J, 15, Female, 05/10/2007, 666-66-6666
    Dancer 2: B Q, 15, Female, 10/10/2007, 999-99-9999
    */
        Person person2 = new Person("Jane", "Doe", 45, "Female");
        person2.setDOB("01/01/1977");
        person2.setSNN("555-55-5555");
        Tester tester2 = new Tester("Yung", "Doe", 20, "Male");
        person2.setDOB("01/12/2002");
        person2.setSNN("777-77-7777");
        Singer singer2 = new Singer("Jessie", "J", 15, "Female");
        person2.setDOB("05/10/2007");
        person2.setSNN("666-66-6666");
        Dancer dancer2 = new Dancer("B", "Q", 15, "Female");
        person2.setDOB("10/10/2007");
        person2.setSNN("999-99-9999");

        System.out.println(person2);
        System.out.println(tester2);
        System.out.println(singer2);
        System.out.println(dancer2);

        System.out.println("\n--------Person ArrayList---------\n");
        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(tester1);
        people.add(singer1);
        people.add(dancer1);

        for (Person element : people){
            System.out.println(element);
        }

        System.out.println("\n--------Person ArrayList Using forEach Method---------\n");
        people.forEach(element -> System.out.println(element)); // OR CAN BE: people.forEach(System.out::println);


        System.out.println("\n--------Methods---------\n");
        tester1.code();
        dancer1.dance();
        singer1.sing();




    }
}
