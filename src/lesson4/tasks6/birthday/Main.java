package lesson4.tasks6.birthday;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1990, 9, 7);
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy - E", Locale.ENGLISH);
        long timeNow = System.currentTimeMillis();
        int countYears = 0;

        while (calendar.getTime().getTime() <= timeNow) {
            System.out.println(countYears + " - " + dateFormat.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, 1);
            countYears++;
        }


    }
}
