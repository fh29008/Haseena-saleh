
import java.sql.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mohammad Zahid
 */
public class Account extends javax.swing.JFrame {

    Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    public Account() {
        super("Creating Application");
        initComponents();
        conn = JavaConnect.connect();
        getRandAccNum();
        getRandRoutNum();
        getRandPinNum();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenBTNGroup = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        FirstName_TF = new javax.swing.JTextField();
        RoutingTF = new javax.swing.JTextField();
        ClearAll_BTN = new javax.swing.JButton();
        NationaltyCBX = new javax.swing.JComboBox<>();
        Back_BTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Sec_Ans_TF = new javax.swing.JTextField();
        AnnIncome_TF = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        OtherRad_BTN = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        LastName_TF = new javax.swing.JTextField();
        PIN_TF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Emplyr_TF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FMaleRad_BTN = new javax.swing.JRadioButton();
        SSN_TF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MaleRad_BTN = new javax.swing.JRadioButton();
        CreateAcc_BTN = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HomeAdd_TF = new javax.swing.JTextField();
        TotalBalnaceTF = new javax.swing.JTextField();
        AccountTypeCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        AccNo_TF = new javax.swing.JTextField();
        DOB_TF = new com.toedter.calendar.JDateChooser();
        SecQCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setName("CreateAccount_Frame"); // NOI18N

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 102));
        jLabel3.setText("S&S Bank Managment System");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Account Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(153, 51, 0)))); // NOI18N

        RoutingTF.setEnabled(false);

        ClearAll_BTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        ClearAll_BTN.setForeground(new java.awt.Color(204, 51, 0));
        ClearAll_BTN.setText("Clear All");
        ClearAll_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearAll_BTNActionPerformed(evt);
            }
        });

        NationaltyCBX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "US Citizen", "Permanent Resident", "Work Visa Holder" }));
        NationaltyCBX.setName("NationalityCB"); // NOI18N

        Back_BTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        Back_BTN.setForeground(new java.awt.Color(204, 51, 0));
        Back_BTN.setText("Go Back");
        Back_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_BTNActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Last Name");

        AnnIncome_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnnIncome_TFActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Date of Birth");

        GenBTNGroup.add(OtherRad_BTN);
        OtherRad_BTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        OtherRad_BTN.setText("Other");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Employeer Name ");

        PIN_TF.setEnabled(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Security Question");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Gender");

        Emplyr_TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Emplyr_TFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Account No");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Home Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("First Name");

        GenBTNGroup.add(FMaleRad_BTN);
        FMaleRad_BTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FMaleRad_BTN.setText("Female");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Answer");

        GenBTNGroup.add(MaleRad_BTN);
        MaleRad_BTN.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MaleRad_BTN.setText("Male");

        CreateAcc_BTN.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        CreateAcc_BTN.setForeground(new java.awt.Color(204, 51, 0));
        CreateAcc_BTN.setText("Create Account");
        CreateAcc_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAcc_BTNActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Account Type");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("SSN");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Current Balance");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Annual Income");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Routing No");

        AccountTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Checking", "Saving", "Credit" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("PIN");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Nationality");

        AccNo_TF.setEnabled(false);

        SecQCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your mother's maiden name?", "In what city were you born?", "What was the make of your first car?", "What is the name of your favorite pet?" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(69, 69, 69))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(39, 39, 39))
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeAdd_TF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TotalBalnaceTF)
                                .addGap(161, 161, 161))
                            .addComponent(Emplyr_TF)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AccNo_TF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RoutingTF, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AccountTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PIN_TF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(SecQCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(49, 49, 49))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(68, 68, 68))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Back_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                        .addGap(178, 178, 178)
                        .addComponent(CreateAcc_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                        .addGap(91, 91, 91)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ClearAll_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addGap(108, 108, 108))
                    .addComponent(FirstName_TF)
                    .addComponent(LastName_TF)
                    .addComponent(SSN_TF)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MaleRad_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FMaleRad_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(OtherRad_BTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(AnnIncome_TF)
                    .addComponent(Sec_Ans_TF)
                    .addComponent(DOB_TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NationaltyCBX, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(AccNo_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7)
                    .addComponent(RoutingTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(DOB_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(PIN_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(SSN_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AccountTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(HomeAdd_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaleRad_BTN)
                    .addComponent(FMaleRad_BTN)
                    .addComponent(OtherRad_BTN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(TotalBalnaceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NationaltyCBX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Emplyr_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(AnnIncome_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sec_Ans_TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(SecQCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Back_BTN)
                    .addComponent(CreateAcc_BTN)
                    .addComponent(ClearAll_BTN))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        setBounds(0, 0, 948, 559);
    }// </editor-fold>//GEN-END:initComponents

    private void AnnIncome_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnnIncome_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnnIncome_TFActionPerformed

    private void ClearAll_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearAll_BTNActionPerformed
        AccNo_TF.setText("");
        RoutingTF.setText("");
        PIN_TF.setText("");
        FirstName_TF.setText("");
        LastName_TF.setText("");
        HomeAdd_TF.setText("");
        SSN_TF.setText("");
        Sec_Ans_TF.setText("");
        TotalBalnaceTF.setText("");
        AnnIncome_TF.setText("");
        Emplyr_TF.setText("");
        MaleRad_BTN.setSelected(false);
        FMaleRad_BTN.setSelected(false);
        OtherRad_BTN.setSelected(false);
        AccountTypeCB.setSelectedIndex(0);
        NationaltyCBX.setSelectedIndex(0);
        ((JTextField) DOB_TF.getDateEditor().getUiComponent()).setText("");

        getRandAccNum();
        getRandRoutNum();
        getRandPinNum();

    }//GEN-LAST:event_ClearAll_BTNActionPerformed

    private void Emplyr_TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Emplyr_TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Emplyr_TFActionPerformed

    /**
     * Create button which renders the values to the Database
     *
     * @param evt
     */
    private void CreateAcc_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAcc_BTNActionPerformed
        try {
            String sql = "insert into Account(Acc_No,Routing_No,PIN,FirstName,LastName,DOB,"
                    + "Acc_Type,Nationality,Gender,Home_Address,SSN,Sec_Quest,Sec_Ans,Balance,AnnIncome,EmployerName) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, AccNo_TF.getText());
            pst.setString(2, RoutingTF.getText());
            pst.setString(3, PIN_TF.getText());
            pst.setString(4, FirstName_TF.getText());
            pst.setString(5, LastName_TF.getText());
            pst.setString(6, ((JTextField) DOB_TF.getDateEditor().getUiComponent()).getText());
            pst.setString(7, AccountTypeCB.getSelectedItem().toString());
            pst.setString(8, NationaltyCBX.getSelectedItem().toString());
            MaleRad_BTN.setActionCommand("Male");
            FMaleRad_BTN.setActionCommand("Female");
            OtherRad_BTN.setActionCommand("other");
            pst.setString(9, GenBTNGroup.getSelection().getActionCommand());
            pst.setString(10, HomeAdd_TF.getText());
            pst.setString(11, SSN_TF.getText());
            pst.setString(12, SecQCmb.getSelectedItem().toString());
            pst.setString(13, Sec_Ans_TF.getText());
            pst.setString(14, TotalBalnaceTF.getText());
            pst.setString(15, AnnIncome_TF.getText());
            pst.setString(16, Emplyr_TF.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Congrats"+FirstName_TF.getText()+" \nYour Account has been created successfully.");
            getBalance();
            pst.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }finally{
            try {
                pst.close();
            } catch (SQLException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_CreateAcc_BTNActionPerformed

    private void Back_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_BTNActionPerformed
        setVisible(false);
        Authentication ob = new Authentication();
        ob.setVisible(true);
    }//GEN-LAST:event_Back_BTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccNo_TF;
    private javax.swing.JComboBox<String> AccountTypeCB;
    private javax.swing.JTextField AnnIncome_TF;
    private javax.swing.JButton Back_BTN;
    private javax.swing.JButton ClearAll_BTN;
    private javax.swing.JButton CreateAcc_BTN;
    private com.toedter.calendar.JDateChooser DOB_TF;
    private javax.swing.JTextField Emplyr_TF;
    private javax.swing.JRadioButton FMaleRad_BTN;
    private javax.swing.JTextField FirstName_TF;
    private javax.swing.ButtonGroup GenBTNGroup;
    private javax.swing.JTextField HomeAdd_TF;
    private javax.swing.JTextField LastName_TF;
    private javax.swing.JRadioButton MaleRad_BTN;
    private javax.swing.JComboBox<String> NationaltyCBX;
    private javax.swing.JRadioButton OtherRad_BTN;
    private javax.swing.JTextField PIN_TF;
    private javax.swing.JTextField RoutingTF;
    private javax.swing.JTextField SSN_TF;
    private javax.swing.JComboBox<String> SecQCmb;
    private javax.swing.JTextField Sec_Ans_TF;
    private javax.swing.JTextField TotalBalnaceTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    /**
     * This method generate Random Number for Account Numbers.
     */
    public void getRandAccNum() {
        Random ra = new Random();
        AccNo_TF.setText("" + ra.nextInt(10000 + 1));

    }

    /**
     * This method generate Random Number for Routing Numbers.
     */
    public void getRandRoutNum() {
        Random ra = new Random();
        RoutingTF.setText("" + ra.nextInt(1000 + 1));
    }

    /**
     * This method generate Random Number for Pin code.
     */
    public void getRandPinNum() {
        Random ra = new Random();
        PIN_TF.setText("" + ra.nextInt(1000 + 1));
    }

    /**
     * This method communicates with SQL Database and take values from Java
     * Interface tax field and store it into the Database.
     */
    public void getBalance() {
        try {
            String sql = ("insert into Balnaces(FirstName,LastName,Acc_No,Routing_No,Balance)values(?,?,?,?,?)");
            pst = conn.prepareStatement(sql);
            pst.setString(1, FirstName_TF.getText());
            pst.setString(2, LastName_TF.getText());
            pst.setString(3, AccNo_TF.getText());
            pst.setString(4, RoutingTF.getText());
            pst.setString(5, TotalBalnaceTF.getText());
            pst.executeQuery();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
