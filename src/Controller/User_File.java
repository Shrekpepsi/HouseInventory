/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import GUI.UP_User;
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
public class User_File {
 ArrayList<User_Class> arraylist=new ArrayList<>();
 User_Class U_F= new User_Class();
    public ArrayList<User_Class> readfromFile(){
    
        try{
            
            FileReader fr=new FileReader("User_File.txt");
            BufferedReader reader = new BufferedReader(fr);
            while(true){
                  String U_name = reader.readLine();
                if(U_name==null)
                  break;
                String U_cnic = reader.readLine();
                 String U_email=reader.readLine();
                 String U_phone=reader.readLine();
                
                   
                User_Class m = new User_Class(U_name,U_cnic,U_email,U_phone);
                arraylist.add(m);

            }
        }catch(IOException e){
           System.out.println("io exception handled");
        }
        return arraylist;
    }

    public  ArrayList< User_Class> arraylist() {
        return arraylist;
    }
    
    public  void addUser(String username,  String usercnic, String useremail, String userphone){
         User_Class Userobj= new  User_Class(username,usercnic,useremail,userphone);
       
        writeToFile(Userobj);
    }
    public void writeToFile( User_Class m){
        File User_File = new File("User_File.txt");
        try{
            if(!User_File.exists())
            User_File.createNewFile();
            FileWriter FileWrite = new FileWriter(User_File, true);
            BufferedWriter BufferWrite = new BufferedWriter(FileWrite);
            BufferWrite.write(m.getName()+"\n");
            
            BufferWrite.write(m.getCnic()+"\n");
          
            BufferWrite.write(m.getEmail()+"\n");
         
             BufferWrite.write(m.getPhone()+"\n");
           
            
           BufferWrite.flush();
            BufferWrite.close(); 
           }
        catch(IOException e){
            System.out.println("io exception handled");
        }
    }
    public void againWriteToFile(){
        File f= new File("User_File.txt");
        try{
            new FileWriter(f,false).close();
        }
        catch(IOException e)
        {
            System.out.println("io exception handled");
        }
        for( User_Class m:arraylist){
            writeToFile(m);
            
        }
    }
         }
     

