package Data;

import Data.Enumeration.RoomAvailability;

public class RoomAvailabilityDetail {
    private int RoomId;

    public RoomAvailability getRoomAvailabilityType() {
        return RoomAvailabilityType;
    }

    public void setRoomAvailabilityType(RoomAvailability roomAvailabilityType) {
        RoomAvailabilityType = roomAvailabilityType;
    }

    private RoomAvailability RoomAvailabilityType;

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int roomId) {
        RoomId = roomId;
    }
}
