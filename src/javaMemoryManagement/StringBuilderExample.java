package javaMemoryManagement;

public class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("John"); // WE WANT TO MAKE IT: Johnathan
        sb.append("athan"); // append basically concatenate -- once any String is appended then it becomes an Object(stored in Heap)
        System.out.println(sb); // now prints --> Johnathan

        sb.append(123);
        System.out.println(sb); // Johnathan123

        // append(); always add the appended value to the end of the String and keep building upon all the changes after that.

        sb.reverse();
        System.out.println(sb); // 321nahtanhoJ
        // reverse(); method from the StringBuilder Class also reverses the String you passed in.


    }
}
