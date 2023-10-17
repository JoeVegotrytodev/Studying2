package mod2les25;

import java.time.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class EntryPoint {
    public static void main(String[] args) {
//        дата рождения

        //для отсчета времени выполнения программы
        GregorianCalendar start = new GregorianCalendar();

        //различными классами задаем дату рождения
        LocalDate bDLocalDate = LocalDate.of(1998, 8,4);
        LocalDateTime bDLocalDateTime = LocalDateTime.of(1998, 8,4, 0, 0);
        ZonedDateTime bDZonedDateTime = ZonedDateTime.of(bDLocalDate, LocalTime.of(0, 0), ZoneId.of("GMT+4"));
        GregorianCalendar bDGregorianCalendar = new GregorianCalendar(1998, Calendar.AUGUST,4);

        //вычисление разницы дат
        System.out.println("Years " + getYearsByBDay(bDLocalDate));
        System.out.println("Years " + getYearsByBDay(bDLocalDateTime));
        System.out.println("Years " + getYearsByBDay(bDZonedDateTime));
        System.out.println("Years " + getYearsByBDay(bDGregorianCalendar));

//      счетчик времени выполнения
        GregorianCalendar timerEnd = new GregorianCalendar();
        long timerDifference = timerEnd.getTimeInMillis() - start.getTimeInMillis();
        System.out.println("\nDuration in mls = " + timerDifference);


    }


    static int getYearsByBDay(Object object){
        int resultDiff;

        if (object instanceof LocalDate){
            LocalDate nowLocalDate = LocalDate.now();

            resultDiff = nowLocalDate.compareTo((LocalDate)object);
            return resultDiff;
        }
        else if(object instanceof LocalDateTime){
            LocalDateTime nowLocalDateTime = LocalDateTime.now();

            resultDiff = nowLocalDateTime.compareTo((LocalDateTime)object);
            return resultDiff;
        }else if (object instanceof ZonedDateTime){
            ZonedDateTime nowZonedDateTime = ZonedDateTime.now();

            resultDiff = nowZonedDateTime.toLocalDate().compareTo(((ZonedDateTime) object).toLocalDate());
            return resultDiff;
        } else if (object instanceof GregorianCalendar){
            GregorianCalendar nowGregorianCalendar = new GregorianCalendar();
            GregorianCalendar bDayGregorianCalendar = (GregorianCalendar)object;

            long differenceInMillis = nowGregorianCalendar.getTimeInMillis() - bDayGregorianCalendar.getTimeInMillis();

            TimeUnit timeUnit = TimeUnit.DAYS;
            long days = timeUnit.convert(differenceInMillis, TimeUnit.MILLISECONDS);
            return (int) (days / 365);
        } else
            throw new ClassCastException("Wrong class");
    }
}
