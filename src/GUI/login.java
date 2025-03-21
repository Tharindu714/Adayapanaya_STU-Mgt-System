package GUI;

import MODAL.MySQL;
import MODAL.Admin;
import com.formdev.flatlaf.IntelliJTheme;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pass_stu = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_stu = new javax.swing.JTextField();
        email_stu = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trajan Pro 3", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("ADYAPANAYA STUDENT MANAGEMENT SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(210, 20, 660, 50);

        pass_stu.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        pass_stu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass_stu.setText("Enter Password Here");
        pass_stu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pass_stuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pass_stuFocusLost(evt);
            }
        });
        pass_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_stuActionPerformed(evt);
            }
        });
        jPanel1.add(pass_stu);
        pass_stu.setBounds(520, 370, 390, 30);

        jLabel3.setBackground(new java.awt.Color(102, 0, 102));
        jLabel3.setFont(new java.awt.Font("Trajan Pro 3", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("ADMIN LOGIN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 90, 330, 60);

        jLabel5.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Admin Name");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 170, 150, 70);

        jLabel4.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 350, 150, 70);

        username_stu.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        username_stu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username_stu.setText("Enter Admin Name Here");
        username_stu.setToolTipText("");
        username_stu.setOpaque(true);
        username_stu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_stuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                username_stuFocusLost(evt);
            }
        });
        username_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_stuActionPerformed(evt);
            }
        });
        jPanel1.add(username_stu);
        username_stu.setBounds(520, 190, 390, 30);

        email_stu.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        email_stu.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email_stu.setText("Enter Email Address Here");
        email_stu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                email_stuFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_stuFocusLost(evt);
            }
        });
        email_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_stuActionPerformed(evt);
            }
        });
        jPanel1.add(email_stu);
        email_stu.setBounds(520, 280, 390, 30);

        jLabel6.setFont(new java.awt.Font("Lao UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Email");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 260, 150, 70);

        jButton4.setBackground(new java.awt.Color(255, 102, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("LOGIN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(520, 440, 390, 30);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Online-Learning-Education-Transparent-Image.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mrsd_online.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 190, 260, 230);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/mail.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/gmail.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(320, 270, 60, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/password (1).png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/password.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(320, 360, 60, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user (3).png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/user (2).png"))); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(320, 180, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1000, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pass_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_stuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_stuActionPerformed

    private void email_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_stuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_stuActionPerformed

    private void username_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_stuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_stuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void username_stuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_stuFocusGained
        // TODO add your handling code here:
        if (username_stu.getText().equals("Enter Admin Name Here")) {
            username_stu.setText("");
            username_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_username_stuFocusGained

    private void username_stuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_stuFocusLost
        // TODO add your handling code here:
        if (username_stu.getText().equals("")) {
            username_stu.setText("Enter Admin Name Here");
            username_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_username_stuFocusLost

    private void email_stuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_stuFocusGained
        // TODO add your handling code here:
        if (email_stu.getText().equals("Enter Email Address Here")) {
            email_stu.setText("");
            email_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_email_stuFocusGained

    private void email_stuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_stuFocusLost
        // TODO add your handling code here:
        if (email_stu.getText().equals("")) {
            email_stu.setText("Enter Email Address Here");
            email_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_email_stuFocusLost

    private void pass_stuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_stuFocusGained
        // TODO add your handling code here:
        if (pass_stu.getText().equals("Enter Password Here")) {
            pass_stu.setText("");
            pass_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_pass_stuFocusGained

    private void pass_stuFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pass_stuFocusLost
        // TODO add your handling code here:
        if (pass_stu.getText().equals("")) {
            pass_stu.setText("Enter Password Here");
            pass_stu.setForeground(java.awt.Color.BLACK);
        }
    }//GEN-LAST:event_pass_stuFocusLost

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String name = username_stu.getText();
        String email = email_stu.getText();
        String pass = String.valueOf(pass_stu.getPassword());
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Email Address", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (pass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter Password", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                ResultSet resultset = MySQL.execute("SELECT * FROM `admin`");
                if (resultset.next()) { 
                    Admin admin = new Admin();
                    admin.setName(resultset.getString("Name"));
                    admin.setEmail(resultset.getString("Email"));
                    admin.setPass(resultset.getString("password"));
                    Home log = new Home();
                    log.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Login Succesful", "SUCCESSFULLY LOGIN", JOptionPane.OK_OPTION);
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid User Detected", "LOGIN FAILED", JOptionPane.WARNING_MESSAGE);
                    username_stu.setText("");
                    email_stu.setText("");
                    pass_stu.setText("");
                    username_stu.grabFocus();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        IntelliJTheme.setup(login.class.getResourceAsStream(
                "/themes/arc_theme_orange.theme.json"));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email_stu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField pass_stu;
    private javax.swing.JTextField username_stu;
    // End of variables declaration//GEN-END:variables
}
