package ua.lviv.iot.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.airline.business.AirlineService;
import ua.lviv.iot.airline.model.Airline;


import java.util.ArrayList;
import java.util.List;


@RequestMapping("/airlines")
@Controller
public class AirlineController {
    @Autowired
    private AirlineService airlineService;



    @GetMapping(path = "/getAll")
    public List<Airline> getAirlines() {
        return airlineService.findAll();
    }

/*    @GetMapping(path = "/{id}")
    public ResponseEntity<Airline> getAirline(final @PathVariable("id") Integer airlineId) {
        return airlineService.getAirline(airlineId);
    }*/

    @PostMapping(path = "/",produces = {MediaType.APPLICATION_JSON_VALUE},  consumes = {"application/x-www-form-urlencoded"})
    public String createAirline(final Airline airline) {
        airlineService.createAirline(airline);
        return "create";
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Airline> deleteAirline(final @PathVariable("id") Integer airlineId) {

        HttpStatus status = airlineService.deleteAirline(airlineId);
        return ResponseEntity.status(status).build();
    }

    @RequestMapping(value = "/edit/update/{id}", method = {RequestMethod.GET, RequestMethod.PUT})
    public String updateAirline(final @PathVariable("id") Integer airlineId,
                                                  Airline airline) {
        airlineService.updateAir(airline, airlineId);
        return "index";
    }

    public AirlineService getAirlineService() {
        return airlineService;
    }

    public void setAirlineService(AirlineService airlineService) {
        this.airlineService = airlineService;
    }

    @RequestMapping(value = "/")
    public String indexPage(Model model) {
         List<Airline> airlines = airlineService.findAll();
         model.addAttribute("airlines", airlines);
        return "index";
    }

    @RequestMapping(value = "/create")
    public String createPage() {
        return "create";
    }

    @RequestMapping(value = "/edit/{id}")
    public String editPage(final @PathVariable("id") Integer airlineId,Model model) {
        List<Airline> airlines = new ArrayList<>();
        airlines.add(airlineService.getAirlineRepository().findById(airlineId).get());
        model.addAttribute("airline", airlines);
        return "edit";
    }
}
