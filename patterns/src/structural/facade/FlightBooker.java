package structural.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBooker {
    public List<String> getFlightsFor(Date from, Date to) {
        List<String> flights = new ArrayList<>();
        flights.add("Flight 1");
        flights.add("Flight 2");
        flights.add("Flight 3");
        System.out.println("Получены рейсы на даты: " + from + " - " + to);
        return flights;
    }
}
