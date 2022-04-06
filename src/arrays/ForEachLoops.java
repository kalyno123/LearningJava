package arrays;

public class ForEachLoops {
    public static void main(String[] args) {

    /* Print each element with a message
    EXPECTED OUTPUT:
    Element 1 = A
    Element 2 =
    Element 3 = ,
    Element 4 = #
    Element 5 = T
    Element 6 = 6
    Element 7 = 9
    */
        char[] chars = {'A', ' ', ',', '#', 'T', '6', '9'};
        System.out.println(chars.length); // 7

        // ONE WAY:
        System.out.println("Element = " + chars[0]);
        System.out.println("Element = " + chars[1]);
        System.out.println("Element = " + chars[2]);
        System.out.println("Element = " + chars[3]);
        System.out.println("Element = " + chars[4]);
        System.out.println("Element = " + chars[5]);
        System.out.println("Element = " + chars[6]);

        // FOR-I LOOP WAY:
        for (int i = 0; i <= 6; i++){
            System.out.println("Element" + i+1 + " = " + chars[i]);
        }

        // FOR-EACH LOOP WAY:
        for (char element : chars){// READ AS: for each 'element' in the 'chars' array printout element
            System.out.println("Element = " + element);
        }
        // For-Each loops always start at its initialization point --> ZERO
        int[] nums = new int[4];
        for (int number : nums){ // for each 'number' in the 'int' array printout number but break when the element is 25
            if (number == 25) break;
        }



    }
}
