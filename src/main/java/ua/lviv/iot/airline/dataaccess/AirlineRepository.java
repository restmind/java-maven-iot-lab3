package ua.lviv.iot.airline.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.airline.model.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {
}
