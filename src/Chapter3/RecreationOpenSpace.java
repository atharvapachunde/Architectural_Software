package Chapter3;
public class RecreationOpenSpace extends javax.swing.JPanel {

    
    public RecreationOpenSpace(double area) {
        initComponents();
        jTextArea1.setEditable(false);
        jTextArea4.setEditable(false);
        if(area<4000){
            jLabel17.setText("NO Recreational Space to be left");
        }else {
            float areatobeleft = (float) (0.1 * area);
            jLabel17.setText("Area to be Left: " + areatobeleft + "sq. m.");
        }  
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Recreational Open Spaces");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Any land/plot admeasuring 0.4 ha. or more, 10% of area shall be enmarked as Recreational Open Space, mostly in \none place.\nIncase land/plot is admeasuring more than 0.8 ha., the recreational open space can be provided in different location. \nOwner can provide more than 10% of recreational open space.\n\nFor the lands which are sub-divided after 11th January, 1967 without taking prior permission from the Authority and \nhaving plot area below 0.4 ha., the applicant may opt for any of the options from :- \na) providing 10% open space subject to a minimum of  200 sq.m., or  \nb) availing the reduced FSI of 75% of the basic FSI as otherwise permissible on such land.  \nc) avail full basic FSI and other permissible FSI / TDR by paying 10% value of the land \nunder proposal as per Annual Statement of Ratesfor that year, without considering \nguidelines therein. \n\nNot more than 50% of Recreational Space to provided on terrace of podium. Owner can provide 100% recreational open \nspace on the terrace only if 1.5 m. strip provided along the boundary of terrace.\n\nIf a surplus or retainable land under the Urban Land (C. & R.) Act, 1976, is 0.4 hectares or more, 10% of it must be reserved as \nrecreational open space.\n\nOpen Space to be provided for any use/zone \n\nNo Recreational Open space to be provided for land/plot of area upto 0.4 ha.\nRecreational open space is not required for:\na) Subdivision of plots from an already sanctioned layout.\nb) Development of non-residential reservations in Development Plans.\nc) Non-residential, non-industrial, and non-educational uses in the Agricultural zone.\n");
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("Structures permitted in Open Spaces:\n1.Max 2 storeyed structure with max 15% builtup area of open space. \nBuilt up area on ground floor shall not exceed 10%. Incase of slilt, additional floor may be added.\n2.The structures used for the purpose of education, sports and recreational activity are permitted. \n3.Utilities such as water tank (underground or elevated), electric substation, generator set, pump houses, \ngarbage treatment, public health out post/ centre may be permitted only with the consent of the society of residents.\n4.No detached toilet block shall be permitted.\n5.A swimming pool may also be permitted in such a recreational open space. \n6.The proposal for the construction of such structure should come as a proposal from the owner/s, \nowners‘ society / societies or federation of owners‘ societies and shall be meant for the beneficial use of \nthe owners/ members of such society / societies / federation of societies. \n7.The remaining area of the recreational open space shall be kept open to sky and properly accessible to all \nmembers as a place of recreation, garden or a playground. \n8.The owners‘ society / societies, the federation of the owners‘ societies shall submit to the Authority, \na registered undertaking agreeing to the conditions in (6) & (7) above while obtaining permission for the \nabove said construction. ");
        jScrollPane5.setViewportView(jTextArea4);

        jLabel17.setText("jLabel17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(201, 201, 201))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
