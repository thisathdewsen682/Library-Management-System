
import java.awt.HeadlessException;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thisath Dewsen
 */
public class Backup extends javax.swing.JFrame {
    
        Connection conn;
        ResultSet rs;
        PreparedStatement pst; 

    /**
     * Creates new form Login
     */
    public Backup() {
        super("Backup & Restore");
        setResizable(false);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();
        jTextField2 = new javax.swing.JTextField();
        browse = new rojeru_san.complementos.RSButtonHover();
        backup = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        jLabel1 = new javax.swing.JLabel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 168, 76));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        rSButtonHover1.setBackground(new java.awt.Color(153, 255, 153));
        rSButtonHover1.setText("Restore");
        rSButtonHover1.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        browse.setBackground(new java.awt.Color(204, 204, 204));
        browse.setText("Browse");
        browse.setColorText(new java.awt.Color(0, 0, 0));
        browse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        backup.setBackground(new java.awt.Color(153, 153, 255));
        backup.setText("Backp");
        backup.setColorText(new java.awt.Color(0, 0, 0));
        backup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupActionPerformed(evt);
            }
        });

        rSButtonHover2.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonHover2.setText("Browse");
        rSButtonHover2.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSButtonHover2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Backup & Restore");

        rSButtonHover3.setBackground(new java.awt.Color(204, 204, 204));
        rSButtonHover3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/previous.png"))); // NOI18N
        rSButtonHover3.setText("Back");
        rSButtonHover3.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rSButtonHover3.setRequestFocusEnabled(false);
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backup, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browse, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backup, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonHover2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonHover1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonHover3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    String path = null;
    String filename;
    
    
    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(this);
        String date = new SimpleDateFormat("MM-dd-yyy").format(new Date());
            
    try {
        File f = fc.getSelectedFile();
        path = f.getAbsolutePath();
        path = path.replace('\\', '/');
        path = path+"_"+date+".sql";
        jTextField1.setText(path);

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_browseActionPerformed

    private void backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupActionPerformed
        // TODO add your handling code here:
         


     if ("".equals(jTextField1.getText())) {
            JOptionPane.showMessageDialog(null, "Backup Didn't Successfull, Browse file First", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
                Process p=null;
        try {
            Runtime runtime=Runtime.getRuntime();
            p=runtime.exec("C:/wamp64/bin/mysql/mysql5.7.28/bin/mysqldump.exe -u root   -B lms -r "+path);

            int processComplete = p.waitFor();
            if (processComplete==0) {
                JOptionPane.showMessageDialog(null, "Successfully Backuped File");
                jTextField1.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Backup Didn't Successfull, Try typing a single word for file name", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                jTextField1.setText("");
            }

        } catch (HeadlessException | IOException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Error :"+e.getLocalizedMessage(),"Error Occurred!",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_backupActionPerformed
    }
    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        // TODO add your handling code here:
         if ("".equals(jTextField2.getText())) {
            JOptionPane.showMessageDialog(null, "Restore Didn't Successfull, Browse file First", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
        } else {
            String user="root";
        //        String pass="";
        String []restorecmd = new String []{"C:/wamp64/bin/mysql/mysql5.7.28/bin/mysql.exe","--user="+user,"-e","source "+path};

        Process process;
        try {
            process=Runtime.getRuntime().exec(restorecmd);
            int pr=process.waitFor();
            if (pr==0) {
                JOptionPane.showMessageDialog(null, "Successfully Restored File. Please close and relaunch the application.");
                jTextField2.setText("");

            } else {

                JOptionPane.showMessageDialog(null, "Restore Didn't Successfull", "Error Occurred!", JOptionPane.ERROR_MESSAGE);
                jTextField2.setText("");
            }
        } catch (HeadlessException | IOException | InterruptedException e) {
            JOptionPane.showMessageDialog(null, "Error :"+e.getLocalizedMessage(),"Error Occurred!",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover2ActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);

        try {
            File f=fc.getSelectedFile();
            path = f.getAbsolutePath();
            path=path.replace('\\', '/');
            jTextField2.setText(path);
        } catch (Exception e) {

            e.printStackTrace();
        }
    }//GEN-LAST:event_rSButtonHover2ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Login obj = new Login();
        obj.setVisible(true);
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Backup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSButtonHover backup;
    private rojeru_san.complementos.RSButtonHover browse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    // End of variables declaration//GEN-END:variables
}
