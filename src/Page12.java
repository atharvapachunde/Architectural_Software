
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

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
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
        jTextArea4.setEditable(false);
        jTextArea5.setEditable(false);
        jTextArea6.setEditable(false);
        jTextArea7.setEditable(false);
        jTextArea8.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel8 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();

        jLabel8.setText("jLabel8");

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
        jTextArea1.setText("i) In land development or redevelopment, the intended use must align with its designated purpose in the \nDevelopment Plan, Regional Plan, or Planning Proposal, unless stated otherwise.\n\nii) Non-Conforming Uses: Lawful non-conforming uses existing before the enforcement of a Development/Regional \nPlan may continue and expand within the original sanctioned limits. If a building with such use is rebuilt, it must \nconform to regulations or lawful existing use.\n\niii) Existing Features: Features shown in plans are indicative and may be modified as per actual conditions. \nLandowners can develop land based on the permitted zone, and physical features like roads or water bodies will \nbe considered per Land Records, allowing unaffected land to be developed as per adjacent predominant use.\n\niv) Parking Development: The Authority may develop land for public parking in any form, regardless of its existing or \nproposed use. Basement parking may be permitted under playgrounds, subject to conditions.\n\nv) Discontinuance of Zoning: If land was designated as Public/Semi-Public or Public Utility due to an existing activity, \nit will be deemed part of the adjacent predominant zone once the activity ceases, unless prohibited.");
        jScrollPane2.setViewportView(jTextArea1);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("RESIDENTIAL ZONE - R-1  ");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea2.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Principal shall be permitted in buildings or premises in purely Residential Zone, subject to other regulations:- \ni Any residences, Slum Improvement / Rehabilitation. \nii Hostels for students / working men/ women, lodging with or without boarding facilities.\niii Old age home, sanatorium, orphanage, night shelter dormitories.  \niv Customary Home Occupations (without hired labor, max 1 H.P. power)\n    ->Stitching, embroidery, beauty parlors, button making, etc.\nv Medical Facilities\n    ->Medical and dental dispensaries, diagnostic clinics, polyclinics, counseling centers (on any floor).\n    ->Maternity homes, nursing homes (max 20 beds) with separate access unless the doctor's residence is above.\nvi Professional Offices for personal use, max carpet area of 50 sq.m.\nvii Community & Recreational Facilities\n    ->Community halls, gymnasiums (max 100 sq.m.).\n    ->Clubhouses/gymkhanas in residential complexes.\nviii Educational Institutions\n    ->Primary and nursery schools, students' hostels (excluding trade schools).\n    ->Crèche, daycare center (max 100 sq.m.).\n    ->Private coaching classes, student mess (max 100 sq.m.) with separate parking. \nix Religious & Cultural Institutions\n   ->Religious buildings.\n   ->Public/city libraries, museums (in independent buildings or ground/first floor of composite buildings).\nx Public Amenities & Infrastructure\n   ->Parks, gardens, playfields (non-commercial).\n   ->Bus shelters, taxi/rickshaw stands, metro/BRT stations, cycle stands, etc.\n   ->Police stations, government/municipal offices, post offices, banks with vaults, electric substations, fire aid posts,\n        home guards, civil defense centers, essential public utilities, pumping stations, and water installations.\nxi Commercial & Industrial Uses\n   ->Convenience shops (only on the ground floor).\n   ->Electronic assembly (not manufacturing), max 1 H.P. power.\n   ->IT establishments (software only) on roads with a width of 9m+.\n   ->Flour mills, wet/dry masala grinding (max 10 H.P. power).\nxii Other Uses\n   ->Burial and cremation grounds (on roads 9m+ wide).\n   ->Agricultural, horticultural, and allied uses (excluding agro-based industries).\n   ->Raisin production, bookbinding.\n   ->Public conveniences.\n   ->Research, experimental, and testing laboratories (non-hazardous).");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel3.setText("Which Residential Zone is your land in?");

        jRadioButton1.setText("Width of Road less than 9.0 m (Congested Area) & 12.0 m. (Non-congested Area)");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Width of Road more than or equal to 9.0 m (Congested Area) & 12.0 m. (Non-congested Area)");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("You Land is in ");

        jTextArea3.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("Uses Permitted in the Zone\nAll uses permitted in R-1 are allowed in R-2 without area restrictions. \nMixed uses may be permitted except those under Regulations 4.8(ii), 4.11(viii, xviii, xxi, xxii, xxxi, xxxvii), and 4.21. \nAll uses in the Public Semi-Public Zone are also allowed.\n\nUses Permitted in Independent Premises/Buildings\nVehicle Fuel Stations (including LPG, CNG, Ethanol, Electric Charging) – as per Regulations 4.11(vi)(c, d, e) & 6.2.2, \nTable 6-E. Trade or Technical Schools\nLPG Godowns, Bulk Kerosene Storage & Sale (subject to NOC from Chief Controller of Explosives).\nService Industries (subject to power limit ≤10 HP, employment ≤9 persons, and floor area ≤100 sq.m).\nList of Permitted Service Industries:\ni) Food Products: Dairy processing, rice hullers, grain mills, masala grinding, bakery, coffee roasting, \nice manufacturing, sugarcane crushing.\nii) Beverages & Tobacco: Bidi manufacturing (also allowed in R-1).\niii) Textile & Garments: Handloom (max 4 looms), embroidery, textile garments, mosquito nets, mattresses.\niv) Wood Products: Wooden furniture manufacturing.\nv) Paper & Printing: Cartons, bookbinding (permitted in R-1), newspaper publishing.\nvi) Leather: Footwear & leather repair.\nvii) Rubber & Plastic: Tire retreading, balloon & glove manufacturing.\nviii) Metal: Grills, gates, doors, water tanks, tool sharpening.\nix) Electrical Goods: Repairs of appliances like TVs, refrigerators, washing machines, air conditioners, motor rewinding.\nx) Transport Equipment: Manufacturing of carts, servicing/repair of bicycles, motorcycles, and vehicles, battery charging.\nxi) Miscellaneous: Jewelry making, watch repair, musical instrument repair, lock/stove repairs, laundries, photo \nprocessing, optical glass grinding, EV charging stations, stone crushing/polishing, concrete manufacturing.\n\nService Industries Without Restrictions\ni) Food Processing: Canning, preservation, jam, jelly, meat, and fish processing.\nii) Printing & Publishing: Books, journals, maps, postcards, embossing.");
        jScrollPane4.setViewportView(jTextArea3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residential Zone", "Low Density Residential Zone", "Future Urbanizable Zone", "Commercial Zone", "Industrial Zone", "Public/Semi Public Zone", "Agricultural Zone", "Green Belt Zone/River Protection Belt", "Afforestation Zone", "Green Zone-2 ", "Defense Zone" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Select you Zone: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("LOW DENSITY RESIDENTIAL ZONE");

        jLabel7.setText(" In this zone, all uses permissible in Residential Zone shall be permitted subject to FSI restrictions mentioned in these regulations. ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jScrollPane4)
                            .addComponent(jScrollPane3)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel6)))
                .addContainerGap(190, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jTextArea5.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("1. Any use permitted in the Residential R-2 zone.\n2. Any commercial use, including wholesale establishments (with or without storage).\n3. Uses permissible in the Public Semi-Public Zone.\n4. Public utility buildings.\n5. Activities permissible in Service Industries.");
        jScrollPane6.setViewportView(jTextArea5);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("COMMERCIAL ZONE");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("INDUSTRIAL ZONE");

        jTextArea6.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("Industries include buildings or structures for fabrication, assembly, or processing of materials, such as plants, laboratories,\nrefineries, dairies, and sawmills.\nPermissible uses in the Industrial Zone:\n1. Service industries (Regulation No.4.4.2(iv)) without restrictions.\n2. Any industry, with a minimum 23m buffer from residential/habitable zones, unless entirely non-polluting (e.g., IT/ITES). \n    Industrial godowns are also permitted.\n3. Industrial premises may include accessory uses (banks, canteens, welfare centers, staff quarters) up to 25% of the \n   built-up area.\n4. Other permitted uses:\n-->Parking lots\n-->Public utility buildings\n-->Banks\n-->Residential hotels, restaurants\n-->Storage buildings\n-->Theatres, cinemas (subject to Maharashtra Cinemas Act)\n-->Highway amenities (as per Agriculture Zone FSI)\n-->Industrial training centers\n-->IT/ITES, biotechnology units\n-->EV charging stations, fuel stations (LPG/CNG/Ethanol)\n-->Hospitals, dispensaries\n-->Transport hubs, logistics parks, warehousing, cold storage, multimodal transport facilities.");
        jScrollPane7.setViewportView(jTextArea6);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(271, 271, 271))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("PUBLIC / SEMI PUBLIC ZONE ");

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea7.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("Permissible Uses\n1) Educational & Institutional: Schools, colleges, training institutes, hostels, staff quarters.\n2) Healthcare & Welfare: Hospitals, dispensaries, maternity homes, sanatoria, health centers, veterinary hospitals, \nhomes for the aged.\n3) Government & Public Services: Govt. & semi-govt. offices, courts, public housing.\n4) Public & Utility Services: Transport, research, education, and healthcare institutions.\n5) Community & Cultural: Libraries, community halls, stadia, religious structures, auditoriums, cultural centers.\n6) Limited Commercial Use (Max 15%):\n7) Restrictions: Liquor, tobacco, lottery, hazardous storage (gas cylinders, kerosene) not allowed.\n8) Exception: Zilla Parishad & Panchayat Samiti lands may allow up to 33% commercial use.\n9) Fuel & Charging Stations: LPG, CNG, Public EV Charging (Regulation 6.2.2, Table 6E).\n10) Special Care & Rehabilitation: Nurseries, crèches, spastic centers, orphanages, hostels for autistic & mentally \nchallenged persons.\n11) Emergency Services: Fire stations.\n12) Transport Infrastructure: Traffic and transport-related facilities.");
        jScrollPane8.setViewportView(jTextArea7);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("AGRICULTURE ZONE");

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea8.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("Permissible uses in the Agricultural Zone:\n1, Agricultural uses, including stables, piggeries, poultry farms, and accessory buildings.\n2. Golf courses, race tracks, shooting ranges (with safety measures), trekking routes, and nature trails.\n3. Gardens, forestry, nurseries, public/private parks, playfields, and summer camps.\n4. Public/semi-public utility establishments (electric substations, gas distribution, sewage/water treatment, etc.) with staff \n   quarters.\n5. LPG Godowns (conditions: minimum plot size per licensing authority, 20% FSI, ground floor only, NOC required).\n6. Fuel Filling Stations (LPG/CNG/Ethanol/EV Charging) (conditions: minimum 12m road width, 20% FSI, NOC from Explosives \n   Authority, compliance with IRC/MORTH road junction guidelines, ancillary facilities like sales offices/restaurants allowed).\n7. Pottery manufacturing.\n8. Fertilizer storage and drying.\n9. Farmhouses (conditions: minimum plot 0.4 Ha, 0.04 FSI, max 400 sq.m. built-up area, ground +1 structure, max height 9m).\n10. Swimming pools, sports facilities, canteens, and tennis courts.\n11. Amusement Park (min. 1.0 Ha) with rides, swimming pools, ethnic villages, shops, hotels, etc. (0.70 FSI; 0.20 free, remainder\nwith premium). Must provide infrastructure, waste disposal, parking, and plant 250 trees/Ha. Ride areas not counted in FSI.\n12. IT/ITES Parks/Units (0.20 FSI, as per Regulation No.7.8).\n13. Government/Semi-Government Buildings & Resettlement Projects (FSI as per Residential Zone).\n14. Biotechnology Units/B.T. Parks (as per Regulation No.7.9).\n15. Educational, Research, Medical, and Spiritual Centers (FSI 1.00; 0.20 free, remainder with premium). Must plant 250\n trees/Ha. Higher FSI as per Chapter-7, capped at 100%. Educational use may have 15% commercial space (Regulation \n No.4.10(vi)).\n16. Integrated Highway/Wayside Amenities (min. 10,000 sq.m.) on NH/SH or 18m-wide roads, including motels, restaurants, \n     fuel pumps, hypermarkets, banks, trauma centers, etc. (FSI 0.2 free, up to 0.3 with premium). No subdivision allowed; fuel \n     pumps separately earmarked. Individual uses allowed on 12m-wide roads (min. 4000 sq.m.).\n17. Ancillary Service Industries for agro products (e.g., cold storages, godowns, grading, banking) with FSI 0.2 free, up to 1.0 \n     with premium.\n18. Industries (FSI 0.2 free, up to 1.0 with premium). 23m buffer from residential zones unless for non-polluting industries, \n      IT/ITES. Industrial layouts allowed with conditions.\n19. Solid Waste Management & Power from Waste.\n20. Non-Conventional Power Generation (solar panels not counted in FSI).\n21. Brick, Tile Manufacturing.\n22. Fish Farming.\n23. Religious Buildings (subject to authority approval).\n24. Slaughterhouses & Animal Disposal Facilities (special permission required).\n25. Cemeteries & Crematoria.\n26. Scrap Market (FSI 0.2 free, up to 1.0 with premium).\n27. Mangal Karyalayas/Lawns (min. 0.4 Ha for Karyalaya, 0.8 Ha for lawns, FSI 0.2 & 0.1 respectively, 40% area for parking). \n     Abuts 9m road (urban) or 12m road (rural).\n28. Bus Terminus.\n29. Communication Routes (roads, railways, airstrips, ropeways, ports, electric lines).\n30. Town Planning Schemes (Min. 20 Ha) under Maharashtra Regional & Town Planning Act, 1966, with full cost borne by \n owners. After sanction, all residential zone uses permitted with respective FSI. Alternatively, owners can develop under \n similar principles with a 12m approach road and 40% land for public use.\n-->10% land for parks/playgrounds (no FSI compensation).\n-->15% land for social infrastructure/sale (FSI compensation in-situ).\n-->15% road area (FSI compensation in-situ); excess road area under owner/developer.\n-->Phase-wise residential zone permissions after infrastructure completion.\n31. Fireworks/Explosives Manufacturing & Storage (Min. 2 km from Gaothan boundary, NOC from Chief Controller of Explosives).\n32. Cinema/TV Film Production & Studios (Min. 2 Ha plot, FSI 0.2 free, up to 1.0 with premium).\n33. Tourism & Hospitality (FSI 0.2 free, up to 1.0 with premium):\n-->Tourist homes, resorts, hotels, motels, health & wellness spas, golf courses, art villages,\n      exhibition centers, adventure/eco/agriculture/medical tourism projects.\n--> Boutique wineries, guest houses, B&B schemes (MTDC/DoT approved).\n--> Includes reception, kitchen, parking, guard cabins, landscaping, and one 15m observation tower \n      per resort (10 sq.m platform)\n34. Tourist Resort Complexes may be permitted with following conditions :- \n      A) General Conditions:\n      -->Minimum site area: 1.00 Ha. (0.4 Ha. for local residents).\n      B) Conditions for Development:\n           a) FSI Regulations:\n             --> 0.25 of gross plot area without premium.\n             --> Up to 1.00 FSI with premium at 20% of land rate in the Annual Statement of Rates, disregarding guidelines.\n           b) Permitted Uses:\n             --> Resort, holiday camp, recreational activities, amusement park.\n           c) Heritage Site Restrictions:\n             --> Development near forts, archaeological, or historical monuments must follow archaeological department rules.\n           d) Lakeside Development:\n              --> Governed by specific regulations for natural lakes. \n                     Given Below is the dstance from High Flood Line (HFL) / Full Storage Level (FSL)  and Development to be allowed\n\tUp to 100 m. --> Not permissible. \n\tabove 100 m. to 300 m.  -->Ground floor structure with maximum height of 5.0 m. \n\tabove 300 m. to 500 m.  --> G + 1 storey structure with maximum height of 9.0 m. \n\tabove 500 m. -->Within permissible FSI and subject to other regulations.  \n            e) No subdivision of land shall be allowed. \n            f) The land should have approach of minimum 9.0 m. wide road. \n            g) The land having slope steeper than 1:5, shall not be eligible for development.\n       C) Infrastructural Facilities - The owner/developer must provide all required infrastructure at their own cost, \n            ensuring proper sewage and solid waste disposal. Untreated effluents are prohibited from entering any watercourse.\n35. All required infrastructural facilities must be provided by the developer at their own cost, including proper sewage and\n      solid waste disposal. No untreated effluent shall be discharged into any watercourse.\n36. In areas of Local Bodies and SPA where a Development Plan is sanctioned, Pradhan Mantri Awas Yojana (PMAY) is \n       permitted as per Reg. 14.4.1.\n37. Individual houses up to 150 sq.m. are allowed for entire holdings as per the single 7/12 extract on the enforcement \n      date of these regulations.\n38. Mining and quarrying are permitted as per Reg. 15.1.\n39. In Regional Plan areas (excluding Local Bodies and SPA with sanctioned Development Plans), \n      PMAY is permitted as per Reg. 14.4.2.\n40. Development of tourism and hospitality services under Community Nature Conservancy near wildlife sanctuaries and \n      national parks is allowed as per Reg. 14.9.\n41. Integrated Township Projects are permitted as per Reg. 14.1.1.\n42. Three-star & above category hotels along National/State Highways, MDR, and roads ≥18m width:\n       FSI 0.2 free, up to 1.0 with premium (20% of land rate in ASR).\n43. Bulk storage and sale of Kerosene is allowed subject to NOC from Chief Controller of Explosives, Government of India.\n44. Development of EWS/LIG housing as per Reg. 7.7.\n45. Development adjacent to Gaothan is allowed as per Reg. 5.1.1.");
        jScrollPane9.setViewportView(jTextArea8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel14))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("FUTURE URBANIZABLE ZONE");

        jTextArea4.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("1. The owner bears the cost of extending offsite infrastructure (road, water, sewage, electricity) and deposits the amount \n     with the Authority or constructs it per approved specifications.\n2. If the land is on a Development Plan road wider than 18m, the owner must build an 18m road; otherwise, a 12m\n    asphalted road is required.\n\n");
        jScrollPane5.setViewportView(jTextArea4);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Green Belt Zone / River Protection Belt");

        jTextArea9.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jTextArea9.setText("Permissible uses in the Green Belt Zone / River Protection Belt :\ni  Agriculture\nii Tree plantation, gardens, public parks, landscaping, recreational open spaces, forestry, and nurseries.\niii River front development by Authority or any institution authorised on behalf of Authority.\niv Development of pedestrian pathways, Jogging tracks, Cycle tracks, Boat clubs etc. \nv  Swimming pools, clubhouses, and other recreational facilities, provided:\n    ->A 15.0 m belt is left along the riverbank.\n    ->A 9.0 m setback is maintained from Nallahs.\n    ->Compliance with other regulatory provisions.\nvi Public Toilets permitted as per the requirement.\nvii Recreational Open Space (ROS) in Layouts/Subdivisions\n     ->If a layout/subdivision proposal includes recreational open space adjacent to a green belt:\n     ->A 15.0 m marginal distance must be maintained from rivers.\n     ->A 9.0 m marginal distance must be maintained from Nallahs.\n     ->Additional conditions as per Regulation No. 3.1.3 must be followed.\n   a.  Recreational Open Space extent of permissible uses shall follow the specifications in this regulation\n   b . Land Handover for Public Purpose\n     ->If the Authority requires land in the green belt for public use:\n     ->The owner must transfer possession for public development and maintenance.\n     ->The land will remain open and accessible for recreational activities.\n   c Marginal Distance Requirements for Buildings Near Rivers/Nallahs\n      ->The side/rear marginal distance must be the maximum of the following:\n          ->Distance required as per building height.\n          ->4.5 m from the boundary line of the green belt and the developable zone.\n          ->Mandatory 15.0 m setback from rivers or 9.0 m setback from Nallahs.\n\n\n\n");
        jScrollPane10.setViewportView(jTextArea9);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Afforestation Zone");

        jTextArea10.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jTextArea10.setText("Permissible uses in Afforestation Zone :\ni All Uses Permissible in Hill Top and Hill Slope Zone\nii Forest Houses (for forest tourists, servants, technicians, or owners, and for storing fertilizers)\n    ->Built-up area must not exceed 150 sq.m.\n     ->Minimum forest plot area required: 0.4 hectares\n     ->Structures allowed: Ground + 1 floor\n     ->Maximum height: 7.0 m\n     ->Materials used should blend with the surroundings.\n     ->The owner must plant 250 trees per hectare and maintain them properly.\n     ->Forest house layouts are permitted for areas greater than 0.4 hectares.\niii Development Permissible Adjacent to Gaothan\n    ->As specified in Regulation 5.1.1.\n    ->Allowed up to a maximum of 200 meters from the Gaothan limit.\niv Restrictions on Hill Slopes\n    ->The above uses shall not be permitted on hill slopes steeper than 1:5.\n    ->Such areas shall not be considered for FSI calculations.");
        jScrollPane11.setViewportView(jTextArea10);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Green Zone-2");

        jTextArea11.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea11.setColumns(20);
        jTextArea11.setRows(5);
        jTextArea11.setText("Permissible uses in the Green Zone -2 :\ni All uses permissible in Hill Top - Hill Slope Zone.  \nii Gaothan expansion \niii Primary and Nursery Schools including student hostels.  ");
        jScrollPane12.setViewportView(jTextArea11);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Defense Zone");

        jTextArea12.setBackground(new java.awt.Color(242, 242, 242));
        jTextArea12.setColumns(20);
        jTextArea12.setRows(5);
        jTextArea12.setText("Permissible uses in the Defence Zone :\nDevelopment by the Ministry of Defence\n   ->Only developments required by the Ministry of Defence or its Authorities shall be permissible.\n   ->Such developments must be on lands owned and possessed by the Ministry of Defence or its Authorities.\nRestrictive Zone \n    ->No development is allowed if it violates notifications issued under the Works of Defence Act - 1903.\n    ->This applies regardless of whether the area is marked on the Development Plan / Regional Plan.\n    ->Development may be permitted only with a No Objection Certificate (NOC) from the concerned Defence Authority.\nUtilization of Restrictive Zone\n    ->The area under the restrictive zone may be treated as marginal distance during construction on unaffected contiguous land.\n    ->The FSI and receiving potential of the restricted land may be utilized on the remaining contiguous unaffected land of the same owner.");
        jScrollPane13.setViewportView(jTextArea12);

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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane12))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane10))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButton4)
                .addGap(133, 133, 133)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Page11 p11 = new Page11(surveyno, gatno, ctsno, plotno, village, taluka, lowest);
        p11.setVisible(true);
        p11.pack();
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Page13 p13 = new Page13(surveyno, gatno, ctsno, plotno, village, taluka, lowest);
        p13.setVisible(true);
        p13.pack();
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

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(jRadioButton1);
        bg1.add(jRadioButton2);

    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        headingPanelActivation();
        jScrollPane3.setVisible(false);
        jScrollPane4.setVisible(false);
        JScrollBar verticalScrollBar = jScrollPane2.getVerticalScrollBar();
        verticalScrollBar.setValue(0);

        JScrollBar verticalScrollBar1 = jScrollPane3.getVerticalScrollBar();
        verticalScrollBar1.setValue(0);

        JScrollBar verticalScrollBar2 = jScrollPane4.getVerticalScrollBar();
        verticalScrollBar2.setValue(0);

        JScrollBar verticalScrollBar3 = jScrollPane5.getVerticalScrollBar();
        verticalScrollBar3.setValue(0);

        JScrollBar verticalScrollBar4 = jScrollPane6.getVerticalScrollBar();
        verticalScrollBar4.setValue(0);

        JScrollBar verticalScrollBar5 = jScrollPane7.getVerticalScrollBar();
        verticalScrollBar5.setValue(0);

        JScrollBar verticalScrollBar6 = jScrollPane8.getVerticalScrollBar();
        verticalScrollBar6.setValue(0);

        JScrollBar verticalScrollBar7 = jScrollPane9.getVerticalScrollBar();
        verticalScrollBar7.setValue(0);
        
        JScrollBar verticalScrollBar8 = jScrollPane10.getVerticalScrollBar();
        verticalScrollBar8.setValue(0);
        
        JScrollBar verticalScrollBar9 = jScrollPane11.getVerticalScrollBar();
        verticalScrollBar9.setValue(0);
        
        JScrollBar verticalScrollBar10 = jScrollPane12.getVerticalScrollBar();
        verticalScrollBar10.setValue(0);
        
        JScrollBar verticalScrollBar11 = jScrollPane13.getVerticalScrollBar();
        verticalScrollBar11.setValue(0);
        
        
        
        jLabel4.setText("");
    }//GEN-LAST:event_formWindowActivated

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String zone = (String) jComboBox1.getSelectedItem();
        JScrollBar verticalScrollBar = jScrollPane1.getVerticalScrollBar();

        if (zone.equals("Residential Zone")) {
            verticalScrollBar.setValue(50);
        } else if (zone.equals("Low Density Residential Zone")) {
            verticalScrollBar.setValue(150);
        } else if (zone.equals("Future Urbanizable Zone")) {
            verticalScrollBar.setValue(300);
        } else if (zone.equals("Commercial Zone")) {
            verticalScrollBar.setValue(400);
        } else if (zone.equals("Industrial Zone")) {
            verticalScrollBar.setValue(500);
        } else if (zone.equals("Public/Semi Public Zone")) {
            verticalScrollBar.setValue(700);
        } else if (zone.equals("Agricultural Zone")) {
            verticalScrollBar.setValue(800);
        } else if (zone.equals("Green Belt Zone/River Protection Belt")) {
            verticalScrollBar.setValue(800);
        } else if (zone.equals("Afforestation Zone")) {
            verticalScrollBar.setValue(900);
        } else if (zone.equals("Green Zone-2")) {
            verticalScrollBar.setValue(1000);
        } else if (zone.equals("Defense Zone")) {
            verticalScrollBar.setValue(0);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel4.setText("Residential Zone -R2");
        jScrollPane4.setVisible(true);
        jScrollPane3.setVisible(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel4.setText("Residential Zone -R1");
        jScrollPane3.setVisible(true);
        jScrollPane4.setVisible(false);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
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
