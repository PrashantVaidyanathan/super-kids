/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;

import com.ece.superkids.QuestionManager;
import com.ece.superkids.entities.Question;
import com.ece.superkids.enums.QuestionCategory;
import com.ece.superkids.enums.QuestionLevel;
import java.util.Iterator;
import java.util.List;
import superkidsapplication.controllers.QuestionController;

/**
 *
 * @author baris
 */
public class EditQuestionsPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditQuestionsPanel
     */
    private QuestionController qController;
    private QuestionManager manager;
    private Question currentQuestion;
    private List<Question> qList1;
    private List<Question> qList2;
    private List<Question> qList3;

    public EditQuestionsPanel() {
        initComponents();
        qController = QuestionController.getInstance();
        //manager = new QuestionManager();
        currentQuestion = null;
        qList1 = null;
        qList2 = null;
        qList3 = null;
        fillInBoxes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        level1QuestionsBox = new javax.swing.JComboBox();
        level2QuestionsBox = new javax.swing.JComboBox();
        level2Label = new javax.swing.JLabel();
        level1Label = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        questionText = new javax.swing.JTextField();
        level3Label = new javax.swing.JLabel();
        level3QuestionsBox = new javax.swing.JComboBox();
        infoLabel = new javax.swing.JLabel();
        infoLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(311, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setOpaque(false);
        setSize(new java.awt.Dimension(380, 370));

        level1QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level1QuestionsBoxActionPerformed(evt);
            }
        });

        level2QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level2QuestionsBoxActionPerformed(evt);
            }
        });

        level2Label.setText("Level 2 Questions");

        level1Label.setText("Level 1 Questions");

        deleteButton.setText("Delete");
        deleteButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        questionText.setText("Question comes here");
        questionText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextActionPerformed(evt);
            }
        });

        level3Label.setText("Level 3 Questions");

        level3QuestionsBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                level3QuestionsBoxActionPerformed(evt);
            }
        });

        infoLabel.setText("You can edit the question below");

        infoLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        infoLabel1.setText("Delete will remove the question from the database.");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(43, 43, 43)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(level3Label)
                    .add(infoLabel)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(layout.createSequentialGroup()
                            .add(saveButton)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(deleteButton)
                            .add(6, 6, 6))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(level1Label)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(questionText)
                                .add(level2QuestionsBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(level1QuestionsBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(level2Label)
                                .add(level3QuestionsBox, 0, 178, Short.MAX_VALUE)))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .add(infoLabel1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(level1Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(level1QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(level2Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(level2QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(12, 12, 12)
                .add(level3Label)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(level3QuestionsBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 54, Short.MAX_VALUE)
                .add(infoLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(questionText, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(saveButton)
                    .add(deleteButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(infoLabel1)
                .add(9, 9, 9))
        );
    }// </editor-fold>//GEN-END:initComponents

    //delete the current selected question
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
         //delete the question from the database
        //manager.deleteQuestion(currentQuestion.getLevel(), currentQuestion.getCategory(), 1);
        System.out.println("Question deleted: " + currentQuestion.getQuestion());
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void level2QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level2QuestionsBoxActionPerformed
        // TODO add your handling code here
        //set the questioText below with the selected item
        String selectedQuestion = (String) level2QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level2QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList2.get(i);
    }//GEN-LAST:event_level2QuestionsBoxActionPerformed

    private void level1QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level1QuestionsBoxActionPerformed
        // TODO add your handling code here:
        //set the questioText below with the selected item
        String selectedQuestion = (String) level1QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level1QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList1.get(i);
    }//GEN-LAST:event_level1QuestionsBoxActionPerformed

    private void level3QuestionsBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_level3QuestionsBoxActionPerformed
        // TODO add your handling code here:
        //set the questioText below with the selected item
        String selectedQuestion = (String) level3QuestionsBox.getSelectedItem();
        questionText.setText(selectedQuestion);
        //get the selected index
        int i = level3QuestionsBox.getSelectedIndex();
        //set the current question to the one selected
        currentQuestion = qList3.get(i);
    }//GEN-LAST:event_level3QuestionsBoxActionPerformed

    //edit the question when save button is clicked
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        //create a new question (editedQuestion)
        Question editedQuestion = currentQuestion;
        //set its question to the text box
        editedQuestion.setQuestion(questionText.getText());
        //edit the question throught the manager
        //manager.editQuestion(currentQuestion.getLevel(), currentQuestion.getCategory(), 1, editedQuestion);
        System.out.println("Question saved: " + questionText.getText());
    }//GEN-LAST:event_saveButtonActionPerformed

    private void questionTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextActionPerformed
        // TODO add your handling code here  
    }//GEN-LAST:event_questionTextActionPerformed

    //fill the combo boxes
    private void fillInBoxes() {
        fillInBox1();
        fillInBox2();
        fillInBox3();
    }

    //fill in level 1 combo box
    private void fillInBox1() {
        //get list of questions for level2
        qList1 = qController.getListOfQuestions(QuestionLevel.LEVEL_1);
        Iterator<Question> iterator = qList1.iterator();
        while (iterator.hasNext()) {
            level1QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }

    //fill in level 2 combo box
    private void fillInBox2() {
        //get list of questions for level2
        qList2 = qController.getListOfQuestions(QuestionLevel.LEVEL_2);
        Iterator<Question> iterator = qList2.iterator();
        while (iterator.hasNext()) {
            level2QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }

    //fill in level 3 combo box
    private void fillInBox3() {
        //get list of questions for level2
        qList3 = qController.getListOfQuestions(QuestionLevel.LEVEL_3);
        Iterator<Question> iterator = qList3.iterator();
        while (iterator.hasNext()) {
            level3QuestionsBox.addItem(iterator.next().getQuestion());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel infoLabel1;
    private javax.swing.JLabel level1Label;
    private javax.swing.JComboBox level1QuestionsBox;
    private javax.swing.JLabel level2Label;
    private javax.swing.JComboBox level2QuestionsBox;
    private javax.swing.JLabel level3Label;
    private javax.swing.JComboBox level3QuestionsBox;
    private javax.swing.JTextField questionText;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
