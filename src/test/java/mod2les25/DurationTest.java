package mod2les25;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static mod2les25.EntryPoint.getDuration;

public class DurationTest {

    @Test
    @DisplayName("Проверка счетчика длительонсти")
    @Owner("Author")
    @Tag("SomeTag")
    @Severity(SeverityLevel.NORMAL)
    public void durationTest(){
        GregorianCalendar start = new GregorianCalendar();

        EntryPoint.main(new String[0]);

        Assertions.assertNotNull(getDuration(start));
    }
}
