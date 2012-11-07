/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package superkidsapplication.panels;
//import sr;
import com.ece.superkids.questions.enums.QuestionCategory;
import com.ece.superkids.questions.enums.QuestionLevel;
import com.ece.superkids.users.entities.User;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import superkidsapplication.events.Session;

/**
 *
 * @author Prashant
 */
public class ScoresHistory extends javax.swing.JPanel {

    public QuestionLevel questionlevel;
    public List<QuestionCategory> category;
    public JTable table[] = new JTable[3];
    public User user;
    private Session session; 
    /*   
     * Creates new form ScoresHistory
     */
//    ScrollPane Historybox = new ScrollPane();
    // JTabbedPane historytab = new JTabbedPane();
    public ScoresHistory() {
        initComponents();
        session = Session.aSession();
        questionlevel = QuestionLevel.LEVEL_1;
        //JPanel tab2 = new JPanel();
        //JPanel tab3 = new JPanel();
        category = questionlevel.getCategories();
        //QuestionCategory.values();
        user = session.getLoggedInUser();
        for (int i = 0; i < category.size(); i++) {
            Object data[][] = user.getHistory(questionlevel.getCategories().get(i), questionlevel);
            /*    Object data[][] = {
             {"Q1", new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)},
             {"Q2", new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)},
             {"Q3", new Integer(11),new Integer(12),new Integer(13),new Integer(14),new Integer(15)},
             {"Q4", new Integer(16),new Integer(17),new Integer(18),new Integer(19),new Integer(20)},
             {"Q5", new Integer(21),new Integer(22),new Integer(23),new Integer(24),new Integer(25)},
            
             };*/

            String Columnname[] = {"Question Number", "Attempt 1", "Attempt 2", "Attempt 3", "Attempt 4", "Attempt 5"};

            table[i] = new JTable(data, Columnname);
            JScrollPane spTable = new JScrollPane(table[i]);

            jTabbedPane1.addTab(category.get(i).toString(), spTable);
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

        jSpinner1 = new javax.swing.JSpinner();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBounds(new java.awt.Rectangle(0, 0, 300, 300));
        setMaximumSize(new java.awt.Dimension(300, 300));
        setMinimumSize(new java.awt.Dimension(300, 300));
        setPreferredSize(new java.awt.Dimension(300, 300));

        jTabbedPane1.setName("historyTabPanel"); // NOI18N

        jButton1.setText("Level 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Level 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Level 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        questionlevel = QuestionLevel.LEVEL_1;
        category = questionlevel.getCategories();
        jTabbedPane1.removeAll();
        for (int i = 0; i < category.size(); i++) {
            Object data[][] = user.getHistory(questionlevel.getCategories().get(i), questionlevel);
            /*    Object data[][] = {
             {"Q1", new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)},
             {"Q2", new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)},
             {"Q3", new Integer(11),new Integer(12),new Integer(13),new Integer(14),new Integer(15)},
             {"Q4", new Integer(16),new Integer(17),new Integer(18),new Integer(19),new Integer(20)},
             {"Q5", new Integer(21),new Integer(22),new Integer(23),new Integer(24),new Integer(25)},
            
             };*/

            String Columnname[] = {"Question Number", "Attempt 1", "Attempt 2", "Attempt 3", "Attempt 4", "Attempt 5"};

            table[i] = new JTable(data, Columnname);
            JScrollPane spTable = new JScrollPane(table[i]);

            jTabbedPane1.addTab(category.get(i).toString(), spTable);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        questionlevel = QuestionLevel.LEVEL_2;
        category = questionlevel.getCategories();
        jTabbedPane1.removeAll();
        for (int i = 0; i < category.size(); i++) {
            Object data[][] = user.getHistory(questionlevel.getCategories().get(i), questionlevel);
            /*    Object data[][] = {
             {"Q1", new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)},
             {"Q2", new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)},
             {"Q3", new Integer(11),new Integer(12),new Integer(13),new Integer(14),new Integer(15)},
             {"Q4", new Integer(16),new Integer(17),new Integer(18),new Integer(19),new Integer(20)},
             {"Q5", new Integer(21),new Integer(22),new Integer(23),new Integer(24),new Integer(25)},
            
             };*/

            String Columnname[] = {"Question Number", "Attempt 1", "Attempt 2", "Attempt 3", "Attempt 4", "Attempt 5"};

            table[i] = new JTable(data, Columnname);
            JScrollPane spTable = new JScrollPane(table[i]);

            jTabbedPane1.addTab(category.get(i).toString(), spTable);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        questionlevel = QuestionLevel.LEVEL_3;
        category = questionlevel.getCategories();
        jTabbedPane1.removeAll();
        for (int i = 0; i < category.size(); i++) {
            Object data[][] = user.getHistory(QuestionLevel.LEVEL_1.getCategories().get(i), questionlevel);
            /*    Object data[][] = {
             {"Q1", new Integer(1),new Integer(2),new Integer(3),new Integer(4),new Integer(5)},
             {"Q2", new Integer(6),new Integer(7),new Integer(8),new Integer(9),new Integer(10)},
             {"Q3", new Integer(11),new Integer(12),new Integer(13),new Integer(14),new Integer(15)},
             {"Q4", new Integer(16),new Integer(17),new Integer(18),new Integer(19),new Integer(20)},
             {"Q5", new Integer(21),new Integer(22),new Integer(23),new Integer(24),new Integer(25)},
            
             };*/

            String Columnname[] = {"Question Number", "Attempt 1", "Attempt 2", "Attempt 3", "Attempt 4", "Attempt 5"};

            table[i] = new JTable(data, Columnname);
            JScrollPane spTable = new JScrollPane(table[i]);

            jTabbedPane1.addTab(category.get(i).toString(), spTable);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
