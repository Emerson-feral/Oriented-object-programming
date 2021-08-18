import java.util.ArrayList;
import java.util.List;

import model.Flight;
import service.FlightRules;

public class App {
    public static void main(String[] args) throws Exception {
        
        FlightRules flightRules = new FlightRules();

        Integer dynamic = 3;

        Flight[] flights = new Flight[dynamic];
        flights[0] = new Flight(1l, "Barcelona", "Madrid", 300F);
        flights[1] = new Flight(2l, "Brazil", "Spain", 2000F);
        flights[2] = new Flight(3l, "Japan", "Italy", 5000F);

        Flight mostExpensiveFlight = flightRules.getMostExpensiveFlight(flights);

        Float averagePrice = flightRules.getAveragePrice(flights);

        List<String> allFlights = new ArrayList<>();;

        for (Flight flight : flights) {
            allFlights.add(flight.toString());
        }

        System.out.println("Most Expensive: " + mostExpensiveFlight);
        
        System.out.println("Average price: " + averagePrice);

        System.out.println("All flights: " + allFlights);


    }
}
