package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("o"); // args here is a String regex
        Matcher matcher = pattern.matcher("I love TechGlobal");
        System.out.println(matcher.matches()); // false --> bc matcher args != compile args
        // matches(); --> returns true or false & is checking if given String matches given pattern

        while(matcher.find()){ // this will find the next matched pattern in the given String
            System.out.println(matcher.group()); // this will print out next matched pattern in given String
            System.out.println("Start index: = " + matcher.start()); // returns int --> prints out where found patter starts
            System.out.println("End index: = " + matcher.end()); // returns int --> prints out where found patter ends
        }
    }
}
