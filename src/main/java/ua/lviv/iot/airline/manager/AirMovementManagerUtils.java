package ua.lviv.iot.airline.manager;


import ua.lviv.iot.airline.model.Airline;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;



public class AirMovementManagerUtils implements Serializable {
    private static final AirlineSorterFoundByNameOfAircraftModel AIRLINE_NAME_SORTER =
            new AirlineSorterFoundByNameOfAircraftModel();

    //static nested class
    static class AirlineSorterFoundByNameOfAircraftModel implements Comparator<Airline>, Serializable {
        @Override
        public int compare(Airline firstAircraft, Airline secondAircraft) {
            return firstAircraft.getNameOfAircraftModel()
                    .compareTo(secondAircraft.getNameOfAircraftModel());
        }
    }

    //inner class
    class AirlineSorterFoundByTotalCapacityOfPassengers
            implements Comparator<Airline> {
        @Override
        public int compare(Airline firstAircraft, Airline secondAircraft) {
            if (Double.compare(firstAircraft.getTotalCapacityOfPassengers(),
                    secondAircraft.getTotalCapacityOfPassengers()) < 0) {
                return -1;
            }
            if (Double.compare(firstAircraft.getTotalCapacityOfPassengers(),
                    secondAircraft.getTotalCapacityOfPassengers()) > 0) {
                return 1;
            }
            return 0;
        }
    }

    public static void sortFoundByFlightRangeInKm(ArrayList<Airline> aircraftList,
                                                  SortType sortType) {

        // anonymous inner class
        Comparator<Airline> comparator = new Comparator<Airline>() {

            @Override
            public int compare(Airline firstAppliance, Airline secondAppliance) {
                return Double.compare(firstAppliance.getFlightRangeInKm(),
                        secondAppliance.getFlightRangeInKm());
            }
        };
        aircraftList.sort(sortType == SortType.ASCENDING
                ? comparator : comparator.reversed());
    }

    public static void sortFoundByTotalCapacityOfPassengers(ArrayList<Airline> goods,
                                                            SortType sortType) {
        AirMovementManagerUtils manager = new AirMovementManagerUtils();
        AirlineSorterFoundByTotalCapacityOfPassengers sorter
                = manager.new AirlineSorterFoundByTotalCapacityOfPassengers();

        goods.sort(sortType == SortType.ASCENDING ? sorter : sorter.reversed());
    }

    public static void sortFoundByNameOfAircraftModel(ArrayList<Airline> aircraftList,
                                                      SortType sortType) {
        aircraftList.sort(sortType == SortType.ASCENDING
                ? AIRLINE_NAME_SORTER :
                AIRLINE_NAME_SORTER.reversed());
    }
}
