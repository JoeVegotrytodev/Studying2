package mod2les2task1;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        Week someWeek;
        Random random = new Random();
        random.nextInt(4);
        int week;
        int day;

        for (int i = 0; i < 3; i++) {
            week = random.nextInt(52);
            day = random.nextInt(31);

            someWeek = new Week(week, day);
            System.out.println(someWeek);
        }
    }
}
