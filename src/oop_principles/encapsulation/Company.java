package oop_principles.encapsulation;

public class Company {

    // TASK 1: CREATE INSTANCE VARIABLE NAME, ADDRESS, PHONE THEN ENCAPSULATE THEM
    private String name;
    private String address;
    private String phone;

    //^ENCAPSULATED BY SETTING INSTANCE VARIABLE AS PRIVATE AND CREATING PUBLIC SET/GET METHODS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    //TASK 2: OVERRIDE toString(); --> NOTE: @OVERRIDE ANNOTATION IS OPTIONAL
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
