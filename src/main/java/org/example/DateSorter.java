package org.example;

import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DateSorter {
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        if (unsortedDates == null || unsortedDates.isEmpty()) {
            return new ArrayList<>();
        }
        List<LocalDate> datesWithR = unsortedDates.stream()
                .filter(date -> date.getMonth().toString().toLowerCase().contains("r"))
                .sorted()
                .collect(Collectors.toList());

        List<LocalDate> datesWithoutR = unsortedDates.stream()
                .filter(date -> !date.getMonth().toString().toLowerCase().contains("r"))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        datesWithR.addAll(datesWithoutR);

        // option for case without duplicates in return
        /*List<LocalDate> sortedAndDistinctDates = datesWithR.stream()
                .distinct()
                .collect(Collectors.toList());

        return sortedAndDistinctDates;*/


        return datesWithR;
    }
}
