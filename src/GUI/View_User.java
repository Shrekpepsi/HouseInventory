/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Controller.User_File;
import Controller.User_Class;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wajeeha Usman
 */
public class View_User extends javax.swing.JFrame {

    /**
     * Creates new form View_User
     */
    public View_User() {
        initComponents();
        model = (DefaultTableModel)TABLE.getModel();
        
        ViewDataInTable();
    }
   ArrayList <String>l=new ArrayList<>();
  
 
User_File F=new  User_File();
  
    private DefaultTableModel model;
    
    private void ViewDataInTable(){
        
        ArrayList <User_Class> a =new ArrayList<>() ;
        a=F.readfromFile();
        
        for(User_Class u : a){
            Object[] o=new Object[4];
            
            o[0] = u.getName();
            o[1] = u.getEmail();
            o[2] = u.getCnic();
            o[3] = u.getPhone();
             
            model.addRow(o);
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Backk = new javax.swing.JButton();
        Exitt = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLE = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(null);

        Backk.setText("Back");
        Backk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackkActionPerformed(evt);
            }
        });
        jPanel1.add(Backk);
        Backk.setBounds(30, 400, 90, 50);

        Exitt.setText("Exiit");
        Exitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExittActionPerformed(evt);
            }
        });
        jPanel1.add(Exitt);
        Exitt.setBounds(460, 400, 90, 50);

        head.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        head.setForeground(new java.awt.Color(255, 255, 255));
        head.setText("USER INFORMATION");
        jPanel1.add(head);
        head.setBounds(120, 50, 320, 70);

        TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "CNIC", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TABLE);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 130, 452, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackkActionPerformed
        // TODO update your handling code here:
        User_Info_AdminPanel u=new User_Info_AdminPanel();
        u.setVisible(true);
        u.setDefaultCloseOperation(0);
    }//GEN-LAST:event_BackkActionPerformed

    private void ExittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExittActionPerformed
        // TODO update your handling code here:
        Exit ex=new Exit();
        ex.setVisible(true);
        ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_ExittActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Backk;
    private javax.swing.JButton Exitt;
    private javax.swing.JTable TABLE;
    private javax.swing.JLabel head;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}