package operators.incrementAndDecrementOperators;

public class Exercise123 {
    public static void main(String[] args) {

        int i = 5;
        int age = 10 * i++; // 10 * 5 = 50 since it is post the value will change in the next (i) when used new value=6
        System.out.println(age); // 50

        age = 10 * i; // new value of (i) used here is 6; next value whole increase by 1 bc didnt increment again
        System.out.println(age); // 60

        age = 10 * i; // value of (i) used here is still 6 OR IF IT IS -- > int age = 10 * i IT'LL BE 60
        System.out.println(age); // 60

        age = 10 * ++i; // new value of (i) used here is 7; value increase by 1 bc it was incremented previously
        System.out.println(age); // 70




    }
}
