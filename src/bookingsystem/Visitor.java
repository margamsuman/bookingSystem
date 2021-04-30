/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingsystem;

import static bookingsystem.patientInterface.bookID;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IT Services
 */
public class Visitor extends javax.swing.JFrame {
    mainLogin obj = new mainLogin();
    String visitorName = null;
    static int visitorind =0;
    visitorClass[] vc = new visitorClass[25];
    /**
     * Creates new form Visitor
     */
    public Visitor() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cmbxphysician = new javax.swing.JComboBox<>();
        cmbxspecialisation = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSearchphy1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtVisitorName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnLog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Search by physician");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Search by specialisation");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        cmbxphysician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxphysicianActionPerformed(evt);
            }
        });

        cmbxspecialisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxspecialisationActionPerformed(evt);
            }
        });

        tblSearchphy1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Physician Name", "Specialisation", "Consultation Hours", "Status", "visitor Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblSearchphy1);
        if (tblSearchphy1.getColumnModel().getColumnCount() > 0) {
            tblSearchphy1.getColumnModel().getColumn(0).setResizable(false);
            tblSearchphy1.getColumnModel().getColumn(1).setResizable(false);
            tblSearchphy1.getColumnModel().getColumn(2).setResizable(false);
            tblSearchphy1.getColumnModel().getColumn(3).setResizable(false);
            tblSearchphy1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME VISITORS");

        jButton1.setText("Book Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtVisitorName.setEditable(false);
        txtVisitorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVisitorNameActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter your name");

        btnLog.setText("Logout");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbxphysician, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(cmbxspecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(311, 311, 311)
                                .addComponent(txtVisitorName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(415, 415, 415)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 152, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtVisitorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbxphysician, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbxspecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnLog))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            cmbxphysician.enable(true);
            cmbxspecialisation.enable(false);
        }

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            cmbxphysician.enable(false);
            cmbxspecialisation.enable(true);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    public void setData (){
        String pname=null;
        String phours = null;
        String pspecial =null;
         for(int i=0;i<tblSearchphy1.getRowCount();i++){
             pname = tblSearchphy1.getValueAt(i, 0).toString();
             phours=tblSearchphy1.getValueAt(i, 2).toString();
             pspecial = tblSearchphy1.getValueAt(i, 1).toString();
             System.out.println(pname);
             for(int j=0;j<visitorind;j++){
                 System.out.println(pname);
                  if(pname.equals(vc[j].physicianName) && phours.equals(vc[j].consultationhours) && pspecial.equals(vc[j].specialisation)){
                      tblSearchphy1.setValueAt(vc[j].name,i, 4);
                      tblSearchphy1.setValueAt(vc[j].status,i, 3);
                  }
             }
             
           
        }
    }
    private void cmbxphysicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxphysicianActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
        DefaultTableModel dt= (DefaultTableModel)tblSearchphy1.getModel();
        dt.setRowCount(0);
        String number = cmbxphysician.getItemAt(cmbxphysician.getSelectedIndex());
        number = number.substring(0, number.indexOf("-")-1);
        int i = Integer.parseInt(number);
        
        dt = obj.getPhysicianData(i,dt,false);
       
        int row=dt.getRowCount();
        int column = dt.getColumnCount();
        int[] remove= new int[25];
        int l=0;
        for(int j=0;j<row;j++){
            for(int k=0;k<column;k++){
                Object ob = dt.getValueAt(j, k);
                if(ob==null){
                    remove[l]=j;
                    l++;
                    dt.removeRow(j);
                    j=0;
                    row--;
                    //System.out.println(remove);
                    break;
                }

            }
            // dt.removeRow(remove);
        }
        /* for(int j=0;j<l;j++)
        dt.removeRow(j); */
        // if(dt.getValueAt(1, 2).equals("null")){
            // dt.removeRow(1);
            // }
        //}

        tblSearchphy1.setModel(dt);
        setData();
        }
    }//GEN-LAST:event_cmbxphysicianActionPerformed

    private void cmbxspecialisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxspecialisationActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            DefaultTableModel dt= (DefaultTableModel)tblSearchphy1.getModel();
            dt.setRowCount(0);
           
            String specialization = cmbxspecialisation.getItemAt(cmbxspecialisation.getSelectedIndex());
            
            dt = obj.getSpecializationData(dt,specialization,false);
        
        int row=dt.getRowCount();
        int column = dt.getColumnCount();
       
        
        for(int j=0;j<row;j++){
            for(int k=0;k<column;k++){
                Object ob = dt.getValueAt(j, k);
                if(ob==null){
                                     
                    dt.removeRow(j);
                    j=0;
                    row--;
                    //System.out.println(remove);
                    break;
                }
                
            }
           // dt.removeRow(remove);
        }
        setData();
        }
        
    }//GEN-LAST:event_cmbxspecialisationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        txtVisitorName.setText(visitorName);
        try {
            bookappointment();
        } catch (IOException ex) {
            Logger.getLogger(Visitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
public void bookappointment() throws IOException{
        FileWriter fw = new FileWriter("visitor.txt",true);
        
        int i =tblSearchphy1.getSelectedRow();
        String status = tblSearchphy1.getValueAt(i, 3).toString();
        if(status.equals("Empty")){
            
                tblSearchphy1.setValueAt("Booked", i, 3 );
                tblSearchphy1.setValueAt(visitorName, i, 4);
                vc[visitorind] = new visitorClass();
                vc[visitorind].name = txtVisitorName.getText().toString();
                vc[visitorind].status= "Booked be there 30 minutes before";
                vc[visitorind].consultationhours =  tblSearchphy1.getValueAt(i, 2).toString();
                vc[visitorind].physicianName =  tblSearchphy1.getValueAt(i, 0).toString();
                vc[visitorind].specialisation=  tblSearchphy1.getValueAt(i, 1).toString();
                
                fw.write(vc[visitorind].name+"\t\t"+ vc[visitorind].status + "\t\t" + vc[visitorind].consultationhours + "\t\t" + vc[visitorind].physicianName+ "\t\t" + vc[visitorind].specialisation);
                fw.write("\r\n");
                
                visitorind++;
            }
        fw.close();
}
    
    
    private void txtVisitorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVisitorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVisitorNameActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        this.hide();
        obj.setFocusable(true);
    }//GEN-LAST:event_btnLogActionPerformed
  
   public void physiciandata(physicians[] phy, String name){
       visitorName=name;
        txtVisitorName.setText(visitorName);
        for (int i = 0 ;i<5;i++){
            
            cmbxphysician.addItem(phy[i].getNumber() + " - " + phy[i].getFullname());
            
        }
        cmbxspecialisation.addItem("Osteopathy");
        cmbxspecialisation.addItem("Rehabilitation");
        cmbxspecialisation.addItem("Physiotherapist");
        cmbxphysician.enable(false);
        cmbxspecialisation.enable(false);
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
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLog;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbxphysician;
    private javax.swing.JComboBox<String> cmbxspecialisation;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblSearchphy1;
    private javax.swing.JTextField txtVisitorName;
    // End of variables declaration//GEN-END:variables
}
