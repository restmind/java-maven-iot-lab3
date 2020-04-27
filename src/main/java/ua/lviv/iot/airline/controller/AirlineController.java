package ua.lviv.iot.airline.controller;

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
import ua.lviv.iot.airline.model.Airline;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/airlines")
@RestController
public class AirlineController {

    private Map<Integer, Airline> listOfAirlines = new HashMap<>();
    private AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Airline> getAirlines() {
        return new LinkedList<>(listOfAirlines.values());
    }

    @GetMapping(path = "/{id}")
    public Airline getStudent(final @PathVariable("id") Integer airlineId) {
        return listOfAirlines.get(airlineId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Airline createStudent(final @RequestBody Airline airline) {
        airline.setId(idCounter.incrementAndGet());
        listOfAirlines.put(airline.getId(), airline);
        return airline;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Airline> deleteStudent(final @PathVariable("id") Integer airlineId) {

        HttpStatus status = listOfAirlines.remove(airlineId) == null ? HttpStatus.NOT_FOUND :
                HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Airline> updateStudent(final @PathVariable("id") Integer studentId,
                                                 final @RequestBody Airline airline) {
        airline.setId(studentId);
        HttpStatus status = listOfAirlines.put(studentId, airline) == null ? HttpStatus.NOT_FOUND :
                HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }
}
