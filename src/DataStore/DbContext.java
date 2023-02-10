package DataStore;

import Data.Booking;
import Data.Room;
import Data.RoomAvailabilityDetail;
import Data.User;

import java.util.ArrayList;

public class DbContext {
    private ArrayList<Room> Rooms;
    private ArrayList<User> Users;
    private ArrayList<Booking> Bookings;
    private  ArrayList<RoomAvailabilityDetail> RoomAvailabilityDetails;
}
