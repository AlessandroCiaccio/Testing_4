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
        System.out.println();
    }

    public static Object year(OffsetDateTime data) {
        if (data == null) {
            return null;
        }
        return data.getYear();
    }

    public static String month(OffsetDateTime data) {
        if (data == null) {
            return null;
        }
        return data.format(DateTimeFormatter.ofPattern("MMMM"));
    }

    public static Object day(OffsetDateTime data) {
        if (data == null) {
            return null;
        }
        return data.getDayOfMonth();
    }

    public static String dayWeek(OffsetDateTime data) {

        if (data == null) {
            return null;
        }
        return data.format(DateTimeFormatter.ofPattern("EEEE"));
    }
}