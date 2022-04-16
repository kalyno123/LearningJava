package oop_principles.encapsulation;

public class Employee {

    //DEFAULT CONSTRUCTOR
    public Employee(){

    }

    /* DEFINE INFO BELOW AND ENCAPSULATE THEM:
    FULLNAME
    AGE
    ADDRESS
    PHONE
    */

    //INSTANCE VARIABLE
    private final static int totalEmployees = 10; // cannot change due to 'final' and not directly accessible outside this class due to 'private'
    private String fullName;
    private int age;
    private String address;
    private String phone;

    //CREATING METHOD TO GET INFO
    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //OVERRIDE TO STRING METHOD
    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }







}
