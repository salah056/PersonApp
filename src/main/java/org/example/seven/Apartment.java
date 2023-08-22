package org.example.seven;

public class Apartment {
    private int rooms;
    private Address address;

    public Apartment() {
    }
    public Apartment(int rooms, Address address) {
        this.rooms = rooms;
        this.address = address;
    }
    public int getRooms() {
        return rooms;
    }
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public void displayinfo(){
        System.out.println("Apartment with "+rooms+"rooms");
        System.out.println("Located at "+address.getStreet()+","+address.getCity());
    }
}
