package service;

import model.Flight;

public class FlightRules {

    public Flight getMostExpensiveFlight(Flight[] flights){
        
        Flight mostExpensiveFlight = flights[0];

        for (Flight flight : flights) {
            if(flight.getPrice() > mostExpensiveFlight.getPrice()){
                mostExpensiveFlight = flight;
            }
        }

        return mostExpensiveFlight;
    }

    public Float getAveragePrice(Flight[] flights){

        Float totalPrice = 0F;

        for (Flight flight : flights) {
            totalPrice += flight.getPrice();
        }

        Float average = totalPrice / flights.length ;

        return average;
    }

    public Integer dynamicArrayLength(Flight[] flights){
        return flights.length + 1;
    }


}
