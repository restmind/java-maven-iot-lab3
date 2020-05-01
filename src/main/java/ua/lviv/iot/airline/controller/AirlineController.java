package ua.lviv.iot.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.airline.business.AirlineService;
import ua.lviv.iot.airline.model.Airline;


import java.util.List;


@RequestMapping("/airlines")
@RestController
public class AirlineController {
    @Autowired
    private AirlineService airlineService;

    @GetMapping
    public List<Airline> getAirlines() {
        return airlineService.findAll();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Airline> getStudent(final @PathVariable("id") Integer airlineId) {
        return airlineService.getAirline(airlineId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Airline createStudent(final @RequestBody Airline airline) {
        airlineService.createAirline(airline);
        return airline;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Airline> deleteStudent(final @PathVariable("id") Integer airlineId) {

        HttpStatus status = airlineService.deleteAirline(airlineId);
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Airline> updateStudent(final @PathVariable("id") Integer studentId,
                                                 final @RequestBody Airline airline) {
        return airlineService.updateAirline(airline, studentId);
    }

    public AirlineService getAirlineService() {
        return airlineService;
    }

    public void setAirlineService(AirlineService airlineService) {
        this.airlineService = airlineService;
    }
}
