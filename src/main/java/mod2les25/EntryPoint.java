package mod2les25;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class EntryPoint {
    public static void main(String[] args) {
//        дата рождения
//        Date birthDay = new Date(1998, Calendar.AUGUST, 4);

        GregorianCalendar start = new GregorianCalendar();

        LocalDate bDLocalDate = LocalDate.of(1998, 8,4);
        LocalDateTime bDLocalDateTime = LocalDateTime.of(1998, 8,4, 0, 0);
        ZonedDateTime bDZonedDateTime = ZonedDateTime.of(bDLocalDate, LocalTime.of(0, 0), ZoneId.of("GMT+4"));
        GregorianCalendar bDGregorianCalendar = new GregorianCalendar(1998, Calendar.AUGUST,4);

        LocalDate nowLocalDate = LocalDate.now();
        LocalDateTime nowLocalDateTime = LocalDateTime.now();
        ZonedDateTime nowZonedDateTime = ZonedDateTime.now();
        GregorianCalendar nowGregorianCalendar = new GregorianCalendar();

        int locDateDiff = nowLocalDate.compareTo(bDLocalDate);
        System.out.println(locDateDiff);
        int locDateTimeDiff = nowLocalDateTime.compareTo(bDLocalDateTime);
        System.out.println(locDateTimeDiff);
        int zonedDiff = nowZonedDateTime.compareTo(bDZonedDateTime);
        System.out.println(zonedDiff);

        long differenceInMillis = nowGregorianCalendar.getTimeInMillis() - bDGregorianCalendar.getTimeInMillis();
        TimeUnit timeUnit = TimeUnit.DAYS;
        long result = timeUnit.convert(differenceInMillis, TimeUnit.MILLISECONDS);
        System.out.println("Сравнение дат класса GregorianCalendar: " + nowGregorianCalendar.compareTo(bDGregorianCalendar) + "\n" +
                "Разница между датами " + result + " дня.");

        for (int i = 0; i < 53323232; i++){
            i++;
            for (int j = 0; j < 22434545; j++){
                j+=i;
            }
        }

        GregorianCalendar timerEnd = new GregorianCalendar();
        long timerDifference = timerEnd.getTimeInMillis() - start.getTimeInMillis();
        System.out.println("Duration in mls = " + timerDifference);
    }
}
