/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Lab;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.LabOrganization;
import Model.UserAccount.UserAccount;
import Model.Flow.LabTest;
import Model.Flow.WorkRequest;
import Model.Flow.Appointment;
import java.awt.Color;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;
import javax.mail.Session;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class LabAreaJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private LabOrganization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private UserAccount userAccount;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    /**
     * Creates new form LabAreaJPanel
     */
    public LabAreaJPanel(JPanel userProcessContainer, UserAccount account, LabOrganization organization, Enterprise enterprise, Ecosystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = account;
        populateTable();
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
        tab1 = new javax.swing.JTable();
        btnSub = new javax.swing.JButton();
        txtSubResult = new javax.swing.JTextField();
        lblQ1 = new javax.swing.JLabel();
        lblQ2 = new javax.swing.JLabel();
        lblQ3 = new javax.swing.JLabel();
        lblQ4 = new javax.swing.JLabel();
        vitalYesRadiobtn = new javax.swing.JRadioButton();
        vitalNoRadiobtn = new javax.swing.JRadioButton();
        dosageYesRadiobtn = new javax.swing.JRadioButton();
        coldYesRadiobtn = new javax.swing.JRadioButton();
        tempYesRadiobtn = new javax.swing.JRadioButton();
        dosageNoRadiobtn = new javax.swing.JRadioButton();
        coldNoRadiobtn = new javax.swing.JRadioButton();
        tempNoRadiobtn = new javax.swing.JRadioButton();
        lblVital = new javax.swing.JLabel();
        lblDose = new javax.swing.JLabel();
        lblcold = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        barVitalsign = new javax.swing.JProgressBar();
        barDosage = new javax.swing.JProgressBar();
        progbarCold = new javax.swing.JProgressBar();
        barTemp = new javax.swing.JProgressBar();
        lblFinall = new javax.swing.JLabel();
        barFinal = new javax.swing.JProgressBar();
        lblresult = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        btnGenReport = new javax.swing.JButton();
        lblTo = new javax.swing.JLabel();
        txtTo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtreport = new javax.swing.JTextArea();
        lblRep = new javax.swing.JLabel();
        btnsendReport = new javax.swing.JButton();
        lblQ5 = new javax.swing.JLabel();
        lblQ6 = new javax.swing.JLabel();
        pulseYesRadiobtn = new javax.swing.JRadioButton();
        pulseNoRadiobtn = new javax.swing.JRadioButton();
        bpYesRadiobtn = new javax.swing.JRadioButton();
        bpNoRadiobtn = new javax.swing.JRadioButton();
        lblBP = new javax.swing.JLabel();
        lblPulserec = new javax.swing.JLabel();
        progbarPulse = new javax.swing.JProgressBar();
        barBP = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTo1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1440, 848));
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tab1.setForeground(new java.awt.Color(36, 47, 65));
        tab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Sender Email", "Receiver", "Status", "Result"
            }
        ));
        tab1.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tab1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 480, 100));

        btnSub.setBackground(new java.awt.Color(255, 255, 255));
        btnSub.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnSub.setText("Submit Result to Doctor");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });
        add(btnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 790, -1, -1));

        txtSubResult.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtSubResult.setBorder(null);
        txtSubResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSubResultActionPerformed(evt);
            }
        });
        add(txtSubResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 290, -1));

        lblQ1.setBackground(new java.awt.Color(0, 0, 0));
        lblQ1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ1.setText("Are the Vital Signs of the person completely normal? ");
        add(lblQ1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, -1, -1));

        lblQ2.setBackground(new java.awt.Color(0, 0, 0));
        lblQ2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ2.setText("Has the patient completed both the doses?");
        add(lblQ2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 360, -1));

        lblQ3.setBackground(new java.awt.Color(0, 0, 0));
        lblQ3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ3.setText("Does the patient have cold, cough?");
        add(lblQ3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 360, -1));

        lblQ4.setBackground(new java.awt.Color(0, 0, 0));
        lblQ4.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ4.setText("Does the patient have a normal temperature? ");
        add(lblQ4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 360, -1));

        vitalYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        vitalYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        vitalYesRadiobtn.setText("Yes");
        vitalYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalYesRadiobtnActionPerformed(evt);
            }
        });
        add(vitalYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 320, -1, -1));

        vitalNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        vitalNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        vitalNoRadiobtn.setText("No");
        vitalNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vitalNoRadiobtnActionPerformed(evt);
            }
        });
        add(vitalNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        dosageYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        dosageYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        dosageYesRadiobtn.setText("Yes");
        dosageYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageYesRadiobtnActionPerformed(evt);
            }
        });
        add(dosageYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, -1, -1));

        coldYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        coldYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        coldYesRadiobtn.setText("Yes");
        coldYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldYesRadiobtnActionPerformed(evt);
            }
        });
        add(coldYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        tempYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        tempYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        tempYesRadiobtn.setText("Yes");
        tempYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempYesRadiobtnActionPerformed(evt);
            }
        });
        add(tempYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 410, -1, -1));

        dosageNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        dosageNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        dosageNoRadiobtn.setText("No");
        dosageNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosageNoRadiobtnActionPerformed(evt);
            }
        });
        add(dosageNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, -1, -1));

        coldNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        coldNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        coldNoRadiobtn.setText("No");
        coldNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coldNoRadiobtnActionPerformed(evt);
            }
        });
        add(coldNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, -1, -1));

        tempNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        tempNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        tempNoRadiobtn.setText("No");
        tempNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempNoRadiobtnActionPerformed(evt);
            }
        });
        add(tempNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        lblVital.setBackground(new java.awt.Color(0, 0, 0));
        lblVital.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblVital.setText("Vital Signs: ");
        add(lblVital, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 320, -1, -1));

        lblDose.setBackground(new java.awt.Color(0, 0, 0));
        lblDose.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblDose.setText("Dosage: ");
        add(lblDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, -1));

        lblcold.setBackground(new java.awt.Color(0, 0, 0));
        lblcold.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblcold.setText("Cold/cough: ");
        add(lblcold, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, -1, -1));

        lblTemp.setBackground(new java.awt.Color(0, 0, 0));
        lblTemp.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTemp.setText("Temperature: ");
        add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 410, -1, -1));

        barVitalsign.setBackground(new java.awt.Color(0, 0, 0));
        barVitalsign.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        barVitalsign.setBorder(null);
        add(barVitalsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 320, -1, 20));

        barDosage.setBackground(new java.awt.Color(0, 0, 0));
        barDosage.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        barDosage.setBorder(null);
        add(barDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, -1, 20));

        progbarCold.setBackground(new java.awt.Color(0, 0, 0));
        progbarCold.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        progbarCold.setBorder(null);
        add(progbarCold, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, -1, 20));

        barTemp.setBackground(new java.awt.Color(0, 0, 0));
        barTemp.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        barTemp.setBorder(null);
        add(barTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, -1, 20));

        lblFinall.setBackground(new java.awt.Color(0, 0, 0));
        lblFinall.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblFinall.setText("Final Report : ");
        add(lblFinall, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 600, -1, -1));

        barFinal.setBackground(new java.awt.Color(0, 0, 0));
        barFinal.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        barFinal.setBorder(null);
        add(barFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 308, 20));

        lblresult.setBackground(new java.awt.Color(0, 0, 0));
        lblresult.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblresult.setText("Result : ");
        add(lblresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 660, -1, 20));

        txtResult.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtResult.setBorder(null);
        add(txtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 660, 296, 20));

        btnGenReport.setBackground(new java.awt.Color(255, 255, 255));
        btnGenReport.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnGenReport.setText("Generate Report Result");
        btnGenReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenReportActionPerformed(evt);
            }
        });
        add(btnGenReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 520, -1, -1));

        lblTo.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTo.setText("To: ");
        add(lblTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 700, -1, -1));

        txtTo.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtTo.setBorder(null);
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });
        add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 700, 290, -1));

        txtreport.setColumns(20);
        txtreport.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtreport.setRows(5);
        txtreport.setBorder(null);
        jScrollPane2.setViewportView(txtreport);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 590, 280, 130));

        lblRep.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblRep.setText("Comments about report:");
        add(lblRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 600, -1, -1));

        btnsendReport.setBackground(new java.awt.Color(255, 255, 255));
        btnsendReport.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        btnsendReport.setText("Send Report to Person");
        btnsendReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendReportActionPerformed(evt);
            }
        });
        add(btnsendReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 730, -1, -1));

        lblQ5.setBackground(new java.awt.Color(0, 0, 0));
        lblQ5.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ5.setText("Does the patient have a heartbeat/pulse?");
        add(lblQ5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 360, -1));

        lblQ6.setBackground(new java.awt.Color(0, 0, 0));
        lblQ6.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblQ6.setText("Does the patient have a normal blood pressure?");
        add(lblQ6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 360, -1));

        pulseYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        pulseYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        pulseYesRadiobtn.setText("Yes");
        pulseYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseYesRadiobtnActionPerformed(evt);
            }
        });
        add(pulseYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        pulseNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        pulseNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        pulseNoRadiobtn.setText("No");
        pulseNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulseNoRadiobtnActionPerformed(evt);
            }
        });
        add(pulseNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 440, -1, -1));

        bpYesRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        bpYesRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        bpYesRadiobtn.setText("Yes");
        bpYesRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpYesRadiobtnActionPerformed(evt);
            }
        });
        add(bpYesRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        bpNoRadiobtn.setBackground(new java.awt.Color(0, 0, 0));
        bpNoRadiobtn.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        bpNoRadiobtn.setText("No");
        bpNoRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpNoRadiobtnActionPerformed(evt);
            }
        });
        add(bpNoRadiobtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        lblBP.setBackground(new java.awt.Color(0, 0, 0));
        lblBP.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblBP.setText("Blood Pressure:");
        add(lblBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 120, -1));

        lblPulserec.setBackground(new java.awt.Color(0, 0, 0));
        lblPulserec.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblPulserec.setText("Pulse:");
        add(lblPulserec, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 440, -1, -1));

        progbarPulse.setBackground(new java.awt.Color(0, 0, 0));
        progbarPulse.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        progbarPulse.setBorder(null);
        add(progbarPulse, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, -1, 20));

        barBP.setBackground(new java.awt.Color(0, 0, 0));
        barBP.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        barBP.setBorder(null);
        add(barBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, -1, 20));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Laboratory");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1440, -1));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient-big.jpg"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, 850));

        lblTo1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTo1.setText("To: ");
        add(lblTo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 690, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // TODO add your handling code here:
        if(!txtSubResult.getText().equals(txtResult.getText())){
            JOptionPane.showMessageDialog(this, "Please input valid report");
            return;
        }
        int selectedRow = tab1.getSelectedRow();
        
        if (selectedRow < 0){
            return;
        }
        
        Appointment request = (Appointment)tab1.getValueAt(selectedRow, 0);
     System.out.println("1");
        request.setTestResult(txtSubResult.getText());
        System.out.println(txtSubResult.getText());
        System.out.println("2");
        JOptionPane.showMessageDialog(this, "Request tested");
        populateTable();
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnSubActionPerformed

    private void vitalYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(vitalNoRadiobtn.isSelected()){
            vitalNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        barVitalsign.setValue(internalvalue);
        
       
    }//GEN-LAST:event_vitalYesRadiobtnActionPerformed

    private void dosageNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageNoRadiobtnActionPerformed
        // TODO add your handling code here:
        if(dosageYesRadiobtn.isSelected()){
            dosageYesRadiobtn.setSelected(false);
        }
        int value = 0;
        barDosage.setValue(value);
    }//GEN-LAST:event_dosageNoRadiobtnActionPerformed

    private void vitalNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vitalNoRadiobtnActionPerformed
        if(vitalYesRadiobtn.isSelected()){
            vitalYesRadiobtn.setSelected(false);
        }
        int value = 0;
        barVitalsign.setValue(value);

        
    }//GEN-LAST:event_vitalNoRadiobtnActionPerformed

    private void dosageYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosageYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(dosageNoRadiobtn.isSelected()){
            dosageNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        barDosage.setValue(internalvalue);
        
    }//GEN-LAST:event_dosageYesRadiobtnActionPerformed

    private void coldYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(coldNoRadiobtn.isSelected()){
            coldNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        progbarCold.setValue(internalvalue);
        
        
    }//GEN-LAST:event_coldYesRadiobtnActionPerformed

    private void coldNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coldNoRadiobtnActionPerformed
        // TODO add your handling code here:
         if(coldYesRadiobtn.isSelected()){
            coldYesRadiobtn.setSelected(false);
        }
        int value = 0;
        progbarCold.setValue(value);
    }//GEN-LAST:event_coldNoRadiobtnActionPerformed

    private void tempYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(tempNoRadiobtn.isSelected()){
            tempNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        barTemp.setValue(internalvalue);
        
    }//GEN-LAST:event_tempYesRadiobtnActionPerformed

    private void tempNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempNoRadiobtnActionPerformed
        // TODO add your handling code here:
         if(tempYesRadiobtn.isSelected()){
            tempYesRadiobtn.setSelected(false);
        }
        int value = 0;
        barTemp.setValue(value);
    }//GEN-LAST:event_tempNoRadiobtnActionPerformed

    private void btnGenReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenReportActionPerformed
        // TODO add your handling code here:
        int vitals = barVitalsign.getValue()/6;
        int cold = progbarCold.getValue()/6;
        int dosage = barDosage.getValue()/6;
        int temp = barTemp.getValue()/6;
        int pulse = progbarPulse.getValue()/6;
        int bp = barBP.getValue()/6;
        
        int finalResult = vitals + cold + dosage + temp + pulse + bp;
        
        barFinal.setValue(finalResult);
        if(finalResult == 100){
            barFinal.setStringPainted(true);
            barFinal.setForeground(Color.white);
            barFinal.setBackground(Color.green);
           
            
            txtResult.setText("Approved !");
        } else if(finalResult >= 50 && finalResult < 100){
            barFinal.setForeground(Color.YELLOW);
            txtResult.setText("Needs Monitoring");
        }else if (finalResult < 50){
            barFinal.setForeground(Color.RED);
            txtResult.setText("Danger!");
        }
        
    }//GEN-LAST:event_btnGenReportActionPerformed

    private void txtSubResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSubResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSubResultActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void btnsendReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendReportActionPerformed
        // TODO add your handling code here:
        
        String toEmail = txtTo.getText();
        if(!Util.Validation.emailValidator(toEmail)){
            JOptionPane.showMessageDialog(null, "Invalid Email ID", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String fromEmail = "nehachandra.dev@gmail.com";
        String fromEmailPassword = "syzcoz-hashap-Qohka5";
        String subject = "Report for Vaccination Checkup";
        
        Properties props = new Properties();
        props.put("mail.smtp.user","username"); 
        props.put("mail.smtp.host", "smtp.gmail.com"); 
        props.put("mail.smtp.port", "25"); 
        props.put("mail.debug", "true"); 
        props.put("mail.smtp.auth", "true"); 
        props.put("mail.smtp.starttls.enable","true"); 
        props.put("mail.smtp.EnableSSL.enable","true");

        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
        props.setProperty("mail.smtp.socketFactory.fallback", "false");   
        props.setProperty("mail.smtp.port", "465");   
        props.setProperty("mail.smtp.socketFactory.port", "465");
        
        Session session = Session.getDefaultInstance(props , new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail , fromEmailPassword);
            }
        });
        populateTable();
        
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            message.setSubject(subject);
            message.setText(txtreport.getText());
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Email Sent Successfully");
        }catch(Exception e){
            System.out.print(e);
        }
        
    }//GEN-LAST:event_btnsendReportActionPerformed

    private void pulseYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(pulseNoRadiobtn.isSelected()){
            pulseNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        progbarPulse.setValue(internalvalue);
    }//GEN-LAST:event_pulseYesRadiobtnActionPerformed

    private void pulseNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulseNoRadiobtnActionPerformed
        // TODO add your handling code here:
        if(pulseYesRadiobtn.isSelected()){
            pulseYesRadiobtn.setSelected(false);
        }
        int internalvalue = 0;
        progbarPulse.setValue(internalvalue);
    }//GEN-LAST:event_pulseNoRadiobtnActionPerformed

    private void bpYesRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpYesRadiobtnActionPerformed
        // TODO add your handling code here:
        if(bpNoRadiobtn.isSelected()){
            bpNoRadiobtn.setSelected(false);
        }
        int internalvalue = 100;
        barBP.setValue(internalvalue);
    }//GEN-LAST:event_bpYesRadiobtnActionPerformed

    private void bpNoRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpNoRadiobtnActionPerformed
        // TODO add your handling code here:
        if(bpYesRadiobtn.isSelected()){
            bpYesRadiobtn.setSelected(false);
        }
        int internalvalue = 0;
        barBP.setValue(internalvalue);
    }//GEN-LAST:event_bpNoRadiobtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barBP;
    private javax.swing.JProgressBar barDosage;
    private javax.swing.JProgressBar barFinal;
    private javax.swing.JProgressBar barTemp;
    private javax.swing.JProgressBar barVitalsign;
    private javax.swing.JRadioButton bpNoRadiobtn;
    private javax.swing.JRadioButton bpYesRadiobtn;
    private javax.swing.JButton btnGenReport;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnsendReport;
    private javax.swing.JRadioButton coldNoRadiobtn;
    private javax.swing.JRadioButton coldYesRadiobtn;
    private javax.swing.JRadioButton dosageNoRadiobtn;
    private javax.swing.JRadioButton dosageYesRadiobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBP;
    private javax.swing.JLabel lblDose;
    private javax.swing.JLabel lblFinall;
    private javax.swing.JLabel lblPulserec;
    private javax.swing.JLabel lblQ1;
    private javax.swing.JLabel lblQ2;
    private javax.swing.JLabel lblQ3;
    private javax.swing.JLabel lblQ4;
    private javax.swing.JLabel lblQ5;
    private javax.swing.JLabel lblQ6;
    private javax.swing.JLabel lblRep;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblTo1;
    private javax.swing.JLabel lblVital;
    private javax.swing.JLabel lblcold;
    private javax.swing.JLabel lblresult;
    private javax.swing.JProgressBar progbarCold;
    private javax.swing.JProgressBar progbarPulse;
    private javax.swing.JRadioButton pulseNoRadiobtn;
    private javax.swing.JRadioButton pulseYesRadiobtn;
    private javax.swing.JTable tab1;
    private javax.swing.JRadioButton tempNoRadiobtn;
    private javax.swing.JRadioButton tempYesRadiobtn;
    private javax.swing.JTextField txtResult;
    private javax.swing.JTextField txtSubResult;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextArea txtreport;
    private javax.swing.JRadioButton vitalNoRadiobtn;
    private javax.swing.JRadioButton vitalYesRadiobtn;
    // End of variables declaration//GEN-END:variables
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)tab1.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            if(request instanceof Appointment){
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            String email = ((Appointment) request).getEmail();
            row[2] = email;
            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[4] = request.getStatus();
            String result = ((Appointment) request).getTestResult();
            row[5] = result;
            
            
            model.addRow(row);
        }
        }
    }
}