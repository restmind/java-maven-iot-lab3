package ua.lviv.iot.airline.model;

public class TransportAirplane extends Airline {
    private int deliveryTimeInDays;

    public TransportAirplane(String producerName, String nameOfAircraftModel, int productionYear, int totalCapacityOfPassengers, double tonnageInTons, String typeOfEngine, double flightRangeInKm, double priceOfFlightInUAN, int deliveryTimeInDays) {
        super(producerName, nameOfAircraftModel, productionYear, totalCapacityOfPassengers, tonnageInTons, typeOfEngine, flightRangeInKm, priceOfFlightInUAN);
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    public int getDeliveryTimeInDays() {
        return deliveryTimeInDays;
    }

    public void setDeliveryTimeInDays(int deliveryTimeInDays) {
        this.deliveryTimeInDays = deliveryTimeInDays;
    }

    @Override
    public String toString() {
        return "TransportAirplane{" +
                "deliveryTimeInDays=" + deliveryTimeInDays +
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
