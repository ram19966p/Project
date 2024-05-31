
package com.mycompany.parabitnbbms;

import static com.mycompany.parabitnbbms.BPreserve.Column1;
import static com.mycompany.parabitnbbms.BPreserve.did1;
import java.awt.Color;
import java.awt.Component;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class ColurTable {
    
 static    ParabitDB  obj1  ; 
  // static Testing  Obj2  ;
   static  BPreserve obj2 ; 
  
   
  
       static void rcb(int row, JTable jt2){
         
             DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int  column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 6   &&  row == row) {
                    c.setBackground(Color.YELLOW);
                    c.setForeground(Color.MAGENTA);
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };

             System.out.println("Hellow ");
       
       jt2.getColumnModel().getColumn(6).setCellRenderer(customRenderer);
       System.out.println(" Colur hu mai chal raha hu ");
        
    }

        
        static  public void pz(int row , JTable  jt2 ){
          
          
     
       
       
         DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 11   &&  row == row) {
                    c.setBackground(Color.YELLOW);
                    c.setForeground(Color.MAGENTA);
                   
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };
         jt2.getColumnModel().getColumn(11).setCellRenderer(customRenderer);
 
    }

    static void pl(int row, JTable jt2) {
        
       
        System.out.println(Column1);
         System.out.print(did1);
       
      
         DefaultTableCellRenderer customRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 9  &&  row == row) {
                    c.setBackground(Color.green);
                    c.setForeground(Color.MAGENTA);
                   
                } else {
                    c.setBackground(Color.WHITE);
                }
                return c;
            }
        };
         jt2.getColumnModel().getColumn(9).setCellRenderer(customRenderer);
 
   
       
          
      }
    
    
    
     static void id(String q, String WBBID1){
         
    
         String   r , p ,m ,t ;
         r = "RBC"+WBBID1;
         System.out.println(r+" Mai r hu aor mera kam chana hai ");
         p="PZ"+WBBID1;
         System.out.println(p+"mai p hu ");
         m="PL"+WBBID1;
         System.out.println(m+"mai m hu ");
         t="CPPZ"+WBBID1;
         System.out.println(t+" mai t hu "+q);
         String  b = "UPDATE `blooddonation` SET `RBCBID`='"+r+"',`PLBID`='"+m+"',`PZBID`='"+p+"',`CPPZBID`='"+t+"' WHERE   did = '"+q+"'   " ;
         obj1 = new ParabitDB();
          try {
         obj1.stm.executeUpdate(b);
         //JOptionPane.showMessageDialog(null," Mera kam ho gya ");
     } catch (SQLException ex) {
         Logger.getLogger(ColurTable.class.getName()).log(Level.SEVERE, null, ex.getMessage());
     }
         
         
         
     }
   
        static    void days( String d , JTable jt2 , int row   ){
           
         LocalDate d1 = LocalDate.parse(d);
        
         System.out.println(d1);
               
          
 
                 DefaultTableModel model = (DefaultTableModel) jt2.getModel();
         try{         //   System.out.println(" mai jt2 hu  chal raha hu ");
              ScheduledExecutorService sche = Executors.newScheduledThreadPool(1);
          
              Runnable task = () -> {
                    
                    LocalDate saveDate = LocalDate.parse(d);
                   
                    LocalDate newDate = saveDate.plusYears(10);
                    LocalDate currentDate = LocalDate.now();
            int    daysLeft = (int) ChronoUnit.DAYS.between(currentDate, newDate);
              SwingUtilities.invokeLater(() -> model.setValueAt(daysLeft, row, 7));
                
             
            };         
      sche.scheduleAtFixedRate( task,0, 1, TimeUnit.DAYS);   
     
                
     } catch (Exception e) {
           System.out.println(e.getMessage());
        }
           
       
      
    
            

     }      
   
}    

       
        
        

