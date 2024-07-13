/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Util.DB4OUtil;
import Model.Ecosystem;
import Model.Enterprise.Enterprise;
import Model.Region.Region;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author nehadevarapalli
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private Ecosystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        signinPanel.setVisible(true);
        signoutPanel.setVisible(false);
        cardPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signinPanel = new javax.swing.JPanel();
        signinFormPanel = new javax.swing.JPanel();
        lblSignin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        separatorLine2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        btnsignin = new javax.swing.JButton();
        separatorLine4 = new javax.swing.JSeparator();
        exiticon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        signoutPanel = new javax.swing.JPanel();
        iconlogout = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 23, 1600, 900));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1440, 900));
        setSize(new java.awt.Dimension(1440, 900));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinPanel.setBackground(new java.awt.Color(255, 255, 255));
        signinPanel.setPreferredSize(new java.awt.Dimension(1440, 900));
        signinPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signinFormPanel.setBackground(new java.awt.Color(0, 0, 51));
        signinFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSignin.setFont(new java.awt.Font("Helvetica Neue", 1, 23)); // NOI18N
        lblSignin.setForeground(new java.awt.Color(255, 255, 255));
        lblSignin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignin.setText("Global Immunization Portal");
        signinFormPanel.add(lblSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 380, 50));

        lblUsername.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("USERNAME");
        signinFormPanel.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        lblPassword.setBackground(new java.awt.Color(255, 255, 255));
        lblPassword.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");
        signinFormPanel.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        separatorLine2.setForeground(new java.awt.Color(255, 255, 255));
        signinFormPanel.add(separatorLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 300, 20));

        txtPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtPassword.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(153, 153, 153));
        txtPassword.setText("password");
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        signinFormPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 300, 30));

        txtUsername.setBackground(new java.awt.Color(0, 0, 51));
        txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(153, 153, 153));
        txtUsername.setText("Enter Username");
        txtUsername.setBorder(null);
        txtUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtUsername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        signinFormPanel.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 300, 30));

        btnsignin.setBackground(new java.awt.Color(204, 204, 204));
        btnsignin.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        btnsignin.setText("Sign In");
        btnsignin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsigninMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsigninMouseExited(evt);
            }
        });
        btnsignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsigninActionPerformed(evt);
            }
        });
        signinFormPanel.add(btnsignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 170, 40));

        separatorLine4.setForeground(new java.awt.Color(255, 255, 255));
        signinFormPanel.add(separatorLine4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 300, 10));

        signinPanel.add(signinFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 510, 900));

        exiticon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/exit.png"))); // NOI18N
        exiticon.setText("Exit");
        exiticon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exiticonMousePressed(evt);
            }
        });
        signinPanel.add(exiticon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1376, 14, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/health/DALL·E Logo child vaccination.png"))); // NOI18N
        signinPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, -10, 1520, 990));

        getContentPane().add(signinPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signoutPanel.setBackground(new java.awt.Color(220, 241, 251));
        signoutPanel.setFont(new java.awt.Font("Libian SC", 0, 14)); // NOI18N
        signoutPanel.setPreferredSize(new java.awt.Dimension(1440, 52));

        iconlogout.setFont(new java.awt.Font("Libian SC", 0, 13)); // NOI18N
        iconlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/exit.png"))); // NOI18N
        iconlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconlogoutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout signoutPanelLayout = new javax.swing.GroupLayout(signoutPanel);
        signoutPanel.setLayout(signoutPanelLayout);
        signoutPanelLayout.setHorizontalGroup(
            signoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signoutPanelLayout.createSequentialGroup()
                .addContainerGap(1366, Short.MAX_VALUE)
                .addComponent(iconlogout)
                .addGap(26, 26, 26))
        );
        signoutPanelLayout.setVerticalGroup(
            signoutPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        getContentPane().add(signoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        cardPanel.setBackground(new java.awt.Color(36, 47, 65));
        cardPanel.setMinimumSize(new java.awt.Dimension(1440, 848));
        cardPanel.setPreferredSize(new java.awt.Dimension(1440, 848));
        cardPanel.setLayout(new java.awt.CardLayout());
        getContentPane().add(cardPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 1440, 848));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        txtUsername.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void btnsigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsigninActionPerformed
        // TODO add your handling code here:
        
        String userName = txtUsername.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Region network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               break;
                           }
                       }  
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        } 
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            //set visibility for panels
            signinPanel.setVisible(false);
            signoutPanel.setVisible(true);
            cardPanel.setVisible(true);
            //set visibility for icons
            exiticon.setVisible(false);
            iconlogout.setVisible(true);
            //set cardlayout panel to display necessary
            CardLayout layout=(CardLayout) cardPanel.getLayout();
            cardPanel.add("workArea", userAccount.getRole().createWorkArea(cardPanel, userAccount, inOrganization, inEnterprise, system));
            layout.next(cardPanel);
        }
    }//GEN-LAST:event_btnsigninActionPerformed

    private void iconlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconlogoutMousePressed
        // TODO add your handling code here:
        //remove all layouts from the cardlayout panel
        cardPanel.removeAll();
        //set visibility for panels
        signinPanel.setVisible(true);
        signoutPanel.setVisible(false);
        cardPanel.setVisible(false);
        //set visibility for icons
        exiticon.setVisible(true);
        iconlogout.setVisible(false);
        //reset the text fields to default values
        txtUsername.setText("Enter Username");
        txtPassword.setText("password");
        //save database
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_iconlogoutMousePressed

    private void exiticonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exiticonMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exiticonMousePressed

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        // TODO add your handling code here:
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void btnsigninMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsigninMouseEntered
        // TODO add your handling code here:
        btnsignin.setForeground(Color.RED);
        
    }//GEN-LAST:event_btnsigninMouseEntered

    private void btnsigninMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsigninMouseExited
        // TODO add your handling code here:
        btnsignin.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnsigninMouseExited

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsignin;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JLabel exiticon;
    private javax.swing.JLabel iconlogout;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignin;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JSeparator separatorLine2;
    private javax.swing.JSeparator separatorLine4;
    private javax.swing.JPanel signinFormPanel;
    private javax.swing.JPanel signinPanel;
    private javax.swing.JPanel signoutPanel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}