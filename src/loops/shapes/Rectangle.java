package loops.shapes;

public class Rectangle {
    public static void main(String[] args) {
    /*
        * * * * * *
        *         *
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *
    */

    for (int i = 1; i <= 8; i++)
        if (i == 1 || i == 8) System.out.println("* * * * * *"); // when 'i' is 1 and 8 this will print
        else System.out.println("*         *");
    }
}
