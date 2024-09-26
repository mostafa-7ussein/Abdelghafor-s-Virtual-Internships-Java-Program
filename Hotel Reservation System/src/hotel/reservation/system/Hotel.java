package hotel.reservation.system;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
  private List<Room> rooms;
  private List<Booking>bookings;
    
  
   public Hotel() {
        rooms = new List<>();
        bookings = new ArrayList<>();
    }
    
    public void checkIn(Room room){
        room.setStatus(true);
       
        
    }
    
    public void checkOut(Room room){
        room.setStatus(false);
        
    }
    
    
    public boolean manageRoomAvailability(Room room){
        
        return room.getStatus();
    }
    
    
    
    
}
