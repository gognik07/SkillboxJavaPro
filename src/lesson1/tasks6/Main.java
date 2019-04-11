package lesson1.tasks6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        DateFormat format = new SimpleDateFormat("hh:mm a MM/dd/yyyy", Locale.ENGLISH);
        Date date = new Date();
        System.out.println("English format: " + format.format(date));

        format = new SimpleDateFormat("HH:mm dd.MM.yyyy");
        date = new Date();
        System.out.println("Russian format: " + format.format(date));
    }
}
