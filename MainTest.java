import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void year() {
        Object year = testing.year(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals(2002, year);
    }

    @Test
    void month() {
        String month = testing.month(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals("marzo",month);
    }

    @Test
    void day() {
        Object day = testing.day(OffsetDateTime.parse("2002-03-01T13:00:00Z"));
        assertEquals(01,day);
    }

    @Test
    void getDayWeek() {
        String dayWeek = testing.dayWeek(OffsetDateTime.parse("2002-03-05T13:00:00Z"));
        assertEquals("martedì",dayWeek);
    }
    void yearNull() {
        Object year = null;
        assertNull(year,"The year is null");
    }

    @Test
    void monthNull() {
        String month = null;
        assertNull(month,"The month is null");
    }

    @Test
    void dayNull() {
        Object day = null;
        assertNull(day,"The day is null");
    }

    @Test
    void getDayWeekNull() {
        String dayWeek = null;
        assertNull(dayWeek,"The day of the week is null");
    }
}