package projects;

import java.util.Arrays;

public class TestingProject07 {
    public static void main(String[] args) {

        // TESTING PROJECT 7 TASK 1 & 2:
        int[] numbers1 = {10, 7, 7, 10, -3, 10, -3};
        Project07.findGreatestAndSmallestWithSort(numbers1);

        Project07.findGreatestAndSmallest(numbers1);

        // TESTING PROJECT 7 TASK 3 & 4:
        int[] numbers2 = {10, 5, 6, 7, 8, 5, 15, 15};
        Project07.findSecondGreatestAndSmallestWithSort(numbers2);

        Project07.findSecondGreatestAndSmallest(numbers2);

        // TESTING PROJECT 7 TASK 5:
        String[] fooBar = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        Project07.findDuplicatedElementsInAnArray(fooBar);

        // TESTING PROJECT 7 TASK 6:
        String[] supplies = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        Project07.findMostRepeatedElementInAnArray(supplies);



    }
}
