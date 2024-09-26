package hotel.reservation.system;
public class Room {
    private int roomNumber;
    private String roomType;
    private boolean status;
    private double price;

    public Room(int roomNumber, String roomType, boolean status, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
        this.price = price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean getStatus() {
        return status;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
}
