/*
 * Hotel Management System for Pavana Hotel Kochchikade
 * Information Technology Project - 2016
 * Project ID   : ITP_WD_16_B1_06
 * Supervisor   : Mrs. Asanthika Imbulpitiya
 *
 * Student Name : Rathnayaka W.R.A.C.J   
 * IT Number    : IT14031380
*/
package app.finance_management;

import app.employee_management.Salary_Calculation_Frame;
import static app.finance_management.Incomes_Management_Frame.txtAmount;
import app.stock_management.Taking_Stock_Frame;
import app.transport_and_tour_management.Revenue_Report_Frame;
import javax.swing.JOptionPane;
import model.finance_management.Expenses_Management_Model;
import source.ImageProcessing;
import source.Validation;

/**
 *
 * @author Dhanuka Perera
 */
public class Expenses_Management_Frame extends javax.swing.JPanel {

   ImageProcessing changebtnImage = new ImageProcessing();
    public Expenses_Management_Model obj = new Expenses_Management_Model();
     Validation validate = new Validation();
   
    public Expenses_Management_Frame() {
        initComponents();
        obj.loadTable("expenses_management",tblExpenses);
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
        btnAdd = new javax.swing.JLabel();
        btnDelete = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        btnReport = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        cmbDepartment = new javax.swing.JComboBox<>();
        lblDepartment1 = new javax.swing.JLabel();
        cmbBarchart = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbTimePeriod = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbSearchBy = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExpenses = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblExpense = new javax.swing.JLabel();
        lblAmount = new javax.swing.JLabel();
        txtExpense = new javax.swing.JTextField();
        txtAmount = new javax.swing.JTextField();
        lblExpenseNo = new javax.swing.JLabel();
        txtExpenseNo = new javax.swing.JTextField();
        panelchart = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(221, 221, 221));

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Add_def.png"))); // NOI18N
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Delete_def.png"))); // NOI18N
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDeleteMouseExited(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Update_def.png"))); // NOI18N
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Clear_def.png"))); // NOI18N
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClearMouseExited(evt);
            }
        });

        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/buttons/Report_def.png"))); // NOI18N
        btnReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportMouseExited(evt);
            }
        });

        lblDepartment.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDepartment.setText("Department :");

        cmbDepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Stock", "Employee Management", "Laundry and Room Service", "Tour and Transport Management", "Other", " " }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        lblDepartment1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDepartment1.setText("Chart Type :");

        cmbBarchart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bar chart", "Pie chart", "Line chart" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Time Period :");

        cmbTimePeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Monthly", "Annualy" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd)
                .addGap(0, 0, 0)
                .addComponent(btnUpdate)
                .addGap(0, 0, 0)
                .addComponent(btnDelete)
                .addGap(0, 0, 0)
                .addComponent(btnClear)
                .addGap(0, 0, 0)
                .addComponent(btnReport)
                .addGap(27, 27, 27)
                .addComponent(lblDepartment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDepartment1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbBarchart, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTimePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear)
                    .addComponent(btnReport))
                .addGap(2, 2, 2))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDepartment)
                    .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartment1)
                    .addComponent(cmbBarchart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cmbTimePeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Search By :");

        cmbSearchBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EXP MANG ID", "Expense", "Date Modified", "Amount", "Department" }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchIcon.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/other/searchButton.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearch.setText("Search");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        tblExpenses.setBackground(new java.awt.Color(52, 73, 94));
        tblExpenses.setForeground(new java.awt.Color(255, 255, 255));
        tblExpenses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Expense No", "Date Modified", "Expense", "Amount"
            }
        ));
        tblExpenses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExpensesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExpenses);

        lblExpense.setText("Expense");

        lblAmount.setText("Amount");

        lblExpenseNo.setText("Expense No");

        txtExpenseNo.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblExpenseNo)
                .addGap(18, 18, 18)
                .addComponent(txtExpenseNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblExpense)
                .addGap(18, 18, 18)
                .addComponent(txtExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblAmount)
                .addGap(18, 18, 18)
                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExpense)
                    .addComponent(lblAmount)
                    .addComponent(txtExpense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpenseNo)
                    .addComponent(txtExpenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelchart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelchart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(txtSearch)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cmbSearchBy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSearch)))
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelchart, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        changebtnImage.buttonState(btnAdd, "Add_hov");
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        changebtnImage.buttonState(btnAdd, "Add_def");
    }//GEN-LAST:event_btnAddMouseExited

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        changebtnImage.buttonState(btnUpdate, "Update_hov");
    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        changebtnImage.buttonState(btnUpdate, "Update_def");
    }//GEN-LAST:event_btnUpdateMouseExited

    private void btnDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseEntered
        changebtnImage.buttonState(btnDelete, "Delete_hov");
    }//GEN-LAST:event_btnDeleteMouseEntered

    private void btnDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseExited
        changebtnImage.buttonState(btnDelete, "Delete_def");
    }//GEN-LAST:event_btnDeleteMouseExited

    private void btnClearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseEntered
        changebtnImage.buttonState(btnClear, "Clear_hov");
    }//GEN-LAST:event_btnClearMouseEntered

    private void btnClearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseExited
        changebtnImage.buttonState(btnClear, "Clear_def");
    }//GEN-LAST:event_btnClearMouseExited

    private void btnReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseEntered
        changebtnImage.buttonState(btnReport, "Report_hov");
    }//GEN-LAST:event_btnReportMouseEntered

    private void btnReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseExited
        changebtnImage.buttonState(btnReport, "Report_def");
    }//GEN-LAST:event_btnReportMouseExited

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
         if(Validation.isEmpty(txtExpense, "Expense can't be empty")==true)
      {
          if(Validation.isEmpty(txtAmount, "Amount can't be empty")==true)
          {
             int msg = JOptionPane.showConfirmDialog(null,"Do you really want to Add a new record?");
             
             if(msg==0)
             {
                  if(Validation.isNumber(txtAmount, "Invalid Data")==true){
                        if(Validation.isPositive(txtAmount, "Invalid Data")==true){
                            
                             obj.add("expenses_management");
                     JOptionPane.showMessageDialog(null, "Record Added Successfully");
                        }
                  }
             }
          }
      }
      clear();
    
       
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        
             
        if(Validation.isEmpty(txtExpense, "Income can't be empty")==true)
      {
          if(Validation.isEmpty(txtAmount, "Amount can't be empty")==true)
          {
             int msg = JOptionPane.showConfirmDialog(null,"Do you really want to DELETE this record?");
             
             if(msg==0)
             {
                 int selectedrow = tblExpenses.getSelectedRow();
                 String expensecolumn = (String) tblExpenses.getValueAt(selectedrow, 2);
                 obj.delete("expenses_management", "EXP MANG ID", obj.getPrimaryKey(),tblExpenses);
                
//                //frank
//                  if(expensecolumn.startsWith("BID")){
//                     System.out.println("chami");
//                     obj.delete("History ID", "History ID", obj.getPrimaryKey(),Taking_Stock_Frame.tblTakingStock);  
//                 }
//                 //khan
//                 else if(expensecolumn.startsWith("")){
//                     obj.delete("revenue report", "Reavenue ID", obj.getPrimaryKey(),Revenue_Report_Frame.tblvad);
//                 }
//                 //udesika
//                 else if(expensecolumn.startsWith("")){
//                     obj.delete("salary_calculation", "SalaryRecordNumber", obj.getPrimaryKey(),Salary_Calculation_Frame.tblSalaryCalculations);
//                 }
                 
                
                 JOptionPane.showMessageDialog(null, "Record Deleted Successfully");
             }
          }
      }
      clear();
      
    }//GEN-LAST:event_btnDeleteMouseClicked

    private void tblExpensesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExpensesMouseClicked
        obj.setAll();
    }//GEN-LAST:event_tblExpensesMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
         if(Validation.isEmpty(txtExpense, "Expense can't be empty")==true)
      {
          if(Validation.isEmpty(txtAmount, "Amount can't be empty")==true)
          {
             int msg = JOptionPane.showConfirmDialog(null,"Do you really want to UPDATE this record?");
             
             if(msg==0)
             {
                  if(Validation.isNumber(txtAmount, "Invalid Data")==true){
                        if(Validation.isPositive(txtAmount, "Invalid Data")==true){
                      obj.update("expenses_management");
                      JOptionPane.showMessageDialog(null, "Record Updated Successfully");
                        }
                  }
             }
          }
      }
      
      clear();
        
        
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportMouseClicked
       // obj.zeroexpense();
       // obj.report();
        obj.charts();
    }//GEN-LAST:event_btnReportMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        clear();
    }//GEN-LAST:event_btnClearMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        obj.Modelsearch();
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        clear();
    }//GEN-LAST:event_txtSearchMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
    }//GEN-LAST:event_jLabel6MouseClicked
    public void clear(){
       txtAmount.setText("");
       txtExpense.setText(""); 
       txtSearch.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnDelete;
    private javax.swing.JLabel btnReport;
    private javax.swing.JLabel btnUpdate;
    public static javax.swing.JComboBox<String> cmbBarchart;
    public static javax.swing.JComboBox<String> cmbDepartment;
    public static javax.swing.JComboBox<String> cmbSearchBy;
    public static javax.swing.JComboBox<String> cmbTimePeriod;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblDepartment1;
    private javax.swing.JLabel lblExpense;
    private javax.swing.JLabel lblExpenseNo;
    public static javax.swing.JPanel panelchart;
    public static javax.swing.JTable tblExpenses;
    public static javax.swing.JTextField txtAmount;
    public static javax.swing.JTextField txtExpense;
    public static javax.swing.JTextField txtExpenseNo;
    public static javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
