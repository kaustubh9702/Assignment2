/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Employee;
import Model.EmployeeHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author kaustubh
 */
public class SearchJpanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchJpanel
     */
    
    EmployeeHistory e;
    public SearchJpanel(EmployeeHistory employee) {
        e = employee;
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

        txtSearchID = new javax.swing.JTextField();
        lbDirectory = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lbstartDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        txtTeamInfo1 = new javax.swing.JTextField();
        lbLevel = new javax.swing.JLabel();
        txtID3 = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        lbTeaminfo1 = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbContactNo = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lbEmailAddress = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        txtStartdate1 = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        txtSearchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchIDActionPerformed(evt);
            }
        });

        lbDirectory.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
        lbDirectory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDirectory.setText("EMPLOYEE DIRECTORY");

        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("Search by ID");

        lbstartDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbstartDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbstartDate.setText("Start Date");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbLevel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLevel.setText("Level");

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbName.setText("Name");

        lbID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbID.setText("Employee ID");

        lbTeaminfo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTeaminfo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTeaminfo1.setText("Team info");

        lbGender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbGender.setText("Gender");

        lbContactNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbContactNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbContactNo.setText("Contact No");

        lbEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmailAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmailAddress.setText("Email Address");

        lbAge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAge.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAge.setText("Age");

        btnClear.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        btnClear.setActionCommand("Clear");
        btnClear.setLabel("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbTeaminfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbstartDate, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbGender, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbID))
                                    .addGap(55, 55, 55)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtStartdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(btnClear)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1)))
                .addContainerGap(445, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbName))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbID))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbGender))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbAge))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtStartdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbstartDate))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbLevel))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTeamInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTeaminfo1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbContactNo))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbEmailAddress))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchIDActionPerformed
           
    }//GEN-LAST:event_txtSearchIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if((txtSearchID.getText()).equals("")){
            JOptionPane.showMessageDialog(this, "Enter a valid ID");
        }
        else{
        int id =  Integer.parseInt(txtSearchID.getText());
         Employee em = new Employee();
         em.setEmployee_ID(id);
         em = e.searchEmployee(em);
         txtAge.setText(String.valueOf(em.getAge()));
         txtContactNo.setText(String.valueOf(em.getNumber()));
         txtEmail.setText(String.valueOf(em.getEmail()));
         txtGender.setText(em.getGender());
         txtID3.setText(String.valueOf(em.getEmployee_ID()));
         txtLevel.setText(em.getLevel());
         txtName.setText(em.getName());
         txtStartdate1.setText(String.valueOf(em.getStartDate()));
         txtTeamInfo1.setText(em.getTeam());
           if(em.getName().equals("")){
               JOptionPane.showMessageDialog(this, "Employee not found");
           }else{
               JOptionPane.showMessageDialog(this, "Employee found");
           }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
         txtName.setText("");
        txtGender.setText("");
        txtID3.setText("");
        txtContactNo.setText("");
        txtTeamInfo1.setText("");
        txtStartdate1.setText("");
        txtLevel.setText("");
        txtEmail.setText("");
        txtAge.setText("");
        txtSearchID.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbContactNo;
    private javax.swing.JLabel lbDirectory;
    private javax.swing.JLabel lbEmailAddress;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbLevel;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbTeaminfo1;
    private javax.swing.JLabel lbstartDate;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID3;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchID;
    private javax.swing.JTextField txtStartdate1;
    private javax.swing.JTextField txtTeamInfo1;
    // End of variables declaration//GEN-END:variables
}
