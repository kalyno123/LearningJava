package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        System.out.println("\n-----T1-T3 ATTRIBUTES OF EACH STUDENTS------\n");
    /* TASK 1:
    CREATE A STUDENT OBJECT WITH BELOW DATA. THEN PRINT IT:
    FIRSTNAME = JOHN
    LAST NAME = DOE
    AGE = 45
    DATE OF BIRTH = 01/01/1977
    GENDER = MALE
    ADDRESS = CHICAGO
    WEIGHT = 170.5
    HEIGHT = 5.7
    EMAIL = JOHNDOE@GMAIL.COM
    ID = 1001
    */
        Student student1 = new Student();
        student1.firstName = "John";
        student1.lastName = "Doe";
        student1.age = 45;
        student1.dateOfBirth = "01/01/1977";
        student1.gender = "Male";
        student1.address = "Chicago";
        student1.weight = 170.5;
        student1.height = 5.7;
        student1.email = "johndoe@gamil.com";
        student1.id = 1001;

        System.out.println(student1);// Student{firstName='John', lastName='Doe', age=45, dateOfBirth='01/01/1977',
        // gender='male', address='Chicago', height=5.7, weight=170.5, email='johndoe@gamil.com', id=1001}

    /* TASK 2:
    CREATE ANOTHER STUDENT OBJECT WITH BELOW DATA. THEN PRINT IT:
    FIRSTNAME = LIONEL
    LAST NAME = MESSI
    AGE = 34
    DATE OF BIRTH = 01/01/1988
    GENDER = MALE
    ADDRESS = PARIS
    WEIGHT = 150
    HEIGHT = 4.9
    EMAIL = LIONEL@GMAIL.COM
    ID = 1002
    */
        Student student2 = new Student();
        student2.firstName = "Lionel";
        student2.lastName = "Messi";
        student2.age = 34;
        student2.dateOfBirth = "01/01/1988";
        student2.gender = "Male";
        student2.address = "Paris";
        student2.weight = 150;
        student2.height = 4.9;
        student2.email = "lionel@gamil.com";
        student2.id = 1002;

        System.out.println(student2);

    /* TASK 3:
    Create 3 more Student object with below information. Then, print the objects.
    firstName = Alex, Jessie, Kaly
    lastName = Morgan, Smith, Ngo
    age = 20, 15, 16;
    dateOfBirth = 01/01/2002 - 01/01/2007 - 01/01/2006
    gender = male, female, female
    address = Chicago, Miami, Berlin
    weight = 165, 160, 150
    height = 5.5, 5.7, 5.3
    email = alex@gmail.com, jessie@gmail.com, kaly@gmail.com
    id = 1003, 1004, 1005
    */
        Student student3 = new Student();
        student3.firstName = "Alex";
        student3.lastName = "Morgan";
        student3.age = 20;
        student3.dateOfBirth = "01/01/2002";
        student3.gender = "Male";
        student3.address = "Chicago";
        student3.weight = 165;
        student3.height = 5.5;
        student3.email = "alex@gamil.com";
        student3.id = 1003;
        System.out.println(student3);

        Student student4 = new Student();
        student4.firstName = "Jessie";
        student4.lastName = "Smith";
        student4.age = 15;
        student4.dateOfBirth = "01/01/2007";
        student4.gender = "Female";
        student4.address = "Miami";
        student4.weight = 160;
        student4.height = 5.7;
        student4.email = "jessie@gamil.com";
        student4.id = 1004;
        System.out.println(student4);

        Student student5 = new Student();
        student5.firstName = "Kaly";
        student5.lastName = "Ngo";
        student5.age = 16;
        student5.dateOfBirth = "01/01/2006";
        student5.gender = "Female";
        student5.address = "Berlin";
        student5.weight = 150;
        student5.height = 5.3;
        student5.email = "kaly@gamil.com";
        student5.id = 1005;
        System.out.println(student5);

        System.out.println("\n-----T4 COUNT OF STUDENTS FROM CHICAGO------\n");
    /* TASK 4:
    COUNT HOW MANY STUDENTS ARE FROM CHICAGO
    RESULT: 2
    */
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        int countChi = 0;
        for (Student element : students){
            if (element.address.equalsIgnoreCase("Chicago")) countChi++;
        }
        System.out.println(countChi); // 2

        System.out.println("\n-----T5 COUNT OF STUDENTS GENDERS------\n");
    /* TASK 5:
    COUNT HOW MANY STUDENTS ARE MALE AND FEMALE
    RESULT: MALE = 3 FEMALE = 2
    */
        int countMale = 0, countFemale = 0;
        for (Student element : students){
            if (element.gender.equalsIgnoreCase("male")) countMale++; // OR CAN BE: element.gender.toLowerCase.startsWith("m") countMale++;
            else if (element.gender.equalsIgnoreCase("female")) countFemale++;
        }
        System.out.println("Male = " + countMale); // 3
        System.out.println("Female = " + countFemale); // 2; OR CAN BE: ("Female = " + (students.size() - countMale));

        System.out.println("\n-----T6 COUNT OF TEEN STUDENTS------\n");
    /* TASK 6:
    COUNT HOW MANY STUDENTS ARE TEENAGERS
    RESULT: 2
    */
        int countTeens = 0;
        for (Student element : students){
            if (element.age >= 13 && element.age <= 19) countTeens++;
        }
        System.out.println(countTeens);

        System.out.println("\n-----T6 STUDENTS INFO IN SEPARATE LINES------\n");
    /* TASK 7;
    PRINT ALL INFO OF EACH STUDENT IN SEPARATE LINES.
    */
        for (Student element : students){
            System.out.println(element.firstName);
            System.out.println(element.lastName);
            System.out.println(element.age);
            System.out.println(element.dateOfBirth);
            System.out.println(element.gender);
            System.out.println(element.address);
            System.out.println(element.height);
            System.out.println(element.weight);
            System.out.println(element.email);
            System.out.println(element.id);
            element.eat();
            element.sleep();
            element.study();
        }

        //ANOTHER WAY TO DO THE ABOVE:
        students.forEach(element -> {
            System.out.println(element.firstName);
            System.out.println(element.lastName);
            System.out.println(element.age);
            System.out.println(element.dateOfBirth);
            System.out.println(element.gender);
            System.out.println(element.address);
            System.out.println(element.height);
            System.out.println(element.weight);
            System.out.println(element.email);
            System.out.println(element.id);
            element.eat();
            element.sleep();
            element.study();
        });









    }
}
