/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Wajeeha Usman
 */
public class House_Class {
    
    public String house_Owner;
    public String house_Adress;
    public String house_Storeys;
    public String house_rooms;

    public House_Class() {
      
    }

    public House_Class(String house_Owner, String house_Adress, String house_Storeys, String house_rooms) {
        this.house_Owner = house_Owner;
        this.house_Adress = house_Adress;
        this.house_Storeys = house_Storeys;
        this.house_rooms = house_rooms;
    }

    
    public String getHouse_Owner() {
        return house_Owner;
    }

    public void setHouse_Owner(String house_Owner) {
        this.house_Owner = house_Owner;
    }

    public String getHouse_Adress() {
        return house_Adress;
    }

    public void setHouse_Adress(String house_Adress) {
        this.house_Adress = house_Adress;
    }

    public String getHouse_Storeys() {
        return house_Storeys;
    }

    public void setHouse_Storeys(String house_Storeys) {
        this.house_Storeys = house_Storeys;
    }

    public String getHouse_rooms() {
        return house_rooms;
    }

    public void setHouse_rooms(String house_rooms) {
        this.house_rooms = house_rooms;
    }

    
    public String toString() {
        return "House_Class{" + "house_Owner=" + house_Owner + ", house_Adress=" + house_Adress + ", house_Storeys=" + house_Storeys + ", house_rooms=" + house_rooms + '}';
    }
    
    
    
}
