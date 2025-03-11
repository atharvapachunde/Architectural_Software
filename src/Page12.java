
import javax.swing.JScrollBar;

public class Page12 extends javax.swing.JFrame {
//Heading Panel Variables

    String plotno = "";
    String ctsno = "";
    String gatno = "";
    String surveyno = "";
    String village = "";
    String taluka = "";
    double lowest = 0.0;
   
    public Page12() {
        initComponents();
    }
      public Page12(String surveyno, String gatno, String ctsno, String plotno, String village, String taluka, double lowest) {
        initComponents();
         //Panel Code Initialization
        this.plotno = plotno;
        this.gatno = gatno;
        this.surveyno = surveyno;
        this.ctsno = ctsno;
        this.village = village;
        this.taluka = taluka;
        this.lowest = lowest;
        
        jTextArea1.setEditable(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        surveyno_l = new javax.swing.JLabel();
        survey = new javax.swing.JLabel();
        village_l = new javax.swing.JLabel();
        village1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        taluka1 = new javax.swing.JLabel();
        arealabel = new javax.swing.JLabel();
        larea = new javax.swing.JLabel();
        gatnol = new javax.swing.JLabel();
        gatno1 = new javax.swing.JLabel();
        ctsl = new javax.swing.JLabel();
        cts1 = new javax.swing.JLabel();
        plotnol = new javax.swing.JLabel();
        plotno1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridBagLayout());

        surveyno_l.setText("Survey No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(surveyno_l, gridBagConstraints);

        survey.setText("jLabel10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(survey, gridBagConstraints);

        village_l.setText("Village");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        jPanel1.add(village_l, gridBagConstraints);

        village1.setText("jLabel12");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        jPanel1.add(village1, gridBagConstraints);

        jLabel13.setText("Taluka");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 0, 0, 0);
        jPanel1.add(jLabel13, gridBagConstraints);

        taluka1.setText("jLabel14");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 54;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        jPanel1.add(taluka1, gridBagConstraints);

        arealabel.setText("Plot Area (in sq. m.)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 3, 0, 0);
        jPanel1.add(arealabel, gridBagConstraints);

        larea.setText("jLabel16");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.ipadx = 60;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(1, 18, 0, 0);
        jPanel1.add(larea, gridBagConstraints);

        gatnol.setText("Gat No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(gatnol, gridBagConstraints);

        gatno1.setText("jLabel16");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 42, 0, 0);
        jPanel1.add(gatno1, gridBagConstraints);

        ctsl.setText("CTS No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(ctsl, gridBagConstraints);

        cts1.setText("jLabel24");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 42, 0, 0);
        jPanel1.add(cts1, gridBagConstraints);

        plotnol.setText("Plot No");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(plotnol, gridBagConstraints);

        plotno1.setText("jLabel26");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 42, 0, 0);
        jPanel1.add(plotno1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel1.setText("Pandit Joshi & Associates");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 31, 0, 6);
        jPanel1.add(jLabel1, gridBagConstraints);

        jButton4.setText("<- PREVIOUS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText(" NEXT ->");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("LAND USE CLASSIFICATION AND PERMISSIBLE USES");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("In land development or redevelopment, the intended use must align with its designated purpose in the \ni) Development Plan, Regional Plan, or Planning Proposal, unless stated otherwise.\n\nii) Non-Conforming Uses: Lawful non-conforming uses existing before the enforcement of a Development/Regional \nPlan may continue and expand within the original sanctioned limits. If a building with such use is rebuilt, it must \nconform to regulations or lawful existing use.\n\niii) Existing Features: Features shown in plans are indicative and may be modified as per actual conditions. \nLandowners can develop land based on the permitted zone, and physical features like roads or water bodies will \nbe considered per Land Records, allowing unaffected land to be developed as per adjacent predominant use.\n\niv) Parking Development: The Authority may develop land for public parking in any form, regardless of its existing or \nproposed use. Basement parking may be permitted under playgrounds, subject to conditions.\n\nv) Discontinuance of Zoning: If land was designated as Public/Semi-Public or Public Utility due to an existing activity, \nit will be deemed part of the adjacent predominant zone once the activity ceases, unless prohibited.");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("RESIDENTIAL ZONE - R-1  ");

        jTextArea2.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Principal shall be permitted in buildings or premises in purely Residential Zone, subject to other regulations:- \ni Any residences, Slum Improvement / Rehabilitation. \nii Hostels for students / working men/ women, lodging with or without boarding facilities.\niii Old age home, sanatorium, orphanage, night shelter dormitories.  \niv Customary Home Occupations (without hired labor, max 1 H.P. power)\n    ->Stitching, embroidery, beauty parlors, button making, etc.\nv Medical Facilities\n    ->Medical and dental dispensaries, diagnostic clinics, polyclinics, counseling centers (on any floor).\n    ->Maternity homes, nursing homes (max 20 beds) with separate access unless the doctor's residence is above.\nvi Professional Offices for personal use, max carpet area of 50 sq.m.\nvii Community & Recreational Facilities\n    ->Community halls, gymnasiums (max 100 sq.m.).\n    ->Clubhouses/gymkhanas in residential complexes.\nviii Educational Institutions\n    ->Primary and nursery schools, students' hostels (excluding trade schools).\n    ->Crèche, daycare center (max 100 sq.m.).\n    ->Private coaching classes, student mess (max 100 sq.m.) with separate parking. \nix Religious & Cultural Institutions\n   ->Religious buildings.\n   ->Public/city libraries, museums (in independent buildings or ground/first floor of composite buildings).\nx Public Amenities & Infrastructure\n   ->Parks, gardens, playfields (non-commercial).\n   ->Bus shelters, taxi/rickshaw stands, metro/BRT stations, cycle stands, etc.\n   ->Police stations, government/municipal offices, post offices, banks with vaults, electric substations, fire aid posts,\n        home guards, civil defense centers, essential public utilities, pumping stations, and water installations.\nxi Commercial & Industrial Uses\n   ->Convenience shops (only on the ground floor).\n   ->Electronic assembly (not manufacturing), max 1 H.P. power.\n   ->IT establishments (software only) on roads with a width of 9m+.\n   ->Flour mills, wet/dry masala grinding (max 10 H.P. power).\nxii Other Uses\n   ->Burial and cremation grounds (on roads 9m+ wide).\n   ->Agricultural, horticultural, and allied uses (excluding agro-based industries).\n   ->Raisin production, bookbinding.\n   ->Public conveniences.\n   ->Research, experimental, and testing laboratories (non-hazardous).\n\n\n\n\n\n\n");
        jScrollPane3.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(jButton4)
                                .addGap(133, 133, 133)
                                .addComponent(jButton3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Page11 p11=new Page11(surveyno, gatno, ctsno, plotno, village, taluka, lowest);
        p11.setVisible(true);
        p11.pack();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Page11 p11=new Page11(surveyno, gatno, ctsno, plotno, village, taluka, lowest);
        p11.setVisible(true);
        p11.pack();
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
public void headingPanelActivation() {
        //setting visibility
        ctsl.setVisible(false);
        cts1.setVisible(false);
        gatnol.setVisible(false);
        gatno1.setVisible(false);
        surveyno_l.setVisible(false);
        survey.setVisible(false);
        plotno1.setVisible(false);
        plotnol.setVisible(false);

        if (!surveyno.isEmpty()) {
            surveyno_l.setVisible(true);
            survey.setVisible(true);
            survey.setText(surveyno);
        }
        if (!ctsno.isEmpty()) {
            ctsl.setVisible(true);
            cts1.setVisible(true);
            cts1.setText(ctsno);
        }
        if (!gatno.isEmpty()) {
            gatno1.setVisible(true);
            gatnol.setVisible(true);
            gatno1.setText(gatno);
        }
        if (!plotno.isEmpty()) {
            plotno1.setVisible(true);
            plotnol.setVisible(true);
            plotno1.setText(plotno);
        }

        //Setting village, lowest area, taluka
        larea.setText(String.valueOf(lowest));
        taluka1.setText(taluka);
        village1.setText(village);

    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        headingPanelActivation();
        JScrollBar verticalScrollBar = jScrollPane2.getVerticalScrollBar();
        verticalScrollBar.setValue(0);
        
        JScrollBar verticalScrollBar1 = jScrollPane3.getVerticalScrollBar();
        verticalScrollBar1.setValue(0);

    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Page12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Page12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Page12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Page12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Page12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arealabel;
    private javax.swing.JLabel cts1;
    private javax.swing.JLabel ctsl;
    private javax.swing.JLabel gatno1;
    private javax.swing.JLabel gatnol;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel larea;
    private javax.swing.JLabel plotno1;
    private javax.swing.JLabel plotnol;
    private javax.swing.JLabel survey;
    private javax.swing.JLabel surveyno_l;
    private javax.swing.JLabel taluka1;
    private javax.swing.JLabel village1;
    private javax.swing.JLabel village_l;
    // End of variables declaration//GEN-END:variables
}
