package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DateSorter dateSorter = new DateSorter();
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
        for (LocalDate c: unsortedDates
             ) {
            System.out.println(c.toString());

        }
        System.out.println("_____________________________________");

        List<LocalDate> result = (List<LocalDate>) dateSorter.sortDates(unsortedDates);
        for (LocalDate c: result
        ) {
            System.out.println(c.toString());

        }

    }
}