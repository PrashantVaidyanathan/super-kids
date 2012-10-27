/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import superkidsapplication.controllers.MusicController;

/**
 *
 * @author davidOhayon & baris
 */
public class OptionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form OptionsPanel
     */
    MusicController mController;

    private OptionsPanel() {
        mController = MusicController.getInstance();
        initComponents();
    }

    private static class OptionsPanelHolder {

        public static final OptionsPanel INSTANCE = new OptionsPanel();
    }

    public static OptionsPanel getInstance() {
        return OptionsPanel.OptionsPanelHolder.INSTANCE;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onOffGroup = new javax.swing.ButtonGroup();
        multipleChoiceButton = new javax.swing.JToggleButton();
        matchingButton = new javax.swing.JToggleButton();
        oddOneOutButton = new javax.swing.JToggleButton();
        allTypesButton = new javax.swing.JToggleButton();
        volumeSlider = new javax.swing.JSlider();
        volumeLabel = new javax.swing.JLabel();
        musicOnButton = new javax.swing.JRadioButton();
        musicOffButton = new javax.swing.JRadioButton();
        musicLabel = new javax.swing.JLabel();
        changeMusicBox = new javax.swing.JComboBox();
        selectThemeLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 204, 255));

        multipleChoiceButton.setText("Multiple Choice");
        multipleChoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multipleChoiceButtonActionPerformed(evt);
            }
        });

        matchingButton.setText("Matching");
        matchingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchingButtonActionPerformed(evt);
            }
        });

        oddOneOutButton.setText("Odd One Out");
        oddOneOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oddOneOutButtonActionPerformed(evt);
            }
        });

        allTypesButton.setText("All Types");
        allTypesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTypesButtonActionPerformed(evt);
            }
        });

        volumeSlider.setMaximum(200);
        volumeSlider.setValue(100);
        volumeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                volumeSliderStateChanged(evt);
            }
        });

        volumeLabel.setText("Volume");

        onOffGroup.add(musicOnButton);
        musicOnButton.setSelected(true);
        musicOnButton.setText("ON");
        musicOnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicOnButtonActionPerformed(evt);
            }
        });

        onOffGroup.add(musicOffButton);
        musicOffButton.setText("OFF");
        musicOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicOffButtonActionPerformed(evt);
            }
        });

        musicLabel.setText("     Music");

        changeMusicBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GameForest", "FlyingAces" }));
        changeMusicBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMusicBoxActionPerformed(evt);
            }
        });

        selectThemeLabel.setText("Select Main Theme");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(allTypesButton)
                    .add(matchingButton)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(oddOneOutButton)
                            .add(multipleChoiceButton))
                        .add(55, 55, 55)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.CENTER)
                            .add(volumeSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(volumeLabel)
                            .add(layout.createSequentialGroup()
                                .add(musicOnButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(musicOffButton))
                            .add(changeMusicBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(selectThemeLabel)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(musicLabel)
                                .add(75, 75, 75)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .add(musicLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(musicOnButton)
                            .add(musicOffButton))
                        .add(29, 29, 29)
                        .add(volumeLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(volumeSlider, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(multipleChoiceButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(oddOneOutButton)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(matchingButton)
                    .add(selectThemeLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(allTypesButton)
                    .add(changeMusicBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(95, 95, 95))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void multipleChoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multipleChoiceButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multipleChoiceButtonActionPerformed

    private void allTypesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allTypesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allTypesButtonActionPerformed

    private void matchingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matchingButtonActionPerformed

    private void oddOneOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oddOneOutButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oddOneOutButtonActionPerformed

    private void musicOnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicOnButtonActionPerformed
        // TODO add your handling code here:
        mController.playMusic();
    }//GEN-LAST:event_musicOnButtonActionPerformed

    private void musicOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicOffButtonActionPerformed
        // TODO add your handling code here:
        mController.stopMusic();
    }//GEN-LAST:event_musicOffButtonActionPerformed

    private void volumeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_volumeSliderStateChanged
        // TODO add your handling code here:
        double vol = volumeSlider.getValue();
        vol = vol / 100; //convert to between 0.0 and 2.0 (gain)
        System.out.println("Volume: " + vol);
        mController.setVolume(vol);
    }//GEN-LAST:event_volumeSliderStateChanged

    private void changeMusicBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMusicBoxActionPerformed
        // TODO add your handling code here:
        String theme = (String) changeMusicBox.getSelectedItem();
        System.out.println("Theme Selected: " + theme);
        mController.loadThemeMusic(theme);
    }//GEN-LAST:event_changeMusicBoxActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton allTypesButton;
    private javax.swing.JComboBox changeMusicBox;
    private javax.swing.JToggleButton matchingButton;
    private javax.swing.JToggleButton multipleChoiceButton;
    private javax.swing.JLabel musicLabel;
    private javax.swing.JRadioButton musicOffButton;
    private javax.swing.JRadioButton musicOnButton;
    private javax.swing.JToggleButton oddOneOutButton;
    private javax.swing.ButtonGroup onOffGroup;
    private javax.swing.JLabel selectThemeLabel;
    private javax.swing.JLabel volumeLabel;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables

    public boolean isMusicON() {
        return musicOnButton.isSelected();
    }
}
