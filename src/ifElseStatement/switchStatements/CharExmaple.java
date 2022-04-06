package ifElseStatement.switchStatements;

public class CharExmaple {
    public static void main(String[] args) {
        char character = ' ';

        switch (character){
            case 'A': // can put char's ascii value (A=64) or can put char symbols
                System.out.println("It is UPPERCASE");
                break;
            case '5':
                System.out.println("It is a DIGIT");
                break;
            case '$':
                System.out.println("It is DOLLAR SIGN");
                break;
            default:
                System.out.println("None");
        }


    }
}
