
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
public class category extends javax.swing.JInternalFrame {

    /**
     * Creates new form category
     */Connection con;
    public category(Connection con) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcatid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcatname = new javax.swing.JTextField();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnmodify = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(234, 229, 229));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(204, 204, 204), null, null));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel1.setText("Category_id ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 60, 110, 26);

        txtcatid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatidActionPerformed(evt);
            }
        });
        jPanel1.add(txtcatid);
        txtcatid.setBounds(210, 60, 160, 25);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setText("Category Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 110, 130, 26);
        jPanel1.add(txtcatname);
        txtcatname.setBounds(210, 110, 160, 25);

        btnnew.setBackground(new java.awt.Color(0, 153, 204));
        btnnew.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 255, 255));
        btnnew.setText("New");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew);
        btnnew.setBounds(50, 170, 70, 29);

        btnsave.setBackground(new java.awt.Color(0, 153, 204));
        btnsave.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(130, 170, 80, 29);

        btndelete.setBackground(new java.awt.Color(0, 153, 204));
        btndelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);
        btndelete.setBounds(310, 170, 80, 29);

        btnmodify.setBackground(new java.awt.Color(0, 153, 204));
        btnmodify.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        btnmodify.setForeground(new java.awt.Color(255, 255, 255));
        btnmodify.setText("Modify");
        btnmodify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnmodify);
        btnmodify.setBounds(220, 170, 80, 29);

        catTable.setModel(new javax.swing.table.DefaultTableModel(
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
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(catTable);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 220, 340, 90);

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 153));
        jLabel3.setText("MANAGE CATEGORIES");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 10, 220, 33);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 30, 430, 340);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/themepark/aaaaa.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 730, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       try
        {
            String catid=txtcatid.getText();
       
        String sql = "delete from  category where category_id = ?";

        PreparedStatement p = con.prepareStatement(sql);
 p.setString(1, catid);
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Deleted");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_btndeleteActionPerformed
       void fillTable()
    {
        try
        {
        Vector heading=new Vector();
        heading.add("Category ID");
        heading.add("Category Name");
        
        
        
        String query="select * from category";
        PreparedStatement ps=con.prepareStatement(query);
        ResultSet rs=ps.executeQuery();
        Vector data=new Vector();
        while(rs.next())
        {
            Vector row=new Vector();
            row.add(rs.getString("category_id"));
            row.add(rs.getString("category_name"));
            
           
            
            data.add(row);
         }
            DefaultTableModel df=new DefaultTableModel(data,heading);
            catTable.setModel(df);
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }
        
    }
    
    
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         try {
            String catid = txtcatid.getText();
            String catname = txtcatname.getText();
            
           
            
            
            String sql = "insert into category (category_id, category_name) values(?,?)";
            PreparedStatement p = con.prepareStatement(sql);
            p.setString(1, catid);
            p.setString(2, catname);
            
            
            p.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Data Saved");
            fillTable();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(departments.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        txtcatid.setText("");
        txtcatname.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnmodifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifyActionPerformed
          try
        {
           
       
            String catid2= txtcatid.getText();
            String catname2= txtcatname.getText();
       
        
           
        String sql = "update category set category_name= ? where category_id= ? ";

        PreparedStatement p = con.prepareStatement(sql);

        p.setString(1,catname2);
        p.setString(2, catid2);
  
  
        p.executeUpdate();

        JOptionPane.showMessageDialog(this, "Data Updated");  
        fillTable();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error occured "+ex.getMessage());
            ex.printStackTrace();
        }  
    }//GEN-LAST:event_btnmodifyActionPerformed

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
           int rowindex = catTable.getSelectedRow();
        TableModel tm = catTable.getModel();

        String catid = (String) tm.getValueAt(rowindex, 0);
      
        String catname = (String) tm.getValueAt(rowindex, 1);
        
       
        
    txtcatid.setText(catid);
    txtcatname.setText(catname);
    
        
    }//GEN-LAST:event_catTableMouseClicked

    private void txtcatidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcatidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnmodify;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JTable catTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcatid;
    private javax.swing.JTextField txtcatname;
    // End of variables declaration//GEN-END:variables
}
