package ch.hslu.exercise.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  Aufgabe 2.3
 */
public class ReadCSVFile {
    private static final Logger LOG = LoggerFactory.getLogger(ReadCSVFile.class);
    private final MeasuringPointProcess measuringPointProcess = new MeasuringPointProcess();

    public static void main(String[] args) {
        String inputFile = "/Users/bmilagre/Projects/hslu/oop/oop_exercises/exercises_files/netatmo-export.csv";

        ReadCSVFile readCSVFile = new ReadCSVFile();
        readCSVFile.readTextFile(inputFile);

        LOG.info("Höchste Temperatur war: {} mit der Uhrzeit: {}", readCSVFile.getMaxTemperatur().getTemperatur(), readCSVFile.getMaxTemperatur().getTime());
        LOG.info("Tiefste Temperatur war: {} mit der Uhrzeit: {}", readCSVFile.getMinTemperatur().getTemperatur(), readCSVFile.getMinTemperatur().getTime());
        LOG.info("Durchscnitt war: {}", readCSVFile.getAverageTemperatur());
        LOG.info("Anzahl Temperaturen war: {}", readCSVFile.getCount());
    }

    private void readTextFile(final String file) {
        if (new File(file).exists()) {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charset.forName("UTF-8")))) {
                String line;
                Temperatur temperatur;

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(";"); // 0: id, 1: timestamp, 2: temperatur, 3: humidity

                    Float temperaturValue = Float.parseFloat(values[2]);
                    LocalDateTime timestamp = LocalDateTime.parse(values[1], DateTimeFormatter.ofPattern("\"yyyy/MM/dd HH:mm:ss\""));

                    this.measuringPointProcess.add(new MeasuringPoint(timestamp, Temperatur.createFromCelsius(temperaturValue)));
                }
            } catch (IOException ioe) {
                LOG.error(ioe.getMessage(), ioe);
            }
        } else {
            throw new RuntimeException("File not found: " + file);
        }
    }

    private MeasuringPoint getMaxTemperatur() {
        return this.measuringPointProcess.max();
    }

    private MeasuringPoint getMinTemperatur() {
        return this.measuringPointProcess.min();
    }

    private float getAverageTemperatur() {
        return this.measuringPointProcess.getAverage();
    }

    private int getCount(){
        return this.measuringPointProcess.getCount();
    }
}