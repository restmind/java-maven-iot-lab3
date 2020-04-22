package ua.lviv.iot.airline.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.airline.model.Airline;
import ua.lviv.iot.airline.model.PassengerAirplane;
import ua.lviv.iot.airline.model.Helicopter;
import ua.lviv.iot.airline.model.TransportAirplane;


 public class AirMovementManagerTest {

     protected AirMovementManager airMovementManager;
     protected PassengerAirplane testPassengerAirplane;
     protected Helicopter testHelicopter;
     protected TransportAirplane testTransportAirplane;

     protected ArrayList<Airline> testListOfAircrafts;


     @BeforeEach
     public void setUp() {
         this.testListOfAircrafts = new ArrayList<Airline>();
         testPassengerAirplane = new PassengerAirplane("Aircompany", "ASS-111",
                 2010, 120, 100,
             "Electric", 2500.0, 1200.00, true);
         testHelicopter = new Helicopter("Helicopter inc.", "Gvintokrill", 2015,
                 8, 10,
                 "Diesel", 1500.4, 2500.00, 2);
         testTransportAirplane = new TransportAirplane("Wizzair", "T10", 2000, 0,
                 200,
             "Diesel", 3000.0, 500.0, 2);


         testListOfAircrafts.add(testPassengerAirplane);
         testListOfAircrafts.add(testHelicopter);
         testListOfAircrafts.add(testTransportAirplane);
         airMovementManager = new AirMovementManager(testListOfAircrafts);

     }


     @Test
     public void findAircraftBy() {

         AirMovementManager manager = new AirMovementManager();
         double testPriceOfFlightInUan = 60.50;
         ArrayList<Airline> result = manager.findAircraftBy(testPriceOfFlightInUan, testListOfAircrafts);

         for (Airline good : result) {
             System.out.println(good.getPriceOfFlightInUan());
             if (good.getPriceOfFlightInUan() < testPriceOfFlightInUan) {
                 System.out.println("This good does not match the criteria");
             } else {
                 result.add(good);
             }
         }

     }

     @Test
     public void calculateFinalPrice(){
         final double expectedFinalPrice = 10 * 2500.0;
         assertEquals(expectedFinalPrice, airMovementManager.calculateFinalPrice(testPassengerAirplane));
     }

     @Test
     public void calculateTotalTonnageInTons() {
         final double expectedFinalTonnageInTons = 310.0;
         assertEquals(expectedFinalTonnageInTons, airMovementManager.calculateTotalTonnageInTons(testListOfAircrafts));
     }
 }
