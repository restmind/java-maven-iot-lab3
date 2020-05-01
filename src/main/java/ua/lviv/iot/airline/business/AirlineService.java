package ua.lviv.iot.airline.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.lviv.iot.airline.dataaccess.AirlineRepository;
import ua.lviv.iot.airline.model.Airline;

import java.util.List;

@Service
public class AirlineService {

    @Autowired
    private AirlineRepository airlineRepository;

    public Airline createAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    public List<Airline> findAll() {
        return airlineRepository.findAll();
    }

    public AirlineRepository getAirlineRepository() {
        return airlineRepository;
    }

    public void setAirlineRepository(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public ResponseEntity<Airline> getAirline(Integer airlineId) {
        if (airlineRepository.existsById(airlineId)) {
            Airline airline = airlineRepository.findById(airlineId).get();
            return new ResponseEntity<>(airline, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public HttpStatus deleteAirline(Integer airlineId) {
        if (airlineRepository.existsById(airlineId)) {
            airlineRepository.deleteById(airlineId);
            return HttpStatus.OK;
        } else {
            return HttpStatus.NOT_FOUND;
        }
    }

    public ResponseEntity<Airline> updateAirline(Airline airline, Integer studentId) {
        if (airlineRepository.existsById(studentId)) {
            Airline oldAirline = new Airline(airlineRepository.findById(studentId).get());
            airline.setId(studentId);
            airlineRepository.save(airline);
            return new ResponseEntity<>(oldAirline, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
