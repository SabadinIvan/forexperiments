package structural.facade;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class FacadeDemo {

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();

        Date from = new Date();
        Date to = new Date(from.getTime() + (1000*60*60*24*7)); // + 7 дней

        Map<String, List<String>> bookingInfo = travelFacade.getFlightsAndHotels(from, to);

        System.out.println("Бронирование завершено:");
        System.out.println("Рейсы: " + bookingInfo.get("flights"));
        System.out.println("Отели: " + bookingInfo.get("hotels"));
    }
}
