/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Wajeeha Usman
 */
public class House_File {
     ArrayList<House_Class> arraylistHouse=new ArrayList<>();
    House_Class H_C= new House_Class();
    public ArrayList<House_Class> readfromFile(){
    
        try{
            
            FileReader fr=new FileReader("House_File.txt");
            BufferedReader reader = new BufferedReader(fr);
            while(true){
                  String H_Owner = reader.readLine();
                if(H_Owner==null)
                  break;
                String H_Address = reader.readLine();
                 String H_Storeys=reader.readLine();
                 String H_Rooms=reader.readLine();
                
                   
                House_Class hc = new House_Class(H_Owner,H_Address,H_Storeys,H_Rooms);
                arraylistHouse.add(hc);

            }
        }catch(IOException e){
            System.out.println("io exception handled");
        }
        return arraylistHouse;
    }

    public  ArrayList< House_Class> arraylist() {
        return arraylistHouse;
    }
    
    public  void addHouse(String ownername,  String houseaddress, String housestoreys, String houserooms){
         House_Class houseobj= new  House_Class(ownername,houseaddress,housestoreys,houserooms);
       
        writeToFile(houseobj);
    }
    public void writeToFile( House_Class House_classObj){
        File House_Class = new File("House_File.txt");
        try{
            if(!House_Class.exists())
            House_Class.createNewFile();
            FileWriter FileWrite = new FileWriter(House_Class, true);
            BufferedWriter BufferWrite = new BufferedWriter(FileWrite);
            BufferWrite.write(House_classObj.getHouse_Owner()+"\n");
            
            BufferWrite.write(House_classObj.getHouse_Adress()+"\n");
          
            BufferWrite.write(House_classObj.getHouse_Storeys()+"\n");
         
             BufferWrite.write(House_classObj.getHouse_rooms()+"\n");
           
            
           BufferWrite.flush();
            BufferWrite.close(); 
           }
        catch(IOException e){
            System.out.println("io exception handled");
        }
    }
    //UPDATED FILE OR DELETED FILE
    public void againWriteToFile(){
        File f= new File("House_File.txt");
        try{
            new FileWriter(f,false).close();
        }
        catch(IOException e)
        {
            System.out.println("io exception handled");
        }
        for( House_Class hco:arraylistHouse){
            writeToFile(hco);
            
        }
    }
}
