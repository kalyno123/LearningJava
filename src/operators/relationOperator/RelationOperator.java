package operators.relationOperator;

public class RelationOperator {
    public static void main(String[] args) {

        int a = 4;
        int b = 10;

        boolean isAEqualToB = a==b; // a is equal to b --> false
        boolean isANotEqualToB = a != b; // a is NOT equal to b --> true

        System.out.println("a = b : " + isAEqualToB);
        System.out.println("a != b : " + isANotEqualToB);

        boolean isAGreaterThanB = a > b; // false
        boolean isASmallerThanB = a < b; // true
        boolean isAGreaterOrEqualToB = a >= b; // false
        boolean isASmallerOrEqualToB = a <= b; // true

        System.out.println("a > b : " + isAGreaterThanB);
        System.out.println("a < b : " + isASmallerThanB);
        System.out.println("a >= b : " + isAGreaterOrEqualToB);
        System.out.println("a <= b : " + isASmallerOrEqualToB);



    }
}
