package methods;

public class UnderstandingMethods {
    public static void main(String[] args) {

        /*
        println() method is invoked (called).
        this method belongs to System, that is why it is invoked with the System class name.
        this method has a task of printing the variable given in its parenthesis (arguments/parameters).
         */
        System.out.println("My name is Kaly Ngo");

        Math.max(5, 10); // 5 and 10 are the arguments; it meets the parameters(rules) of the max() method

        // use command and click on the method to see/read its' about info.

        Introduction.introduce("Kaly Ngo", "Programmer", 25, "Java");
        Math.max(4,5); // <--- just like the max() method has arguments the method you create will need to as well.

            System.out.println("My name is John Doe");
            System.out.println("I am a programmer");
            System.out.println("I am 25 years old");
            System.out.println("I like Java");

            // WHEN YOU CREATE A METHOD IT SHOULD BE REUSABLE ... USED MORE THAN ONCE.

    }
}
