import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-05T13:00:00Z");

        System.out.println("The year is " + year(data) +
                "\nThe month is " + month(data) +
                "\nThe day of the month is " + day(data) +
                "\nThe day of the week is " + dayWeek(data));
    }
    public static int year(OffsetDateTime data){
        return data.getYear();
    }
    public static String month(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofPattern("MMMM"));
    }
    public static int day(OffsetDateTime data){
        return data.getDayOfMonth();
    }
    public static String dayWeek(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofPattern("EEEE"));
    }
}