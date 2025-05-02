
package Chapter3;

public class EducationalPurposeOpenSpace extends javax.swing.JPanel {

    public EducationalPurposeOpenSpace(double educationarea) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("In the case of development of land for educational purpose, in lieu of 10% recreational open space, following percentage \nof the gross area: ");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel3.setText("Enter the gross area (in ha.):");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Structures permitted in Open Spaces:\n1.Max 2 storeyed structure with max 15% builtup area of open space. \nBuilt up area on ground floor shall not exceed 10%. Incase of slilt, additional floor may be added.\n2.The structures used for the purpose of education, sports and recreational activity are permitted. \n3.Utilities such as water tank (underground or elevated), electric substation, generator set, pump houses, \ngarbage treatment, public health out post/ centre may be permitted only with the consent of the society of residents.\n4.No detached toilet block shall be permitted.\n5.A swimming pool may also be permitted in such a recreational open space. \n6.The proposal for the construction of such structure should come as a proposal from the owner/s, \nowners‘ society / societies or federation of owners‘ societies and shall be meant for the beneficial use of \nthe owners/ members of such society / societies / federation of societies. \n7.The remaining area of the recreational open space shall be kept open to sky and properly accessible to all \nmembers as a place of recreation, garden or a playground. \n8.The owners‘ society / societies, the federation of the owners‘ societies shall submit to the Authority, \na registered undertaking agreeing to the conditions in (6) & (7) above while obtaining permission for the \nabove said construction. ");
        jScrollPane5.setViewportView(jTextArea4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        double educationarea = Double.parseDouble(jTextField1.getText().trim());
        double playground = 0.0;
        double percentage = 0.0;
        double remaining = 0.0;
        if (educationarea <= 1.0) {
            percentage = 40;
            playground = (educationarea * 40) / 100;
            jLabel4.setText("Percentage of Playground to be left: " + percentage + "%");
            jLabel5.setText("Area to be left for playground: " + playground + " ha.");
        } else if (educationarea <= 2 && educationarea > 1) {
            playground = 0.4;
            jLabel4.setText("Area as per 1 + 35% of remaining area");
            remaining = educationarea - 1;
            playground = playground + ((remaining * 35) / 100);
            jLabel5.setText("Area to be left for playground: " + playground + " ha.");
        } else if (educationarea <= 3 && educationarea > 2) {
            playground = 0.75;
            jLabel4.setText("Area as per 2 + 30% of remaining area");
            remaining = educationarea - 2;
            playground = playground + ((remaining * 30) / 100);
            jLabel5.setText("Area to be left for playground: " + playground + " ha.");
        } else if (educationarea <= 4 && educationarea > 3) {
            playground = 1.05;
            jLabel4.setText("Area as per 3 + 25% of remaining area");
            remaining = educationarea - 3;
            playground = playground + ((remaining * 25) / 100);
            jLabel5.setText("Area to be left for playground: " + playground + " ha.");
        } else if (educationarea > 4) {
            playground = 1.3;
            jLabel4.setText("Area as per 4 + 20% of remaining area");
            remaining = educationarea - 4;
            playground = playground + ((remaining * 20) / 100);
            jLabel5.setText("Area to be left for playground: " + playground + " ha.");
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
