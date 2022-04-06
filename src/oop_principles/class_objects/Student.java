package oop_principles.class_objects;

public class Student {

    // TASK 1: INVOKE DEFAULT CONSTRUCTOR.
    public Student(){

    }

    //TASK 2: DEFINE INSTANCE VARIABLE(FIELD) OF STUDENT CLASS
    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String gender;
    public String address;
    public double height;
    public double weight;
    public String email;
    public int id;

    //TASK 3: DEFINE STUDENTS FUNCTIONS/METHODS(BEHAVIORS)
    public void study(){
        System.out.println("Student Studies");
    }

    public void eat(){
        System.out.println("Student Eats");
    }

    public void sleep(){
        System.out.println("Student Sleeps");
    }

    //TASK 4: OVERRIDE toString(); METHOD FROM OBJECT(STUDENT) CLASS
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }







}
