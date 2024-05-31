
package com.mycompany.parabitnbbms;

import com.github.sarxos.webcam.Webcam;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;




public class BBDonorR extends javax.swing.JDialog {
    

    
    
    
     
    Dimension  screen = Toolkit.getDefaultToolkit().getScreenSize();
    BBDonorRD   obj11 ;
     BTesting  t ;
    ResultSet  r1 , rs2,rs3 , rs11 , rt1;
    ParabitDB obj1  , obj12 ;
     String  h, ss,   o, s ,rdt1,  name1 , gender1 , dob1, aadhar1 , emailid1, mobno1 , amobno1 , bgroup1, plotno1, city1 , colony1 , district1,pincode1, state1  ;
     int   weight1 , did1   ;
     String sqlFormattedDateTime, donation1, source1  ;
    Boolean isRunning = false ;
   static String hour ;
    public BBDonorR(java.awt.Frame parent, boolean modal,  String cd ) throws IOException, ParseException 
    {
        super(parent, modal);
        
         initComponents();
      
          this.setVisible(false);
           
         obj12 = new ParabitDB();  
         source1  =  cd  ;
         jl20.setText(source1);
         this.setSize(screen.width,screen.height);
         obj1 = new  ParabitDB();
       
         String s  = "Select name from  state";
         try
         {
             rs11=obj1.stm.executeQuery(s);
             
             while( rs11.next())
             {
                
             cb2.addItem(rs11.getString(1));
             }
             String r = "Select bgroup from bloodgroup";
             rs3=obj1.stm.executeQuery(r);
             while(rs3.next())
            {
           cb3.addItem(rs3.getString(1));//Blood group 
            }  
         }catch(Exception e )
                 {
                     System.out.print(e+"Error 1  ");
                 }
              dateTime(); 
               time();
            
               
                   
               
             
    }

    
    
