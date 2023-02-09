package Data;

import Data.Enumeration.RoomType;

import java.util.ArrayList;

public class Room {
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Data.Enumeration.RoomType getRoomType() {
        return RoomType;
    }

    public void setRoomType(Data.Enumeration.RoomType roomType) {
        RoomType = roomType;
    }

    private int Id;
    private Data.Enumeration.RoomType RoomType;

    public ArrayList<Data.RoomAvailabilityDetail> getRoomAvailabilityDetail() {
        return RoomAvailabilityDetail;
    }

    public void setRoomAvailabilityDetail(ArrayList<Data.RoomAvailabilityDetail> roomAvailabilityDetail) {
        RoomAvailabilityDetail = roomAvailabilityDetail;
    }

    public int getCreatedById() {
        return CreatedById;
    }

    public void setCreatedById(int createdById) {
        CreatedById = createdById;
    }

    public Booking getIsAvailable() {
        return IsAvailable;
    }

    public void setIsAvailable(Booking isAvailable) {
        IsAvailable = isAvailable;
    }

    private ArrayList<RoomAvailabilityDetail> RoomAvailabilityDetail;
    private int CreatedById;
    private Booking IsAvailable;

}
