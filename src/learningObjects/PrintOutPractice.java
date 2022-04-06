package learningObjects;

public class PrintOutPractice {
        public static void main(String [] args){

            char capitalH = 'H';
            char e = 'E';
            char l = 'L';
            char o = 'O';

    //      THIS IS THE LONG WAY:
            System.out.println(capitalH);
            System.out.println(e);
            System.out.println(l);
            System.out.println(l);
            System.out.println(o);

    //      THIS IS THE FASTER WAY:
            String greetings = "Hello";
            System.out.println("\n" + greetings);

            System.out.println(capitalH + e + l + l + o); // 72 + 101 + 108 + 108 + 111 = 500
            System.out.println("" + capitalH + e + l + l + o); /*NOW WHEN EXECUTED IT WILL READ Hello DUE TO JAVA
            READING FROM LEFT TO RIGHT AND TAKE THE DOUBLE QUOTATION AS DOMINATE DATA TYPE CONVERTING THE REST OF THE VALUES INTO STRING*/
            System.out.println(capitalH + e + l + l + o + ""); // THIS WILL RUN AS 500

            int valueOfCapitalH = 'H';
            int capitalHNumber = 72;

            System.out.println(capitalH); // H
            System.out.println(valueOfCapitalH); // 72
            System.out.println(capitalHNumber); // 72


    //      example to show you can change the value once instead of multiple times
            String studentName = "Kaly"; // <-- can switch value of Kaly to Diana, Regina, etc.
            System.out.println(studentName + " is coding.");
            System.out.println(studentName + " is sleeping.");
            System.out.println(studentName + " is eating.");


        }
}
