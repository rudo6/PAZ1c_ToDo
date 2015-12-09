/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.todo;

import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

/**
 *
 * @author student
 */
public class MainForm extends javax.swing.JFrame {
    
    //private PamatovyUlohaDao pamatovyUlohaDao = new PamatovyUlohaDao();
    private UlohaDao ulohaDao = ulohaDaoFactory.INSTANCE.getUlohaDao();
    
    private KategoriaTableModel kategoriaTableModel = new KategoriaTableModel();

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        refresh();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        ulohyList = new javax.swing.JList();
        ulohaTextField = new javax.swing.JTextField();
        pridatButton = new javax.swing.JButton();
        terminDatePicker = new org.jdesktop.swingx.JXDatePicker();
        odstranitButton = new javax.swing.JButton();
        hotovoButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        kategorieTable = new org.jdesktop.swingx.JXTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ulohyList.setCellRenderer(new UlohaListCellRenderer());
        ulohyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ulohyListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ulohyList);

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        terminDatePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminDatePickerActionPerformed(evt);
            }
        });

        odstranitButton.setText("Odstraniť");
        odstranitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odstranitButtonActionPerformed(evt);
            }
        });

        hotovoButton.setText("Hotovo!");
        hotovoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hotovoButtonActionPerformed(evt);
            }
        });

        kategorieTable.setModel(this.kategoriaTableModel);
        kategorieTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategorieTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(kategorieTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ulohaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(terminDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pridatButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(hotovoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(odstranitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ulohaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(terminDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pridatButton)
                    .addComponent(odstranitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hotovoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        Uloha uloha = new Uloha();
        String nazov = ulohaTextField.getText();
        if (nazov.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nazov je povinny.");
            return;
        }
        uloha.setNazov(nazov);
        
        Date date = terminDatePicker.getDate();
        if(date == null){
            date = new Date();
        }
        if(date.before(new Date())){
            JOptionPane.showMessageDialog(this, "Datum nesmie byt z minulosti.","Chyba",JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        uloha.setDate(date);
        
        ulohaDao.pridat(uloha);
        
        refresh();
    }//GEN-LAST:event_pridatButtonActionPerformed

    private void terminDatePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminDatePickerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminDatePickerActionPerformed

    private void odstranitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odstranitButtonActionPerformed
        Uloha uloha = (Uloha) ulohyList.getSelectedValue(); 
        if (uloha == null) {
            return;
        }
        ulohaDao.odstranit(uloha);
        
        refresh();
    }//GEN-LAST:event_odstranitButtonActionPerformed

    private void hotovoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hotovoButtonActionPerformed
        //vypitaj si oznacenu ulohu
        Uloha uloha = (Uloha) ulohyList.getSelectedValue();
        if (uloha == null) {
            return;
        }
        //nastav splnenie na true
        uloha.setSplnena(true);
        //uloz do dao
        ulohaDao.upravit(uloha);

        refresh();
    }//GEN-LAST:event_hotovoButtonActionPerformed

    private void ulohyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ulohyListMouseClicked
        if(evt.getClickCount()==2){
            Uloha uloha = (Uloha) ulohyList.getSelectedValue();
            
            UlohaForm ulohaform = new UlohaForm(this, true, uloha);
            ulohaform.setVisible(true);
            
            refresh();
        }
    }//GEN-LAST:event_ulohyListMouseClicked

    private void kategorieTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategorieTableMouseClicked
        int vybranyIndex = kategorieTable.getSelectedRow();
        Kategoria kategoria = kategoriaTableModel.getKategoria(vybranyIndex);
        
        ulohyList.setListData(kategoria.getUlohy().toArray());
    }//GEN-LAST:event_kategorieTableMouseClicked

    private void refresh() {
        List<Uloha> ulohy = ulohaDao.dajVsetky();
        ulohyList.setListData(ulohy.toArray());
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hotovoButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private org.jdesktop.swingx.JXTable kategorieTable;
    private javax.swing.JButton odstranitButton;
    private javax.swing.JButton pridatButton;
    private org.jdesktop.swingx.JXDatePicker terminDatePicker;
    private javax.swing.JTextField ulohaTextField;
    private javax.swing.JList ulohyList;
    // End of variables declaration//GEN-END:variables
}