 public BBDonorR( JFrame pF,boolean arg , ResultSet rs1 ) throws SQLException {
       
        initComponents();
   Dimension  screen = Toolkit.getDefaultToolkit().getScreenSize();
  this.setSize(screen.width,screen.height);

  if(rs1!= null){
  try{
  name1 = rs1.getString("name");
 tf1.setText(name1);
 rdt1 = rs1.getString("rdt");
 tf11.setText(rdt1);
 mobno1 = rs1.getString("mobno");
 tf2.setText(mobno1);
 amobno1 = rs1.getString("amobno");
 tf3.setText(amobno1);
 aadhar1 = rs1.getString("aadhar");
 tf4.setText(aadhar1);
 emailid1 = rs1.getString("emailid");
 tf5.setText(emailid1);
 state1 =rs1.getString("state");
cb2.addItem(state1);  
//System.out.println(cb2);
district1 = rs1.getString("district");
cb1.addItem(district1);
plotno1 = rs1.getString("plotno");
tf7.setText(plotno1);
city1  = rs1.getString("city");
tf8.setText(city1);
colony1  = rs1.getString("colony");
tf9.setText(colony1);
pincode1 = rs1.getString("pincode");
tf10.setText(pincode1);
bgroup1 = rs1.getString("bgroup");
cb3.addItem(bgroup1);
  gender1  = rs1.getString("gender");
  if( gender1  != null)
  {
 //System.out.println(gender1);
    if( "M".equals(gender1))
    {
        rb1.setSelected(true);
        //System.out.println(rb1);
    }
    if(gender1.equals("F"))
    {
         rb2.setSelected(true);
        // System.out.println(rb2);
    }
    if(gender1.equals("T"))
    {
        rb3.setSelected(true);
        //System.out.println("T");
    }
  }
  donation1 = rs1.getString("donation");
  if( donation1 != null)
  {
      if( "D".equals(donation1))
      {
          rb5.setSelected(true);
      }
      if("E".equals(donation1))
      {
          rb4.setSelected(true);
      }
  }
      source1 = rs1.getString("source");
      jl20.setText(source1);
     java.sql.Date dob1 = rs1.getDate("dob");
     //System.out.print(dob1); 
     tf6.setDate(dob1);
    

  }catch(Exception e)
          {
              System.out.println(e);
          }
 }
 }

  

 
    public void dateTime() throws ParseException
    {
      
             LocalDate  date = LocalDate.now();
             DateTimeFormatter sf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
               sqlFormattedDateTime = date.format(sf);
              DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy" );
              String dft = date.format(displayFormatter);
             tf11.setText(dft);
             rdt1=tf11.getText();
             tf11.setEditable(false); 
             tf11.setFocusable(false);
             
        
    }
        
    
    public void time(){
    LocalTime   time = LocalTime.now();
    DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("HH:mm:ss" );
     String t = time.format(displayFormatter);
    //LocalDateTime  now = LocalDateTime.now();
    time1.setText(t);  
     LocalTime adjustedTime = time.minusMinutes(5);
     String h=  adjustedTime.format(displayFormatter);
   
      hour = h ;
   System.out.println(hour+"----------------");
     
    time1.setEditable(false); 
    time1.setFocusable(false);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        bg2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        rb3 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf6 = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        tf11 = new javax.swing.JTextField();
        ImageHolder = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        tf12 = new javax.swing.JTextField();
        rb4 = new javax.swing.JRadioButton();
        rb5 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        cb3 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jl20 = new javax.swing.JLabel();
        Image = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        time1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Personal Detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 2, 18), new java.awt.Color(255, 0, 51))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("      Name");

        tf1.setFont(new java.awt.Font("Dubai Medium", 2, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel2.setText("     Gender ");

        bg1.add(rb1);
        rb1.setFont(new java.awt.Font("Segoe UI Emoji", 3, 14)); // NOI18N
        rb1.setText("M");
        rb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb1ActionPerformed(evt);
            }
        });

        bg1.add(rb2);
        rb2.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        rb2.setText("F");
        rb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb2ActionPerformed(evt);
            }
        });

        bg1.add(rb3);
        rb3.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        rb3.setText("T");
        rb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel3.setText("   Mobile no ");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel4.setText("  Alternate no");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel5.setText("   Aadhar no");

        tf2.setFont(new java.awt.Font("Dubai Medium", 2, 14)); // NOI18N
        tf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf2ActionPerformed(evt);
            }
        });

        tf3.setFont(new java.awt.Font("Dubai Medium", 2, 14)); // NOI18N
        tf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf3ActionPerformed(evt);
            }
        });

        tf4.setFont(new java.awt.Font("Dubai Medium", 2, 14)); // NOI18N
        tf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel6.setText("      Email");

        tf5.setFont(new java.awt.Font("Dubai Medium", 2, 14)); // NOI18N
        tf5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel7.setText("Date of Birth");

        tf6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Birth", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Emoji", 2, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(rb2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(rb3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf5, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(tf6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(23, 23, 23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(13, 13, 13)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(tf3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rb2)
                        .addComponent(rb3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(tf5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Perpetua", 2, 24), new java.awt.Color(204, 0, 204))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel8.setText("          Plot NO");

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel9.setText("       City");

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel10.setText("       colony");

        jLabel11.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel11.setText("     District");

        jLabel12.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel12.setText("       State");

        jLabel13.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        jLabel13.setText("    Pin Code");

        tf7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf7ActionPerformed(evt);
            }
        });

        tf9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf9ActionPerformed(evt);
            }
        });

        tf10.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });

        cb2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb2ItemStateChanged(evt);
            }
        });
        cb2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf8, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(tf9)
                                .addComponent(tf7))
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        jLabel14.setText("             Date ");

        tf11.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        tf11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf11ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Office", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Historic", 2, 18), new java.awt.Color(255, 0, 136))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI Variable", 2, 14)); // NOI18N
        jLabel17.setText("         Donation");

        jLabel18.setFont(new java.awt.Font("Segoe UI Symbol", 2, 14)); // NOI18N
        jLabel18.setText("Weight ");

        tf12.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N

        bg2.add(rb4);
        rb4.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        rb4.setText("Exchange");
        rb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb4ActionPerformed(evt);
            }
        });

        bg2.add(rb5);
        rb5.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        rb5.setText("Donate");
        rb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        jLabel16.setText("       BloodGroup");

        cb3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cb3FocusLost(evt);
            }
        });
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(rb4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rb5, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb3, 0, 111, Short.MAX_VALUE)
                            .addComponent(tf12))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rb4)
                            .addComponent(rb5))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf12, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel19.setBackground(new java.awt.Color(255, 102, 255));
        jLabel19.setFont(new java.awt.Font("Sitka Text", 2, 24)); // NOI18N
        jLabel19.setText("                  BBDonorRegistration");

        b1.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        b1.setText("Save");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI Emoji", 2, 14)); // NOI18N
        b2.setText("Reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI Historic", 2, 18)); // NOI18N
        b3.setText("Cancle");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        jl20.setBackground(new java.awt.Color(204, 204, 255));
        jl20.setFont(new java.awt.Font("Segoe UI Black", 3, 24)); // NOI18N
        jl20.setText("    ");

        Image.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        Image.setText("Image capture ");
        Image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImageActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N
        jLabel15.setText("             Time ");

        time1.setFont(new java.awt.Font("Segoe UI Black", 3, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 66, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(time1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jl20, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(time1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ImageHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(Image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
        gender1 = "F";
    }//GEN-LAST:event_rb2ActionPerformed

    private void rb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb3ActionPerformed

        // TODO add your handling code here:
         gender1= "T";
    }//GEN-LAST:event_rb3ActionPerformed

    private void tf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf2ActionPerformed

    private void tf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf3ActionPerformed

    private void tf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf4ActionPerformed

    private void tf5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf5ActionPerformed

    private void tf11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf11ActionPerformed
        // TODO add your handling code 
    }//GEN-LAST:event_tf11ActionPerformed

    private void tf9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf9ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
                                   
                          try{
                              // TODO add your handling code here:
                              
                              
                              rdt1 = tf11.getText();
                              name1=tf1.getText();
                              mobno1=tf2.getText();
                              amobno1=tf3.getText();
                              aadhar1=tf4.getText();
                              emailid1=tf5.getText();
                              SimpleDateFormat  sdf = new SimpleDateFormat("YYYY-MM-dd");
                              dob1 = sdf.format(tf6.getDate());
                              plotno1=tf7.getText();
                              city1=tf8.getText();
                              district1=(String)cb1.getSelectedItem();
                              state1=(String)cb2.getSelectedItem();
                              
                              pincode1 =""+  Integer.parseInt (tf10.getText());
                              weight1=  Integer.parseInt(tf12.getText());
                              //System.out.println(weight1);
                              colony1=tf9.getText();
                              bgroup1=(String)cb3.getSelectedItem();
                              //source1 =(String) jl20.cd.getText();
                              System.out.println(source1);
                         
                        }catch(Exception  ex )
                          {
                                System.out.println(" Error 11 ");
                          }
                          
                              LocalDate today = LocalDate.now();
                              String dob  = dob1 ; // Example DOB string
                              LocalDate birthDate = LocalDate.parse(dob);
                              int age1 = Period.between(birthDate, today).getYears();
                          
                              if(age1 >= 18)
                              {
                                  //JOptionPane.showMessageDialog(null," Eligible for donate blood");
                                  s = "INSERT INTO donorregistration(eid ,bbid,`rdt`, `name`, `gender`, `mobno`, `amobno`, `bgroup`, `emailid`, `aadhar`, `dob`, `plotno`, `colony`, `city`, `district`, `state`,  `pincode`, `donation`, `source`, weight) VALUES ('"+EmpLogin.eid1+"',"+EmpLogin.workplaceid1+",'"+ sqlFormattedDateTime+"','"+name1+"','"+gender1+"','"+mobno1+"','"+amobno1+"','"+bgroup1+"','"+emailid1+"','"+aadhar1+"','"+dob1+"','"+plotno1+"','"+colony1+"','"+city1+"','"+district1+"', '"+state1+"','"+pincode1+"' ,'"+donation1+"', '"+source1+"' ,"+weight1+" )";
                                 
                               
                                 try {
                                      obj1.stm.executeUpdate(s);
                                      
                                      System.out.println("Hellow"+s);
                                      JOptionPane.showMessageDialog(null,"Record succefully insert ");
                                      
                                 } catch (Exception e) {
                                      System.out.println("Error occurred: " + e.getMessage());
                                      JOptionPane.showMessageDialog(null, "Failed to insert record: " + e.getMessage());
                                      System.out.println(e);
                                  }
                                 
                                 
                              
                              
                              
                              
                           
                                 
                             
                              ss = "Select  did  from  donorregistration  where aadhar = '"+aadhar1+"'";
                                  System.out.println(did1);
                                  
                                  
                                  try{
                                      
                                      rt1 =obj1.stm.executeQuery(ss);
                                      rt1.next();
                                      did1 = rt1.getInt("did");
                                      System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&"+did1);
                                  }catch(Exception ex){
                                      
                                  }
                                            



           
            o = "INSERT INTO `blooddonation`( BBID, DID , BGROUP,AGE ,MOBNO,  WEIGHT,WBDT)VALUES("+EmpLogin.workplaceid1+" ,"+did1+", '"+bgroup1+"',"+age1+" ,'"+mobno1+"', "+weight1+",'"+sqlFormattedDateTime+"')";
                             
         try {
        obj1.stm.executeUpdate(o);
          System.out.println(  " @@@@@@@@@@@@@ "+ bgroup1 + "\n"+o);
            } catch (SQLException ex) {
          Logger.getLogger(BBDonorR.class.getName()).log(Level.SEVERE, null, ex);
        
        }
          }  else
                         {
                                    JOptionPane.showMessageDialog(null,"  Your are not Eligible for donate blood");
                                    this.setVisible(false);
                             }
                         
                   if(gender1  != null)
                   {
                       h  =  "SELECT p.did,  p.rdt, p.name, r.bbid, r.bdid FROM donorregistration p, blooddonation r WHERE p.did = r.did AND p.aadhar = "+aadhar1+"  ";   
                              
                      
                              
                                    try {
                                        r1 = obj12.stm.executeQuery(h);
                                   
                               r1.next();
                                  System.out.println(r1+ "\n"+h);
                                name1 = r1.getString("name");
                              String r = r1.getString("Did");
                               System.out.println(name1+r);
                                String bbid1 = r1.getString("bbid");
                               System.out.println(bbid1); 
                              String bdid1 =  r1.getString("bdid");
                              System.out.println(bdid1);
                                 } catch (Exception ex) {
                                    System.out.println( ex.getMessage());
                                    }
                                  
                           
                       javax.swing.JFrame pF = new javax.swing.JFrame();
                    try
                   {
                     obj11 = new BBDonorRD(pF, true, r1 );
                       this.setVisible(false);
                        obj11.setVisible(true);
                        
                         }catch(Exception  e)
                {
                   System.out.println( e.getMessage());
                  
                }
                   
                   
                   }             
                       
          
    }//GEN-LAST:event_b1ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_cb3ActionPerformed

    private void rb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb1ActionPerformed
        // TODO add your handling code here:
             gender1="M";
    }//GEN-LAST:event_rb1ActionPerformed

    private void rb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb4ActionPerformed
        // TODO add your handling code here:
        donation1= "E";
    }//GEN-LAST:event_rb4ActionPerformed

    private void rb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb5ActionPerformed
        // TODO add your handling code here:
         donation1= " D";
    }//GEN-LAST:event_rb5ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb2FocusLost
        // TODO add your handling code here:
        String i = (String)cb2.getSelectedItem();
        cb1.removeAllItems();
        String s = "Select  distinct districtname from district where state= '"+i+"'";
        
        try
        {
        rs2 =obj1.stm.executeQuery(s);
//        cb1.removeAllItems();
        while(rs2.next())
        {
             
          cb1.addItem(rs2.getString(1));
            
        }
        }catch(Exception e)
        {
         javax.swing.JOptionPane.showMessageDialog(null," Plese Select state "+e.getMessage());
        }
    }//GEN-LAST:event_cb2FocusLost

    private void cb2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb2ItemStateChanged
        // TODO add your handling code here:
  

    }//GEN-LAST:event_cb2ItemStateChanged

    private void cb3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cb3FocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cb3FocusLost

    private void tf7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tf7ActionPerformed

    private void ImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImageActionPerformed
  
        
         Webcam webcam = Webcam.getDefault();   
        webcam.open();
        
        class VideoFeedTaker extends Thread{
             public void run(){   
                 while( isRunning){
                     
                 
                    Image image = webcam.getImage();
                   ImageHolder.setIcon(new ImageIcon(image));
                     try {
                         Thread.sleep(40);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(BBDonorR.class.getName()).log(Level.SEVERE, null, ex);
                     }
                 }
                 
             }
             }      

 if(  ! isRunning ){
            isRunning = true ;
           
            new VideoFeedTaker().start();
        }else {
 try {
        
           
            BufferedImage image = webcam.getImage();
         
           if (image != null) {
            File directory = new File("/path/to/directory12");
            if (!directory.exists()) {
                directory.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date(System.currentTimeMillis()));

            String filename = "capture_" + timestamp + ".jpg";
            File outputFile = new File(directory, filename);
            ImageIO.write(image, "JPG", outputFile);
            System.out.println("Image captured and saved successfully: " + filename);
             try
              ( ByteArrayOutputStream  baos   =  new ByteArrayOutputStream()){
                ImageIO.write(image,"jpg",baos);
                byte[] imageData = baos.toByteArray();
                System.out.println(" Image Converted to byte array successfully.");
                System.out.println(did1+"############");
             //  String  o =  "UPDATE `donorregistration` SET `photo`= '"+imageData+"'  WHERE   did  = '"+did1+"' ";
      
           
              }catch(  IOException   e ){
                System.out.println("Error:"+e.getMessage());
              }
               
        } else {
            System.out.println("Error: No image captured from webcam");
        }
           isRunning = false ;
             webcam.close();
 
        }  catch (IOException e) {
        System.err.println("Error capturing image or saving to file: ");
        e.printStackTrace();
    } finally {
        //webcam.close();
    }
        }       
    
           
        
             
 
            
    }//GEN-LAST:event_ImageActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Image;
    private javax.swing.JLabel ImageHolder;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.ButtonGroup bg2;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
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
    private javax.swing.JLabel jl20;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JRadioButton rb3;
    private javax.swing.JRadioButton rb4;
    private javax.swing.JRadioButton rb5;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf11;
    private javax.swing.JTextField tf12;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private com.toedter.calendar.JDateChooser tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JTextField time1;
    // End of variables declaration//GEN-END:variables

}