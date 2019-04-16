package lesson3.tasks8;

import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Terminal;

public class Loader {

    public static void main(String[] args) {
        Airport airport = Airport.getInstance();
        System.out.println("Количество самолётов: " + airport.getAllAircrafts().size());
        for (Aircraft aircraft : airport.getAllAircrafts()) {
            System.out.println(aircraft.getModel());
        }
        System.out.println();

        int countTerminal = 1;
        for (Terminal terminal: airport.getTerminals()) {

            System.out.println("Прибывшие самолёты в терминале " + countTerminal + ":");
            for (Aircraft aircraft : terminal.getArrivalAircrafts()) {
                System.out.println(aircraft.getModel());
            }
            System.out.println();

            System.out.println("Вылетевшие самолёты в терминале " + countTerminal + "");
            for (Aircraft aircraft : terminal.getDepartureAircrafts()) {
                System.out.println(aircraft.getModel());
            }
            System.out.println();

            System.out.println("Припаркованные самолёты в терминале " + countTerminal + "");
            for (Aircraft aircraft : terminal.getParkingAircrafts()) {
                System.out.println(aircraft.getModel());
            }
            System.out.println();

            countTerminal++;
            System.out.println();
        }

    }
}
