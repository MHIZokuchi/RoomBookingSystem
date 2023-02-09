package Data;

import java.util.Date;

public class Booking {
    private int RoomId;
    private int Id;
    private int BookedById;
    private Date  DateBooked;
    private Date EndDate;
    private String BookingCustomerName;
    private String BookingCustomerPhoneNumber;
    private String BookingCustomerAddress;

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int roomId) {
        RoomId = roomId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBookedById() {
        return BookedById;
    }

    public void setBookedById(int bookedById) {
        BookedById = bookedById;
    }

    public Date getDateBooked() {
        return DateBooked;
    }

    public void setDateBooked(Date dateBooked) {
        DateBooked = dateBooked;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public String getBookingCustomerName() {
        return BookingCustomerName;
    }

    public void setBookingCustomerName(String bookingCustomerName) {
        BookingCustomerName = bookingCustomerName;
    }

    public String getBookingCustomerPhoneNumber() {
        return BookingCustomerPhoneNumber;
    }

    public void setBookingCustomerPhoneNumber(String bookingCustomerPhoneNumber) {
        BookingCustomerPhoneNumber = bookingCustomerPhoneNumber;
    }

    public String getBookingCustomerAddress() {
        return BookingCustomerAddress;
    }

    public void setBookingCustomerAddress(String bookingCustomerAddress) {
        BookingCustomerAddress = bookingCustomerAddress;
    }
}
