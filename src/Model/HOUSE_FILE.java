/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Wajeeha Usman
 */
public class HOUSE_FILE {
    
    ArrayList<House_Class> H_cl = new ArrayList<>();
    

    House_Class hc = new House_Class();

    public HOUSE_FILE() {
          
   }

    public HOUSE_FILE(House_Class u_Class) {

    }

    public ArrayList<House_Class> getH_cl() {
        return H_cl;
    }

    public void setH_cl(ArrayList<House_Class> U_cl) {
        this.H_cl = U_cl;
    }

    public void Write(House_Class user_write) {
        
        try {
            FileOutputStream FOS = new FileOutputStream("HOUSE_FILE.txt");

            PrintStream Print = new PrintStream(FOS);
            H_cl.add(user_write);
            Print.print(H_cl);
            
            Print.close();
            FOS.close();

        
        } catch (IOException ioex) {
            ioex.printStackTrace();
        }
       
    }

    public void Read() {
        try {

            BufferedReader READER = new BufferedReader(new FileReader("HOUSE_FILE.txt"));
            String str;
            System.out.println("INFORMATION OF USER ARE : ");
            while ((str = READER.readLine()) != null) {

                
                System.out.println(str);
            }
            READER.close();

        } catch (IOException e) {
            System.out.println("");
        }

    }

 

    public void Update(String Name, House_Class H_OBJ) {
        
        House_Class F[] = new House_Class[H_cl.size()];
        
        for (int w = 0; w < H_cl.size(); w++) {
            F[w] = H_cl.get(w);

            if (F[w].getOwner().equals(Name)) {
                H_cl.set(w, H_OBJ);

                System.out.println("Updated Data : " + H_cl);
            } else {
                System.out.println(F[w]);
            }
        }

    }

    public void Delete(String Name, House_Class OBJ_U) {
        House_Class F[] = new House_Class[H_cl.size()];
        for (int u = 0; u < H_cl.size(); u++) {

            F[u] = H_cl.get(u);
            if (F[u].getOwner().equals(Name)) {
                H_cl.remove(u);
                //System.out.println(Name + "'s All Information has been removed Successfully ");

            } else {
                System.out.println("Name not found");
            }

        }
        System.out.println(H_cl);
    }
}
