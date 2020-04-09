package ua.lviv.iot.airline.model;

public class Helicopter extends Airline {
    private int quantityOfScrews;

    public Helicopter(String producerName, String nameOfAircraftModel, int productionYear, int totalCapacityOfPassengers, double tonnageInTons, String typeOfEngine, double flightRangeInKm, double priceOfFlightInUAN, int quantityOfScrews) {
        super(producerName, nameOfAircraftModel, productionYear, totalCapacityOfPassengers, tonnageInTons, typeOfEngine, flightRangeInKm, priceOfFlightInUAN);
        this.quantityOfScrews = quantityOfScrews;
    }

    public int getQuantityOfScrews() {
        return quantityOfScrews;
    }

    public void setQuantityOfScrews(int quantityOfScrews) {
        this.quantityOfScrews = quantityOfScrews;
    }

    public void extinguishTheFire(){
        System.out.println("Extinguish the fire");
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "quantityOfScrews=" + quantityOfScrews +
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
