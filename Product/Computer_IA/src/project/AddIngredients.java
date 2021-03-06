/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package project;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AddIngredients extends javax.swing.JFrame {
    
    private int c;
    /**
     * Creates new form AddIngredients
     */
    public AddIngredients() {
        
        initComponents();
        fillInput();
        c=0;
        Menu obj=new Menu();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        BakingSoda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ProductName = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Flour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CondensedMilk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Oil = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        BakingPowder = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Butter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Essence = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        WhippedCream = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CocoaPowder = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Sugar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 7), "Ingredients", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 24))); // NOI18N

        BakingSoda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BakingSodaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel2.setText("Baking soda:");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel3.setText("Product Name: ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel4.setText("Flour:");

        Flour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FlourKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel5.setText("Condensed Milk:");

        CondensedMilk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CondensedMilkKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel6.setText("Oil:");

        Oil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                OilKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel7.setText("Baking powder:");

        BakingPowder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BakingPowderKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel8.setText("Butter: ");

        Butter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ButterKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel9.setText("Essence: ");

        Essence.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EssenceKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel10.setText("Whipped cream: ");

        WhippedCream.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WhippedCreamActionPerformed(evt);
            }
        });
        WhippedCream.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                WhippedCreamKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel11.setText("Cocoa powder:");

        CocoaPowder.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CocoaPowderKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jLabel12.setText("Sugar: ");

        Sugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SugarActionPerformed(evt);
            }
        });
        Sugar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SugarKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ProductName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BakingPowder, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Oil, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CondensedMilk, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Flour, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BakingSoda, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Sugar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(Essence, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(WhippedCream, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CocoaPowder, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Butter, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BakingSoda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(Essence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Flour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(WhippedCream, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CondensedMilk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(CocoaPowder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Oil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Sugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(53, 53, 53)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BakingPowder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Butter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu obj=new Menu();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8889/COMP IA","root","root");
            String sql="INSERT INTO IngredientsPerCake(Name, Baking_Soda, Flour, Condensed_Milk, Oil, Essence, Whipped_Cream, Cocoa_Powder, Sugar, Butter   ) VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1, ProductName.getSelectedItem().toString());
            pst.setString(2, BakingSoda.getText());
            pst.setString(3, Flour.getText());
            pst.setString(4, CondensedMilk.getText());
            pst.setString(5, Oil.getText());
            pst.setString(6, Essence.getText());
            pst.setString(7, WhippedCream.getText());
            pst.setString(8, CocoaPowder.getText());
            pst.setString(9, Sugar.getText());
            pst.setString(10, Butter.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserted successfully");
            setVisible(false);
            Menu obj=new Menu();
            obj.setVisible(true);
        }
        catch(Exception obj) {
            JOptionPane.showMessageDialog(null, obj);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FlourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FlourKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }

    }//GEN-LAST:event_FlourKeyTyped

    private void BakingSodaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BakingSodaKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_BakingSodaKeyTyped

    private void CondensedMilkKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CondensedMilkKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CondensedMilkKeyTyped

    private void OilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OilKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_OilKeyTyped

    private void BakingPowderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BakingPowderKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_BakingPowderKeyTyped

    private void EssenceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EssenceKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_EssenceKeyTyped

    private void WhippedCreamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_WhippedCreamKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_WhippedCreamKeyTyped

    private void CocoaPowderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CocoaPowderKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_CocoaPowderKeyTyped

    private void SugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SugarActionPerformed

    private void SugarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SugarKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_SugarKeyTyped

    private void ButterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButterKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c)||c== KeyEvent.VK_BACK_SPACE||c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ButterKeyTyped

    private void WhippedCreamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WhippedCreamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WhippedCreamActionPerformed
    
    
    
    public void fillInput() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8889/COMP IA","root","root");
            String sql="Select * from Stock";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs =pst.executeQuery();
            while (rs.next()) {
                String name=rs.getString("Name");
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.WARNING_MESSAGE);
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8889/COMP IA","root","root");
            String sql="Select * from Menu";
            PreparedStatement pst=con.prepareStatement(sql);
            ResultSet rs =pst.executeQuery();
            while (rs.next()) {
                String name=rs.getString("Name");
                ProductName.addItem(name);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Failed to Connect to Database","Error Connection", JOptionPane.WARNING_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(AddIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddIngredients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddIngredients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BakingPowder;
    private javax.swing.JTextField BakingSoda;
    private javax.swing.JTextField Butter;
    private javax.swing.JTextField CocoaPowder;
    private javax.swing.JTextField CondensedMilk;
    private javax.swing.JTextField Essence;
    private javax.swing.JTextField Flour;
    private javax.swing.JTextField Oil;
    private javax.swing.JComboBox<String> ProductName;
    private javax.swing.JTextField Sugar;
    private javax.swing.JTextField WhippedCream;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
