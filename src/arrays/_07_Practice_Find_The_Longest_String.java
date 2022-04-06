package arrays;

public class _07_Practice_Find_The_Longest_String {
    public static void main(String[] args) {

        System.out.println("\n-------TASK-1-------\n");
    /* TASK 1:
    Find the string that has the most characters and print it
    RESULT:
    yellow
    */
        String[] colors = {"red", "blue", "yellow", "white"};

        System.out.println("\n---------TASK-1 for-i loop----------\n");
        int index = 0; // initialing index of the longest element
        int maxLength = colors[0].length(); //initializing a maxLength to 0 so String don't have negative length
        // then loop through the array
        for(int i = 1; i < colors.length; i++) {
            // compare the element of each iteration to the maxLength and update when needed
            if(colors[i].length() > maxLength) {
                index = i; // index reassign to the number of iteration loop is in
                maxLength = colors[i].length(); // maxLength reassigned to the current longest element of from each iteration
            }
        }
        System.out.println(colors[index]); // printing the longest element at the matching index of the array


        System.out.println("\n---------TASK-1 for-each loop----------\n");

        String longest = colors[0];

        for (String color : colors) {
            if(color.length() > longest.length()) longest = color;
        }
        System.out.println(longest);



    }
}
