package com.mycompany.parabitnbbms;

import static com.mycompany.parabitnbbms.BTesting.jp2;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TestR extends javax.swing.JDialog {


     int s ; 
     String q  , r ,m , u , i ;
      
     ParabitDB obj1 ;
     ResultSet rs , rs2 ; 
     BTesting  p ;
     public TestR(java.awt.Frame parent, boolean modal , String did1) throws SQLException {
        super(parent, modal);
        initComponents();
        obj1 =  new ParabitDB();
        
          
        
        u= did1 ;        
    }

 

    TestR(JPanel jp2) {
        
        
        
         }
 

  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        cb1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Please Select In One Option "));

        bg1.add(rb1);
        rb1.setFont(new java.awt.Font("Rockwell Condensed", 1, 18)); // NOI18N
        rb1.setText("    Accept");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        bg1.add(rb2);
        rb2.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        rb2.setText("     Reject");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        bg1.add(rb3);
        rb3.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        rb3.setText("(<._.>)Black-List");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 0, 18)); // NOI18N
        jButton1.setText("procced");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rb3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
       
         
            s = 0;
           cb1.setVisible(true);
          String h ="R";
         
           try{
               cb1.removeAllItems();
               JOptionPane.showMessageDialog(null," Are you sure This Donor   Rejected   For Donotion Blood  ");
           
               m="Select Distinct  reason  from reason  where type = '"+h+"' ";
               rs = obj1.stm.executeQuery(m);
               while(rs.next())
               {
                   cb1.addItem(rs.getString(1));
               }
              i = (String) cb1.getSelectedItem();
                   
           }catch(Exception ex)
           {
               
           }
            
          
        
        
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        
         
             System.out.println(u+" >>>>>>");
             
             
             
             s = 1 ;
             i = "Verified";
              m  = "SELECT  p.BDID, y.name,  p.bbid, p.WBBID , y.wbu, y.did, y.rdt, y.source, y.bgroup, y.status, y.donation , p.WBTI , y.eid FROM donorregistration y, blooddonation p WHERE p.did ='"+u+"'and y.did ='"+u+"'";
          
           try {   
             
             rs2= obj1.stm.executeQuery(m);
              p = new BTesting(rs2);
             //System.out.println(rs2);
             
           jp2.setVisible(true);
        
     
         
          // p.tf6.setText(BBDonorR.rdt1);
          
//             while(rs2.next()){
//                 
//                 
//               
//                     String  y = rs2.getString("name");
//                     p.tf9.setText(y);
//                     String r = rs2.getString("wbu");
//                     p.tf5.setText(r);
//                     String o = rs2.getString("bdid");
//                     p.tf7.setText(o);
//                     String q  = rs2.getString("did");
//                     p.tf8.setText(q);
//            
//                     System.out.println(")))))))))))"+y+"((((((((((((((");
//             }
        
             
             
             
           
         } catch (Exception ex) {
             System.out.println( ex.getMessage());
         }
             
            
       
     
     
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed
        // TODO add your handling code here:
        // System.out.println(u+" uuu");
         s = -1 ;
         cb1.setVisible(true);
         String h ="BL";
          
         try{
             cb1.removeAllItems();
             JOptionPane.showMessageDialog(null," Are you sure This Donor Disqulify Always  For Donotion Blood  ");
             m = "select distinct reason From reason where type = '"+h+"' ";
             rs = obj1.stm.executeQuery(m);
             while(rs.next()){
                 cb1.addItem(rs.getString(1));
                 
             }
              i = (String) cb1.getSelectedItem();
              System.out.println(i);
         }catch( Exception ex ){
             System.out.println(ex.getMessage());
         }
         
         
         
       
    }//GEN-LAST:event_rb3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                                                  
              //  System.out.println(u+" uuu");
              
              q   = "UPDATE donorregistration AS s, blooddonation AS p  SET s.status = '"+s+"', s.note = '"+i+"', p.status = '"+s+"', p.note = '"+i+"' WHERE s.did = "+u+" AND p.did = "+u+"";
              try {
                  
                  obj1.stm.executeUpdate(q);
                //  JOptionPane.showMessageDialog(null," Succesful (*_*) ");
              } catch (SQLException ex) {
                  System.out.println(ex.getMessage());
              }

  
         
       
                
                 this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    // End of variables declaration//GEN-END:variables
}
