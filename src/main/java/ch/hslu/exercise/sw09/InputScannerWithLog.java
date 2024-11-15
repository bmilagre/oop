package ch.hslu.exercise.sw09;

import java.util.Scanner;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class InputScannerWithLog {
    private static final Logger LOG = LoggerFactory.getLogger(InputScannerWithLog.class);

    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Bitte Temperatur eingeben (oder 'exit' zum Beenden): ");
            input = scanner.next();

            try {
                if(!input.equals("exit")) {
                    float value = Float.valueOf(input);
                    System.out.println("Die eingegebene Temperatur war " + value);
                }
            } catch (NumberFormatException e) {
                System.out.println("Bitte geben Sie eine Zahl ein.");
                LOG.debug("Entered value: " + input);
                LOG.error(e.getMessage());
            }
        } while (!"exit".equals(input));
        LOG.debug("Programm beendet");
        System.out.println("Programm beendet.");
    }
}
