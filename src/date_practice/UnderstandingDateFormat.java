package date_practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingDateFormat {
    public static void main(String[] args) {

        /* We can format the date using SimpleDateFormat class and get below formats:
        yyyy-MM-dd	    ->	2021-07-15
        MM/dd/yyyy	    ->	07/15/2021
        dd-MMM-yyyy	    -> 	15-Jul-2021
        E, MMM dd yyyy	->	Thu, Jul 15 2021
        hh:mm:ss a	    ->	08:33:27 PM
        h:mm a 		    -> 	8:37 PM
        EEE 		    -> 	Thu
        EEEE 		    -> 	Thursday

        https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        */

        Date currentDate = new Date();
        System.out.println(currentDate); // Sat Apr 30 10:16:53 CDT 2022

        // FORMAT: MM/dd/yyyy - 04/30/2022
        // MM - uppercase MM - months
        // mm - lowercase mm - minutes

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy"); // in the () you pass(set) the date format pattern
        System.out.println("Today is = " + sdf.format(currentDate)); // Today is = 04/30/2022

        // TASK 1 - PRINT DATE IN THE FORMAT OF: Sat hh:mm AM
        SimpleDateFormat task1 = new SimpleDateFormat("EEE h:mm a");
        System.out.println(task1.format(currentDate)); // Sat 10:26 AM

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate)); // 10 o'clock AM, Central Daylight Time





    }
}
