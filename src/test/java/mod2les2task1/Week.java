package mod2les2task1;

public class Week {
    /*
    Создать класс Week содержащий 7 полей Day и поле номера недели относительно начала года (не статическое).
     */
    Day Poned;
    Day Vtornik;
    Day Sreda;
    Day Chetverg;
    Day Pyatnica;
    Day Subbota;
    Day Voskresen;

    int weekNumByYear;

    int numDayOfWeek;

    public Week(int outWeekNumByYear, int firstDayNumber) {
        weekNumByYear = outWeekNumByYear;
        numDayOfWeek = firstDayNumber;

        Poned = new Day(DaysOfWeek.MONDAY, numDayOfWeek++);

        Vtornik = new Day(DaysOfWeek.TUESDAY, numDayOfWeek++);

        Sreda = new Day(DaysOfWeek.WEDNESDAY, numDayOfWeek++);

        Chetverg = new Day(DaysOfWeek.THURSDAY, numDayOfWeek++);

        Pyatnica = new Day(DaysOfWeek.FRIDAY, numDayOfWeek++);

        Subbota = new Day(DaysOfWeek.SATURDAY, numDayOfWeek++);

        Voskresen = new Day(DaysOfWeek.SUNDAY, numDayOfWeek++);
    }

    @Override
    public String toString() {
        return "Week{" + ", weekNumByYear=" + weekNumByYear + "\n" +
                " Poned=" + Poned +
                " Vtornik=" + Vtornik +
                " Sreda=" + Sreda +
                " Chetverg=" + Chetverg +
                " Pyatnica=" + Pyatnica +
                " Subbota=" + Subbota +
                " Voskresen=" + Voskresen +
                '}';
    }
}
