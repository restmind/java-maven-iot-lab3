package ua.lviv.iot.airline.model;

import java.util.Objects;

public class Helicopter extends Airline {
    private int quantityOfScrews;

    public Helicopter(String producerName, String nameOfAircraftModel,
                      int productionYear, int totalCapacityOfPassengers,
                      double tonnageInTons, String typeOfEngine,
                      double flightRangeInKm, double priceOfFlightInUan,
                      int quantityOfScrews) {
        super(producerName, nameOfAircraftModel, productionYear, totalCapacityOfPassengers,
                tonnageInTons, typeOfEngine, flightRangeInKm, priceOfFlightInUan);
        this.quantityOfScrews = quantityOfScrews;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "," + "quantityOfScrews";
    }

    @Override
    public String toCsv() {
        return super.toCsv() + "," + getQuantityOfScrews();
    }

    public int getQuantityOfScrews() {
        return quantityOfScrews;
    }

    public void setQuantityOfScrews(int quantityOfScrews) {
        this.quantityOfScrews = quantityOfScrews;
    }

    public void extinguishTheFire() {
        System.out.println("Extinguish the fire");
    }

    @Override
    public String toString() {
        return "Helicopter{"
                + "quantityOfScrews=" + quantityOfScrews
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
        if (!(o instanceof Helicopter)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Helicopter that = (Helicopter) o;
        return getQuantityOfScrews() == that.getQuantityOfScrews();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getQuantityOfScrews());
    }
}
