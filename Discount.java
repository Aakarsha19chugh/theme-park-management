
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Discount extends javax.swing.JInternalFrame {

    /**
     * Creates new form Discount
     */Connection con;
    public Discount(Connection con) {
        initComponents();
        this.con = con;
        fillTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        distab = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdisperc = new javax.swing.JLabel();
        txtdisname = new javax.swing.JTextField();
        txtdisid = new javax.swing.JTextField();
        txtdiscountper = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        txtModify = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/dis.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(450, 40, 300, 300);

        distab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        distab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                distabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(distab);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 320, 490, 140);

        jPanel1.setBackground(new java.awt.Color(255, 102, 153));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel1.setText("Discount ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 30, 110, 23);

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel2.setText("Discount Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 70, 140, 17);

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 14)); // NOI18N
        jLabel3.setText("Discount percentage");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 110, 170, 23);

        txtdisperc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtdisperc.setText("%");
        jPanel1.add(txtdisperc);
        txtdisperc.setBounds(360, 120, 28, 15);

        txtdisname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisnameActionPerformed(evt);
            }
        });
        jPanel1.add(txtdisname);
        txtdisname.setBounds(210, 70, 130, 25);
        jPanel1.add(txtdisid);
        txtdisid.setBounds(210, 30, 130, 25);
        jPanel1.add(txtdiscountper);
        txtdiscountper.setBounds(210, 110, 130, 25);

        btnnew.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew);
        btnnew.setBounds(10, 170, 70, 25);

        btnsave.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnsave.setText("Add");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(95, 170, 80, 29);

        txtModify.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtModify.setText("Modify");
        txtModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyActionPerformed(evt);
            }
        });
        jPanel1.add(txtModify);
        txtModify.setBounds(305, 170, 80, 29);

        btndel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel);
        btndel.setBounds(203, 170, 80, 29);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 60, 394, 218);

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blue.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 770, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
          void fillTable()
    {
        try
        {
        Vector heading=new Vector();
        heading.add("Discount Name");
        heading.add("Discount ID");
        heading.add("Dicount Percentage");
        
        
        String query="select * from discount";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        Vector data=new Vector();
        while(rs.next())
        {
            Vector row=new Vector();
            row.add(rs.getString("discount_name"));
            row.add(rs.getString("discount_id"));
            row.add(rs.getString("discount_percentage"));
           
            
            data.add(row);
         }
            DefaultTableModel df=new DefaultTableModel(data,heading);
            distab.setModel(df);
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
                try {
            String disid = txtdisid.getText();
            String dname = txtdisname.getText();
            
           
            String percentage = txtdiscountper.getText();
            
            String sql = "insert into discount (discount_id ,discount_name, discount_percentage) values(?,?,?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, disid);
            p.setString(2, dname);
            p.setString(3, percentage);
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            fillTable();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(departments.class.getName()).log(Level.SEVERE, null, ex);
        }
                                          

    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtdisid.setText("");
        txtdisname.setText("");
        txtdisperc.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewActionPerformed

    private void distabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_distabMouseClicked
         int rowindex = distab.getSelectedRow();
        TableModel tm = distab.getModel();

        String disname = (String) tm.getValueAt(rowindex, 0);
      
        String disid = (String) tm.getValueAt(rowindex, 1);
        
       String perc = (String)tm.getValueAt(rowindex,2);
        
    txtdisname.setText(disname);
    txtdisid.setText(disid);
    txtdiscountper.setText(perc);
        
    }//GEN-LAST:event_distabMouseClicked

    private void txtModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyActionPerformed
           try
        {
           
       
        String disname1=txtdisname.getText();
        String disid1 = txtdisid.getText();
        String perc1=txtdiscountper.getText();
        
           
        String sql = "update discount set discount_name=?,discount_percentage=? where discount_id =? ";

        PreparedStatement p = con.prepareStatement(sql);

  p.setString(1, disname1);
  p.setString(3, disid1);
  p.setString(2, perc1);
  
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Updated");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
        
    }//GEN-LAST:event_txtModifyActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
      try
        {
            String disid=txtdisid.getText();
       
        String sql = "delete from  discount where discount_id=?";

        PreparedStatement p = con.prepareStatement(sql);
 p.setString(1,disid);
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Deleted");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_btndelActionPerformed

    private void txtdisnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndel;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JTable distab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtModify;
    private javax.swing.JTextField txtdiscountper;
    private javax.swing.JTextField txtdisid;
    private javax.swing.JTextField txtdisname;
    private javax.swing.JLabel txtdisperc;
    // End of variables declaration//GEN-END:variables
}
