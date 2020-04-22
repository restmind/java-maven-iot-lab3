package ua.lviv.iot.airline.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class AircraftWriterTest extends AirMovementManagerTest {
    private AircraftWriter writer;

    @BeforeEach
    public void setUp() {
        super.setUp();
        this.writer = new AircraftWriter();
    }

    @Test
    public void writeToFile() {
        try (Writer fileWriter = new FileWriter("aircraft.csv")) {
            this.writer.setCsvWriter(fileWriter);
            this.writer.writeToFile(testListOfAircrafts);
        } catch (IOException e) {
            System.out.println("Error while writing to file!");
            e.printStackTrace();
        }
    }
}
