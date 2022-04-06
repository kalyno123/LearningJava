package casting;

public class CastingPrimitives {
    public static void main(String[] args) {

        // RANK BIG TO SMALL:  double > float > long > int = char > short > byte

        int myInt = 32;
        long myLong = myInt; // this is implicit casting
        myInt = (int) myLong; // this is explicit (manual) casting

        int mySecondInt = 'B'; // implicit casting
        char myChar = (char) 56;
        char mySecondChar = 56; // <-- the same as char myChar = (char) 56; since char=int
        int myThirdInt = (int) 45.5; // PUT IN () THE TYPE YOU WANT TO CAST/CONVERT

        short myShort = (short) myChar;
        char myThirdChar = (char) myShort;

        //-------------------------------------------------------------------------

        byte num1 =45;
        int num2 = num1; // implicit

        double num3 = 13.6;
        float num4 = (float) num3;

        int num5 = 45;
        short num6 = -34;

        char c = (char) num5; // have to explicitly cast for both to generate POSITIVE value
        c = (char) num6; // ^^^





    }
}
