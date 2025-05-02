package Chapter3;

import javax.swing.table.DefaultTableModel;

public class MinimumPlotArea extends javax.swing.JPanel {
    public MinimumPlotArea() {
        initComponents();
        DefaultTableModel m1 = (DefaultTableModel) jTable2.getModel();
        m1.setRowCount(0);
        m1.addRow(new Object[]{"Residential & Commercial", "30", "As per Table 6D", "Row/Semi-detached/Detached as per approved layout or marginal distances"});
        m1.addRow(new Object[]{"EWS Housing/High Density Housing/Slum Upgradation", "20 or as per scheme", "Not Specified", "Row/Semi-detached/Detached"});
        m1.addRow(new Object[]{"Vehicle Fuel & Charging Stations", "As required by authority", "As required by authority", "Detached"});
        m1.addRow(new Object[]{"Industrial (excluding service industries)", "300", "10", "Detached"});
        m1.addRow(new Object[]{"Other Uses", "As per regulations", "As per regulations", "As per regulations"});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("MINIMUM PLOT AREA FOR VARIOUS USES ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uses", "Min Plot Area (in sq. m.)", "Min. Plot Width (in m.) ", "Type of Development "
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
