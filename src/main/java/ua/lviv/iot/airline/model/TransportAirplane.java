package ua.lviv.iot.airline.model;

import java.util.Objects;

public class TransportAirplane extends Airline {
    private int deliveryTimeInDays;

    public TransportAirplane(String producerName, String nameOfAircraftModel,
                             int productionYear, int totalCapacityOfPassengers,
                             double tonnageInTons, String typeOfEngine,
                             double flightRangeInKm, double priceOfFlightInUan,
                             int deliveryTimeInDays) {
        super(producerName, nameOfAircraftModel,
                productionYear, totalCapacityOfPassengers,
                tonnageInTons, typeOfEngine,
                flightRangeInKm, priceOfFlightInUan);
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "deliveryTimeInDays";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getDeliveryTimeInDays();
    }

    public int getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public void setDeliveryTimeInDays(int deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    @Override
    public String toString() {
        return "TransportAirplane{"
                + "deliveryTimeInDays=" + deliveryTimeInDays
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransportAirplane)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        TransportAirplane that = (TransportAirplane) o;
        return getDeliveryTimeInDays() == that.getDeliveryTimeInDays();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDeliveryTimeInDays());
    }
}
