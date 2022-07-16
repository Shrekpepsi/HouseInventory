/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import GUI.START;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wajeeha Usman
 */
public class HWH_Online_House_Registeration_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        START st =new START();
       st.setVisible(true);
       st.setDefaultCloseOperation(0);
       
       char choiceMenu;
       Scanner choicemenu = new Scanner(System.in);
        System.out.println("\t\t\t\t***WELCOME TO HWH ONLINE HOUSE REGISTERATION SYSTEM***");
        System.out.println("\n\t\t\t CLICK TO CHOOSE YOUR TYPE OF PANEL :\n\n\t\t\ta) ADIMN.\n\n\t\t\tb) USER.");
        System.out.println("\n\n\t\t\tEnter Your Choice");
        
        choiceMenu = choicemenu.next().charAt(0);
        if(choiceMenu=='a'){
            char choiceAdmin;
             Scanner choiceadmin = new Scanner(System.in);
            System.out.println("\n\t\t\tWELCOME TO ADMIN PANEL");
            System.out.println("\n\t\t\tCLICK ON YOUR CHOICE : \n\t\t\tA) USER INFORMATION. \n\t\t\tB) HOUSE INFORMATION.");
            choiceAdmin = choiceadmin.next().charAt(0);
            if(choiceAdmin=='A'){
            
             User_Class pf = new User_Class();
            ArrayList<User_Class> UserClassObj = new ArrayList<User_Class>();
            User_Class u1 = new User_Class( "WAJEEHA", "wajeeha.usman2000@gmail.com", "11101-7750028-8", "0333-5177345");
            User_Class u2 = new User_Class("FIZZA", "fizzapervaiz7@gmail.com", "423010-58609227-6", "0333-3979135");
            User_Class u3 = new User_Class("IRSA", "irsajaved42@gmail.com", "11101-1234567-8", "03325255543");
            UserClassObj.add(u1);
            UserClassObj.add(u2);
            UserClassObj.add(u3);

            User_Class U_C = new User_Class();
            ArrayList<String> array = new ArrayList<String>();

            USER_FILE user_Filing = new USER_FILE();
            user_Filing.Write(u1);
            user_Filing.Write(u2);
            user_Filing.Write(u3);

            System.out.println("CLICK TO CHOOSE YOUR TYPE OF USER :\n\n\t\t\t1) ADD.\n\n\t\t\t2) VIEW.\n\n\t\t\t3) UPDATE.\n\n\t\t\t4) DELETE.");
            int ch1;
            Scanner CH1 = new Scanner(System.in);

            ch1 = CH1.nextInt();
            Scanner addinputs = new Scanner(System.in);
            if (ch1 == 1) {
                int size;
                System.out.println("Enter the number");
                Scanner in = new Scanner(System.in);
                size = in.nextInt();
                User_Class P[] = new User_Class[size];
                for (int i = 0; i < size; i++) {

                    P[i] = new User_Class();
                    System.out.println("ENTER NAME OF USER YOU WANT TO ADD");
                    P[i].setName(addinputs.next());
                    System.out.println("ENTER EMAIL OF USER YOU WANT TO ADD");
                    P[i].setEmail(addinputs.next());
                    System.out.println("ENTER CNIC YOU WANT TO ADD");
                    P[i].setCnic(addinputs.next());
                    System.out.println("ENTER PHONE YOU WANT TO ADD");
                    P[i].setPhone(addinputs.next());
                   
                    
                    user_Filing.Write(P[i]);

                }
                array.add(user_Filing.toString());

            }

            if (ch1 == 2) {

                user_Filing.Read();
            }
           
            if (ch1 == 3) {
                System.out.println("UPDATE");
                System.out.println("Enter the name of User You Want to Update: ");
                Scanner UN = new Scanner(System.in);
                String updateN = UN.next();
                System.out.println("\n\nENTER NEW DETAILS: \n\n");
                System.out.println("ENTER NAME ");
                U_C.setName(addinputs.next());
                System.out.println("ENTER EMAIL ");
                U_C.setEmail(addinputs.next());
                System.out.println("ENTER CNIC ");
                U_C.setCnic(addinputs.next());
                System.out.println("ENTER PHONE ");
                U_C.setPhone(addinputs.next());
                

                user_Filing.Update(updateN, U_C);
                user_Filing.Write(U_C);

            }
            if (ch1 == 4) {
                System.out.println("DELETE");
                System.out.println("Enter the name of User You Want to Delete: ");
                Scanner DN = new Scanner(System.in);
                String deleteN = DN.next();

                user_Filing.Delete(deleteN, U_C);
                user_Filing.Write(U_C);

            }
        }
             if(choiceAdmin=='B'){
                 House_Class pf = new House_Class();
            ArrayList<House_Class> HouseClassObj = new ArrayList<House_Class>();
            House_Class h1 = new House_Class( "AREEJ", "house#346,street#18,sector#I-10/2", "4", "7");
           House_Class h2 = new House_Class("IKRA", "house#976, street#2, sector#pindi ", "2", "6");
            House_Class h3 = new House_Class("AYESHA", "house#53, Street#4, Sector#pindi", "2", "6");
            HouseClassObj.add(h1);
            HouseClassObj.add(h2);
            HouseClassObj.add(h3);

            House_Class H_H = new House_Class();
            ArrayList<String> array = new ArrayList<String>();

           HOUSE_FILE house_Filing = new HOUSE_FILE();
            house_Filing.Write(h1);
            house_Filing.Write(h2);
            house_Filing.Write(h3);

            System.out.println("CLICK TO CHOOSE YOUR TYPE OF HOUSE :\n\n\t\t\t1) ADD.\n\n\t\t\t2) VIEW.\n\n\t\t\t3) UPDATE.\n\n\t\t\t4) DELETE.");
            int ch1;
            Scanner CH1 = new Scanner(System.in);

            ch1 = CH1.nextInt();
            Scanner addinputs = new Scanner(System.in);
            if (ch1 == 1) {
                int size;
                System.out.println("Enter the number");
                Scanner in = new Scanner(System.in);
                size = in.nextInt();
                House_Class P[] = new House_Class[size];
                for (int i = 0; i < size; i++) {

                    P[i] = new House_Class();
                    System.out.println("ENTER OWNER OF HOUSE YOU WANT TO ADD");
                    P[i].setOwner(addinputs.next());
                    System.out.println("ENTER ADDRESS OF HOUSE YOU WANT TO ADD");
                    P[i].setAddress(addinputs.next());
                    System.out.println("ENTER STOREYS YOU WANT TO ADD");
                    P[i].setStoreys(addinputs.next());
                    System.out.println("ENTER ROOMS YOU WANT TO ADD");
                    P[i].setRooms(addinputs.next());
                   
                    
                    house_Filing.Write(P[i]);

                }
                array.add(house_Filing.toString());

            }

            if (ch1 == 2) {

                house_Filing.Read();
            }
           
            if (ch1 == 3) {
                System.out.println("UPDATE");
                System.out.println("Enter the name of HOUSE You Want to Update: ");
                Scanner UN = new Scanner(System.in);
                String updateN = UN.next();
                System.out.println("\n\nENTER NEW DETAILS: \n\n");
                System.out.println("ENTER NAME ");
                H_H.setOwner(addinputs.next());
                System.out.println("ENTER ADRESS ");
                H_H.setAddress(addinputs.next());
                System.out.println("ENTER STOREYS ");
                H_H.setStoreys(addinputs.next());
                System.out.println("ENTER ROOMS ");
                H_H.setRooms(addinputs.next());
                

                house_Filing.Update(updateN, H_H);
                house_Filing.Write(H_H);

            }
            if (ch1 == 4) {
                System.out.println("DELETE");
                System.out.println("Enter the name of User You Want to Delete: ");
                Scanner DN = new Scanner(System.in);
                String deleteN = DN.next();

                house_Filing.Delete(deleteN, H_H);
                house_Filing.Write(H_H);

            }
        }
        }
         if(choiceMenu=='b'){
            char choiceAdmin;
             Scanner choiceadmin = new Scanner(System.in);
            System.out.println("\n\t\t\tWELCOME TO USER PANEL");
            System.out.println("\n\t\t\tCLICK ON YOUR CHOICE : \n\t\t\tA) VIEW HOUSES. \n\t\t\tB) RESERVE HOUSES.");
            choiceAdmin = choiceadmin.next().charAt(0);
            if(choiceAdmin=='A'){
            
           HOUSE_FILE house_Filing = new HOUSE_FILE();
          
            System.out.println("YOU CAN NOW VIEW HOUSES\n");
           
            house_Filing.Read();
          
           
            
          
        }
             if(choiceAdmin=='B'){
              
            House_Class H_H = new House_Class();
           

           HOUSE_FILE house_Filing = new HOUSE_FILE();
           

            System.out.println("YOU CAN RESERVE THE FOLLOWING HOUSES");
            

                house_Filing.Read();
          

                System.out.println("Enter the name of House You Want to Reserve: ");
                Scanner DN = new Scanner(System.in);
                String deleteN = DN.next();
             
                house_Filing.Delete(deleteN, H_H);
                house_Filing.Write(H_H);
                 System.out.println("YOU HAVE RESERVED "+deleteN+" HOUSE SUCCESSFULLY");

            
        }
        }
        }
    }
    
    

