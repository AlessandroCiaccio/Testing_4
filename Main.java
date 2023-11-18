import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String meseItaliano = data.format(DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ITALY));
        String giornoItaliano=data.format(DateTimeFormatter.ofPattern("EEEE").withLocale(Locale.ITALY));
        int year = data.getYear();
        int day = data.getDayOfMonth();
        System.out.println("The year is " + year +
                "\nThe month is " + meseItaliano +
                "\nThe day of the month is " + day +
                "\nThe day of the week is " + giornoItaliano);
    }
}