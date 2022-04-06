package loops.nestedLoops;

public class UnderstandingNestedLoops {
    public static void main(String[] args) {

        //NESTED (FOR) LOOPS:
        for (int i = 1; i <= 5; i++){
            System.out.println(i); // 1

            for (int j = 1; j <= 3; j++){
                System.out.println("\t" + j); // 1 2 3
            }
        }
    // for each iteration of the outer loop, it will run all iteration of the inner loop before updating to the next iteration of the outer loop




    }
}
