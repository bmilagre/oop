package ch.hslu.exercise.sw11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 *  Aufgabe 1.3a bis 1.3d
 */
public class StreamExample {
    private static final Logger LOG = LoggerFactory.getLogger(StreamExample.class);

    public static void main(final String[] args) {
        StreamExample streamExample = new StreamExample();
        String inputFile = "/Users/bmilagre/Projects/hslu/oop/oop_exercises/exercises_files/oop-sw11-demo";

        streamExample.writeDataToFileWithDataOutputStream(inputFile);
        streamExample.readDataFromFileWithDataInputStream(inputFile);
    }

    private void writeDataToFileWithDataOutputStream(final String file) {
        try(DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(file))) {
            outputStream.writeInt(2024);
            outputStream.writeFloat(22.66F);
            outputStream.writeDouble(233.56);
            outputStream.writeBoolean(true);
            outputStream.writeByte(48);

            LOG.info("Data written to {}", file);
        } catch (IOException e) {
            LOG.error("Fehler bei writeDataToFileWithDataOutputStream: ", e.getMessage());
        }
    }

    private void readDataFromFileWithDataInputStream(final String file) {
        try(DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
            float inputContentFloat = inputStream.readFloat();
            int inputContentInt = inputStream.readInt();
            Double inputContentDouble = inputStream.readDouble();
            Boolean inputContentBoolean = inputStream.readBoolean();
            Byte inputContentByte = inputStream.readByte();

            LOG.info("Data read as int: {}", inputContentInt); // Response 2024
            LOG.info("Data read as float: {}", inputContentFloat); // Response 22.66
            LOG.info("Data read as Double: {}", inputContentDouble); // Response 233.56
            LOG.info("Data read as Boolean: {}", inputContentBoolean); // Response true
            LOG.info("Data read as Byte: {}", inputContentByte); // Response 122

        } catch (IOException e){
            LOG.error("Fehler bei readDataFromFileWithDataInputStream: ", e);
        }
    }
}
