package oop_principles.encapsulation;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {

    /* TASK 1:
    Write a program that asks an employee to enter their information age, address and fullName
    Test Data:
    fullName = Alex Robert
    address = 1234 Abc St, Chicago IL 12345
    age = 32
    Print "Alex Robert is in the club" if user is from Chicago and age is more than 21
    Print "Alex Robert is not in the club" otherwise
    EXPECTED OUTPUT:
    Alex Robert is in the club
    */

        Scanner scan = new Scanner(System.in);
        Employee employee1 = new Employee();

        System.out.println("Please enter your full name");
        employee1.setFullName(scan.nextLine());

        System.out.println("Please enter your age");
        employee1.setAge(scan.nextInt());

        System.out.println("Please enter your address");
        scan.nextLine(); // extra space collector
        employee1.setAddress(scan.nextLine());

        //System.out.println(employee1);

        if (employee1.getAddress().toLowerCase().contains("chicago") && employee1.getAge() > 21){
            System.out.println(employee1.getFullName() + " is in the club.");
        }
        else {
            System.out.println(employee1.getFullName() + " is not in the club.");
        }





    }
}
