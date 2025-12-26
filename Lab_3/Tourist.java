package Lab_3;

public class Tourist {

    private int ID;
    private String surname;
    private String hotelName;
    private String roomNumber;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;
    private int numberOfPersons;
    private double price;

    public Tourist() {
        ID = 0;
        surname = "";
        hotelName = "";
        roomNumber = "";
        roomType = "";
        checkInDate = "";
        checkOutDate = "";
        numberOfPersons = 0;
        price = 0.0;
    }

    public Tourist(int ID, String surname, String hotelName, String roomNumber,
                   String roomType, String checkInDate, String checkOutDate,
                   int numberOfPersons, double price) {
        this.ID = ID;
        this.surname = surname;
        this.hotelName = hotelName;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.numberOfPersons = numberOfPersons;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(int numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

public String toString() {
    return ID + " / " +
           surname + " / " +
           hotelName + " / " +
           roomNumber + " / " +
           roomType + " / " +
           checkInDate + " - " + checkOutDate + " / " +
           numberOfPersons + " persons /" + " " +
           price;
}
}
