package GUI;

import MODAL.MySQL;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class class_registration extends javax.swing.JFrame {

    public static HashMap<String, Integer> subMap = new HashMap();
    public static HashMap<String, Integer> teachMap = new HashMap();

    public class_registration() {
        initComponents();
        loadsub();
        loadteacher();
        loadclass();
    }

    private void loadclass() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `class` "
                    + "INNER JOIN `teacher` ON `class`.`t_no` = `teacher`.`t_no`"
                    + "INNER JOIN `subjects` ON `class`.`sub_no` = `subjects`.`sub_no`");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> v = new Vector();

                v.add(resultSet.getString("class_no"));
                v.add(resultSet.getString("teacher.subjects"));
                v.add(resultSet.getString("teacher.first_name"));
                v.add(resultSet.getString("name"));
                v.add(resultSet.getString("timeslot"));

                model.addRow(v);
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadsub() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT `subjects`,`t_no` FROM `teacher`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("subjects"));
                subMap.put(resultSet.getString("subjects"), resultSet.getInt("t_no"));

            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private void reset() {
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTextField5.setText("");
        jComboBox1.requestFocus();
    }

    private void loadteacher() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT `first_name`,`t_no` FROM `teacher`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("first_name"));
                teachMap.put(resultSet.getString("first_name"), resultSet.getInt("t_no"));

            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox2.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Class Registration");

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel1.setText("Select Teacher");

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel5.setText("Add Timeslot");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add New Class");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Classes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete Classes");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel2.setText("Select The Subject");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel6.setText("Add Class Name");

        jTextField5.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField5))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class No", "Subject", "Teacher", "Class name", "Time slot"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String timeslot = jTextField4.getText();
        String className = jTextField5.getText();
        String subject = String.valueOf(jComboBox1.getSelectedItem());
        String teacher = String.valueOf(jComboBox2.getSelectedItem());

        //Validation
        if (timeslot.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Time Slot before add a new class", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (className.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Class Name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (subject.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Subject", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (teacher.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Teacher's First Name", "Warning", JOptionPane.ERROR_MESSAGE);

        } else {
            int sub_no = subMap.get(subject);
            int t_no = teachMap.get(teacher);

            try {
                MySQL.execute("INSERT INTO"
                        + "`class`(`t_no`,`sub_no`,`timeslot`,`name`)"
                        + "VALUES('" + t_no + "','" + sub_no + "','" + timeslot + "','" + className + "')");
                loadclass();
                reset();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int SelectedRow = jTable1.getSelectedRow();
        if (SelectedRow == -1) {
            JOptionPane.showMessageDialog(this, "First You Must select a ROW", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(SelectedRow, 0));

            String timeslot = jTextField4.getText();
            String className = jTextField5.getText();
            String subject = String.valueOf(jComboBox1.getSelectedItem());
            String teacher = String.valueOf(jComboBox2.getSelectedItem());

            if (timeslot.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Update Time Slot", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if (className.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Update Class Name", "Warning", JOptionPane.ERROR_MESSAGE);

            } else {
                int sub_no = subMap.get(subject);
                int t_no = teachMap.get(teacher);

                try {
                    MySQL.execute("UPDATE `class` SET "
                            + "`t_no`= '" + t_no + "' ,"
                            + "`sub_no`= '" + sub_no + "',"
                            + "`timeslot`= '" + timeslot + "',"
                            + "`name`= '" + className + "'"
                            + "WHERE `class_no`= '" + id + "'");
                    loadclass();
                    reset();
                    jTable1.setEnabled(true);
                    jButton1.setEnabled(true);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int SelectedRow = jTable1.getSelectedRow();
        if (SelectedRow == -1) {
            JOptionPane.showMessageDialog(this, "First You Must select a ROW", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(SelectedRow, 0));

            try {
                MySQL.execute("DELETE FROM `class` WHERE `class_no`= '" + id + "'");
                loadclass();
                reset();

                jTable1.setEnabled(true);
                jButton1.setEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            //System.out.println("Double clicked");

            jTable1.setEnabled(false);
            jButton1.setEnabled(false);
            int SelectedRow = jTable1.getSelectedRow();

            String tiimeslot = String.valueOf(jTable1.getValueAt(SelectedRow, 4));
            jTextField4.setText(tiimeslot);

            String className = String.valueOf(jTable1.getValueAt(SelectedRow, 3));
            jTextField5.setText(className);

            String subject = String.valueOf(jTable1.getValueAt(SelectedRow, 1));
            jComboBox1.setSelectedItem(subject);

            String teacher = String.valueOf(jTable1.getValueAt(SelectedRow, 2));
            jComboBox2.setSelectedItem(teacher);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(login.class.getResourceAsStream(
                "/themes/arc_theme_orange.theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new class_registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
