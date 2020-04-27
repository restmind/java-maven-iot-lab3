package ua.lviv.iot.airline.manager;


import ua.lviv.iot.airline.model.Airline;


import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;


public class AircraftWriter {
    public Writer csvWriter = new StringWriter();

    public Writer getCsvWriter() {
        return csvWriter;
    }

    public void setCsvWriter(Writer csvWriter) {
        this.csvWriter = csvWriter;
    }

    @Override
    public String toString() {
        return csvWriter.toString();
    }

    public void writeToFile(ArrayList<Airline> airlines) throws IOException {
        try {
            for (Airline currentAircraft : airlines) {
                writeLine(this.csvWriter, currentAircraft.getHeaders());
                writeLine(this.csvWriter, currentAircraft.toCsv());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            csvWriter.flush();
            csvWriter.close();
        }
    }

    private void writeLine(Writer writer, String line) throws IOException {
        writer.write(line + "\n");
    }
}

