package ch.hslu.exercise.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Aufgabe 1.3
 */
public class InputScannerWithLog {
    private static final Logger LOG = LoggerFactory.getLogger(InputScannerWithLog.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        InputScannerWithLog listener = new InputScannerWithLog();
        temperaturVerlauf.addTemperaturChangeEventListener(new TemperaturEventListener() {
            @Override
            public void temperaturChangeEvent(TemperaturEvent temperaturEvent) {
                System.out.println(temperaturEvent.toString());
            }
        });

        String inputFile = "/Users/bmilagre/Projects/hslu/oop/oop_exercises/exercises_files/sw11-stream";

        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();

            try {
                if (!input.equals("exit")) {
                    float value = Float.valueOf(input);
                    temperaturVerlauf.add(Temperatur.createFromCelsius(value));

                    System.out.println("Die eingegebene Temperatur war " + value);
                }
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben Sie eine Zahl ein.");

                LOG.debug("Entered value: " + input);
                LOG.error(e.getMessage());
            }
        } while (!"exit".equals(input));

        if(temperaturVerlauf.getCount() >= 1){
            // Add count to file
            listener.writeDataToFileWithDataOutputStream(inputFile, temperaturVerlauf.getCount());

            // Add each temperatur value to file
            for(Temperatur temperatur: temperaturVerlauf.temperaturen){
                listener.writeDataToFileWithDataOutputStream(inputFile, temperatur.getCelsius());
            }
        }

        System.out.println(temperaturVerlauf.toString());
        System.out.println("Programm beendet.");
        LOG.debug("Programm beendet");
    }

    private void writeDataToFileWithDataOutputStream(final String file, final float value) {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file))) {
            outputStream.writeFloat(value);
            LOG.info("Data written to {}", file);
        } catch (IOException e) {
            LOG.error("Fehler bei writeDataToFileWithDataOutputStream: ", e.getMessage());
        }
    }

    public void propertyChange(final TemperaturEvent event) {
        if(event.getNewValue() != event.getOldValue()){
            System.out.println(event.toString());
        }
    }
}
