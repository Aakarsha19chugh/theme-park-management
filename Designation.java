
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
public class Designation extends javax.swing.JInternalFrame {

    /**
     * Creates new form Designation
     */
    Connection con;
    public Designation(Connection con) {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdesig = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtdcode = new javax.swing.JTextField();
        txtAdd = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btndel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        desigTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(null);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Designation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(51, 47, 100, 19);
        jPanel1.add(txtdesig);
        txtdesig.setBounds(196, 42, 135, 25);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("Dcode");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(51, 101, 70, 19);
        jPanel1.add(txtdcode);
        txtdcode.setBounds(196, 96, 135, 25);

        txtAdd.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        txtAdd.setText("Add");
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        jPanel1.add(txtAdd);
        txtAdd.setBounds(122, 157, 70, 29);

        btnNew.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);
        btnNew.setBounds(35, 157, 60, 29);

        btnModify.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnModify.setText("Modify");
        btnModify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModifyMouseClicked(evt);
            }
        });
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify);
        btnModify.setBounds(212, 157, 80, 29);

        btndel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btndel.setText("Delete");
        btndel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelActionPerformed(evt);
            }
        });
        jPanel1.add(btndel);
        btndel.setBounds(323, 157, 80, 29);

        desigTable.setModel(new javax.swing.table.DefaultTableModel(
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
        desigTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desigTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(desigTable);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(35, 235, 385, 91);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(90, 60, 450, 390);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ccxcdss.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     
      void fillTable()
    {
        try
        {
        Vector heading=new Vector();
        heading.add("Designation");
        heading.add("Designation Code");
        
        
        
        String query="select * from designation";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        Vector data=new Vector();
        while(rs.next())
        {
            Vector row=new Vector();
            row.add(rs.getString("designation"));
            row.add(rs.getString("dcode"));
            
           
            
            data.add(row);
         }
            DefaultTableModel df=new DefaultTableModel(data,heading);
            desigTable.setModel(df);
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        try {
            String designame = txtdesig.getText();
            String dcode = txtdcode.getText();
            
           
            
            
            String sql = "insert into designation (designation,dcode) values(?,?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, designame);
            p.setString(2, dcode);
            
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            fillTable();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(departments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtAddActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
          try
        {
           
       
            String dname2=txtdesig.getText();
        String dcode2 = txtdcode.getText();
       
        
           
        String sql = "update designation set designation=? where dcode=? ";

        PreparedStatement p = con.prepareStatement(sql);

        p.setString(1, dname2);
  p.setString(2, dcode2);
  
  
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Updated");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btndelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelActionPerformed
        try
        {
            String dcode=txtdcode.getText();
       
        String sql = "delete from  designation where dcode=?";

        PreparedStatement p = con.prepareStatement(sql);
 p.setString(1, dcode);
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

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtdesig.setText("");
        txtdcode.setText("");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModifyMouseClicked
        
    }//GEN-LAST:event_btnModifyMouseClicked

    private void desigTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desigTableMouseClicked
          int rowindex = desigTable.getSelectedRow();
        TableModel tm = desigTable.getModel();

        String designame = (String) tm.getValueAt(rowindex, 0);
      
        String dcode = (String) tm.getValueAt(rowindex, 1);
        
       
        
    txtdesig.setText(designame);
    txtdcode.setText(dcode);
    
        
    }//GEN-LAST:event_desigTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btndel;
    private javax.swing.JTable desigTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtAdd;
    private javax.swing.JTextField txtdcode;
    private javax.swing.JTextField txtdesig;
    // End of variables declaration//GEN-END:variables
}
