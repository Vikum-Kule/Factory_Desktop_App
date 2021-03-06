/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIs;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Vikum
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Parent = new javax.swing.JPanel();
        SideBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home = new javax.swing.JPanel();
        in_home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_notifications = new javax.swing.JPanel();
        in_notification = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn_warnings = new javax.swing.JPanel();
        in_warnings = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_charts = new javax.swing.JPanel();
        in_charts = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        in_reports = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        btn_export = new javax.swing.JPanel();
        btn_manifacture = new javax.swing.JPanel();
        btn_import = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        Parent.setAlignmentX(200.0F);
        Parent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SideBar.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dashboard");

        btn_home.setBackground(new java.awt.Color(102, 0, 102));
        btn_home.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_homeMouseMoved(evt);
            }
        });
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_homeMousePressed(evt);
            }
        });
        btn_home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout in_homeLayout = new javax.swing.GroupLayout(in_home);
        in_home.setLayout(in_homeLayout);
        in_homeLayout.setHorizontalGroup(
            in_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_homeLayout.setVerticalGroup(
            in_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_home.add(in_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");
        btn_home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        btn_notifications.setBackground(new java.awt.Color(102, 0, 102));
        btn_notifications.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_notificationsMousePressed(evt);
            }
        });
        btn_notifications.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout in_notificationLayout = new javax.swing.GroupLayout(in_notification);
        in_notification.setLayout(in_notificationLayout);
        in_notificationLayout.setHorizontalGroup(
            in_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_notificationLayout.setVerticalGroup(
            in_notificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_notifications.add(in_notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Notifications");
        btn_notifications.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        btn_warnings.setBackground(new java.awt.Color(102, 0, 102));
        btn_warnings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_warningsMousePressed(evt);
            }
        });
        btn_warnings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout in_warningsLayout = new javax.swing.GroupLayout(in_warnings);
        in_warnings.setLayout(in_warningsLayout);
        in_warningsLayout.setHorizontalGroup(
            in_warningsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_warningsLayout.setVerticalGroup(
            in_warningsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_warnings.add(in_warnings, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Warnings");
        btn_warnings.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        btn_charts.setBackground(new java.awt.Color(102, 0, 102));
        btn_charts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_chartsMousePressed(evt);
            }
        });
        btn_charts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout in_chartsLayout = new javax.swing.GroupLayout(in_charts);
        in_charts.setLayout(in_chartsLayout);
        in_chartsLayout.setHorizontalGroup(
            in_chartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_chartsLayout.setVerticalGroup(
            in_chartsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_charts.add(in_charts, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Charts");
        btn_charts.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        btn_reports.setBackground(new java.awt.Color(102, 0, 102));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout in_reportsLayout = new javax.swing.GroupLayout(in_reports);
        in_reports.setLayout(in_reportsLayout);
        in_reportsLayout.setHorizontalGroup(
            in_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        in_reportsLayout.setVerticalGroup(
            in_reportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_reports.add(in_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 40));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Reports");
        btn_reports.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 200, 40));

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_notifications, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_warnings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(124, 124, 124))
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_charts, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_notifications, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_warnings, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_charts, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        Parent.add(SideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 210, -1));

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_export.setBackground(new java.awt.Color(102, 0, 102));
        btn_export.setPreferredSize(new java.awt.Dimension(170, 170));

        javax.swing.GroupLayout btn_exportLayout = new javax.swing.GroupLayout(btn_export);
        btn_export.setLayout(btn_exportLayout);
        btn_exportLayout.setHorizontalGroup(
            btn_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        btn_exportLayout.setVerticalGroup(
            btn_exportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel11.add(btn_export, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 170, 170));

        btn_manifacture.setBackground(new java.awt.Color(102, 0, 102));
        btn_manifacture.setPreferredSize(new java.awt.Dimension(170, 170));

        javax.swing.GroupLayout btn_manifactureLayout = new javax.swing.GroupLayout(btn_manifacture);
        btn_manifacture.setLayout(btn_manifactureLayout);
        btn_manifactureLayout.setHorizontalGroup(
            btn_manifactureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        btn_manifactureLayout.setVerticalGroup(
            btn_manifactureLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel11.add(btn_manifacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, 170, 170));

        btn_import.setBackground(new java.awt.Color(102, 0, 102));
        btn_import.setPreferredSize(new java.awt.Dimension(170, 170));

        javax.swing.GroupLayout btn_importLayout = new javax.swing.GroupLayout(btn_import);
        btn_import.setLayout(btn_importLayout);
        btn_importLayout.setHorizontalGroup(
            btn_importLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        btn_importLayout.setVerticalGroup(
            btn_importLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        jPanel11.add(btn_import, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 170, 170));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/istockphoto-1005362660-612x612.jpg"))); // NOI18N
        jPanel11.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, -1));

        Parent.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 840, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parent, javax.swing.GroupLayout.PREFERRED_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 523, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_homeMousePressed

    private void btn_notificationsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_notificationsMousePressed
        resetColor(btn_home);
        setColor(btn_notifications);
        resetColor(btn_reports);
        resetColor(btn_warnings);
        resetColor(btn_charts);
    }//GEN-LAST:event_btn_notificationsMousePressed

    private void btn_warningsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_warningsMousePressed
        resetColor(btn_home);
        resetColor(btn_notifications);
        resetColor(btn_reports);
        setColor(btn_warnings);
        resetColor(btn_charts);
    }//GEN-LAST:event_btn_warningsMousePressed

    private void btn_chartsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_chartsMousePressed
        resetColor(btn_home);
        resetColor(btn_notifications);
        resetColor(btn_reports);
        resetColor(btn_warnings);
        setColor(btn_charts);
    }//GEN-LAST:event_btn_chartsMousePressed

    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed
        resetColor(btn_home);
        resetColor(btn_notifications);
        setColor(btn_reports);
        resetColor(btn_warnings);
        resetColor(btn_charts);
        
    }//GEN-LAST:event_btn_reportsMousePressed

    private void btn_homeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseMoved
        setColor(btn_home);
        resetColor(btn_notifications);
        resetColor(btn_reports);
        resetColor(btn_warnings);
        resetColor(btn_charts);
    }//GEN-LAST:event_btn_homeMouseMoved
    public void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    public void resetColor(JPanel panel){
        panel.setBackground(new Color(102,0,102));
    }
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Parent;
    private javax.swing.JPanel SideBar;
    private javax.swing.JPanel btn_charts;
    private javax.swing.JPanel btn_export;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_import;
    private javax.swing.JPanel btn_manifacture;
    private javax.swing.JPanel btn_notifications;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_warnings;
    private javax.swing.JPanel in_charts;
    private javax.swing.JPanel in_home;
    private javax.swing.JPanel in_notification;
    private javax.swing.JPanel in_reports;
    private javax.swing.JPanel in_warnings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel11;
    // End of variables declaration//GEN-END:variables
}
