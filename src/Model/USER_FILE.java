/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Wajeeha Usman
 */
public class USER_FILE {
 
    ArrayList<User_Class> U_cl = new ArrayList<>();
    

    User_Class pf = new User_Class();

    public USER_FILE() {
          
   }

    public USER_FILE(User_Class u_Class) {

    }

    public ArrayList<User_Class> getU_cl() {
        return U_cl;
    }

    public void setU_cl(ArrayList<User_Class> U_cl) {
        this.U_cl = U_cl;
    }

    public void Write(User_Class user_write) {
        
        try {
            FileOutputStream FOS = new FileOutputStream("USER_FILE.txt");

            PrintStream Print = new PrintStream(FOS);
            U_cl.add(user_write);
            Print.print(U_cl);
            
            Print.close();
            FOS.close();

        
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
        //System.out.println("\n\nEMPLOYEES INFORMATION :\n\n" + getU_cl);
    }

    public void Read() {
        try {

            BufferedReader READER = new BufferedReader(new FileReader("USER_FILE.txt"));
            String str;
            System.out.println("iNFORMATION OF USER ARE : ");
            while ((str = READER.readLine()) != null) {

                
                System.out.println(str);
            }
            READER.close();

        } catch (IOException e) {
            System.out.println("");
        }

    }

    public void Update(String Name, User_Class U_OBJ) {
        
        User_Class F[] = new User_Class[U_cl.size()];
        
        for (int w = 0; w < U_cl.size(); w++) {
            F[w] = U_cl.get(w);

            if (F[w].getName().equals(Name)) {
                U_cl.set(w, U_OBJ);

                System.out.println("Updated Data : " + U_cl);
            } else {
                System.out.println(F[w]);
            }
        }

    }

    public void Delete(String Name, User_Class OBJ_U) {
        User_Class F[] = new User_Class[U_cl.size()];
        for (int u = 0; u < U_cl.size(); u++) {

            F[u] = U_cl.get(u);
            if (F[u].getName().equals(Name)) {
                U_cl.remove(u);
                System.out.println(Name + "'s All Information has been removed Successfully ");

            } else {
                System.out.println("Name not found");
            }

        }
        System.out.println(U_cl);
    }
}
