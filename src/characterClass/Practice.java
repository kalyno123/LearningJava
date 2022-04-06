package characterClass;

public class Practice {
    public static void main(String[] args) {

        String s = "ab1x2y3cd3dsjfhw43";
        // 1+2+3+3+4+3 = 16; char's int-values
        // 49+50+51+51+52+51 = 304; char's ascii values

        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        System.out.println(sum);




    }
}
