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
public class User_Class {
        
    public String Name;
    public String Email;
    public String Cnic;
    public String Phone;

    public User_Class() {
    }

    
    public User_Class(String Name, String Email, String Cnic, String Phone) {
        this.Name = Name;
        this.Email = Email;
        this.Cnic = Cnic;
        this.Phone = Phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCnic() {
        return Cnic;
    }

    public void setCnic(String Cnic) {
        this.Cnic = Cnic;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "\n\n\t USERS: " + "\n\t Name : " + getName() + " \n\t Email : " + getEmail() + "\n\t CNIC : " + getCnic() + "\n\t Phone # " + getPhone() ;
    }
    
}
