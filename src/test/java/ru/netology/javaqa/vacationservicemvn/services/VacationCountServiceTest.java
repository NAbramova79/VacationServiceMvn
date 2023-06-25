package ru.netology.javaqa.vacationservicemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.javaqa.vacationservicemvn.services.VacationCountService;

public class VacationCountServiceTest {
    @ParameterizedTest
//    @CsvSource({
//            "10000, 3000, 20000, 3",
//            "100000, 60000, 150000, 2"
//    })
    @CsvFileSource(files="src/test/resources/vacation.csv")
    void shouldCalculateVacationMonths(int income, int expense, int threshold, int expected) {
        VacationCountService service = new VacationCountService();

    //  int income = 10_000;
    //  int expense = 3_000;
    //  int threshold = 20_000;
    //  int expected = 3;

        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
