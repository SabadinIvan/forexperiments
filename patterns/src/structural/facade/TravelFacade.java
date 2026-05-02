package structural.facade;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelFacade {

    private final FlightBooker flightBooker;
    private final HotelBooker hotelBooker;

    public TravelFacade() {
        this.flightBooker = new FlightBooker();
        this.hotelBooker = new HotelBooker();
    }

    Map<String, List<String>> getFlightsAndHotels(Date from, Date to) {
        Map<String, List<String>> result = new HashMap<>();
        List<String> flights = flightBooker.getFlightsFor(from, to);
        List<String> hotels = hotelBooker.getHotelNamesFor(from, to);
        result.put("flights", flights);
        result.put("hotels", hotels);
        return result;
    }
}
