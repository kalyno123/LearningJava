package loops.nestedLoops;

public class Practice1 {
    public static void main(String[] args) {

        // SEPARATED LOOPS STATEMENTS:
        for (char i = 'a'; i <= 'z'; i++){ // can also be for (int i = 97; i <= 122; i++)
            System.out.print(i); // can also be ((char) i) -- explicit casting id done here to convert int to char
        }

        for (char j = 'A'; j <= 'Z'; j++){
            System.out.print(j);
        }
        // both loops run 26 times individually
        System.out.println("\nEND OF THE PROGRAM");


        // NESTED LOOPS STATEMENTS:
        for (int i = 1; i <= 2; i++) {// OUTER LOOP
            int start = 97; // 'a'
            if(i == 1){//at this point it is the first iteration; start point = 97 | end = 122 --> (start+25)
                System.out.println("Lowercase Letters");
            }else {//at this point it is the second iteration; start point = 65 | end = 90
                System.out.println("Uppercase Letters");
                start = 65; // start is reassigned here
            }
            for (int j = start; j <= start+25; j++) {// INNER LOOP -- this loop will run completely for each iteration of the outer loop
                System.out.println((char)j);
            }
        }// the if-else statement here is mainly to printout messages
        System.out.println("\nEND OF THE PROGRAM");




    }
}
