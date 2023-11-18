import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void year() {
        int year = testing.year(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals(2002, year, "La data è corretta");
    }

    @Test
    void month() {
        String month = testing.month(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assert month.equals("marzo") : "La data è sbagliata";
    }

    @Test
    void day() {
        int day = testing.day(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals(01, day, "La data è corretta");
    }

    @Test
    void getDayWeek() {
        String dayWeek = testing.dayWeek(OffsetDateTime.parse("2002-03-05T13:00:00Z"));
        assert dayWeek.equals("domenica") : "La data è sbagliata";
    }
}