package Chap6;

import javax.swing.table.DefaultTableModel;

public class HeigthUpto15m extends javax.swing.JPanel {

    boolean answer = false;
    double area = 0.0;

    public HeigthUpto15m(double area) {
        this();
        this.area = area;

    }

    public HeigthUpto15m(boolean ans) {
      //jLabel2.setText(String.valueOf(ans));
    }

    public HeigthUpto15m() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Row Housing on Road of Width 12.0 and above", "Road of Width less than 15.0 m", "Road of Width 15.0 m above and below 18.0 m", "Road of Width 18.0 m above and below 30.0 m", "Road of Width 30.0 m and above", "NH/SH" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Type of Road");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Min. Front Setback (in m.)", "Min. Side Margin (in m.)", "Min. Rear Margin (in m.)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        int selected = jComboBox1.getSelectedIndex() + 1;

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        
        switch (selected) {
            case 1 -> {
                //jLabel2.setText("Front Setback: 0.9 m from pathway or 2.25 m from road Boundary");
                model.setRowCount(0);
                model.addRow(new Object[]{"2.25", "0.0 for Corner Plot/1.5 from Side building", "1.5"});
            }
            case 2 -> {
                model.setRowCount(0);
                model.addRow(new Object[]{"3.0", "1.5", "1.5"});
            }
            case 3 -> {
                model.setRowCount(0);
                model.addRow(new Object[]{"3.0", "1.5", "1.5"});
            }
            case 4 -> {
                model.setRowCount(0);
                model.addRow(new Object[]{"4.5", "2.0", "2.0"});
            }
            case 6 -> {
                model.setRowCount(0);
                model.addRow(new Object[]{"4.5", "3.0", "3.0"});
            }
            case 5 -> {
                model.setRowCount(0);
                model.addRow(new Object[]{"6.0", "3.0", "3.0"});
            }

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
