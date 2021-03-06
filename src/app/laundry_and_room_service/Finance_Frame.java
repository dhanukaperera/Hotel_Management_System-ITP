/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.laundry_and_room_service;

import javax.swing.JOptionPane;
import model.laundry_and_room_service.Finance_Model;
import source.ImageProcessing;

/**
 *
 * @author Dhanuka Perera
 */
public class Finance_Frame extends javax.swing.JPanel {
    
    Finance_Model obj = new Finance_Model();
    
    public Finance_Frame() 
    {
        initComponents();
        obj.loadTable("finance", tblFinance);
    }

    ImageProcessing changebtnImage = new ImageProcessing();
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pnlNavigation = new javax.swing.JPanel();
        btnViewCustomRange = new javax.swing.JLabel();
        lblDisplayBy = new javax.swing.JLabel();
        cmbDisplayBy = new javax.swing.JComboBox<>();
        lblOrderBy = new javax.swing.JLabel();
        cmbOrderBy = new javax.swing.JComboBox<>();
        lblSearchBy = new javax.swing.JLabel();
        cmbSearchBy = new javax.swing.JComboBox<>();
        lblSearchIcon = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFinance = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1020, 570));

        pnlNavigation.setBackground(new java.awt.Color(221, 221, 221));

        btnViewCustomRange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Report_def.png"))); // NOI18N
        btnViewCustomRange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewCustomRangeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewCustomRangeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewCustomRangeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigationLayout = new javax.swing.GroupLayout(pnlNavigation);
        pnlNavigation.setLayout(pnlNavigationLayout);
        pnlNavigationLayout.setHorizontalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigationLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnViewCustomRange)
                .addContainerGap(927, Short.MAX_VALUE))
        );
        pnlNavigationLayout.setVerticalGroup(
            pnlNavigationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnViewCustomRange)
        );

        lblDisplayBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDisplayBy.setText("Display By :");

        cmbDisplayBy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbDisplayBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order No", "Room No", "Guest ID", "Date", "Item" }));
        cmbDisplayBy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDisplayByActionPerformed(evt);
            }
        });

        lblOrderBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrderBy.setText("Order By :");

        cmbOrderBy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Order No", "Room No", "Guest ID", "Date", "Item" }));

        lblSearchBy.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSearchBy.setText("Search By :");

        cmbSearchBy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Finance ID", "Order NO", "Type" }));

        lblSearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchIcon.png"))); // NOI18N

        txtSearchBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchBox.setText("Search ...");
        txtSearchBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchBoxMouseClicked(evt);
            }
        });
        txtSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoxActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchButton.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        tblFinance.setBackground(new java.awt.Color(52, 73, 94));
        tblFinance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblFinance.setForeground(new java.awt.Color(255, 255, 255));
        tblFinance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "FinanceID", "OrderNO", "Date", "Type", "Price"
            }
        ));
        tblFinance.setGridColor(new java.awt.Color(189, 195, 199));
        jScrollPane1.setViewportView(tblFinance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlNavigation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisplayBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDisplayBy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOrderBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSearchBy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblSearchIcon)
                        .addGap(0, 0, 0)
                        .addComponent(txtSearchBox, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSearch))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlNavigation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisplayBy)
                            .addComponent(cmbDisplayBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblOrderBy)
                            .addComponent(cmbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSearchBy)
                            .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblSearchIcon))
                    .addComponent(txtSearchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomRangeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCustomRangeMouseExited
        changebtnImage.buttonState(btnViewCustomRange, "Report_def");
    }//GEN-LAST:event_btnViewCustomRangeMouseExited

    private void btnViewCustomRangeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCustomRangeMouseEntered
        changebtnImage.buttonState(btnViewCustomRange, "Report_hov");
    }//GEN-LAST:event_btnViewCustomRangeMouseEntered

    private void cmbDisplayByActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDisplayByActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDisplayByActionPerformed

    private void txtSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoxActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        obj.Modelsearch();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchBoxMouseClicked
        Finance_Frame.txtSearchBox.setText("");
    }//GEN-LAST:event_txtSearchBoxMouseClicked

    private void btnViewCustomRangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCustomRangeMouseClicked
        obj.report();
    }//GEN-LAST:event_btnViewCustomRangeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnViewCustomRange;
    private javax.swing.JComboBox<String> cmbDisplayBy;
    private javax.swing.JComboBox<String> cmbOrderBy;
    public static javax.swing.JComboBox<String> cmbSearchBy;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDisplayBy;
    private javax.swing.JLabel lblOrderBy;
    private javax.swing.JLabel lblSearchBy;
    private javax.swing.JLabel lblSearchIcon;
    private javax.swing.JPanel pnlNavigation;
    public static javax.swing.JTable tblFinance;
    public static javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
