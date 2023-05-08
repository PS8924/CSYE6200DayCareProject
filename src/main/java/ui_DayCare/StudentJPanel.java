/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.ui_DayCare;

import com.alexandriasoftware.swing.JInputValidator;
import com.alexandriasoftware.swing.JInputValidatorPreferences;
import com.alexandriasoftware.swing.Validation;
import ui_DayCare.dao.StudentDAO;
import ui_DayCare.model.GroupInfo;
import ui_DayCare.model.Student;
import ui_DayCare.utils.Helper;

import javax.swing.*;
import java.util.Date;

/**
 *
 * @author kpsingh
 */
public class StudentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentJPanel
     */
    
    JSplitPane splitPane;
    public StudentJPanel(JSplitPane splitPane) {
        initComponents();
        populateComponents();
        this.splitPane = splitPane;
    }


    private void populateComponents() {
        txtStudentName.setText("");
        txtStudentName.setInputVerifier(new JInputValidator(txtStudentName) {
            @Override
            protected Validation getValidation(JComponent input, JInputValidatorPreferences preferences) {
                if (txtStudentName.getText().length() < 8) {
                    return new Validation(Validation.Type.DANGER, "Too short", preferences);
                }
                return new Validation(Validation.Type.NONE, "", preferences);
            }
        });
        txtDob.setText("");
        txtParentName.setText(""); // emergency contact name
        txtAge.setText("");
        txtGpa.setText("");
        txtTeacher.setText("");
        txtEmergencyContact.setText(""); // number
//        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(GroupInfo.getDisplayStrings()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hapetitisbtnGroup = new javax.swing.ButtonGroup();
        lblName = new javax.swing.JLabel();
        lblGroup = new javax.swing.JLabel();
        lblDob = new javax.swing.JLabel();
        lblParentName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblHeadingMain = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtParentName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblGpa = new javax.swing.JLabel();
        lblTeacher = new javax.swing.JLabel();
        lblEmergencyContact = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtGpa = new javax.swing.JTextField();
        txtTeacher = new javax.swing.JTextField();
        txtEmergencyContact = new javax.swing.JTextField();
        groupComboBox = new javax.swing.JComboBox<>();
        addressArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        descriptionArea = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        lblVaccination = new javax.swing.JLabel();
        lblHapetitisB = new javax.swing.JLabel();
        btnHapetitisYes = new javax.swing.JRadioButton();
        btnHapetitisNo = new javax.swing.JRadioButton();
        lblMeasels = new javax.swing.JLabel();
        btnMeaselsYes = new javax.swing.JRadioButton();
        btnMeaselsNo = new javax.swing.JRadioButton();
        lblPolio = new javax.swing.JLabel();
        btnPolioYes = new javax.swing.JRadioButton();
        btnPolioNo = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setBackground(new java.awt.Color(106, 137, 204));
        setRequestFocusEnabled(false);

        lblName.setText("Name");

        lblGroup.setText("Group");

        lblDob.setText("Date Of Birth");

        lblParentName.setText("Emergency Contact Name");

        lblAddress.setText("Address");

        lblHeadingMain.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        lblHeadingMain.setText("Student Details");

        txtDob.setText("jTextField2");

        txtParentName.setText("jTextField4");

        lblAge.setText("Age");

        lblGpa.setText("GPA");

        lblTeacher.setText("Teacher");

        lblEmergencyContact.setText("Emergency Contact Number");

        lblDescription.setText("Description");

        txtTeacher.setText("jTextField8"); // NOI18N

        txtEmergencyContact.setText("jTextField9");

        groupComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        addressArea.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        descriptionArea.setViewportView(jTextArea2);

        lblVaccination.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblVaccination.setText("Vaccination :");

        lblHapetitisB.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblHapetitisB.setText("Hapetitis B");

        btnHapetitisYes.setText("Yes");
        btnHapetitisYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapetitisYesActionPerformed(evt);
            }
        });

        btnHapetitisNo.setText("No");
        btnHapetitisNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapetitisNoActionPerformed(evt);
            }
        });

        lblMeasels.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblMeasels.setText("Measels");

        btnMeaselsYes.setText("Yes");
        btnMeaselsYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeaselsYesActionPerformed(evt);
            }
        });

        btnMeaselsNo.setText("No");
        btnMeaselsNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeaselsNoActionPerformed(evt);
            }
        });

        lblPolio.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblPolio.setText("Polio");

        btnPolioYes.setText("Yes");
        btnPolioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolioYesActionPerformed(evt);
            }
        });

        btnPolioNo.setText("No");
        btnPolioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolioNoActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress)
                            .addComponent(lblParentName)
                            .addComponent(lblDob)
                            .addComponent(lblName)
                            .addComponent(lblGroup)
                            .addComponent(lblVaccination))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtStudentName)
                                .addComponent(txtDob)
                                .addComponent(groupComboBox, 0, 108, Short.MAX_VALUE)
                                .addComponent(txtParentName))
                            .addComponent(addressArea, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblEmergencyContact)
                                            .addComponent(lblDescription)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTeacher, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblGpa, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(91, 91, 91)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmergencyContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(descriptionArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblHeadingMain)
                                .addGap(188, 188, 188)
                                .addComponent(btnEdit))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHapetitisB)
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(btnSave))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblMeasels)
                                                .addGap(168, 168, 168))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnMeaselsYes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnMeaselsNo)
                                                .addGap(111, 111, 111)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPolioYes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPolioNo))
                                            .addComponent(lblPolio)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHapetitisYes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnHapetitisNo)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeadingMain)
                    .addComponent(btnEdit))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtStudentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGpa)
                    .addComponent(txtGpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGroup)
                    .addComponent(txtTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(groupComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTeacher))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblParentName)
                    .addComponent(txtParentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmergencyContact)
                    .addComponent(txtEmergencyContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddress)
                        .addComponent(lblDescription))
                    .addComponent(addressArea, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(descriptionArea, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addComponent(lblVaccination)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPolio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHapetitisB)
                        .addComponent(lblMeasels)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPolioYes)
                        .addComponent(btnPolioNo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMeaselsYes)
                        .addComponent(btnMeaselsNo))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnHapetitisYes)
                        .addComponent(btnHapetitisNo)))
                .addGap(24, 24, 24)
                .addComponent(btnSave)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapetitisYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapetitisYesActionPerformed
        // TODO add your handling code here:
        btnHapetitisNo.setSelected(!btnHapetitisYes.isSelected());
    }//GEN-LAST:event_btnHapetitisYesActionPerformed

    private void btnHapetitisNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapetitisNoActionPerformed
        // TODO add your handling code here:
        btnHapetitisYes.setSelected(!btnHapetitisNo.isSelected());
    }//GEN-LAST:event_btnHapetitisNoActionPerformed

    private void btnMeaselsYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeaselsYesActionPerformed
        // TODO add your handling code here:
        btnMeaselsNo.setSelected(!btnMeaselsYes.isSelected());
    }//GEN-LAST:event_btnMeaselsYesActionPerformed

    private void btnMeaselsNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeaselsNoActionPerformed
        // TODO add your handling code here:
        btnMeaselsYes.setSelected(!btnMeaselsNo.isSelected());
    }//GEN-LAST:event_btnMeaselsNoActionPerformed

    private void btnPolioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolioYesActionPerformed
        // TODO add your handling code here:
        btnPolioNo.setSelected(!btnPolioYes.isSelected());
    }//GEN-LAST:event_btnPolioYesActionPerformed

    private void btnPolioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolioNoActionPerformed
        // TODO add your handling code here:
        btnPolioYes.setSelected(!btnPolioNo.isSelected());
    }//GEN-LAST:event_btnPolioNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Student student = new Student();
        student.setFirstName(txtStudentName.getText());
        student.setLastName("");
        student.setDateOfBirth(txtDob.getText());
        student.setEmergencyContactName(txtParentName.getText());
        student.setEmergencyContactNumber(txtEmergencyContact.getText());
        student.setRegistrationDate(new Date().toInstant().getEpochSecond());

        StudentDAO studentDAO = new StudentDAO();
        studentDAO.addStudent(student);
        studentDAO.getStudents().stream().forEach(System.out::println);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane addressArea;
    private javax.swing.JButton btnEdit;
    private javax.swing.JRadioButton btnHapetitisNo;
    private javax.swing.JRadioButton btnHapetitisYes;
    private javax.swing.JRadioButton btnMeaselsNo;
    private javax.swing.JRadioButton btnMeaselsYes;
    private javax.swing.JRadioButton btnPolioNo;
    private javax.swing.JRadioButton btnPolioYes;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane descriptionArea;
    private javax.swing.JComboBox<String> groupComboBox;
    private javax.swing.ButtonGroup hapetitisbtnGroup;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblEmergencyContact;
    private javax.swing.JLabel lblGpa;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblHapetitisB;
    private javax.swing.JLabel lblHeadingMain;
    private javax.swing.JLabel lblMeasels;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblParentName;
    private javax.swing.JLabel lblPolio;
    private javax.swing.JLabel lblTeacher;
    private javax.swing.JLabel lblVaccination;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmergencyContact;
    private javax.swing.JTextField txtGpa;
    private javax.swing.JTextField txtParentName;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtTeacher;
    // End of variables declaration//GEN-END:variables
}
