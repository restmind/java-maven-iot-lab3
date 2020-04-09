package ua.lviv.iot.airline.model;

public class PassengerAirplane extends Airline {
    private boolean availabilityOfEconomClass;

    public PassengerAirplane(String producerName, String nameOfAircraftModel, int productionYear, int totalCapacityOfPassengers, double tonnageInTons, String typeOfEngine, double flightRangeInKm, double priceOfFlightInUAN, boolean availabilityOfEconomClass) {
        super(producerName, nameOfAircraftModel, productionYear, totalCapacityOfPassengers, tonnageInTons, typeOfEngine, flightRangeInKm, priceOfFlightInUAN);
        this.availabilityOfEconomClass = availabilityOfEconomClass;
    }

    public boolean isAvailabilityOfEconomClass() {
        return availabilityOfEconomClass;
    }

    public void setAvailabilityOfEconomClass(boolean availabilityOfEconomClass) {
        this.availabilityOfEconomClass = availabilityOfEconomClass;
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "availabilityOfEconomClass=" + availabilityOfEconomClass +
                ", producerName='" + producerName + '\'' +
                ", nameOfAircraftModel='" + nameOfAircraftModel + '\'' +
                ", productionYear=" + productionYear +
                ", totalCapacityOfPassengers=" + totalCapacityOfPassengers +
                ", tonnageInTons=" + tonnageInTons +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", flightRangeInKm=" + flightRangeInKm +
                ", priceOfFlightInUAN=" + priceOfFlightInUAN +
                '}';
    }
}
