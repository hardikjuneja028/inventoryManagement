/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockmgm;

/**
 *
 * @author GTB Student
 */
public class AdminFrame extends javax.swing.JFrame
{

   /**
    * Creates new form AdminFrame
    */

   public AdminFrame ()
   {
      initComponents();
      this.setExtendedState(MAXIMIZED_BOTH);
      if (login.usertype.equalsIgnoreCase("emp")) {
         jMenu2.setVisible(false);
      }
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents()
   {

      jDesktopPane1 = new javax.swing.JDesktopPane();
      jMenuBar1 = new javax.swing.JMenuBar();
      jMenu1 = new javax.swing.JMenu();
      jMenuItem1 = new javax.swing.JMenuItem();
      jMenuItem9 = new javax.swing.JMenuItem();
      jMenuItem8 = new javax.swing.JMenuItem();
      jMenu2 = new javax.swing.JMenu();
      jMenuItem3 = new javax.swing.JMenuItem();
      jMenuItem4 = new javax.swing.JMenuItem();
      jMenuItem5 = new javax.swing.JMenuItem();
      jMenu3 = new javax.swing.JMenu();
      jMenuItem6 = new javax.swing.JMenuItem();
      jMenuItem7 = new javax.swing.JMenuItem();
      jMenu4 = new javax.swing.JMenu();
      jMenuItem2 = new javax.swing.JMenuItem();
      jMenuItem11 = new javax.swing.JMenuItem();
      jMenu5 = new javax.swing.JMenu();
      jMenuItem10 = new javax.swing.JMenuItem();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("Admin Frame");

      jDesktopPane1.setBackground(new java.awt.Color(102, 102, 102));

      javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
      jDesktopPane1.setLayout(jDesktopPane1Layout);
      jDesktopPane1Layout.setHorizontalGroup(
         jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 763, Short.MAX_VALUE)
      );
      jDesktopPane1Layout.setVerticalGroup(
         jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 524, Short.MAX_VALUE)
      );

      jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));

      jMenu1.setText("Account");

      jMenuItem1.setText("User");
      jMenuItem1.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem1ActionPerformed(evt);
         }
      });
      jMenu1.add(jMenuItem1);

      jMenuItem9.setText("Change Password");
      jMenuItem9.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem9ActionPerformed(evt);
         }
      });
      jMenu1.add(jMenuItem9);

      jMenuItem8.setText("Logout");
      jMenuItem8.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem8ActionPerformed(evt);
         }
      });
      jMenu1.add(jMenuItem8);

      jMenuBar1.add(jMenu1);

      jMenu2.setText("  Manage ");

      jMenuItem3.setText("Category");
      jMenuItem3.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem3ActionPerformed(evt);
         }
      });
      jMenu2.add(jMenuItem3);

      jMenuItem4.setText("Subcategory");
      jMenuItem4.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem4ActionPerformed(evt);
         }
      });
      jMenu2.add(jMenuItem4);

      jMenuItem5.setText("Product");
      jMenuItem5.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem5ActionPerformed(evt);
         }
      });
      jMenu2.add(jMenuItem5);

      jMenuBar1.add(jMenu2);

      jMenu3.setText("  Bill   ");

      jMenuItem6.setText("Sale");
      jMenuItem6.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem6ActionPerformed(evt);
         }
      });
      jMenu3.add(jMenuItem6);

      jMenuItem7.setText("Purchase");
      jMenuItem7.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem7ActionPerformed(evt);
         }
      });
      jMenu3.add(jMenuItem7);

      jMenuBar1.add(jMenu3);

      jMenu4.setText("Clients   ");

      jMenuItem2.setText("Supplier");
      jMenuItem2.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem2ActionPerformed(evt);
         }
      });
      jMenu4.add(jMenuItem2);

      jMenuItem11.setText("Customer");
      jMenuItem11.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem11ActionPerformed(evt);
         }
      });
      jMenu4.add(jMenuItem11);

      jMenuBar1.add(jMenu4);

      jMenu5.setText("Analytics");

      jMenuItem10.setText("Purchase record");
      jMenuItem10.addActionListener(new java.awt.event.ActionListener()
      {
         public void actionPerformed(java.awt.event.ActionEvent evt)
         {
            jMenuItem10ActionPerformed(evt);
         }
      });
      jMenu5.add(jMenuItem10);

      jMenuBar1.add(jMenu5);

      setJMenuBar(jMenuBar1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
      );

      setSize(new java.awt.Dimension(777, 583));
   }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      // TODO add your handling code here:
      changepass obj = new changepass();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
      this.dispose();
      login obj = new login();
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      managecat obj = new managecat();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
      managesubcat obj = new managesubcat();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      manageproduct obj = new manageproduct();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      manageSupplier obj = new manageSupplier();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
      purchrpt obj = new purchrpt();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      purchform obj = new purchform();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      AddEmployee obj = new AddEmployee();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      saleform1 obj = new saleform1();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
      // TODO add your handling code here:
      manageCustomer obj = new manageCustomer();
      this.jDesktopPane1.add(obj);
      obj.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

   /**
    * @param args the command line arguments
    */
   public static void main (String args[])
   {
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
      }
      catch (ClassNotFoundException ex) {
         java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(AdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable()
      {
         public void run ()
         {
            new AdminFrame().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   public static javax.swing.JDesktopPane jDesktopPane1;
   private javax.swing.JMenu jMenu1;
   private javax.swing.JMenu jMenu2;
   private javax.swing.JMenu jMenu3;
   private javax.swing.JMenu jMenu4;
   private javax.swing.JMenu jMenu5;
   private javax.swing.JMenuBar jMenuBar1;
   private javax.swing.JMenuItem jMenuItem1;
   private javax.swing.JMenuItem jMenuItem10;
   private javax.swing.JMenuItem jMenuItem11;
   private javax.swing.JMenuItem jMenuItem2;
   private javax.swing.JMenuItem jMenuItem3;
   private javax.swing.JMenuItem jMenuItem4;
   private javax.swing.JMenuItem jMenuItem5;
   private javax.swing.JMenuItem jMenuItem6;
   private javax.swing.JMenuItem jMenuItem7;
   private javax.swing.JMenuItem jMenuItem8;
   private javax.swing.JMenuItem jMenuItem9;
   // End of variables declaration//GEN-END:variables
}
