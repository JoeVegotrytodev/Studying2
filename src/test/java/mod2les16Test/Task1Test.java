package mod2les16Test;

import io.qameta.allure.Owner;
import mod2les2task1.Week;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task1Test {

    @Test
    @DisplayName("проверка нумерации дня в понедельнике")
    @Owner("Author")
    public void ponedDateCheckTest(){
        int startDay = 1;
        Week week = new Week(1, startDay);

        Assertions.assertEquals(week.getPoned().getDayCounterByMonth(), startDay);
    }

    @Test
    @DisplayName("проверка нумерации дней в неделе")
    @Owner("Author")
    public void vtornikDateCheckTest(){
        int startDay = 1;
        Week week = new Week(1, startDay);
        startDay++;

        Assertions.assertEquals(week.getVtornik().getDayCounterByMonth(), startDay);
    }

}
