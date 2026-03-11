// File: BookMyStayApp.java
// Version 2.1 - Refactored with inheritance, abstraction, and static availability

// Abstract class representing a generalized Room
abstract class Room {
    private String roomType;
    private int numberOfBeds;
    private double pricePerNight;

    // Constructor
    public Room(String roomType, int numberOfBeds, double pricePerNight) {
        this.roomType = roomType;
        this.numberOfBeds = numberOfBeds;
        this.pricePerNight = pricePerNight;
    }

    // Common method to display room details
    public void displayRoomDetails() {
        System.out.println("Room Type: " + roomType);
        System.out.println("Beds: " + numberOfBeds);
        System.out.println("Price per Night: $" + pricePerNight);
    }
}

// Concrete room classes
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 50.0);
    }
}

class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 90.0);
    }
}

class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 200.0);
    }
}

// Application entry point
public class BookMyStayApp {

    public static void main(String[] args) {

        // Static availability representation
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        // Initialize room objects
        Room single = new SingleRoom();
        Room doubleR = new DoubleRoom();
        Room suite = new SuiteRoom();

        System.out.println("=== Hotel Room Availability ===\n");

        single.displayRoomDetails();
        System.out.println("Available: " + singleRoomAvailability + "\n");

        doubleR.displayRoomDetails();
        System.out.println("Available: " + doubleRoomAvailability + "\n");

        suite.displayRoomDetails();
        System.out.println("Available: " + suiteRoomAvailability + "\n");

        System.out.println("=== End of Program ===");
    }
}