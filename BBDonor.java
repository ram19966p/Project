
package com.mycompany.parabitnbbms;

import javax.swing.JFrame;

public class BBDonor extends javax.swing.JDialog {

   
  
    public BBDonor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        b1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        b1.setText("Direct");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        b2.setText("Camp");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Agency FB", 3, 18)); // NOI18N
        jb3.setText("Donor");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb3, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        String  D =" Direct" ;
         try
        {
            javax.swing.JFrame pF = new javax.swing.JFrame();
            BBDonorR ob = new BBDonorR(pF, true, D );
            //ob.jl20.setText(field);
              this.setVisible(false);
            ob.setVisible(true);
        }catch(Exception  e)
          {
                  System.out.println(" Error in a BBDonorR Class "+e.getMessage());
           }
     
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        String  C = "Camp" ;
      
         try
        {
            javax.swing.JFrame pF = new javax.swing.JFrame();
            BBDonorR ob = new BBDonorR(pF, true ,C);
            //ob.jl20.setText(field);
              this.setVisible(false);
              ob.setVisible(true);
            
        }catch(Exception  e)
          {
                  System.out.println(" Error in a BBDonorR Class ");
           }
         
    }//GEN-LAST:event_b2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        // TODO add your handling code here:
         try
        {
         
            javax.swing.JFrame pF = new javax.swing.JFrame();
            DonorD ob = new DonorD(pF, true );
             this.setVisible(false);
            ob.setVisible(true);
            
            
        }catch(Exception  e)
          {
                  System.out.println(" Error in Class Cantrol Pannel ");
           }
    }//GEN-LAST:event_jb3ActionPerformed


    
    
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jb3;
    // End of variables declaration//GEN-END:variables
}


