package mod2les2task1;

public class Day {
    String DayOfWeek;
    int dayCounterByMonth;

    public Day(String dayOfWeek, int dayCounterByMonth) {
        DayOfWeek = dayOfWeek;
        this.dayCounterByMonth = dayCounterByMonth;
    }

    @Override
    public String toString() {
        return "Day{" +
                "DayOfWeek='" + DayOfWeek + '\'' +
                ", dayCounterByMonth=" + dayCounterByMonth +
                "} \n";
    }
}
