package GUI;

import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import MODAL.MySQL;
import com.formdev.flatlaf.IntelliJTheme;

public class User_registration extends javax.swing.JFrame {

    public User_registration() {
        initComponents();
        loadUser();
    }
    private void loadUser() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `student` ");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {

                Vector<String> v = new Vector();

                v.add(resultSet.getString("s_no"));
                v.add(resultSet.getString("First_name"));
                v.add(resultSet.getString("Last_name"));
                v.add(resultSet.getString("Address"));
                v.add(resultSet.getString("dob"));

                model.addRow(v);
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void reset() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField1.grabFocus();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adyapana Student Registration Tab");

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel1.setText("First Name");

        jTextField1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel2.setText("Last Name");

        jTextField2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel3.setText("Address");

        jTextField3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel5.setText("Date Of Birth");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Create New Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Student Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete Student Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField4))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Address", "Date Of Birth"
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String firstName = jTextField1.getText();
        String lastName = jTextField2.getText();
        String Address = jTextField3.getText();
        String dob = jTextField4.getText();

        //Validation
        if (firstName.isEmpty()) {
            //System.out.println("Please Enter First Name");
            JOptionPane.showMessageDialog(this, "Please Enter First Name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (lastName.isEmpty()) {
            //System.out.println("Please Enter Last Name");
            JOptionPane.showMessageDialog(this, "Please Enter Last Name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (Address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Address", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (dob.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Date Of Birth", "Warning", JOptionPane.ERROR_MESSAGE);

        } else {

            try {
                MySQL.execute("INSERT INTO "
                        + "`student`(`first_name`,`last_name`,`Address`,`dob` )"
                        + "VALUES('" + firstName + "','" + lastName + "','" + Address + "','" + dob + "')");
                loadUser();
                reset();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //System.out.println("Double clicked");

            jTable1.setEnabled(false);
            jButton1.setEnabled(false);
            jTextField4.setEnabled(false);

            //jButton3.setEnabled(false);
            int SelectedRow = jTable1.getSelectedRow();
            //System.out.println(SelectedRow);

            String fname = String.valueOf(jTable1.getValueAt(SelectedRow, 1));
            jTextField1.setText(fname);

            String lname = String.valueOf(jTable1.getValueAt(SelectedRow, 2));
            jTextField2.setText(lname);

            String Address = String.valueOf(jTable1.getValueAt(SelectedRow, 3));
            jTextField3.setText(Address);

            String dob = String.valueOf(jTable1.getValueAt(SelectedRow, 4));
            jTextField4.setText(dob);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int SelectedRow = jTable1.getSelectedRow();
        if (SelectedRow == -1) {
            JOptionPane.showMessageDialog(this, "First You Must select a ROW", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(SelectedRow, 0));
            String firstName = jTextField1.getText();
            String lastName = jTextField2.getText();
            String Address = jTextField3.getText();
            //Validation
            if (firstName.isEmpty()) {
                //System.out.println("Please Enter First Name");
                JOptionPane.showMessageDialog(this, "Please Update First Name", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if (lastName.isEmpty()) {
                //System.out.println("Please Enter Last Name");
                JOptionPane.showMessageDialog(this, "Please Update Last Name", "Warning", JOptionPane.ERROR_MESSAGE);
            } else if (Address.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please Update Address", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    MySQL.execute("UPDATE `student` SET `First_name`= '" + firstName + "' ,"
                            + "`Last_name`= '" + lastName + "',"
                            + "`Address`= '" + Address + "'"
                            + "WHERE `s_no`= '" + id + "'");
                    loadUser();
                    reset();
                    jTable1.setEnabled(true);
                    jButton1.setEnabled(true);
                    jTextField4.setEnabled(true);
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
                MySQL.execute("DELETE FROM `student` WHERE `s_no`= '" + id + "'");
                loadUser();
                reset();
                jTable1.setEnabled(true);
                jButton1.setEnabled(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(login.class.getResourceAsStream(
                "/themes/arc_theme_orange.theme.json"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new User_registration().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
