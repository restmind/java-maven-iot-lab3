package ua.lviv.iot.airline.model;

import java.util.Objects;

public class PassengerAirplane extends Airline {
    private boolean availabilityOfEconomClass;

    public PassengerAirplane(String producerName, String nameOfAircraftModel,
                             int productionYear, int totalCapacityOfPassengers,
                             double tonnageInTons, String typeOfEngine,
                             double flightRangeInKm, double priceOfFlightInUan,
                             boolean availabilityOfEconomClass) {
        super(producerName, nameOfAircraftModel,
                productionYear, totalCapacityOfPassengers,
                tonnageInTons, typeOfEngine,
                flightRangeInKm, priceOfFlightInUan);
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
        return "PassengerAirplane{"
                + "availabilityOfEconomClass=" + availabilityOfEconomClass
                + ", producerName='" + producerName + '\''
                + ", nameOfAircraftModel='" + nameOfAircraftModel + '\''
                + ", productionYear=" + productionYear
                + ", totalCapacityOfPassengers=" + totalCapacityOfPassengers
                + ", tonnageInTons=" + tonnageInTons
                + ", typeOfEngine='" + typeOfEngine + '\''
                + ", flightRangeInKm=" + flightRangeInKm
                + ", priceOfFlightInUAN=" + priceOfFlightInUan
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerAirplane)) return false;
        if (!super.equals(o)) return false;
        PassengerAirplane that = (PassengerAirplane) o;
        return isAvailabilityOfEconomClass() == that.isAvailabilityOfEconomClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isAvailabilityOfEconomClass());
    }
}
