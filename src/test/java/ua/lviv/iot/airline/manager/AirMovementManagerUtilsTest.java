package ua.lviv.iot.airline.manager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AirMovementManagerUtilsTest extends AirMovementManagerTest {

    @Test
    void sortFoundByFlightRangeInKm(){
        AirMovementManagerUtils.sortFoundByFlightRangeInKm(testListOfAircrafts, SortType.ASCENDING);
        assertEquals(testHelicopter, testListOfAircrafts.get(0));
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(1));
        assertEquals(testTransportAirplane, testListOfAircrafts.get(2));
        AirMovementManagerUtils.sortFoundByFlightRangeInKm(testListOfAircrafts, SortType.DESCENDING);
        assertEquals(testTransportAirplane, testListOfAircrafts.get(0));
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(1));
        assertEquals(testHelicopter, testListOfAircrafts.get(2));
    }

    @Test
    void sortFoundByTotalCapacityOfPassengers() {
        AirMovementManagerUtils.sortFoundByTotalCapacityOfPassengers(testListOfAircrafts, SortType.ASCENDING);
        assertEquals(testTransportAirplane, testListOfAircrafts.get(0));
        assertEquals(testHelicopter, testListOfAircrafts.get(1));
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(2));
        AirMovementManagerUtils.sortFoundByTotalCapacityOfPassengers(testListOfAircrafts, SortType.DESCENDING);
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(0));
        assertEquals(testHelicopter,testListOfAircrafts.get(1));
        assertEquals(testTransportAirplane, testListOfAircrafts.get(2));
    }

    @Test
    void sortFoundByNameOfAircraftModel() {
        AirMovementManagerUtils.sortFoundByNameOfAircraftModel(testListOfAircrafts, SortType.ASCENDING);
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(0));
        assertEquals(testHelicopter, testListOfAircrafts.get(1));
        assertEquals(testTransportAirplane, testListOfAircrafts.get(2));
        AirMovementManagerUtils.sortFoundByNameOfAircraftModel(testListOfAircrafts, SortType.DESCENDING);
        assertEquals(testTransportAirplane, testListOfAircrafts.get(0));
        assertEquals(testHelicopter, testListOfAircrafts.get(1));
        assertEquals(testPassengerAirplane, testListOfAircrafts.get(2));
    }
}
