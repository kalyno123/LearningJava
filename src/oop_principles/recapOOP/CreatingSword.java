package oop_principles.recapOOP;

public class CreatingSword {
    public static void main(String[] args) {

        CurvedSword goldenSword = new CurvedSword();
        goldenSword.color = "Yellow";
        goldenSword.material = "Gold";
        goldenSword.sharpness = "Blunt";
        goldenSword.price = 500.0;
        goldenSword.weight = 15.5;
        System.out.println(goldenSword);

        goldenSword.slash();
        goldenSword.cut();
        //goldenSword.cut(false);
        goldenSword.cut(goldenSword.sharpness.equals("Sharp")); // false -- "There is no cuts made"


        System.out.println("\n");
        CurvedSword ironSword = new CurvedSword("Silver", "Iron", "Sharp", 7.3, 50.0);
        System.out.println(ironSword);

        ironSword.slash();
        ironSword.cut();
        //ironSword.cut(true);
        ironSword.cut(ironSword.sharpness.equals("Sharp")); // true -- "The cut is deep"

    }
}
