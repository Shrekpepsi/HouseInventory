/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Wajeeha Usman
 */
public class Exit extends javax.swing.JFrame {

    /**
     * Creates new form Exit
     */
    public Exit() {
        initComponents();
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
        Exitt = new javax.swing.JLabel();
        STARTAGAIN = new javax.swing.JButton();
        Backkgound = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Exitt.setFont(new java.awt.Font("Freestyle Script", 1, 24)); // NOI18N
        Exitt.setForeground(new java.awt.Color(51, 0, 51));
        Exitt.setText("THANK YOU! FOR USING OUR WEBSITE");
        jPanel1.add(Exitt);
        Exitt.setBounds(150, 120, 350, 220);

        STARTAGAIN.setText("START AGAIN");
        STARTAGAIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STARTAGAINActionPerformed(evt);
            }
        });
        jPanel1.add(STARTAGAIN);
        STARTAGAIN.setBounds(370, 390, 120, 70);

        Backkgound.setBackground(new java.awt.Color(51, 0, 51));
        Backkgound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/housesssssss.jpeg"))); // NOI18N
        jPanel1.add(Backkgound);
        Backkgound.setBounds(0, 0, 540, 510);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 640, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void STARTAGAINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STARTAGAINActionPerformed
        // TODO add your handling code here:
         START ex=new START();
       ex.setVisible(true);
       ex.setDefaultCloseOperation(0);
    }//GEN-LAST:event_STARTAGAINActionPerformed

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
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backkgound;
    private javax.swing.JLabel Exitt;
    private javax.swing.JButton STARTAGAIN;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
