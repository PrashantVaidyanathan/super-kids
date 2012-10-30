/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.enums.QuestionLevel;
import java.awt.Color;
import superkidsapplication.controllers.PanelController;

/**
 *
 * @author baris
 */
public class NewGamePanel extends javax.swing.JPanel {

    /**
     * Creates new form NewGamePanel
     */
    private PanelController controller;

    public NewGamePanel() {
        controller = PanelController.getInstance();
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        level3Button = new javax.swing.JButton();
        level2Button = new javax.swing.JButton();
        level1Button = new javax.swing.JButton();
        backgoundLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));

        level3Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level3Button.setForeground(new java.awt.Color(255, 255, 255));
        level3Button.setText("Level 3");
        level3Button.setBorderPainted(false);
        level3Button.setContentAreaFilled(false);
        level3Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level3ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level3ButtonMouseEntered(evt);
            }
        });
        level3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3ButtonActionPerformed(evt);
            }
        });
        level3Button.setBounds(558, 329, 110, 110);
        jLayeredPane1.add(level3Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level2Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level2Button.setForeground(new java.awt.Color(255, 255, 255));
        level2Button.setText("Level 2");
        level2Button.setBorderPainted(false);
        level2Button.setContentAreaFilled(false);
        level2Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level2ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level2ButtonMouseEntered(evt);
            }
        });
        level2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2ButtonActionPerformed(evt);
            }
        });
        level2Button.setBounds(340, 339, 110, 90);
        jLayeredPane1.add(level2Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        level1Button.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        level1Button.setForeground(new java.awt.Color(255, 255, 255));
        level1Button.setText("Level 1");
        level1Button.setBorderPainted(false);
        level1Button.setContentAreaFilled(false);
        level1Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                level1ButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                level1ButtonMouseEntered(evt);
            }
        });
        level1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1ButtonActionPerformed(evt);
            }
        });
        level1Button.setBounds(110, 339, 130, 90);
        jLayeredPane1.add(level1Button, javax.swing.JLayeredPane.DEFAULT_LAYER);

        backgoundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backgrounds/newgamebackground.png"))); // NOI18N
        backgoundLabel.setBounds(0, 0, 800, 600);
        jLayeredPane1.add(backgoundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1133, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLayeredPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 719, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 154, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //FOR EACH LEVEL I THINK WE SHOULD HAVE A DIFFERENT PANEL RATHER THAN USING THE SAME PANEL
    private void level2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2ButtonActionPerformed
        // TODO add your handling code here:
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_2);
        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level2ButtonActionPerformed

    private void level1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1ButtonActionPerformed
        // TODO add your handling code here
        //CATEGORIES PANEL COMES HERE.
        //QUESTIONS PANEL WILL BE ACCESSED FROM CATEGORIESPANEL
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_1);
        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level1ButtonActionPerformed

    private void level3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3ButtonActionPerformed
        // TODO add your handling code here:
        SubjectSelectionPanel sPanel = new SubjectSelectionPanel(QuestionLevel.LEVEL_3);
        //add questionPanel
        controller.addPanel(sPanel);
    }//GEN-LAST:event_level3ButtonActionPerformed

    private void level1ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1ButtonMouseEntered
        // TODO add your handling code here:
        level1Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level1ButtonMouseEntered

    private void level1ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level1ButtonMouseExited
        // TODO add your handling code here:
        level1Button.setForeground(Color.white);
    }//GEN-LAST:event_level1ButtonMouseExited

    private void level2ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2ButtonMouseEntered
        // TODO add your handling code here:
        level2Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level2ButtonMouseEntered

    private void level2ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level2ButtonMouseExited
        // TODO add your handling code here:
        level2Button.setForeground(Color.white);
    }//GEN-LAST:event_level2ButtonMouseExited

    private void level3ButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3ButtonMouseEntered
        // TODO add your handling code here:
        level3Button.setForeground(Color.yellow);
    }//GEN-LAST:event_level3ButtonMouseEntered

    private void level3ButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_level3ButtonMouseExited
        // TODO add your handling code here:
        level3Button.setForeground(Color.white);
    }//GEN-LAST:event_level3ButtonMouseExited
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgoundLabel;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JButton level1Button;
    private javax.swing.JButton level2Button;
    private javax.swing.JButton level3Button;
    // End of variables declaration//GEN-END:variables
}
