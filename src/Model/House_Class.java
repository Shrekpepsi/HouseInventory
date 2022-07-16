/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Wajeeha Usman
 */
public class House_Class {
    
    public String Owner;
    public String Address;
    public String Storeys;
    public String Rooms;

    public House_Class() {
    }

    public House_Class(String Owner, String Address, String Storeys, String Rooms) {
        this.Owner = Owner;
        this.Address = Address;
        this.Storeys = Storeys;
        this.Rooms = Rooms;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getStoreys() {
        return Storeys;
    }

    public void setStoreys(String Storeys) {
        this.Storeys = Storeys;
    }

    public String getRooms() {
        return Rooms;
    }

    public void setRooms(String Rooms) {
        this.Rooms = Rooms;
    }

    @Override
    public String toString() {
        return "\nHouse_Class" + "\nOwner : " + Owner + "\nAddress : " + Address + "\nStoreys : " + Storeys + "\n Rooms : " + Rooms ;
    }
    
    
}
