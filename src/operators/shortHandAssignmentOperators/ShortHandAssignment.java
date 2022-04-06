package operators.shortHandAssignmentOperators;

import java.sql.SQLOutput;

public class ShortHandAssignment {
    public static void main(String[] args) {

        int age = 5;
        System.out.println(age);

        age = age + 3; // reassigned value now age = 8 bc 5 + 3
        age += 3; // <-- this is called shorthand assignment
        System.out.println(age);

        age -= 2; // equals 6 bc 8-2
        System.out.println(age);

        age *= 2; // equals 12 bc 6*2
        System.out.println(age);

        age /= 2; // equals 6 bc 12/2
        System.out.println(age);

        age %= 3; // equals 1 bc
        System.out.println(age);

    }
}
