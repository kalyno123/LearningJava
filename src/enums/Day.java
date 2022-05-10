package enums;

public class Day {

    /* DECLARING CONSTANT VARIABLES USING 'final' keyword
    public static final String sunday = "SUNDAY";
    public static final String monday = "MONDAY";
    public static final String tuesday = "TUESDAY";
    public static final String wednesday = "WEDNESDAY";
    public static final String thursday = "THURSDAY";
    public static final String friday = "FRIDAY";
    public static final String saturday = "SATURDAY";
    */

    // ENUM CAN BE DECLARED WITHIN A CLASS (INNER ENUM)
    public enum Gender{
        FEMALE,
        MALE,
        OTHER
    }

    public enum TShirtSize{
        SMALL,
        MEDIUM,
        LARGE,
        XLARGE
    }

    public enum Level{
        LOW,
        MEDIUM,
        HIGH
    }

    public enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER
    }

    public enum Frequencies{
        HOURLY,
        DAILY,
        WEEKLY,
        BIWEEKLY,
        MONTHLY,
        YEARLY
    }





}
