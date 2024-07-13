/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdmin;

import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.Organization;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author nehadevarapalli
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    Ecosystem ecosystem;
    
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,Ecosystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        lblVal.setText("sysadmin");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        background = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        onePanel = new javax.swing.JPanel();
        lblRegion = new javax.swing.JLabel();
        icRegion = new javax.swing.JLabel();
        twoPanel = new javax.swing.JPanel();
        lblEnterprise = new javax.swing.JLabel();
        icEnterprise = new javax.swing.JLabel();
        threePanel = new javax.swing.JPanel();
        lblProfile = new javax.swing.JLabel();
        icAdmin = new javax.swing.JLabel();
        lblVal = new javax.swing.JLabel();
        lblTxt = new javax.swing.JLabel();
        cardWorkPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 204, 255));
        setForeground(new java.awt.Color(102, 204, 255));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1440, 848));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(102, 204, 255));
        background.setForeground(new java.awt.Color(102, 204, 255));
        background.setFocusTraversalKeysEnabled(false);
        background.setMaximumSize(new java.awt.Dimension(1440, 848));
        background.setMinimumSize(new java.awt.Dimension(1440, 848));
        background.setPreferredSize(new java.awt.Dimension(1440, 848));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuPanel.setBackground(new java.awt.Color(0, 0, 51));
        menuPanel.setForeground(new java.awt.Color(255, 255, 255));
        menuPanel.setMaximumSize(new java.awt.Dimension(250, 848));
        menuPanel.setMinimumSize(new java.awt.Dimension(250, 848));
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 848));
        menuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        onePanel.setBackground(new java.awt.Color(102, 204, 255));
        onePanel.setForeground(new java.awt.Color(255, 255, 255));
        onePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        onePanel.setOpaque(false);
        onePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        onePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                onePanelMousePressed(evt);
            }
        });
        onePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegion.setBackground(new java.awt.Color(0, 0, 51));
        lblRegion.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblRegion.setForeground(new java.awt.Color(255, 255, 255));
        lblRegion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegion.setText("Create Region");
        lblRegion.setMaximumSize(new java.awt.Dimension(180, 20));
        lblRegion.setMinimumSize(new java.awt.Dimension(180, 20));
        lblRegion.setOpaque(true);
        lblRegion.setPreferredSize(new java.awt.Dimension(180, 20));
        onePanel.add(lblRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 50));

        icRegion.setBackground(new java.awt.Color(102, 204, 255));
        icRegion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sysadmin/region.png"))); // NOI18N
        icRegion.setOpaque(true);
        onePanel.add(icRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        menuPanel.add(onePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 50));

        twoPanel.setBackground(new java.awt.Color(102, 204, 255));
        twoPanel.setForeground(new java.awt.Color(255, 255, 255));
        twoPanel.setMinimumSize(new java.awt.Dimension(250, 40));
        twoPanel.setOpaque(false);
        twoPanel.setPreferredSize(new java.awt.Dimension(250, 40));
        twoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                twoPanelMousePressed(evt);
            }
        });
        twoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterprise.setBackground(new java.awt.Color(0, 0, 51));
        lblEnterprise.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblEnterprise.setForeground(new java.awt.Color(255, 255, 255));
        lblEnterprise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnterprise.setText("Create Enterprise");
        lblEnterprise.setMaximumSize(new java.awt.Dimension(180, 20));
        lblEnterprise.setMinimumSize(new java.awt.Dimension(180, 20));
        lblEnterprise.setOpaque(true);
        lblEnterprise.setPreferredSize(new java.awt.Dimension(180, 20));
        twoPanel.add(lblEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 50));

        icEnterprise.setBackground(new java.awt.Color(102, 204, 255));
        icEnterprise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sysadmin/organisation.png"))); // NOI18N
        icEnterprise.setOpaque(true);
        twoPanel.add(icEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, -1));

        menuPanel.add(twoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, 50));

        threePanel.setBackground(new java.awt.Color(102, 204, 255));
        threePanel.setMinimumSize(new java.awt.Dimension(250, 40));
        threePanel.setOpaque(false);
        threePanel.setPreferredSize(new java.awt.Dimension(250, 40));
        threePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                threePanelMousePressed(evt);
            }
        });
        threePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProfile.setBackground(new java.awt.Color(0, 0, 51));
        lblProfile.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblProfile.setForeground(new java.awt.Color(255, 255, 255));
        lblProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfile.setText("Create Admin");
        lblProfile.setOpaque(true);
        threePanel.add(lblProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 180, 50));

        icAdmin.setBackground(new java.awt.Color(102, 204, 255));
        icAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/sysadmin/admin.png"))); // NOI18N
        icAdmin.setOpaque(true);
        threePanel.add(icAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, -1));

        menuPanel.add(threePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 50));

        lblVal.setBackground(new java.awt.Color(255, 255, 255));
        lblVal.setFont(new java.awt.Font("Helvetica Neue", 1, 22)); // NOI18N
        lblVal.setForeground(new java.awt.Color(255, 255, 255));
        lblVal.setText("<value>");
        menuPanel.add(lblVal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 810, 230, 30));

        lblTxt.setBackground(new java.awt.Color(255, 255, 255));
        lblTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lblTxt.setForeground(new java.awt.Color(255, 255, 255));
        lblTxt.setText("Currently Logged in as:");
        menuPanel.add(lblTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 780, -1, -1));

        background.add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardWorkPanel.setBackground(new java.awt.Color(255, 255, 255));
        cardWorkPanel.setForeground(new java.awt.Color(255, 255, 255));
        cardWorkPanel.setMinimumSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setPreferredSize(new java.awt.Dimension(1190, 848));
        cardWorkPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gradient.jpg"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        cardWorkPanel.add(jLabel1, "card3");

        background.add(cardWorkPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void threePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threePanelMousePressed
        // TODO add your handling code here:
        setColor(threePanel);
        resetColor(new JPanel[]{twoPanel,onePanel});
        ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageEnterpriseAdminJPanel",manageEnterpriseAdminJPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_threePanelMousePressed

    private void twoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoPanelMousePressed
        // TODO add your handling code here:
        setColor(twoPanel);
        resetColor(new JPanel[]{onePanel,threePanel});
        ManageEnterpriseJPanel manageEnterprisePanel = new ManageEnterpriseJPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageEnterprisePanel",manageEnterprisePanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_twoPanelMousePressed

    private void onePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onePanelMousePressed
        // TODO add your handling code here:
        setColor(onePanel);
        resetColor(new JPanel[]{twoPanel,threePanel});
        ManageRegionPanel manageNetworkPanel = new ManageRegionPanel(cardWorkPanel, ecosystem);
        cardWorkPanel.add("ManageNetworkJPanel",manageNetworkPanel);
        CardLayout layout = (CardLayout) cardWorkPanel.getLayout();
        layout.next(cardWorkPanel);
    }//GEN-LAST:event_onePanelMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel cardWorkPanel;
    private javax.swing.JLabel icAdmin;
    private javax.swing.JLabel icEnterprise;
    private javax.swing.JLabel icRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblProfile;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel lblVal;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JPanel onePanel;
    private javax.swing.JPanel threePanel;
    private javax.swing.JPanel twoPanel;
    // End of variables declaration//GEN-END:variables
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(23,35,51));
    }
    private void resetColor(JPanel [] pane)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(36,47,65));
           
        }
    }
}