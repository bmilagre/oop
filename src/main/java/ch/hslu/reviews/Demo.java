package ch.hslu.reviews;

import java.util.stream.IntStream;

public class Demo {
    public static void main(String[] args) {
        RoomManagement roomManagement = new RoomManagement();

        final IntStream numberOfPersons = IntStream.of(11,6,17);

        //roomManagement.stream().foreach(System.out::println);

        numberOfPersons.forEach((n) -> {
            Room room = roomManagement.getBestAvailableRoomForAmountPersons(n);

            if(room.equals(room)){
                roomManagement.lockRoomState(room);
            } else {
                System.out.println("No room currently available for " + n + " Persons!");
            }
        });


    }
}
