package ua.lviv.iot.airline.manager;

import ua.lviv.iot.airline.model.Airline;

import java.util.ArrayList;




public class AirMovementManager {
    private ArrayList<Airline> listOfAircrafts;
    static final int pricePerKmInUAN = 10;

    public AirMovementManager(ArrayList<Airline> listOfAircrafts) {
        this.listOfAircrafts = new ArrayList<>();
    }

    public AirMovementManager() {

    }


    public ArrayList<Airline> findAircraftBy(double price, ArrayList<Airline> listOfAircrafts) {
        ArrayList<Airline> result = new ArrayList<Airline>();
        for (int goodFromTheList = 0; goodFromTheList < listOfAircrafts.size(); goodFromTheList++) {
            if (listOfAircrafts.get(goodFromTheList).getPriceOfFlightInUan() < price) {
                result.add(listOfAircrafts.get(goodFromTheList));
            }
        }
        return result;
    }

    public final double calculateFinalPrice(Airline airline) {
        return airline.getFlightRangeInKm() * pricePerKmInUAN;
    }

    public final double calculateTotalTonnageInTons(ArrayList<Airline> entryList) {
        double result = 0;
        for (Airline airline : entryList) {
            result += airline.getTonnageInTons();
        }
        return result;
    }
}
