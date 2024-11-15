package ch.hslu.exercise.sw09;

import java.util.Scanner;

public class InputScannerWithPrintLn {

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
            }
        } while (!"exit".equals(input));
        System.out.println("Programm beendet.");
    }
}
