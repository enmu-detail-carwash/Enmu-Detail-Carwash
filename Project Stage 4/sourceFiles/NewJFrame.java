/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package s4files;

import java.awt.CardLayout;
import java.awt.Color;

/**
 *
 * @author david
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    CardLayout cardLayout;
    public NewJFrame() {
        initComponents();
        cardLayout = (CardLayout)(rightCardPanel.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        mainMenu = new javax.swing.JPanel();
        appointmentButton = new javax.swing.JButton();
        clientsButton = new javax.swing.JButton();
        employeesButton = new javax.swing.JButton();
        servicesButton = new javax.swing.JButton();
        salesButton = new javax.swing.JButton();
        mainTitleLabel = new javax.swing.JLabel();
        rightCardPanel = new javax.swing.JPanel();
        appointmentPanel = new javax.swing.JPanel();
        appointmentTabs = new javax.swing.JTabbedPane();
        CalendarPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        appointCreatePane = new javax.swing.JPanel();
        appointModifyPane = new javax.swing.JPanel();
        appointDeletePane = new javax.swing.JPanel();
        appointmentLabel = new javax.swing.JLabel();
        clientsPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        employeesPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        servicesPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        serviceTabs = new javax.swing.JTabbedPane();
        serviceCreateTab = new javax.swing.JPanel();
        serviceModifyTab = new javax.swing.JPanel();
        serviceRandomTab = new javax.swing.JPanel();
        salesPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carwash Management System");

        jSplitPane2.setDividerLocation(200);
        jSplitPane2.setDividerSize(0);

        mainMenu.setBackground(new java.awt.Color(0, 204, 255));
        mainMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 255)));
        mainMenu.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N

        appointmentButton.setBackground(new java.awt.Color(0, 153, 255));
        appointmentButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        appointmentButton.setForeground(new java.awt.Color(0, 0, 51));
        appointmentButton.setText("Appointments");
        appointmentButton.setBorderPainted(false);
        appointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appointmentButtonActionPerformed(evt);
            }
        });

        clientsButton.setBackground(new java.awt.Color(0, 153, 255));
        clientsButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        clientsButton.setForeground(new java.awt.Color(0, 0, 51));
        clientsButton.setText("Clients");
        clientsButton.setBorderPainted(false);
        clientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsButtonActionPerformed(evt);
            }
        });

        employeesButton.setBackground(new java.awt.Color(0, 153, 255));
        employeesButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        employeesButton.setForeground(new java.awt.Color(0, 0, 51));
        employeesButton.setText("Employees");
        employeesButton.setBorderPainted(false);
        employeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesButtonActionPerformed(evt);
            }
        });

        servicesButton.setBackground(new java.awt.Color(0, 153, 255));
        servicesButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        servicesButton.setForeground(new java.awt.Color(0, 0, 51));
        servicesButton.setText("Services");
        servicesButton.setBorderPainted(false);
        servicesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicesButtonActionPerformed(evt);
            }
        });

        salesButton.setBackground(new java.awt.Color(0, 153, 255));
        salesButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        salesButton.setForeground(new java.awt.Color(0, 0, 51));
        salesButton.setText("Sales");
        salesButton.setBorderPainted(false);
        salesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesButtonActionPerformed(evt);
            }
        });

        mainTitleLabel.setFont(new java.awt.Font("Rockwell Condensed", 0, 24)); // NOI18N
        mainTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainTitleLabel.setText("Carwash Management");

        javax.swing.GroupLayout mainMenuLayout = new javax.swing.GroupLayout(mainMenu);
        mainMenu.setLayout(mainMenuLayout);
        mainMenuLayout.setHorizontalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainMenuLayout.createSequentialGroup()
                .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(mainTitleLabel))
                    .addGroup(mainMenuLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(salesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(servicesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(employeesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(appointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainMenuLayout.setVerticalGroup(
            mainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainMenuLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mainTitleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(appointmentButton)
                .addGap(18, 18, 18)
                .addComponent(clientsButton)
                .addGap(18, 18, 18)
                .addComponent(employeesButton)
                .addGap(18, 18, 18)
                .addComponent(servicesButton)
                .addGap(18, 18, 18)
                .addComponent(salesButton)
                .addGap(124, 124, 124))
        );

        jSplitPane2.setLeftComponent(mainMenu);

        rightCardPanel.setLayout(new java.awt.CardLayout());

        appointmentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        appointmentTabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Testing Commit");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jCheckBox1.setText("Test");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CalendarPaneLayout = new javax.swing.GroupLayout(CalendarPane);
        CalendarPane.setLayout(CalendarPaneLayout);
        CalendarPaneLayout.setHorizontalGroup(
            CalendarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(CalendarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalendarPaneLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        CalendarPaneLayout.setVerticalGroup(
            CalendarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalendarPaneLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalendarPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jButton1))
                .addContainerGap(418, Short.MAX_VALUE))
        );

        appointmentTabs.addTab("Calendar", CalendarPane);

        javax.swing.GroupLayout appointCreatePaneLayout = new javax.swing.GroupLayout(appointCreatePane);
        appointCreatePane.setLayout(appointCreatePaneLayout);
        appointCreatePaneLayout.setHorizontalGroup(
            appointCreatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        appointCreatePaneLayout.setVerticalGroup(
            appointCreatePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        appointmentTabs.addTab("Create", appointCreatePane);

        javax.swing.GroupLayout appointModifyPaneLayout = new javax.swing.GroupLayout(appointModifyPane);
        appointModifyPane.setLayout(appointModifyPaneLayout);
        appointModifyPaneLayout.setHorizontalGroup(
            appointModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        appointModifyPaneLayout.setVerticalGroup(
            appointModifyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        appointmentTabs.addTab("Modify", appointModifyPane);

        javax.swing.GroupLayout appointDeletePaneLayout = new javax.swing.GroupLayout(appointDeletePane);
        appointDeletePane.setLayout(appointDeletePaneLayout);
        appointDeletePaneLayout.setHorizontalGroup(
            appointDeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        appointDeletePaneLayout.setVerticalGroup(
            appointDeletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        appointmentTabs.addTab("Delete", appointDeletePane);

        appointmentLabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        appointmentLabel.setText("Appointments");

        javax.swing.GroupLayout appointmentPanelLayout = new javax.swing.GroupLayout(appointmentPanel);
        appointmentPanel.setLayout(appointmentPanelLayout);
        appointmentPanelLayout.setHorizontalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(appointmentTabs, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appointmentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        appointmentPanelLayout.setVerticalGroup(
            appointmentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentPanelLayout.createSequentialGroup()
                .addComponent(appointmentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appointmentTabs))
        );

        rightCardPanel.add(appointmentPanel, "appointmentPanel");

        clientsPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 102, 255)));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Clients");

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("tab1", jPanel5);

        javax.swing.GroupLayout clientsPanelLayout = new javax.swing.GroupLayout(clientsPanel);
        clientsPanel.setLayout(clientsPanelLayout);
        clientsPanelLayout.setHorizontalGroup(
            clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane2)
        );
        clientsPanelLayout.setVerticalGroup(
            clientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientsPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2))
        );

        rightCardPanel.add(clientsPanel, "clientsPanel");

        employeesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Employees");

        jTabbedPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jTabbedPane3.addTab("tab1", jPanel6);

        javax.swing.GroupLayout employeesPanelLayout = new javax.swing.GroupLayout(employeesPanel);
        employeesPanel.setLayout(employeesPanelLayout);
        employeesPanelLayout.setHorizontalGroup(
            employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane3)
        );
        employeesPanelLayout.setVerticalGroup(
            employeesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(employeesPanelLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3))
        );

        rightCardPanel.add(employeesPanel, "employeesPanel");

        servicesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Services");

        serviceTabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout serviceCreateTabLayout = new javax.swing.GroupLayout(serviceCreateTab);
        serviceCreateTab.setLayout(serviceCreateTabLayout);
        serviceCreateTabLayout.setHorizontalGroup(
            serviceCreateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        serviceCreateTabLayout.setVerticalGroup(
            serviceCreateTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        serviceTabs.addTab("Create", serviceCreateTab);

        javax.swing.GroupLayout serviceModifyTabLayout = new javax.swing.GroupLayout(serviceModifyTab);
        serviceModifyTab.setLayout(serviceModifyTabLayout);
        serviceModifyTabLayout.setHorizontalGroup(
            serviceModifyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        serviceModifyTabLayout.setVerticalGroup(
            serviceModifyTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        serviceTabs.addTab("Modify", serviceModifyTab);

        javax.swing.GroupLayout serviceRandomTabLayout = new javax.swing.GroupLayout(serviceRandomTab);
        serviceRandomTab.setLayout(serviceRandomTabLayout);
        serviceRandomTabLayout.setHorizontalGroup(
            serviceRandomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        serviceRandomTabLayout.setVerticalGroup(
            serviceRandomTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );

        serviceTabs.addTab("Random", serviceRandomTab);

        javax.swing.GroupLayout servicesPanelLayout = new javax.swing.GroupLayout(servicesPanel);
        servicesPanel.setLayout(servicesPanelLayout);
        servicesPanelLayout.setHorizontalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(serviceTabs)
        );
        servicesPanelLayout.setVerticalGroup(
            servicesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(servicesPanelLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(serviceTabs))
        );

        rightCardPanel.add(servicesPanel, "servicesPanel");

        salesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Sales");

        jTabbedPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 704, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("tab1", jPanel8);

        javax.swing.GroupLayout salesPanelLayout = new javax.swing.GroupLayout(salesPanel);
        salesPanel.setLayout(salesPanelLayout);
        salesPanelLayout.setHorizontalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane5)
        );
        salesPanelLayout.setVerticalGroup(
            salesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salesPanelLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane5))
        );

        rightCardPanel.add(salesPanel, "salesPanel");

        jSplitPane2.setRightComponent(rightCardPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        setSize(new java.awt.Dimension(912, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(rightCardPanel, "clientsPanel");
    }//GEN-LAST:event_clientsButtonActionPerformed

    private void appointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appointmentButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(rightCardPanel,"appointmentPanel");
    }//GEN-LAST:event_appointmentButtonActionPerformed

    private void employeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(rightCardPanel,"employeesPanel");
       
    }//GEN-LAST:event_employeesButtonActionPerformed

    private void servicesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicesButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(rightCardPanel,"servicesPanel");
    }//GEN-LAST:event_servicesButtonActionPerformed

    private void salesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesButtonActionPerformed
        // TODO add your handling code here:
        cardLayout.show(rightCardPanel, "salesPanel");
    }//GEN-LAST:event_salesButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CalendarPane;
    private javax.swing.JPanel appointCreatePane;
    private javax.swing.JPanel appointDeletePane;
    private javax.swing.JPanel appointModifyPane;
    private javax.swing.JButton appointmentButton;
    private javax.swing.JLabel appointmentLabel;
    private javax.swing.JPanel appointmentPanel;
    private javax.swing.JTabbedPane appointmentTabs;
    private javax.swing.JButton clientsButton;
    private javax.swing.JPanel clientsPanel;
    private javax.swing.JButton employeesButton;
    private javax.swing.JPanel employeesPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel mainMenu;
    private javax.swing.JLabel mainTitleLabel;
    private javax.swing.JPanel rightCardPanel;
    private javax.swing.JButton salesButton;
    private javax.swing.JPanel salesPanel;
    private javax.swing.JPanel serviceCreateTab;
    private javax.swing.JPanel serviceModifyTab;
    private javax.swing.JPanel serviceRandomTab;
    private javax.swing.JTabbedPane serviceTabs;
    private javax.swing.JButton servicesButton;
    private javax.swing.JPanel servicesPanel;
    // End of variables declaration//GEN-END:variables
}
