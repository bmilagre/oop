package ch.hslu.exercise.sw10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Scanner;

public class InputScannerWithLog implements PropertyChangeListener {
    private static final Logger LOG = LoggerFactory.getLogger(InputScannerWithLog.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        TemperaturVerlauf temperaturVerlauf = new TemperaturVerlauf();

        InputScannerWithLog listener = new InputScannerWithLog();
        temperaturVerlauf.addPropertyChangeListener(listener);

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

        System.out.println(temperaturVerlauf.toString());

        LOG.debug("Programm beendet");
        System.out.println("Programm beendet.");
    }

    public void propertyChange(final PropertyChangeEvent event) {
        if(event.getPropertyName() != event.getOldValue()){
            System.out.println(event.toString());
        }
    }
}
