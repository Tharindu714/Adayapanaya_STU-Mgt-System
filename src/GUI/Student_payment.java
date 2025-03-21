package GUI;
import MODAL.MySQL;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class Student_payment extends javax.swing.JFrame {

    public static HashMap<String, Integer> stuMap = new HashMap();
    public static HashMap<String, Integer> subMap = new HashMap();
    public static HashMap<String, Integer> teachMap = new HashMap();

    public Student_payment() {
        initComponents();
        loadStudent();
        loadsub();
        loadteacher();
        loadpay();
    }

    private void loadpay() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT * FROM `invoice` "
                    + "INNER JOIN `student` ON `invoice`.`s_no`=`student`.`s_no` "
                    + "INNER JOIN `teacher` ON `invoice`.`t_no` = `teacher`.`t_no`"
                    + "INNER JOIN `subjects` ON `invoice`.`sub_no` = `subjects`.`sub_no`");

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {

                Vector<String> v = new Vector();

                v.add(resultSet.getString("student.first_name"));
                v.add(resultSet.getString("teacher.subjects"));
                v.add(resultSet.getString("teacher.first_name"));
                v.add(resultSet.getString("month"));
                v.add(resultSet.getString("value"));

                model.addRow(v);
                jTable1.setModel(model);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reset() {
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jTextField5.setText("");
        jComboBox1.requestFocus();
    }

    private void loadStudent() {
        try {
            ResultSet resultSet = MySQL.execute("SELECT `first_name`,`s_no` FROM `student`");

            Vector v = new Vector();
            v.add("Select");

            while (resultSet.next()) {
                v.add(resultSet.getString("first_name"));
                stuMap.put(resultSet.getString("first_name"), resultSet.getInt("s_no"));

            }

            DefaultComboBoxModel model1 = new DefaultComboBoxModel(v);
            jComboBox1.setModel(model1);

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
            jComboBox2.setModel(model1);

        } catch (Exception e) {
            e.printStackTrace();

        }
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
            jComboBox3.setModel(model1);

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
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Payment Portal");

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel1.setText("Select Subject");

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel5.setText("Month");

        jButton1.setBackground(new java.awt.Color(0, 102, 51));
        jButton1.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Authorize Payment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 153));
        jButton2.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 0, 0));
        jButton3.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Reject Payment");
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
        jLabel2.setText("Select The Student");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel6.setText("Value Of the Class");

        jTextField5.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 16)); // NOI18N
        jLabel3.setText("Select Teacher");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

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
                    .addComponent(jTextField5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                "Student Name", "Subject", "Teacher", "Month", "value"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String month = jTextField4.getText();
        String value = jTextField5.getText();
        String student = String.valueOf(jComboBox1.getSelectedItem());
        String subject = String.valueOf(jComboBox2.getSelectedItem());
        String teacher = String.valueOf(jComboBox3.getSelectedItem());

        //Validation
        if (month.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Month before Authorize", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (value.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Value", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (student.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select student's First Name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (subject.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Subject", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (teacher.equals("Select")) {
            JOptionPane.showMessageDialog(this, "Please Select Teacher's First Name", "Warning", JOptionPane.ERROR_MESSAGE);

        } else {
            int sub_no = subMap.get(subject);
            int t_no = teachMap.get(teacher);
            int s_no = stuMap.get(student);

            try {
                MySQL.execute("INSERT INTO"
                        + "`invoice`(`s_no`,`t_no`,`sub_no`,`month`,`value`)"
                        + "VALUES('" + s_no + "','" + t_no + "','" + sub_no + "','" + month + "','" + value + "')");
                loadpay();
                reset();

                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("Invoice", "Student Payment");

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adyapana_db", "root", "tharinduCHA@8754");

                JasperPrint report = JasperFillManager.fillReport("src/reports/AdyapanaInvoice.jasper", parameters, connection);
                JasperViewer.viewReport(report, false);

                connection.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        {
            // TODO add your handling code here:
            int SelectedRow = jTable1.getSelectedRow();
            if (SelectedRow == -1) {
                JOptionPane.showMessageDialog(this, "First You Must select a ROW", "Warning", JOptionPane.ERROR_MESSAGE);
            } else {
                String id = String.valueOf(jTable1.getValueAt(SelectedRow, 0));

                String month = jTextField4.getText();
                String value = jTextField5.getText();

                if (month.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Update Month", "Warning", JOptionPane.ERROR_MESSAGE);
                } else if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please Update value of the class", "Warning", JOptionPane.ERROR_MESSAGE);

                } else {

                    try {
                        MySQL.execute("UPDATE `invoice` SET "
                                + "`month`= '" + month + "',"
                                + "`value`= '" + value + "'"
                                + "WHERE `inv_no`= '" + id + "'");
                        loadpay();
                        reset();
                        jTable1.setEnabled(true);
                        jButton1.setEnabled(true);
                        jComboBox1.setEnabled(true);
                        jComboBox2.setEnabled(true);
                        jComboBox3.setEnabled(true);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int SelectedRow = jTable1.getSelectedRow();
        if (SelectedRow == -1) {
            JOptionPane.showMessageDialog(this, "First You Must select a ROW", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            String id = String.valueOf(jTable1.getValueAt(SelectedRow, 0));

            try {
                MySQL.execute("DELETE FROM `invoice` WHERE `inv_no`= '" + id + "'");
                loadpay();
                reset();

                jTable1.setEnabled(true);
                jButton1.setEnabled(true);
                jComboBox1.setEnabled(true);
                jComboBox2.setEnabled(true);
                jComboBox3.setEnabled(true);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            //System.out.println("Double clicked");

            jTable1.setEnabled(false);
            jButton1.setEnabled(false);
            jComboBox1.setEnabled(false);
            jComboBox2.setEnabled(false);
            jComboBox3.setEnabled(false);
            int SelectedRow = jTable1.getSelectedRow();

            String month = String.valueOf(jTable1.getValueAt(SelectedRow, 3));
            jTextField4.setText(month);

            String value = String.valueOf(jTable1.getValueAt(SelectedRow, 4));
            jTextField5.setText(value);

            String subject = String.valueOf(jTable1.getValueAt(SelectedRow, 1));
            jComboBox2.setSelectedItem(subject);

            String teacher = String.valueOf(jTable1.getValueAt(SelectedRow, 2));
            jComboBox3.setSelectedItem(teacher);

            String student = String.valueOf(jTable1.getValueAt(SelectedRow, 0));
            jComboBox1.setSelectedItem(student);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(login.class.getResourceAsStream(
                "/themes/arc_theme_orange.theme.json"));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
