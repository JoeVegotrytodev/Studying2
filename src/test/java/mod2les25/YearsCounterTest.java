package mod2les25;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class YearsCounterTest {

    @Test
    @DisplayName("проверка корректного подсчета дней в методе getYearsByBDay")
    @Owner("Author")
    public void yearsCounterTest(){

        Assertions.assertEquals(25,
                EntryPoint.getYearsByBDay(LocalDate.of(1998, 8,4)));
        // и по аналогии
    }

}
