
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Menu2 extends javax.swing.JFrame {

    /**
     * Creates new form Menu2
     */Connection con;
     String empid;
    public Menu2(Connection con,String empid) {
        initComponents();
        this.con = con;
        this.empid=empid;
    }

    private Menu2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miChangepas = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        bookingmi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dp2Layout = new javax.swing.GroupLayout(dp2);
        dp2.setLayout(dp2Layout);
        dp2Layout.setHorizontalGroup(
            dp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        dp2Layout.setVerticalGroup(
            dp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        miChangepas.setText("Change Password");
        miChangepas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangepasActionPerformed(evt);
            }
        });
        jMenu1.add(miChangepas);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Manage");

        bookingmi.setText("Customer Booking");
        bookingmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingmiActionPerformed(evt);
            }
        });
        jMenu2.add(bookingmi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dp2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miChangepasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangepasActionPerformed
  ChangePassword2 st = new ChangePassword2(con);
  st.setSize(690,500);
Dimension desktopSize = dp2.getSize();
Dimension jInternalFrameSize = st.getSize();
st.setLocation((desktopSize.width - jInternalFrameSize.width)
        /2,
(desktopSize.height- jInternalFrameSize.height)/2);

 st.setVisible(true); 
dp2.add(st);
    }//GEN-LAST:event_miChangepasActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
         dispose();       
        
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        try{ 
       
        con.close();
    System.exit(0);
    } 
    catch (SQLException ex) {
       ex.printStackTrace();
       JOptionPane.showMessageDialog(this, "some error occured");
    }
      
    }//GEN-LAST:event_exitActionPerformed

    private void bookingmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingmiActionPerformed
     bookings b = new bookings(con,empid);
        b.setSize(720,630);
        Dimension desktopSize = dp2.getSize();
        Dimension jInternalFrameSize = b.getSize();
b.setLocation((desktopSize.width - jInternalFrameSize.width)/2,
    (desktopSize.height - jInternalFrameSize.height)/2);
        
        
        b.setVisible(true);
        dp2.add(b);
    }//GEN-LAST:event_bookingmiActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem bookingmi;
    private javax.swing.JDesktopPane dp2;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenuItem miChangepas;
    // End of variables declaration//GEN-END:variables
}
