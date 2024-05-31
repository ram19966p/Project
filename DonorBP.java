
package com.mycompany.parabitnbbms;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DonorBP extends javax.swing.JDialog {
ParabitDB    obj ;public DonorBP(java.awt.Frame parent, boolean modal)  {
        super(parent, modal);
        initComponents();
        obj =  new ParabitDB();
        
        
        
       
    }

   



public void  rcb(){
    
         if(BPreserve.Column != null){
        
     String   R = "UPDATE `blooddonation` SET `PRBC`= '"+BPreserve.Column+"'  WHERE  did = '"+BPreserve.did1+"'";
        
    try {
        obj.stm.executeUpdate(R);
        
        
         
    } catch (SQLException ex) {
       System.out.println( ex.getMessage());
    }
    
    
         String  o =" UPDATE `blooddonation` SET   RBC = null  WHERE  did = '" +BPreserve.did1+"' ";
         try {
             obj.stm.executeUpdate(o);
         } catch (SQLException ex) {
             Logger.getLogger(DonorBP.class.getName()).log(Level.SEVERE, null, ex);
         }
         }else{
             System.out.println("Null Rcb "+"&&&&&&&&&");
         }
    System.out.println(BPreserve.Column+" 000000000"   + BPreserve.did1);
}






public void preseve(){
       if(BPreserve.Column1  != null){
      String    r = "Update blooddonation  set ppl =  '"+BPreserve.Column1+"'  where did = '"+BPreserve.did1+"'" ;
      try{
          obj.stm.executeUpdate(r);
       //   JOptionPane.showMessageDialog(null,"Succesfull");
           
            
      }catch(Exception ex){
          System.out.println(ex.getMessage());
      }
      
         String  r1  = "Update blooddonation  set pl = null  where did ='"+BPreserve.did1+"' " ;
    try {
        obj.stm.executeUpdate(r1);
    } catch (SQLException ex) {
        Logger.getLogger(DonorBP.class.getName()).log(Level.SEVERE, null, ex);
    }
       }else{
           System.out.println("Null  platelet "+"*********");
       }
      
}




  public void pz(){
       if(BPreserve.Column2  != null){
      String  vr = "update blooddonation set ppz = '"+BPreserve.Column2+"'   where did ='"+BPreserve.did1+"'" ;
      try{
          obj.stm.executeUpdate(vr);
           //JOptionPane.showMessageDialog(null,"Succefull");
           
          
         
      }catch(Exception  ex ){
          System.out.println(ex.getMessage());
      }
      
       String r2 = "Update blooddonation set pz = null where did ='"+BPreserve.did1+"'";
    try {
        obj.stm.executeUpdate(r2);
    } catch (SQLException ex) {
        Logger.getLogger(DonorBP.class.getName()).log(Level.SEVERE, null, ex);
    }
       }else{
           System.out.println("Null Plama ");
       }
          
  }

      
  
  
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrb1 = new javax.swing.JRadioButton();
        jrb2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Please Select Then Procced"));

        buttonGroup1.add(jrb1);
        jrb1.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jrb1.setText("Accepts");
        jrb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb2);
        jrb2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        jrb2.setText("Reject ");

        jButton1.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jrb1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jrb2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrb2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb1ActionPerformed
        // TODO add your handling code here:z
        
        
        
       
        if( BPreserve.c1 == 5){
            rcb();
        }else{
             System.out.println("Not Working rcb");
        }
        if(BPreserve.c1 == 7 )  {
         preseve();
     }else{
         System.out.println("Not  Run ");
     }
     if(BPreserve.c1  ==  9 ){
         pz();
         
     }else{
         System.out.println("Not Work  pz ");
     }
   
      
     

     
    
        
        
    }//GEN-LAST:event_jrb1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       
    
      
      
     
        
        
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DonorBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorBP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrb1;
    private javax.swing.JRadioButton jrb2;
    // End of variables declaration//GEN-END:variables

    
}
