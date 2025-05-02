package Chap6;

import java.awt.BorderLayout;

public class OtherBuildings extends javax.swing.JPanel {

    public OtherBuildings() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setLayout(new java.awt.GridBagLayout());

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medical Buildings", "Educational Buildings", "Public-Semi Public Buildings", "Mercantile Buildings", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 27, 0, 0);
        add(jComboBox1, gridBagConstraints);

        jLabel1.setText("Type of Building");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 25, 0, 0);
        add(jLabel1, gridBagConstraints);

        jLabel2.setText("Select Road Width");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 25, 0, 0);
        add(jLabel2, gridBagConstraints);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 110;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 27, 0, 0);
        add(jComboBox2, gridBagConstraints);

        jLabel3.setText("jLabel3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 64, 0, 0);
        add(jLabel3, gridBagConstraints);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 531;
        gridBagConstraints.ipady = 191;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 6, 6);
        add(jScrollPane1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selected = jComboBox1.getSelectedIndex();
        switch (selected) {
            case 0 -> {
                jComboBox2.removeAllItems();
                jComboBox2.addItem("9.0 m/7.5 m");
                jComboBox2.addItem("For Special Buildings");
            }
            case 1 -> {
                jComboBox2.removeAllItems();
                jComboBox2.addItem("Pre-Primary School");
                jComboBox2.addItem("Primary School - 6.0 m");
                jComboBox2.addItem("Other - 9.0m");
                jComboBox2.addItem("For Special Buildings");
            }
            case 2 -> {
                jComboBox2.removeAllItems();
                jComboBox2.addItem("9.0 m");
                jComboBox2.addItem("For Special Buildings");
            }
            case 3 -> {
                jComboBox2.removeAllItems();
                jComboBox2.addItem("On any Road");
                jComboBox2.addItem("As per R-2 Zone");
                jComboBox2.addItem("For Special Buildings");
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        String selected = String.valueOf(jComboBox2.getSelectedItem());
        switch (selected) {
            case "9.0 m/7.5 m" -> {
                jLabel3.setText("Margins as per Upto 15m Table, Side Margin: Min 6.0 m");
                HeigthUpto15m panel1 = new HeigthUpto15m();
                jPanel1.removeAll();
                jPanel1.setLayout(new java.awt.BorderLayout());
                jPanel1.add(panel1, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
            case "For Special Buildings" -> {
                 jPanel1.removeAll();
                jLabel3.setText("6.0 m on all sides");
            }
            case "Pre-Primary School" -> {
                jLabel3.setText("Margins as per Upto 15m Table");
                HeigthUpto15m panel1 = new HeigthUpto15m();
                jPanel1.removeAll();
                jPanel1.setLayout(new java.awt.BorderLayout());
                jPanel1.add(panel1, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
            case "Primary School - 6.0 m" -> {
                jLabel3.setText("--do--");
                 jPanel1.removeAll();
            }
            case "Other - 9.0m" -> {
                jLabel3.setText("3.0 m on all sides");
                 jPanel1.removeAll();
            }
            case "9.0 m" -> {
                jLabel3.setText("Margins as per Upto 15m Table, Side Margin: Min 3.0 m");
                HeigthUpto15m panel1 = new HeigthUpto15m();
                jPanel1.removeAll();
                jPanel1.setLayout(new java.awt.BorderLayout());
                jPanel1.add(panel1, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
            case "On any Road" -> {
                jLabel3.setText("Margins as per Upto 15m Table");
                HeigthUpto15m panel1 = new HeigthUpto15m();
                jPanel1.removeAll();
                jPanel1.setLayout(new java.awt.BorderLayout());
                jPanel1.add(panel1, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
            case "As per R-2 Zone" -> {
                jLabel3.setText("Margins as per Upto 15m Table, Side Margin: Min 3.0 m");
                HeigthUpto15m panel1 = new HeigthUpto15m();
                jPanel1.removeAll();
                jPanel1.setLayout(new java.awt.BorderLayout());
                jPanel1.add(panel1, BorderLayout.CENTER);
                jPanel1.revalidate();
                jPanel1.repaint();
            }
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
