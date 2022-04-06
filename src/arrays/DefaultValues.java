package arrays;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {

    /* NULL NOTES:
    - whenever you try to manipulate a null Java.lang will throw a NullPointerException
    - null IS A RESERVED KEYWORD .. IT MEANS THAT THE OBJECT HAS NO VALUE.
    - primitives cannot be null .. they have their own “null” values.
    */

        String[] s = new String[5];
        System.out.println(Arrays.toString(s));

        int[] integers = new int[5];
        System.out.println(Arrays.toString(integers)); // [0, 0, 0, 0, 0]

        double[] doubles = new double[5];
        System.out.println(Arrays.toString(doubles)); // [0.0, 0.0, 0.0, 0.0, 0.0]

        boolean[] booleans = new boolean[5]; // [false, false, false, false, false]
        System.out.println(Arrays.toString(booleans));

        char[] characters = new char[5]; // [  ,  ,  ,  ,  ]
        System.out.println(Arrays.toString(characters));

        float[] floats = new float[5];
        System.out.println(Arrays.toString(floats)); // [0.0, 0.0, 0.0, 0.0, 0.0]
        floats[1] = 45.65F; // [0.0, 45.65, 0.0, 0.0, 0.0]



    }
}
