package mathClass;

public class FindAbs {
    public static void main(String[] args){

        char c = (char)Math.abs(6-10); // char doesn't take int so must cast it; casting aka converting
        char b = 4;

        int abs1 = Math.abs(6-10); // 4
        int abs2 = Math.abs(6-10+11+5*1); //12
        int abs3 = Math.abs(-12); // this is the same as above
    //  int abs3 = Math.abs(5,7); this doesn't run for Math.abs bc commas indicates two separate values

        System.out.println(Math.abs(6-10));
        System.out.println(Math.abs(6-10+11+5*1));
        System.out.println(Math.abs(-12));




    }
}
