package structural.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelBooker {
    public List<String> getHotelNamesFor(Date from, Date to) {
        List<String> hotels = new ArrayList<>();
        hotels.add("Hotel A");
        hotels.add("Hotel B");
        hotels.add("Hotel C");
        System.out.println("Получены отели на даты: " + from + " - " + to);
        return hotels;
    }
}
