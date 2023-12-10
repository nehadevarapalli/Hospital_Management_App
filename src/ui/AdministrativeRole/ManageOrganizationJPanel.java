/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdministrativeRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nehadevarapalli
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private UserAccount account;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory directory,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.account = account;
        this.enterprise = enterprise;
        //this.enterprise = enterprise;
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        cmbOrg.removeAllItems();
        
        String enterpriseType = enterprise.getClass().toString();
        
        for (Type type : Type.values()){
            if (enterpriseType.equals("class Business.Enterprise.GovernmentEnterprise")){
                if(type.equals(Type.Health)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Economy)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Person)){
                   cmbOrg.addItem(type);
                }
            } else if(enterpriseType.equals("class Business.Enterprise.HospitalEnterprise")){
                if(type.equals(Type.Doctor)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Lab)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Pharma)){
                   cmbOrg.addItem(type);
                }
                
        }
            else if(enterpriseType.equals("class Business.Enterprise.PharmaceuticalEnterprise")){
                if(type.equals(Type.Manufacturing)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Sales)){
                   cmbOrg.addItem(type);
                }
            } else if(enterpriseType.equals("class Business.Enterprise.ServiceEnterprise")){
                if(type.equals(Type.Purchase)){
                   cmbOrg.addItem(type);
                }
                if(type.equals(Type.Distribution)){
                   cmbOrg.addItem(type);
                }
            }
        }
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        btnAddition = new javax.swing.JButton();
        cmbOrg = new javax.swing.JComboBox();
        lblOrganization = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1190, 848));
        setPreferredSize(new java.awt.Dimension(1190, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblOrg.setForeground(new java.awt.Color(36, 47, 65));
        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrg);
        if (tblOrg.getColumnModel().getColumnCount() > 0) {
            tblOrg.getColumnModel().getColumn(0).setResizable(false);
            tblOrg.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 480, 180));

        btnAddition.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        btnAddition.setText("Add Organization");
        btnAddition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdditionActionPerformed(evt);
            }
        });
        add(btnAddition, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        cmbOrg.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        cmbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrgActionPerformed(evt);
            }
        });
        add(cmbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 240, -1));

        lblOrganization.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        lblOrganization.setText("Organization Type:");
        add(lblOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        lblTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/orggg.png"))); // NOI18N
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 1020, 820));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdditionActionPerformed
Type type = (Type) cmbOrg.getSelectedItem();
        
        directory.createOrganization(type);
        
        populateTable();
        
        dB4OUtil.storeSystem(system);

        
    }//GEN-LAST:event_btnAdditionActionPerformed

    private void cmbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrgActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddition;
    private javax.swing.JComboBox cmbOrg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrganization;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblOrg;
    // End of variables declaration//GEN-END:variables
}
