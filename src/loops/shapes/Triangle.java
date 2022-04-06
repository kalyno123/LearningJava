package loops.shapes;

public class Triangle {
    public static void main(String[] args) {
    /* write a program that generates this A-triangle.

      A
      AA
      AAA
      AAAA
      AAAAA

    */

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){ // for each iteration of the outer loop it increases the termination value of the inner loop
                System.out.print("A"); // print(); so A is print all on same line in the inner loop
            } System.out.println(); // println(); with each outer loop iteration it'll move to the next line
        }



    }
}
