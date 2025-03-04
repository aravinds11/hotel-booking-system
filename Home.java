/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

/**
 *
 * @author HRD-LAB1
 */
public class Home {
    private String firstName;
    private String lastName;
    private String gender;
    private String roomType;
    private String guestsQty;
    private String arrivalDate;
    private String arrivalMonth;
    private String arrivalYear;
    private String arrivalTime;
    private String departDate;
    private String departMonth;
    private String departYear;
    private String departTime;
    private String pickup;
    private String request;

    public Home(String firstName, String lastName, String gender, String roomType, String guestsQty, String arrivalDate, String arrivalMonth, String arrivalYear, String arrivalTime, String departDate, String departMonth, String departYear, String departTime, String pickup, String request) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.roomType = roomType;
        this.guestsQty = guestsQty;
        this.arrivalDate = arrivalDate;
        this.arrivalMonth = arrivalMonth;
        this.arrivalYear = arrivalYear;
        this.arrivalTime = arrivalTime;
        this.departDate = departDate;
        this.departMonth = departMonth;
        this.departYear = departYear;
        this.departTime = departTime;
        this.pickup = pickup;
        this.request = request;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getGuestsQty() {
        return guestsQty;
    }

    public void setGuestsQty(String guestsQty) {
        this.guestsQty = guestsQty;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getArrivalMonth() {
        return arrivalMonth;
    }

    public void setArrivalMonth(String arrivalMonth) {
        this.arrivalMonth = arrivalMonth;
    }

    public String getArrivalYear() {
        return arrivalYear;
    }

    public void setArrivalYear(String arrivalYear) {
        this.arrivalYear = arrivalYear;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartDate() {
        return departDate;
    }

    public void setDepartDate(String departDate) {
        this.departDate = departDate;
    }

    public String getDepartMonth() {
        return departMonth;
    }

    public void setDepartMonth(String departMonth) {
        this.departMonth = departMonth;
    }

    public String getDepartYear() {
        return departYear;
    }

    public void setDepartYear(String departYear) {
        this.departYear = departYear;
    }

    public String getDepartTime() {
        return departTime;
    }

    public void setDepartTime(String departTime) {
        this.departTime = departTime;
    }

    public String getPickup() {
        return pickup;
    }

    public void setPickup(String pickup) {
        this.pickup = pickup;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

         
}

