package ch.hslu.reviews;

import ch.hslu.exercise.sw12.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class Demo {
    private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        RoomManagement roomManagement = new RoomManagement();
        roomManagement.addRoomEventListener((RoomEvent roomEvent) -> {
            LOG.info("Event received: {}", roomEvent);
        });

        final IntStream numberOfPersons = IntStream.of(11,6,17);

        System.out.println("-- Before booking --");
        roomManagement.getRooms().forEach((id, room) -> {
            System.out.println(room);
        });

        numberOfPersons.forEach((n) -> {
            Room room = roomManagement.getBestAvailableRoomForAmountPersons(n);
            if (room != null) {
                roomManagement.lockRoomState(room);
            } else {
                System.out.println("No room currently available for " + n + " Persons!");
            }
        });

        System.out.println("-- After booking --");
        roomManagement.getRooms().forEach((id, room) -> {
            System.out.println(room);
        });
    }
}
