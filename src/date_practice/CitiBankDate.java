package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CitiBankDate {
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat sdfDate = new SimpleDateFormat("MMM dd");
        System.out.println("Today is = " + sdfDate.format(currentDate));
        SimpleDateFormat sdfTime = new SimpleDateFormat("hh:mm:ss a, zzzz");
        System.out.println("Today is = " + sdfTime.format(currentDate));






    }

    String expected = "100,000.00";
    String actual = "10,0000.00";

    public static boolean validateBalance(String balance) {
        // PATTERN FORMAT: <3chars>,<3chars>.<2chars>
        return balance.matches("");
    }

}
