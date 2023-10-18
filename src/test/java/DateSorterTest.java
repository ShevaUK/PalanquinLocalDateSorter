import org.example.DateSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateSorterTest {

    private DateSorter dateSorter;

    @BeforeEach
    public void setUp() {
        dateSorter = new DateSorter();
    }

    @Test
    public void testSortDates() {
        List<LocalDate> unsortedDates = new ArrayList<>(
                Arrays.asList(
                        LocalDate.of(2023, 5, 15),
                        LocalDate.of(2023, 3, 15),
                        LocalDate.of(2023, 1, 30),
                        LocalDate.of(2022, 12, 5),
                        LocalDate.of(2022, 8, 20),
                        LocalDate.of(2022, 8, 2),
                        LocalDate.of(2023, 4, 10)
                )
        );

        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        List<LocalDate> expectedDates = Arrays.asList(
                LocalDate.of(2022, 12, 5),
                LocalDate.of(2023, 1, 30),
                LocalDate.of(2023, 3, 15),
                LocalDate.of(2023, 4, 10),
                LocalDate.of(2023, 5, 15),
                LocalDate.of(2022, 8, 20),
                LocalDate.of(2022, 8, 2)
        );
        assertEquals(expectedDates, new ArrayList<>(sortedDates));
    }

    @Test
    public void testSortDatesWithEmptyList() {
        List<LocalDate> unsortedDates = new ArrayList<>();
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        assertTrue(sortedDates.isEmpty());
    }

    @Test
    public void testSortDatesWithNull() {
        List<LocalDate> unsortedDates = null;
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        assertEquals(Collections.emptyList(), sortedDates);
    }
}

