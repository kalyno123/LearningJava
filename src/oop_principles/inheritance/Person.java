package oop_principles.inheritance;

public class Person {

    //DEFAULT CONSTRUCTOR
    public Person(){

    }

    //CUSTOM 4-ARGS CONSTRUCTOR
    public Person (String fName, String lName, int age, String gender) {
        // this(fName, lName, age, gender); --> ask about this
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.gender = gender;
    }

    //INSTANCE VARIABLE
    public String fName;
    public String lName;
    protected int age;
    protected String gender;
    double weight;
    double height;
    private String DOB; // can start with upper?
    private String SNN;


    //METHODS
    public void sleep(){
        System.out.println("Person sleeps");
    }

    public void learn(){
        System.out.println("Person learns");
    }

    public void walk(){
        System.out.println("Person walks");
    }

    public void eat(){
        System.out.println("Person eats");
    }


    // GETTER & SETTER METHODS
    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSNN() {
        return SNN;
    }

    public void setSNN(String SNN) {
        this.SNN = SNN;
    }


    // OVERRIDE toString();
    @Override
    public String toString() { // OR CAN BE: this.getClass().getName().substring(this.getClass().getName().indexOf("."))
        return  this.getClass().getSimpleName() + "{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", DOB='" + DOB + '\'' +
                ", SNN='" + SNN + '\'' +
                '}';
    }
    // this.getClass().getSimpleName() --> edited the default so its more dynamic across all other Classes that is extended from this Class





}
