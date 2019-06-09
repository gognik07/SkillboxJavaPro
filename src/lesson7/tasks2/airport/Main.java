package lesson7.tasks2.airport;

import com.skillbox.airport.Airport;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");
        Airport airport = Airport.getInstance();

        Calendar calendar = Calendar.getInstance();
        Date now = calendar.getTime();
        calendar.add(Calendar.HOUR, 2);
        Date afterTwoHours = calendar.getTime();

        airport.getTerminals().stream().forEach(terminal -> {
            terminal.getFlights().stream().filter(flight -> flight.getDate().getTime() >= now.getTime() && flight.getDate().getTime() <= afterTwoHours.getTime())
                    .forEach(flight -> System.out.println(flight.getAircraft().getModel() + " вылет в " + hourFormat.format(flight.getDate())));
        });
    }
}
