package com.mycompany.parabitnbbms;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class BTesting extends javax.swing.JDialog {
     String name1 , rdt1, source1 ,did1 , bdid1 , donation1 , Bgroup1 ,  status1, o  , q  ,o1 ,formattedDate1,formattedDate , formattedDate2, formattedDate3 ,formattedTime , pzh,formattedTime2, formattedTime4 , wbu1;
     ResultSet rs1, rs2  ;
     ParabitDB obj1 , obj2 ;
     TestR  Tr , b ;
     LocalDate  h  , p ;
     LocalTime  time ;
                 
      String sqlFormattedDateTime,  sqlFormattedDateTime1 ,  sql3 ;
   
    
     
   
    public BTesting(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       
     b = new TestR(jp2); 
        
        obj1 = new ParabitDB();
         int  r = 2 ;
         LocalDate today = LocalDate.now();
             DateTimeFormatter sf = DateTimeFormatter.ofPattern("yyyy-MM-d");
               sqlFormattedDateTime = today.format(sf);
               LocalDate twoDaysAgo = today.minusDays(r);
               jdc3.setDate(java.sql.Date.valueOf( sqlFormattedDateTime));
               Date  h = jdc3.getDate();
             System.out.println(h);

             DateTimeFormatter sf1 = DateTimeFormatter.ofPattern("yyyy-MM-d");
               sqlFormattedDateTime1 = twoDaysAgo.format(sf1);
              jdc2.setDate(java.sql.Date.valueOf( sqlFormattedDateTime1));
               System.out.println(jdc2);
               Date y = jdc2.getDate();
               System.out.println(y);
      
         Dimension  screen = Toolkit.getDefaultToolkit().getScreenSize();
         this.setSize(screen.width,screen.height); 
         
            // TODO add your handling code here:
            
        
           
           
      
             
          

          
            System.out.println(EmpLogin.workplaceid1);
            
            
          o  = "SELECT DISTINCT p.BDID, y.name, y.did, y.rdt, y.source, y.bgroup, y.status, y.donation FROM donorregistration y, blooddonation p WHERE p.WBBID = y.wbbid AND y.bbid = '"+EmpLogin.workplaceid1+"'  ORDER BY y.status ='-1' or y.status ='0' or y.status = '1' ";
               try {
                  rs1 = obj1.stm.executeQuery(o);
                  DefaultTableModel model = (DefaultTableModel) jt1.getModel();
                  model.setRowCount(0); 
                  
   //model.addColumn("Name");
  // model.addColumn("Date");
  //  model.addColumn("Source");
 //  model.addColumn("Did");
 //   model.addColumn("BDID");
 //    model.addColumn("Donation");
 //    model.addColumn("Status");
 //    model.addColumn("bgroup");
    
    while (rs1.next()) {
        // System.out.println(status1);
      //  System.out.println(rs1+"++++++++++++");
        name1 = rs1.getString("name");
        rdt1 = rs1.getString("rdt");
        source1 = rs1.getString("source");
        did1 = rs1.getString("did");
        bdid1 = rs1.getString("BDID");
       // System.out.println(bdid1);
        donation1 = rs1.getString("donation");
        Bgroup1 = rs1.getString("Bgroup");
        // wbbid1=rs1.getString("wbbid");
        status1 = rs1.getString("status");
       // System.out.println(status1);

      String Data[] = {name1, rdt1, source1, did1, bdid1, donation1,status1,  Bgroup1};
      model.addRow(Data);
    
    }
    
 
} catch (Exception ex) {
    System.out.println(ex.getMessage());
}
    }
    

    BTesting(ResultSet rs2) throws SQLException {
        
       obj2 = new ParabitDB();
        System.out.println(rs2+"_________________");
         
             while(rs2.next()){

               

                     String  y =  null ;
                 try {
                     
                      String  WBBID1 = rs2.getString("WBBID");
                           tf11.setText(WBBID1);
                          
                     y = rs2.getString("name");
                 
                     tf9.setText(y);
                     wbu1 = rs2.getString("wbu");
                     tf5.setText(wbu1);
                     String o = rs2.getString("bdid");
                     tf7.setText(o);
                      q  = rs2.getString("did");
                       tf8.setText(q);
                       int   eid1 = rs2.getInt("eid");
                       System.out.println(eid1+"  Mai eid hu a gya hu )))))))))");
                       
                       
                      tf6.setText(rs2.getString("rdt"));
                          p   = rs2.getDate("rdt").toLocalDate();
                         DateTimeFormatter sf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                              sql3 = p.format(sf);
                     
                     
                     
                     
                     h  = rs2.getDate("rdt").toLocalDate() ;
                       tf10.setText(rs2.getString("WBTI"));
                        
                          time = rs2.getTime("WBTI").toLocalTime();
                          System.out.println(time);
                        
                          
                          
                           int daysToAdd = 34;
                           LocalDate newDate = h.plusDays(daysToAdd);
                           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
                          formattedDate = newDate.format(formatter); 
                           rex1.setText(formattedDate);
                         
                           
                            int daysToAdd1 = 364;
                           LocalDate newDate1 = h.plusDays(daysToAdd1);
                           DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
                            formattedDate1 = newDate1.format(formatter1); 
                           plex1.setText(formattedDate1);
                           
                           
                           
                           
                               int daysToAdd2 = 4;
                           LocalDate newDate2 = h.plusDays(daysToAdd2);
                           DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
                           formattedDate2 = newDate2.format(formatter2); 
                           ptex1.setText(formattedDate2);
                      
                     
                      
                               int daysToAdd3 = 364;
                           LocalDate newDate3 = h.plusDays(daysToAdd3);
                           DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
                        formattedDate3 = newDate3.format(formatter3); 
                           cpex1.setText(formattedDate3);
                           
                           
                           
                           
                           
                           
                           
                                
                                LocalTime adjustedTime = time.minusMinutes(1);
                                DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                                   formattedTime = adjustedTime.format(displayFormatter);
                                   time1.setText(formattedTime);
                           
                          
                                 LocalTime adjustedTime1 = time.minusMinutes(1);
                                DateTimeFormatter displayFormatter1 = DateTimeFormatter.ofPattern("HH:mm:ss" );
                                  pzh=  adjustedTime1.format(displayFormatter1);
                                 time2.setText(pzh);
                                 
                                
                                LocalTime adjustedTime2 = time.minusMinutes(1);
                                DateTimeFormatter displayFormatter2 = DateTimeFormatter.ofPattern("HH:mm:ss");
                                    formattedTime2 = adjustedTime2.format(displayFormatter2);
                                   time3.setText(formattedTime2);
                                   
                                      
                                LocalTime adjustedTime4 = time.minusMinutes(1);
                                DateTimeFormatter displayFormatter4 = DateTimeFormatter.ofPattern("HH:mm:ss");
                                   formattedTime4 = adjustedTime4.format(displayFormatter4);
                                   time4.setText(formattedTime4);
                                   
                                   
                                    ColurTable.id(q,WBBID1 );
                                   
               
                                   
                                   
                                   
                   if( time4  != null  ){      
         
                       
                       
                         LocalDate  date = LocalDate.now();
             DateTimeFormatter sf11 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
              String     sqlFormattedDateTime11 = date.format(sf11);
               
               
                LocalTime   time1 = LocalTime.now();
          DateTimeFormatter displayFormatter11 = DateTimeFormatter.ofPattern("HH:mm:ss" );
          String t = time1.format(displayFormatter11);
  
                                   
                      System.out.println(time1 + " Mai time hu thik hai na ");
                      
                       
                try{
                   // JOptionPane.showMessageDialog(null, " Work hy ");
              o1 ="UPDATE  blooddonation  SET `RBCDT`='"+sql3+"',`RBCTI`='"+time+"',`RBCEDT`='"+formattedDate+"',`RBCETI`='"+formattedTime+"',`PLDT`='"+h+"',`PLTI`='"+time+"',`PLEDT`='"+formattedDate2+"',`PLETI`='"+formattedTime2+"',`PZDT`='"+h+"',`PZTI`='"+time+"',`PZEDT`='"+formattedDate1+"',`PZETI`='"+pzh+"',`CPPZDT`='"+h+"',`CPPZTI`='"+time+"',`CPPZEDT`='"+formattedDate3+"',`CPPZETI`='"+formattedTime4+"' ,  eid = '"+eid1+"'  , statustime = '"+t+"', statusdate = '"+sqlFormattedDateTime11+"'  WHERE did = '"+q+"' "  ;
              obj2.stm.executeUpdate(o1);
               
           // JOptionPane.showMessageDialog(null," Succesfull ");
                } catch (Exception ex) {
            System.out.println(ex.getMessage());
         }
        
            
                        
                             }else{
                                 JOptionPane.showMessageDialog(null, " hy");
                             }
                        }catch(Exception ex ){
                              System.out.println(ex.getMessage());
                         }
                            
                            
                     
                         
                          // System.out.println(sql3+"  iiiiii");
             }
             }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt1 = new javax.swing.JTable();
        jp2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rtf1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ptf2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ttf3 = new javax.swing.JTextField();
        ctf4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        rex1 = new javax.swing.JLabel();
        plex1 = new javax.swing.JLabel();
        ptex1 = new javax.swing.JLabel();
        cpex1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        time2 = new javax.swing.JLabel();
        time3 = new javax.swing.JLabel();
        time4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tf11 = new javax.swing.JTextField();
        jdc2 = new com.toedter.calendar.JDateChooser();
        jdc3 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor List ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14))); // NOI18N

        jt1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 204))); // NOI18N
        jt1.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        jt1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Date ", "Source", "DID", "BDID", "Donation", "Status", "BloodGroup"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt1);

        jp2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accepted Donor ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 3, 14))); // NOI18N
        jp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jp2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel1.setText("    Name ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("        Time ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setText("  DID");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setText("   BDID");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setText("        Date");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setText("     WBU");

        tf5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        tf6.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        tf7.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        tf8.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        tf9.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        tf10.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Donor Blood Detail ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 14), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("   RBC ");

        rtf1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        rtf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtf1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText(" Plazma ");

        ptf2.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        ptf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptf2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("  Platelet ");

        ttf3.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        ttf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttf3ActionPerformed(evt);
            }
        });

        ctf4.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        ctf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctf4ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("       CPPZ");

        rex1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        plex1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        ptex1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        cpex1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel16.setText("    Expire Date -> ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel17.setText("    Expire Time -> ");

        time1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        time2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        time3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        time4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rtf1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(rex1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161)
                        .addComponent(time3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(plex1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(ptex1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ptf2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ttf3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ctf4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cpex1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(time4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rtf1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptf2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ttf3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctf4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ptex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(time4, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                                    .addComponent(time3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plex1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 204));
        jLabel12.setText("     WBBID");

        tf11.setBackground(new java.awt.Color(0, 102, 102));
        tf11.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        tf11.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jp2Layout = new javax.swing.GroupLayout(jp2);
        jp2.setLayout(jp2Layout);
        jp2Layout.setHorizontalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(tf9)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(13, Short.MAX_VALUE))
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jp2Layout.setVerticalGroup(
            jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp2Layout.createSequentialGroup()
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tf8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jdc2.setDateFormatString("yyyy-MM-dd");
        jdc2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jdc3.setDateFormatString("yyyy-MM-d");
        jdc3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jLabel5.setText("   List  of   Donor Testing For Blood Report ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jdc2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jdc3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdc2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jdc3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt1MouseClicked
 
    
        
        String Data1[] = { name1,rdt1,source1,did1,bdid1,donation1};
   
       
  int c;
    c=evt.getClickCount();
    if(c==2)
  { 
      int row =  jt1.getSelectedRow();
     DefaultTableModel  model = (DefaultTableModel)jt1.getModel();
    did1 = (String) model.getValueAt(row,3);
    status1 =(String)model.getValueAt(row,6);
    System.out.println(status1);
  if (!status1.equals("t") && !status1.equals("t")) {
        jt1.isEnabled();
  }else{
         javax.swing.JFrame pF = new javax.swing.JFrame();   
          try {
              Tr = new TestR( pF, true,did1);
          } catch (SQLException ex) {
              Logger.getLogger(BTesting.class.getName()).log(Level.SEVERE, null, ex);
          }
                Tr.setVisible(true);
               
        }
      
  }else{
      // JOptionPane.showMessageDialog(null," Somthing with Worng");
        
    }
      
    
    
    
                                      
    }//GEN-LAST:event_jt1MouseClicked

    private void jp2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jp2MouseClicked
        // TODO add your handling code here:
        
    
        
        
        
    }//GEN-LAST:event_jp2MouseClicked

    private void rtf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rtf1ActionPerformed

    private void ptf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptf2ActionPerformed

    private void ttf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ttf3ActionPerformed

    private void ctf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctf4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
          int row =  jt1.getSelectedRow();
     DefaultTableModel  model = (DefaultTableModel)jt1.getModel();
    did1 = (String) model.getValueAt(row,3);
  //  System.out.println(did1+" PPPPPPPPOOOOOMMMMMMMM////////////");
         
         String      s  , f ,g ,cpp  ;
           int    total  ;
             s =    rtf1.getText();
             System.out.println(s+" OOOOOOOOO");
             f = ptf2.getText();
             g = ttf3.getText();
             cpp = ctf4.getText();
             System.out.println(cpp);
             System.out.println(rdt1);
             String  wbu11  = "SELECT `WBU`   from blooddonation WHERE did = '"+did1+"' ";
             
             
            
             try{
                  rs2 = obj1.stm.executeQuery(wbu11);
                   rs2.next();
                  String weight =  rs2.getString("WBU");
                   int Unit  = Integer.parseInt(weight);
                  
                  //  System.out.println(Unit );
                  
            
             

             int sInt = Integer.parseInt(s);
            int fInt = Integer.parseInt(f);
            int gInt = Integer.parseInt(g);
            int cppInt = Integer.parseInt(cpp);
            total   =  sInt+fInt+gInt+cppInt  ;
          //  System.out.println(total+" ///////////////"+Unit );
            
            
            if(total == Unit){
            
            String  h1   = "UPDATE  blooddonation  SET `RBC`='"+s+"' ,`PL`='"+g+"',`PZ`='"+f+"',`CPPZ`='"+cpp+"' where  did = '"+did1+"'  " ;
    
             obj1 .stm.executeUpdate(h1);
             JOptionPane.showMessageDialog(null," Worko Is Done");
                  }else{
                JOptionPane.showMessageDialog(null," Your Components value  not match in Whole blood Unit ");
            }
            
              
                   }catch(Exception ex ){
                 System.out.println(ex.getMessage());
             }
             
           
                 
             
         
               
             
       
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BTesting dialog = new BTesting(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel cpex1;
    private javax.swing.JTextField ctf4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdc2;
    private com.toedter.calendar.JDateChooser jdc3;
    public static javax.swing.JPanel jp2;
    public javax.swing.JTable jt1;
    public static javax.swing.JLabel plex1;
    public static javax.swing.JLabel ptex1;
    private javax.swing.JTextField ptf2;
    public static javax.swing.JLabel rex1;
    public static javax.swing.JTextField rtf1;
    public static javax.swing.JTextField tf10;
    public static javax.swing.JTextField tf11;
    public static javax.swing.JTextField tf5;
    public static javax.swing.JTextField tf6;
    public static javax.swing.JTextField tf7;
    public static javax.swing.JTextField tf8;
    public static javax.swing.JTextField tf9;
    public static javax.swing.JLabel time1;
    public static javax.swing.JLabel time2;
    public static javax.swing.JLabel time3;
    public static javax.swing.JLabel time4;
    private javax.swing.JTextField ttf3;
    // End of variables declaration//GEN-END:variables

    
}
