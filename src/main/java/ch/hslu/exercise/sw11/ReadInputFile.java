package ch.hslu.exercise.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ReadInputFile {
    private static final Logger LOG = LoggerFactory.getLogger(ReadInputFile.class);

    public static void main(String[] args) {
        ReadInputFile readInputFile = new ReadInputFile();
        String inputFile = "/Users/bmilagre/Projects/hslu/oop/oop_exercises/exercises_files/oop-sw11-stream";

        readInputFile.readDataFromFileWithDataInputStream(inputFile);
    }

    private void readDataFromFileWithDataInputStream(final String file) {
        if (new File(file).exists()) {
            try(DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
                int inputContentInt = inputStream.readInt();
                Float value;

                LOG.info("Total: {}", inputContentInt);

                while ((value = inputStream.readFloat()) != null) {
                    LOG.info("Value: {}", value);
                }
            } catch (IOException e) {
                LOG.error("Fehler bei readDataFromFileWithDataInputStream: ", e);
            }
        }
    }
}
