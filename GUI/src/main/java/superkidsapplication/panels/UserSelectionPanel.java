/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.users.UserDatabaseFactory;
import com.ece.superkids.users.UserManager;
import com.ece.superkids.users.entities.User;
import java.util.Iterator;
import java.util.List;
import superkidsapplication.controllers.PanelController;
import superkidsapplication.events.Session;

/**
 *
 * @author baris
 */
public final class UserSelectionPanel extends javax.swing.JPanel {

    /**
     * Creates new form UserSelectionPanel
     */
    private StartScreenPanel startscreen;
    //get the panel controller to manage panels
    private PanelController controller;
    private UserManager uM = UserDatabaseFactory.aUserManager();
    private Session session = Session.aSession();

    public UserSelectionPanel() {
        this.setName("UserSelection");
        initComponents();
        //get the startscreen
        startscreen = StartScreenPanel.getInstance();
        //get controller
        controller = PanelController.getInstance();
        fillBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usersBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        warnLabel = new javax.swing.JLabel();

        usersBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usersBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the User");

        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        warnLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        warnLabel.setForeground(new java.awt.Color(255, 0, 0));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(warnLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(layout.createSequentialGroup()
                            .add(47, 47, 47)
                            .add(jLabel1))
                        .add(layout.createSequentialGroup()
                            .add(39, 39, 39)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(loginButton)
                                .add(usersBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 240, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(54, 54, 54)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(usersBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(loginButton)
                .add(18, 18, 18)
                .add(warnLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usersBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usersBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usersBoxActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        if (usersBox.getItemCount() == 0) {
            warnLabel.setText("Please add a child first.");
            return;
        }
        //get user
        User user = uM.getUser((String) usersBox.getSelectedItem());
        //login
        if (session.login(user) == false) {
            warnLabel.setText("Already logged in");
            return;
        }
        //change the button visibility in the main frame
        MainFrame frame = (MainFrame) javax.swing.SwingUtilities.getWindowAncestor(this);
        frame.logoutButton.setVisible(true);
        controller.addPanel(startscreen);
    }//GEN-LAST:event_loginButtonActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JComboBox usersBox;
    private javax.swing.JLabel warnLabel;
    // End of variables declaration//GEN-END:variables

    public void fillBox() {
        usersBox.removeAllItems();
        warnLabel.setText("");
        List usersList = uM.getAllUsers();
        Iterator<User> iterator = usersList.iterator();
        while (iterator.hasNext()) {
            usersBox.addItem(iterator.next().getName());
        }
    }
}
