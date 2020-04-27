package ua.lviv.iot.airline.model;


import java.util.Objects;

public class Airline {
    protected String producerName;
    protected String nameOfAircraftModel;
    protected int productionYear;
    protected int totalCapacityOfPassengers;
    protected double tonnageInTons;
    protected String typeOfEngine;
    protected double flightRangeInKm;
    protected double priceOfFlightInUan;
    private Integer id;

    public Airline(String producerName, String nameOfAircraftModel,
                   int productionYear, int totalCapacityOfPassengers,
                   double tonnageInTons, String typeOfEngine,
                   double flightRangeInKm, double priceOfFlightInUan) {
        this.producerName = producerName;
        this.nameOfAircraftModel = nameOfAircraftModel;
        this.productionYear = productionYear;
        this.totalCapacityOfPassengers = totalCapacityOfPassengers;
        this.tonnageInTons = tonnageInTons;
        this.typeOfEngine = typeOfEngine;
        this.flightRangeInKm = flightRangeInKm;
        this.priceOfFlightInUan = priceOfFlightInUan;
    }

    public Airline() {

    }

    public void takeOff() {
        System.out.println("Aircraft has been taken off");
    }

    public void land() {
        System.out.println("Aircraft has been land");
    }

    public String getHeaders() {
        return "producerName" + "," + "nameOfAircraftModel" + "," + "productionYear" + ","
                + "totalCapacityOfPassengers" + "," + "tonnageInTons" + "," + "typeOfEngine"
                + "," + "flightRangeInKm" + "," + "priceOfFlightInUan";
    }

    public String toCsv() {
        return getProducerName() + "," + getNameOfAircraftModel() + ","
                + getProductionYear() + "," + getTotalCapacityOfPassengers() + ","
                + getTonnageInTons() + "," + getTypeOfEngine() + ","
                + getFlightRangeInKm() + "," + getPriceOfFlightInUan();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public String getNameOfAircraftModel() {
        return nameOfAircraftModel;
    }

    public void setNameOfAircraftModel(String nameOfAircraftModel) {
        this.nameOfAircraftModel = nameOfAircraftModel;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getTotalCapacityOfPassengers() {
        return totalCapacityOfPassengers;
    }

    public void setTotalCapacityOfPassengers(int totalCapacityOfPassengers) {
        this.totalCapacityOfPassengers = totalCapacityOfPassengers;
    }

    public double getTonnageInTons() {
        return tonnageInTons;
    }

    public void setTonnageInTons(double tonnageInTons) {
        this.tonnageInTons = tonnageInTons;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public double getFlightRangeInKm() {
        return flightRangeInKm;
    }

    public void setFlightRangeInKm(double flightRangeInKm) {
        this.flightRangeInKm = flightRangeInKm;
    }

    public double getPriceOfFlightInUan() {
        return priceOfFlightInUan;
    }

    public void setPriceOfFlightInUan(double priceOfFlightInUan) {
        this.priceOfFlightInUan = priceOfFlightInUan;
    }

    @Override
    public String toString() {
        return "Airline{"
                + "producerName='" + producerName + '\''
                + ", nameOfAircraftModel='" + nameOfAircraftModel + '\''
                + ", productionYear=" + productionYear
                + ", totalCapacityOfPassengers=" + totalCapacityOfPassengers
                + ", tonnageInTons=" + tonnageInTons
                + ", typeOfEngine='" + typeOfEngine + '\''
                + ", flightRangeInKm=" + flightRangeInKm
                + ", priceOfFlightInUan=" + priceOfFlightInUan
                + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Airline)) {
            return false;
        }
        Airline airline = (Airline) o;
        return getProductionYear() == airline.getProductionYear()
                && getTotalCapacityOfPassengers() == airline.getTotalCapacityOfPassengers()
                && Double.compare(airline.getTonnageInTons(), getTonnageInTons()) == 0
                && Double.compare(airline.getFlightRangeInKm(), getFlightRangeInKm()) == 0
                && Double.compare(airline.getPriceOfFlightInUan(), getPriceOfFlightInUan()) == 0
                && Objects.equals(getProducerName(), airline.getProducerName())
                && Objects.equals(getNameOfAircraftModel(), airline.getNameOfAircraftModel())
                && Objects.equals(getTypeOfEngine(), airline.getTypeOfEngine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducerName(), getNameOfAircraftModel(),
                getProductionYear(), getTotalCapacityOfPassengers(),
                getTonnageInTons(), getTypeOfEngine(),
                getFlightRangeInKm(), getPriceOfFlightInUan());
    }
}
