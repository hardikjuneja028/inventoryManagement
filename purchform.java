
package stockmgm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static stockmgm.vars.myurl;
import static stockmgm.vars.pass;
import static stockmgm.vars.uname;


public class purchform extends javax.swing.JInternalFrame {

    public purchform() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Entry Bill Date");

        jLabel3.setText("...........");

        jLabel4.setText("Purchase Bill No");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Supplier Details"));

        jLabel5.setText("Choose Supplier");
        jLabel5.setToolTipText("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Address");

        jLabel7.setText(".............");

        jLabel8.setText("Phone");

        jLabel9.setText(".............");

        jLabel10.setText("GST no.");

        jLabel11.setText(".............");

        jLabel22.setText("Order Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel22))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, 0, 169, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProdID", "Product Name", "Rate", "Qty", "Total Cost"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Product Details"));

        jLabel12.setText("Choose Category");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel13.setText("Choose Sub Category");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel14.setText("Choose Product");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Rate");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("Quantity");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel2)
                    .addComponent(jLabel15))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, 0, 176, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.setText("Remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Total");

        jLabel17.setText("............");

        jLabel18.setText("GST");

        jLabel19.setText("............");

        jLabel20.setText("Grand Total");

        jLabel21.setText("............");

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(445, 445, 445)
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1075, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel21)
                        .addComponent(jButton3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)
                        .addComponent(jLabel19)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        fetchcat();
        fetchsupp();
        fetchpurchaseid();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedIndex()>0)
        {
            try
                {
                    Connection myconn = DriverManager.getConnection(myurl, uname, pass);
                    try
                    {
                       String q="select * from managesupplier where supplierId=?";
                       PreparedStatement myst = myconn.prepareStatement(q); 

                       String bigname = jComboBox1.getSelectedItem().toString();
                       int cpos = bigname.indexOf(",");                  
                       String catid = bigname.substring(0, cpos);
                       myst.setString(1, catid);

                    ResultSet res=myst.executeQuery();                   
                   if(res.next())
                   {
                      do
                      {
                          jLabel7.setText(res.getString("address"));
                          jLabel9.setText(res.getString("phone"));
                          jLabel11.setText(res.getString("GST"));

                      }
                      while(res.next());
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(rootPane, "No records found");

                   }
                 }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
                }
                finally
                {
                    myconn.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
            }   
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()>0)
        {
            fetchsubcat();
        }
        
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox3.getSelectedIndex()>0)
        {
            fetchproduct();
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double rt,qt,tc;
        rt = Double.parseDouble((jTextField1.getText()));
        qt = Double.parseDouble((jTextField2.getText()));
        tc=rt*qt;
        
        String bigname = jComboBox4.getSelectedItem().toString();
        int cpos = bigname.indexOf(",");                  
        String pid = bigname.substring(0, cpos);
        String pname = bigname.substring(cpos+1);
        
        Object myrow [] = {pid,pname,rt,qt,tc};
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        
        mymodel.addRow(myrow);
        calctotal();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel();
        
        mymodel.removeRow(jTable1.getSelectedRow());
        calctotal();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try
            {
                Connection myconn = DriverManager.getConnection(myurl, uname, pass);
                try
                {
                   String q="insert into purchase values(?,?,?,?,?)";
                   PreparedStatement myst = myconn.prepareStatement(q);
                   myst.setString(1, jLabel3.getText());
                   
                    String bigname = jComboBox1.getSelectedItem().toString();
                    int cpos = bigname.indexOf(",");                  
                    String suppid = bigname.substring(0, cpos);
                    myst.setString(2, suppid);
                    myst.setString(3, jLabel21.getText());
                    
                    SimpleDateFormat myformat = new SimpleDateFormat("yyyy-MM-dd");
                    
                    String odate = myformat.format(jDateChooser2.getDate());
                    myst.setString(4, odate);
                    
                    String edate = myformat.format(jDateChooser1.getDate());
                    myst.setString(5, edate);
                    
                   int count = myst.executeUpdate();
                   if(count==1)
                   {
                       for(int x=0;x<jTable1.getRowCount();x++)
                       {
                            q="insert into purchdetails(purchaseid,prodid,pname,rate,qty,tc) values(?,?,?,?,?,?)";
                            myst = myconn.prepareStatement(q);
                            myst.setString(1, jLabel3.getText());
                            myst.setString(2, jTable1.getValueAt(x, 0).toString());
                            myst.setString(3, jTable1.getValueAt(x, 1).toString());
                            myst.setString(4, jTable1.getValueAt(x, 2).toString());
                            myst.setString(5, jTable1.getValueAt(x, 3).toString());
                            myst.setString(6, jTable1.getValueAt(x, 4).toString());
                            myst.executeUpdate();
                       }
                       for(int x=0;x<jTable1.getRowCount();x++)
                       {
                            q="update manageproduct set stock=stock+? where prodid=?";
                            myst = myconn.prepareStatement(q);;
                            myst.setString(1, jTable1.getValueAt(x, 3).toString());
                            myst.setString(2, jTable1.getValueAt(x, 0).toString());
                            myst.executeUpdate();
                       }
                        JOptionPane.showMessageDialog(rootPane, "Purchase entry successfully");
                        
                        recipt obj=new recipt(jLabel3.getText());
                        AdminFrame.jDesktopPane1.add(obj);
                        obj.setVisible(true);
                        this.setVisible(false);
                        clearFix();
                   }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
                }
                finally
                {
                    myconn.close();
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
            }        
    }//GEN-LAST:event_jButton3ActionPerformed
 
    void calctotal()
    {
        double gtotal=0;
        for(int x=0;x<jTable1.getRowCount();x++)
        {
            gtotal+=Double.parseDouble(jTable1.getValueAt(x, 4).toString());
        }
        double gst = (18*gtotal)/100;
        double billtotal = gtotal+gst;
        jLabel17.setText(String.valueOf(gtotal));
        jLabel19.setText(String.valueOf(gst));
        jLabel21.setText(String.valueOf(billtotal));
    }
    
    void fetchsupp()
    {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from managesupplier";
               PreparedStatement myst = myconn.prepareStatement(q);
               ResultSet res=myst.executeQuery(); 
               if(res.next())
               {
                  do
                  {
                   jComboBox1.addItem(res.getString("supplierId") + "," + res.getString("suppliername"));
                  }
                  while(res.next());
               }
               else
               {
                   jComboBox1.removeAllItems();
                   jComboBox1.addItem("No Catgeory available");
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }   
    }
  void fetchpurchaseid()
    {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from purchase order by purchaseId desc";
               PreparedStatement myst = myconn.prepareStatement(q);
               ResultSet res=myst.executeQuery(); 
               if(res.next())
               {
                 int prodid = res.getInt("purchaseId");
                 prodid++;
                 jLabel3.setText(String.valueOf(prodid));
               }
               else
               {
                  jLabel3.setText("3000");
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }  
    }

  
    void fetchcat()
    {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from managecat";
               PreparedStatement myst = myconn.prepareStatement(q);
               ResultSet res=myst.executeQuery(); 
               if(res.next())
               {
                  
                  do
                  {
                   jComboBox2.addItem(res.getString("catid") + "," + res.getString("catname"));
                  }
                  while(res.next());
               }
               else
               {
                   jComboBox2.removeAllItems();
                   jComboBox2.addItem("No Catgeory available");
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }   
    }
     void fetchsubcat()
    {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from managesubcat where catid=?";
               PreparedStatement myst = myconn.prepareStatement(q);
               
                String bigname = jComboBox2.getSelectedItem().toString();
                int cpos = bigname.indexOf(",");                  
                String catid = bigname.substring(0, cpos);
                myst.setString(1, catid);
                
               ResultSet res=myst.executeQuery(); 
               if(res.next())
               {
                  jComboBox3.removeAllItems();
                  jComboBox3.addItem("Choose");
                  do
                  {
                   jComboBox3.addItem(res.getString("subcatid") + "," + res.getString("subcatname"));
                  }
                  while(res.next());
               }
               else
               {
                   jComboBox3.removeAllItems();
                   jComboBox3.addItem("No Subcatgeory available");
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }   
    }
     
     void clearFix()
    {
        jLabel7.setText("");
        jLabel9.setText("");
        jLabel11.setText(""); 
        jLabel17.setText(""); 
        jLabel19.setText(""); 
        jLabel21.setText(""); 
        jTextField1.setText("");
        jTextField2.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(0);
        fetchpurchaseid();
        DefaultTableModel mymodel = (DefaultTableModel)jTable1.getModel(); 
        mymodel.setRowCount(0);

        jDateChooser1.setDate(null);
        
    }
     void fetchproduct()
    {
        try
        {
            Connection myconn = DriverManager.getConnection(myurl, uname, pass);
            try
            {
               String q="select * from manageproduct where catid =? and subcatid=?";
               PreparedStatement myst = myconn.prepareStatement(q);
               
                String bigname1 = jComboBox2.getSelectedItem().toString();
                int cpos1 = bigname1.indexOf(",");                  
                String catid = bigname1.substring(0, cpos1);
                myst.setString(1, catid);
                 
                String bigname = jComboBox3.getSelectedItem().toString();
                int cpos = bigname.indexOf(",");                  
                String subcatid = bigname.substring(0, cpos);
                myst.setString(2, subcatid);

                 
               ResultSet res=myst.executeQuery(); 
               if(res.next())
               {
                  jComboBox4.removeAllItems();
                  jComboBox4.addItem("Choose");
                  do
                  {
                   jComboBox4.addItem(res.getString("ProdId") + "," + res.getString("pname"));
                  }
                  while(res.next());
               }
               else
               {
                   jComboBox4.removeAllItems();
                   jComboBox4.addItem("No product available");
               }
             }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Occured " + e.getMessage());
            }
            finally
            {
                myconn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error in Connection " + e.getMessage());
        }   
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
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
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
