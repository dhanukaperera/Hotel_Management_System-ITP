/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.restaurant_management;


import model.restaurant_management.All_Bill_Details_Model;
import source.ImageProcessing;
import source.Validation;

/**
 *
 * @author Dhanuka Perera
 */
public class All_Bill_Details_Details_Frame extends javax.swing.JPanel {

      ImageProcessing changebtnImage = new ImageProcessing();
      Validation val = new Validation();
      
      All_Bill_Details_Model obj = new All_Bill_Details_Model();
      
    public All_Bill_Details_Details_Frame() {
        initComponents();
        obj.takeoutorderstableloadmethod();
        obj.restaurantorderstableloadmethod();
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        cmbSearchByTakeout = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtSearchtakeoutorders = new javax.swing.JTextField();
        btnSearch = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurantBill = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltakeoutorders = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        cmbSearchByDineIn = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtSearchRestaurantOrders = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(221, 221, 221));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Search By :");

        cmbSearchByTakeout.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bill ID" }));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchIcon.png"))); // NOI18N

        txtSearchtakeoutorders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchtakeoutorders.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchtakeoutorders.setText("Search...");
        txtSearchtakeoutorders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchtakeoutordersMouseClicked(evt);
            }
        });
        txtSearchtakeoutorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchtakeoutordersActionPerformed(evt);
            }
        });
        txtSearchtakeoutorders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchtakeoutordersKeyReleased(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchButton.png"))); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        tblRestaurantBill.setBackground(new java.awt.Color(52, 73, 94));
        tblRestaurantBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblRestaurantBill.setForeground(new java.awt.Color(255, 255, 255));
        tblRestaurantBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Bill_ID", "FOB_ID", "Type", "Name", "QTY", "Price", "Service_Charges", "Total", "Discount", "Paid_Amount", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRestaurantBill.setGridColor(new java.awt.Color(189, 195, 199));
        jScrollPane1.setViewportView(tblRestaurantBill);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Take Out Orders Bill Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Restaurant DineIn Bill Information");

        tbltakeoutorders.setBackground(new java.awt.Color(52, 73, 94));
        tbltakeoutorders.setForeground(new java.awt.Color(255, 255, 255));
        tbltakeoutorders.setModel(new javax.swing.table.DefaultTableModel(
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
        tbltakeoutorders.setGridColor(new java.awt.Color(189, 195, 199));
        jScrollPane2.setViewportView(tbltakeoutorders);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Search By :");

        cmbSearchByDineIn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bill ID" }));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchIcon.png"))); // NOI18N

        txtSearchRestaurantOrders.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchRestaurantOrders.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchRestaurantOrders.setText("Search...");
        txtSearchRestaurantOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchRestaurantOrdersMouseClicked(evt);
            }
        });
        txtSearchRestaurantOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchRestaurantOrdersActionPerformed(evt);
            }
        });
        txtSearchRestaurantOrders.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchRestaurantOrdersKeyReleased(evt);
            }
        });

        btnSearch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchButton.png"))); // NOI18N
        btnSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearch1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSearchByDineIn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchRestaurantOrders)
                        .addGap(0, 0, 0)
                        .addComponent(btnSearch1))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSearchByTakeout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSearchtakeoutorders, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnSearch)))
                        .addGap(0, 390, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(cmbSearchByTakeout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtSearchtakeoutorders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cmbSearchByDineIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtSearchRestaurantOrders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchtakeoutordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchtakeoutordersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchtakeoutordersActionPerformed

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        obj.Modelsearchtakout();
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchtakeoutordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchtakeoutordersMouseClicked
        txtSearchtakeoutorders.setText("");
    }//GEN-LAST:event_txtSearchtakeoutordersMouseClicked

    private void txtSearchtakeoutordersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchtakeoutordersKeyReleased
        obj.Modelsearchtakout();
    }//GEN-LAST:event_txtSearchtakeoutordersKeyReleased

    private void txtSearchRestaurantOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchRestaurantOrdersMouseClicked
       txtSearchRestaurantOrders.setText("");
    }//GEN-LAST:event_txtSearchRestaurantOrdersMouseClicked

    private void txtSearchRestaurantOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchRestaurantOrdersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchRestaurantOrdersActionPerformed

    private void txtSearchRestaurantOrdersKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchRestaurantOrdersKeyReleased
        obj.Modelsearchdinein();
    }//GEN-LAST:event_txtSearchRestaurantOrdersKeyReleased

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked
        obj.Modelsearchdinein();
    }//GEN-LAST:event_btnSearch1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnSearch;
    private javax.swing.JLabel btnSearch1;
    public static javax.swing.JComboBox cmbSearchByDineIn;
    public static javax.swing.JComboBox cmbSearchByTakeout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable tblRestaurantBill;
    public static javax.swing.JTable tbltakeoutorders;
    public static javax.swing.JTextField txtSearchRestaurantOrders;
    public static javax.swing.JTextField txtSearchtakeoutorders;
    // End of variables declaration//GEN-END:variables
}
