/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InventorySystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ASUS
 */
public class StockPage extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public StockPage() {
        initComponents();
    }
    
    public void updateTable(){
        String sql = "select * from stock";
        try{
            con = Connections.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            System.out.print(e);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddNew = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 30)); // NOI18N
        jLabel1.setText("Stock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(469, 469, 469)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonAddNew.setBackground(new java.awt.Color(8, 82, 119));
        jButtonAddNew.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jButtonAddNew.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAddNew.setText("Add New Stock");
        jButtonAddNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddNewActionPerformed(evt);
            }
        });

        jButtonUpdate.setBackground(new java.awt.Color(8, 82, 119));
        jButtonUpdate.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setText("Update stock");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonRemove.setBackground(new java.awt.Color(8, 82, 119));
        jButtonRemove.setFont(new java.awt.Font("Forte", 0, 18)); // NOI18N
        jButtonRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setText("Remove stock");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jTextFieldSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchActionPerformed(evt);
            }
        });
        jTextFieldSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldSearchKeyReleased(evt);
            }
        });

        jButtonRefresh.setText("Refresh");
        jButtonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefreshActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Price", "Quantity", "Description", "Category"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRefresh))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddNew, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(205, 205, 205))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void jButtonAddNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddNewActionPerformed
        // TODO add your handling code here:
        //Add new stock button
        AddNewStock addnew = new AddNewStock();
        addnew.setVisible(true);
    }//GEN-LAST:event_jButtonAddNewActionPerformed

    private void jButtonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefreshActionPerformed
        updateTable();
    }//GEN-LAST:event_jButtonRefreshActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        //Update button
        UpdateStock updateS = new UpdateStock();
        
        int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String name = model.getValueAt(index, 1).toString();
        String price = model.getValueAt(index, 2).toString();
        String quantity = model.getValueAt(index, 3).toString();
        String description = model.getValueAt(index, 4).toString();
        String category = model.getValueAt(index, 5).toString();
        
        updateS.setVisible(true);
        
        updateS.jComboBoxCategory.setSelectedItem(category);
        updateS.jTextFieldName.setText(name);
        updateS.jTextFieldPrice.setText(price);
        updateS.jTextFieldQty.setText(quantity);
        updateS.jTextAreaDesc.setText(description);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            con = Connections.getConnection();
            pst = con.prepareStatement("select * from stock");
            rs = pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        }
        catch(Exception e){
            System.out.print(e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String cell = jTable1.getModel().getValueAt(row, 0).toString();
        String sql = "delete from stock where id =" + cell;
        int respond = JOptionPane.showConfirmDialog(rootPane, "Confirm to delete the selected stock?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respond == JOptionPane.YES_OPTION){
        try{
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Sucessfully Deleted","Success",JOptionPane.INFORMATION_MESSAGE);
            updateTable();
        }
        catch (Exception e){
            System.out.print(e);
        }
        }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jTextFieldSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldSearchKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        String search = jTextFieldSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_jTextFieldSearchKeyReleased

    private void jTextFieldSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StockPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddNew;
    private javax.swing.JButton jButtonRefresh;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
